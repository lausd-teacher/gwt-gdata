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
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.gbase.Attribute;
import com.google.gwt.gdata.client.gbase.GoogleBaseService;
import com.google.gwt.gdata.client.gbase.ItemsEntry;
import com.google.gwt.gdata.client.gbase.ItemsEntryCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create an item.
 */
public class GoogleBaseCreateItemDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new GoogleBaseCreateItemDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a new item. " +
          "The items feed post URL (http://www.google.com/base/feeds/items) " +
          "is used to insert a new item entry for the authenticated user.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Creating an Item";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  public GoogleBaseCreateItemDemo() {
    service = GoogleBaseService.newInstance("HelloGData_GoogleBase_CreateItemDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create an item");
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
    showStatus("Creating item...", false);
    ItemsEntry entry = ItemsEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-GoogleBase-Client - inserted item");
    entry.setContent(Text.newInstance());
    entry.getContent().setText("GData is great data!! :)");
    entry.setAttribute("target_country", Attribute.newInstance());
    entry.getAttributes().get("target_country").setValue("US");
    entry.setAttribute("review_type", Attribute.newInstance());
    entry.getAttributes().get("review_type").setValue("Product Review");
    entry.setAttribute("name_of_item_reviewed", Attribute.newInstance());
    entry.getAttributes().get("name_of_item_reviewed").setValue("gwt-gdata");
    entry.setAttribute("expiration_date", Attribute.newInstance());
    entry.getAttributes().get("expiration_date").setValue("2038-01-19T03:14:07Z");
    entry.setAttribute("rating", Attribute.newInstance());
    entry.getAttributes().get("rating").setValue("5-Excellent");
    entry.setAttribute("customer_id", Attribute.newInstance());
    entry.getAttributes().get("customer_id").setValue("5752122");
    entry.setAttribute("item_type", Attribute.newInstance());
    entry.getAttributes().get("item_type").setValue("Reviews");
    entry.setAttribute("item_language", Attribute.newInstance());
    entry.getAttributes().get("item_language").setValue("en");
    
    service.insertItemsEntry("http://www.google.com/base/feeds/items", entry, new ItemsEntryCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("Terms of Service acceptance required")) {
          showStatus("No Google Base account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while creating an item, see details below:\n" + message, true);
        }
      }
      public void onSuccess(ItemsEntry result) {
        showStatus("Created an item.", false);
      }
    });
  }
}