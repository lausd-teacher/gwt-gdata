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
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of a user's items.
 */
public class GoogleBaseRetrieveItemsDemo extends GDataDemo {

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
        return new GoogleBaseRetrieveItemsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code uses the items feed to retrieve a list of all of an " +
          "authenticated user's items. The title of each item entry is printed.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Retrieving all items";
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
  public GoogleBaseRetrieveItemsDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_RetrieveItemsDemo_v1.0");
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
        if (entries.length == 0) {
          showStatus("You have no items.", false);
        } else {
          showData(entries);
        }
      }
    });
  }

  /**
  * Displays a set of Google Base item entries in a tabular 
  * fashion with the help of a GWT FlexTable widget. The data fields 
  * Title, URL and Published are displayed.
  * 
  * @param entries The Google Base item entries to display.
  */
  private void showData(ItemsEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "URL", "Published" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      ItemsEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      if (entry.getHtmlLink() == null) {
        mainPanel.setWidget(row, 1, new Label("Not available"));
      } else {
        String link = entry.getHtmlLink().getHref();
        mainPanel.setWidget(row, 1, new HTML("<a href=\"" + link + "\" target=\"_blank\">" + link +  "</a>"));
        mainPanel.addCell(row);
        mainPanel.setWidget(row, 2, new Label(entry.getPublished().getValue().getDate().toString()));
      }
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