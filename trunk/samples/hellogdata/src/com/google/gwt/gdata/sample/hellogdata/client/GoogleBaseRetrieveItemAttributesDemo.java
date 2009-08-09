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
import com.google.gwt.gdata.client.gbase.Attribute;
import com.google.gwt.gdata.client.gbase.GoogleBaseService;
import com.google.gwt.gdata.client.gbase.ItemsEntry;
import com.google.gwt.gdata.client.gbase.ItemsFeed;
import com.google.gwt.gdata.client.gbase.ItemsFeedCallback;
import com.google.gwt.gdata.client.impl.Map;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of an item's attributes.
 */
public class GoogleBaseRetrieveItemAttributesDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new GoogleBaseRetrieveItemAttributesDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code uses the items feed to find an item with a " +
          "title starting with 'GWT-GoogleBase-Client' and displays its attributes.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Retrieving item attributes";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  public GoogleBaseRetrieveItemAttributesDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_RetrieveItemAttributesDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      showStatus("You are not logged on to Google Base.", true);
    }
  }
  public void showData(Map<Attribute> attributes) {
    mainPanel.clear();
    String[] labels = new String[] { "Name", "Type", "Value" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    String[] attributeNames = attributes.keys();
    for (int i = 0; i < attributeNames.length; i++) {
      String attributeName = attributeNames[i];
      Attribute attribute = attributes.get(attributeName);
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(attributeName));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(attribute.getType()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(attribute.getValue()));
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
          ItemsEntry targetEntry = null;
          for (ItemsEntry entry : entries) {
            String title = entry.getTitle().getText();
            if (title.startsWith("GWT-GoogleBase-Client")) {
              targetEntry = entry;
              break;
            }
          }
          if (targetEntry == null) {
            showStatus("No item found that contains 'GWT-GoogleBase-Client' in the title.", false);
          } else {
            showData(targetEntry.getAttributes());
          }
        }
      }
    });
  }
}