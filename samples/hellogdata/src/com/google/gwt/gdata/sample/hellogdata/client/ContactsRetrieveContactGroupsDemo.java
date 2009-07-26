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
import com.google.gwt.gdata.client.contacts.ContactGroupEntry;
import com.google.gwt.gdata.client.contacts.ContactGroupFeed;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to retrieve a list of a user's contact groups.
 */
public class ContactsRetrieveContactGroupsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new ContactsRetrieveContactGroupsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code retrieves all the contact groups of the authenticated user.</p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Retrieving all contacts groups";
      }
    };
  }

  private ContactsService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/m8/feeds/";

  public ContactsRetrieveContactGroupsDemo() {
    service = ContactsService.newInstance("HelloGData_Contacts_RetrieveContactGroupsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      Button loginButton = new Button();
      loginButton.setText("Login to Contacts to start demo...");
      loginButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          User.login(scope);
        }
      });
      mainPanel.setWidget(0, 0, loginButton);
    }
  }
  public void showData(ContactGroupEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Id" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      ContactGroupEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(entry.getId().getValue()));
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
    showStatus("Loading contact groups feed...", false);
    service.getContactGroupFeed("http://www.google.com/m8/feeds/groups/default/full", new AsyncCallback<ContactGroupFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Contacts account was found for the currently logged-in user")) {
          showStatus("No Contacts account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the contact groups feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(ContactGroupFeed result) {
        ContactGroupEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no contact groups.", false);
        } else {
          showData(entries);
        }
      }
    });
  }
}