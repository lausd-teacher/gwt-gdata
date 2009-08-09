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
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.contacts.ContactEntry;
import com.google.gwt.gdata.client.contacts.ContactEntryCallback;
import com.google.gwt.gdata.client.contacts.ContactFeed;
import com.google.gwt.gdata.client.contacts.ContactFeedCallback;
import com.google.gwt.gdata.client.contacts.ContactQuery;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import java.util.Date;

/**
 * The following example demonstrates how to update a contact.
 */
public class ContactsUpdateContactDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new ContactsUpdateContactDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrate how to update a contact entry. It queries for the most " +
          "recently modified contact entry of today from the authenticated user and update that " +
          "entry with a phone number.</p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Updating contacts";
      }
    };
  }

  private ContactsService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/m8/feeds/";

  public ContactsUpdateContactDemo() {
    service = ContactsService.newInstance("HelloGData_Contacts_UpdateContactDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update a contact");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Contacts.", true);
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
    showStatus("Querying contacts...", false);
    ContactQuery query = ContactQuery.newInstance("http://www.google.com/m8/feeds/contacts/default/full");
    Date today = new Date();
    DateTime updatedMin = DateTime.newInstance(today, true);
    query.setUpdatedMin(updatedMin);
    query.setSortOrder(ContactQuery.SORTORDER_DESCENDING);
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
        ContactEntry targetEntry = null;
        for (ContactEntry contact : entries) {
          String title = contact.getTitle().getText();
          if (title.startsWith("GWT-Contacts-Client")) {
            targetEntry = contact;
            break;
          }
        }
        if (targetEntry == null) {
          showStatus("No contacts were found that were modified today and contained 'GWT-Contacts-Client' in the title.", false);
        } else {
          targetEntry.setTitle(Text.newInstance());
          targetEntry.getTitle().setText("GWT-Contacts-Client - updated contact");
          PhoneNumber phoneNumber = PhoneNumber.newInstance();
          phoneNumber.setValue("123-456-7890");
          phoneNumber.setRel(PhoneNumber.REL_WORK);
          targetEntry.setPhoneNumbers(new PhoneNumber[] { phoneNumber });
          showStatus("Updating a contact event...", false);
          targetEntry.updateEntry(new ContactEntryCallback() {
            public void onFailure(Throwable caught) {
              showStatus("An error occurred while updating a contact, see details below:\n" + caught.getMessage(), true);
            }
            public void onSuccess(ContactEntry result) {
              showStatus("Updated a contact.", false);
            }
          });
        }
      }
    });
  }
}