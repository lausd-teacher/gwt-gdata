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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete an item.
 */
public class GoogleBaseDeleteItemDemo extends GDataDemo {

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
        return "Google Base - Deleting an Item";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  public GoogleBaseDeleteItemDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_DeleteItemDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete an item");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Base.", true);
    }
  }
  public void showStatus(String message, boolean isError) {
    mainPanel.clear();
    mainPanel.insertRow(0);
    mainPanel.addCell(0);
    Label msg = new Label(message);
    if (isError) {
      msg.setStylePrimaryName("hm-error");
    }
    mainPanel.setWidget(0, 0, msg);
  }
  public void startDemo() {
    showStatus("Loading items feed...", false);
    service.getItemsFeed("http://www.google.com/base/feeds/items/", new ItemsFeedCallback() {
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
        ItemsEntry targetEntry = null;
        for (ItemsEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("GWT-GoogleBase-Client")) {
            targetEntry = entry;
            break;
          }
        }
        if (targetEntry == null) {
          showStatus("No item found that contains 'GWT-GoogleBase-Client' in the title.", false);
        } else {
          deleteItem(targetEntry);
        }
      }
    });
  }
  public void deleteItem(ItemsEntry entry) {
    showStatus("Updating item...", false);
    entry.deleteEntry(new ItemsEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while deleting an item, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(ItemsEntry result) {
        showStatus("Deleted an item.", false);
      }
    });
  }
}