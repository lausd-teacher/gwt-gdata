/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.gdata.sample.hellogdata.client;

import com.google.gwt.accounts.client.AuthSubStatus;
import com.google.gwt.accounts.client.User;
import com.google.gwt.gdata.client.gbase.GoogleBaseService;
import com.google.gwt.gdata.client.gbase.ItemsEntry;
import com.google.gwt.gdata.client.gbase.ItemsFeed;
import com.google.gwt.gdata.client.gbase.ItemsFeedCallback;
import com.google.gwt.gdata.client.gbase.MediaEntry;
import com.google.gwt.gdata.client.gbase.MediaFeed;
import com.google.gwt.gdata.client.gbase.MediaFeedCallback;
import com.google.gwt.gdata.client.gbase.MediaFeedLink;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of media attachments.
 */
public class GoogleBaseRetrieveMediaDemo extends GDataDemo {

  /**
   * This method is used by the main sample app to obtain
   * information on this sample and a sample instance.
   * 
   * @return An instance of this demo.
   */
  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new GoogleBaseRetrieveMediaDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code uses the private, read/write media feed to query an items " +
          "attached media. Each item has an associated media feed which can contain up to 10 " +
          "binary attachments. Use this feed to manage binary attachments for your Google Base " +
          "items. Google Base creates a set of thumbnails for each attachment, and stores the " +
          "thumbnails on the Google Base server.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Retrieving media";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  /**
   * Setup the Google Base service and create the main content panel.
   * If the user is not logged on to Google Base display a message,
   * otherwise start the demo by retrieving the user's items.
   */
  public GoogleBaseRetrieveMediaDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_RetrieveMediaDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      getItems();
    } else {
      showStatus("You are not logged on to Google Base.", true);
    }
  }
  
  private void getItems() {
    showStatus("Loading items feed...", false);
    service.getItemsFeed("http://www.google.com/base/feeds/items", new ItemsFeedCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("Terms of Service acceptance required")) {
          showStatus("No Google Base account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the items feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(ItemsFeed result) {
        ItemsEntry[] entries = result.getEntries();
        ItemsEntry targetItem = null;
        for (ItemsEntry entry : entries) {
          MediaFeedLink link = entry.getMediaFeedLink();
          if (link.getCountHint() > 0) {
            targetItem = entry;
            break;
          }
        }
        if (targetItem == null) {
          showStatus("You have no items containing media.", false);
        } else {
          String itemsEntryUri = targetItem.getSelfLink().getHref();
          getMedia(itemsEntryUri);
        }
      }
    });
  }
  
  private void getMedia(String itemsEntryUri) {
    showStatus("Loading media feed...", false);
    String mediaFeedUri = itemsEntryUri + "/media/";
    service.getMediaFeed(mediaFeedUri, new MediaFeedCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving the media feed, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(MediaFeed result) {
        MediaEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("No media found.", false);
        } else {
          showData(entries);
        }
      }
    });
  }

  /**
  * Displays a set of Google Base media entries in a tabular 
  * fashion with the help of a GWT FlexTable widget. The data field
  * Title is displayed.
  * 
  * @param entries The Google Base media entries to display.
  */
  private void showData(MediaEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      MediaEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
    }
  }

  /**
   * Displays a status message to the user.
   * 
   * @param message The message to display.
   * @param isError Indicates whether the status is an error status.
   */
  private void showStatus(String message, boolean isError) {
    mainPanel.clear();
    mainPanel.insertRow(0);
    mainPanel.addCell(0);
    Label msg = new Label(message);
    if (isError) {
      msg.setStylePrimaryName("hm-error");
    }
    mainPanel.setWidget(0, 0, msg);
  }
}