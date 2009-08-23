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
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create an item.
 */
public class GoogleBaseCreateItemDemo extends GDataDemo {

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
        return new GoogleBaseCreateItemDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert " +
            "a new item. The items feed post URL " +
            "(http://www.google.com/base/feeds/items) is used to insert a " +
            "new item entry for the authenticated user.</p>\n";
      }

      @Override
      public String getName() {
        return "Google Base - Creating an item";
      }
    };
  }

  private GoogleBaseService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/base/feeds/";

  /**
   * Setup the Google Base service and create the main content panel.
   * If the user is not logged on to Google Base display a message,
   * otherwise start the demo by creating an item.
   */
  public GoogleBaseCreateItemDemo() {
    service = GoogleBaseService.newInstance(
        "HelloGData_GoogleBase_CreateItemDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create an item");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          createItem("http://www.google.com/base/feeds/items");
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Base.", true);
    }
  }

  /**
   * Create an item by inserting an item entry into
   * an items feed.
   * Set the item's title to an arbitrary string. Here
   * we prefix the title with 'GWT-GoogleBase-Client' so that
   * we can identify which items were created by this demo.
   * The new item is created as a product review with values
   * for the default product review attributes.
   * On success and failure, display a status message.
   * 
   * @param itemsFeedUri The uri of the items feed into which
   * to insert the new item entry
   */
  private void createItem(String itemsFeedUri) {
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
    entry.getAttributes().get("expiration_date").setValue(
        "2038-01-19T03:14:07Z");
    entry.setAttribute("rating", Attribute.newInstance());
    entry.getAttributes().get("rating").setValue("5-Excellent");
    entry.setAttribute("customer_id", Attribute.newInstance());
    entry.getAttributes().get("customer_id").setValue("5752122");
    entry.setAttribute("item_type", Attribute.newInstance());
    entry.getAttributes().get("item_type").setValue("Reviews");
    entry.setAttribute("item_language", Attribute.newInstance());
    entry.getAttributes().get("item_language").setValue("en");
    
    service.insertItemsEntry(itemsFeedUri, entry, new ItemsEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while creating an item: " +
            caught.getMessage(), true);
      }
      public void onSuccess(ItemsEntry result) {
        showStatus("Created an item.", false);
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