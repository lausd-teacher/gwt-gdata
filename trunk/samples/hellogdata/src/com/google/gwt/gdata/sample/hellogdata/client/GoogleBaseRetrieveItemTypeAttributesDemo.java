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
import com.google.gwt.gdata.client.gbase.AttributesEntry;
import com.google.gwt.gdata.client.gbase.AttributesFeed;
import com.google.gwt.gdata.client.gbase.AttributesFeedCallback;
import com.google.gwt.gdata.client.gbase.GmAttribute;
import com.google.gwt.gdata.client.gbase.GmValue;
import com.google.gwt.gdata.client.gbase.GoogleBaseService;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of attributes for an item type.
 */
public class GoogleBaseRetrieveItemTypeAttributesDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new GoogleBaseRetrieveItemTypeAttributesDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code uses the attributes feed to query for metadata about product " +
          "listed in Google Base. The attributes feed is useful for determining what kinds of " +
          "attributes other users are using with certain item types. This example, looks at " +
          "attributes related to the products vertical.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Retrieving item type attributes";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  public GoogleBaseRetrieveItemTypeAttributesDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_RetrieveAttributesDemo_v1.0");
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
  public void showData(AttributesEntry[] attributes) {
    mainPanel.clear();
    String[] labels = new String[] { "Name", "Type", "Common Values" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < attributes.length; i++) {
      AttributesEntry attribute = attributes[i];
      GmAttribute attributeInfo = attribute.getAttribute();
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(attributeInfo.getName()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(attributeInfo.getType()));
      mainPanel.addCell(row);
      String commonValues = "";
      for (GmValue value : attributeInfo.getValues()) {
        commonValues += value.getValue() + "\n";
      }
      mainPanel.setWidget(row, 2, new Label(commonValues));
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
    showStatus("Loading attributes feed...", false);
    service.getAttributesFeed("http://www.google.com/base/feeds/attributes/-/products", new AttributesFeedCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("Terms of Service acceptance required")) {
          showStatus("No Google Base account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the attributes feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(AttributesFeed result) {
        AttributesEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("No attributes found.", false);
        } else {
          showData(entries);
        }
      }
    });
  }
}