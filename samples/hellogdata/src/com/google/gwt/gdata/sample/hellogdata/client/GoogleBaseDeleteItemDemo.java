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
import com.google.gwt.gdata.client.gbase.ItemsEntryCallback;
import com.google.gwt.gdata.client.gbase.ItemsFeed;
import com.google.gwt.gdata.client.gbase.ItemsFeedCallback;
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete an item.
 */
public class GoogleBaseDeleteItemDemo extends GDataDemo {

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
        return new GoogleBaseDeleteItemDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to delete an existing item of the " +
          "authenticated user. It retrieves a list of the user's items, and deletes " +
          "the first item with a title that starts with 'GWT-GoogleBase-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Deleting an item";
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
  public GoogleBaseDeleteItemDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_DeleteItemDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete an item");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getItems();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Base.", true);
    }
  }
  
  private void deleteItem(String itemsEntryUri) {
    showStatus("Updating item...", false);
    service.deleteItemsEntry(itemsEntryUri, new ItemsEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while deleting an item: " + caught.getMessage(), true);
      }
      public void onSuccess(ItemsEntry result) {
        showStatus("Deleted an item.", false);
      }
    });
  }
  
  private void getItems() {
    showStatus("Loading items feed...", false);
    service.getItemsFeed("http://www.google.com/base/feeds/items/", new ItemsFeedCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the items feed: " + caught.getMessage(), true);
      }
      public void onSuccess(ItemsFeed result) {
        ItemsEntry[] entries = result.getEntries();
        ItemsEntry targetItem = null;
        for (ItemsEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("GWT-GoogleBase-Client")) {
            targetItem = entry;
            break;
          }
        }
        if (targetItem == null) {
          showStatus("No item found that contains 'GWT-GoogleBase-Client' in the title.", false);
        } else {
          String itemsEntryUri = targetItem.getSelfLink().getHref();
          deleteItem(itemsEntryUri);
        }
      }
    });
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