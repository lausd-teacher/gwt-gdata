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
import com.google.gwt.gdata.client.contacts.ContactEntry;
import com.google.gwt.gdata.client.contacts.ContactFeed;
import com.google.gwt.gdata.client.contacts.ContactFeedCallback;
import com.google.gwt.gdata.client.contacts.ContactGroupEntry;
import com.google.gwt.gdata.client.contacts.ContactGroupFeed;
import com.google.gwt.gdata.client.contacts.ContactGroupFeedCallback;
import com.google.gwt.gdata.client.contacts.ContactQuery;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of contact group members.
 */
public class ContactsRetrieveContactGroupMembersDemo extends GDataDemo {

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
        return new ContactsRetrieveContactGroupMembersDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to retrieve all members of a " +
          "particular group. It first retrieves the contact group ID and use it as " +
          "the query parameter to retrieve all members of that group.</p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Retrieving all group members";
      }
    };
  }

  private ContactsService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/m8/feeds/";

  /**
   * Setup the Contacts service and create the main content panel.
   * If the user is not logged on to Contacts display a message,
   * otherwise start the demo by retrieving the user's contact groups.
   */
  public ContactsRetrieveContactGroupMembersDemo() {
    service = ContactsService.newInstance("HelloGData_Contacts_RetrieveContactGroupMembersDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      getContactGroups();
    } else {
      showStatus("You are not logged on to Google Contacts.", true);
    }
  }
  
  private void queryContacts(String contactGroupId) {
    showStatus("Loading contacts feed...", false);
    ContactQuery query = ContactQuery.newInstance("http://www.google.com/m8/feeds/contacts/default/full");
    query.setStringParam("group", contactGroupId);
    service.getContactFeed(query, new ContactFeedCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Contacts account was found for the currently logged-in user")) {
          showStatus("No Contacts account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Contacts feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(ContactFeed result) {
        ContactEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("The contact group has no member contacts.", false);
        } else {
          showData(entries);
        }
      }
    });
  }
  
  private void getContactGroups() {
    showStatus("Loading contact groups feed...", false);
    service.getContactGroupFeed("http://www.google.com/m8/feeds/groups/default/full", new ContactGroupFeedCallback() {
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
          ContactGroupEntry targetGroup = entries[0];
          String groupId = targetGroup.getId().getValue();
          queryContacts(groupId);
        }
      }
    });
  }

  /**
  * Displays a set of Google Contacts contact entries in a tabular 
  * fashion with the help of a GWT FlexTable widget. The data fields 
  * Title, Email and Updated are displayed.
  * 
  * @param entries The Google Contacts contact entries to display.
  */
  private void showData(ContactEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Email", "Updated" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      ContactEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      String email = "";
      if (entry.getEmailAddresses().length > 0) {
        email = entry.getEmailAddresses()[0].getAddress();
      }
      mainPanel.setWidget(row, 1, new Label(email));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(entry.getUpdated().getValue().getDate().toString()));
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