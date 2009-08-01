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
import com.google.gwt.gdata.client.Email;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.contacts.ContactEntry;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a contact.
 */
public class ContactsCreateContactDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new ContactsCreateContactDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create a new contact entry.</p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Creating contacts";
      }
    };
  }

  private ContactsService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/m8/feeds/";

  public ContactsCreateContactDemo() {
    service = ContactsService.newInstance("HelloGData_Contacts_CreateContactDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a contact");
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
    showStatus("Creating contact...", false);
    ContactEntry entry = ContactEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Contacts-Client: Create Contact");
    entry.setContent(Text.newInstance());
    entry.getContent().setText("content info here");
    Email email = Email.newInstance();
    email.setAddress("GWT-Contacts-Client@domain.com");
    email.setPrimary(true);
    email.setRel(Email.REL_HOME);
    entry.setEmailAddresses(new Email[] { email });
    service.insertEntry("http://www.google.com/m8/feeds/contacts/default/full", entry, new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Contacts account was found for the currently logged-in user")) {
          showStatus("No Contacts account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while creating a contact, see details below:\n" + message, true);
        }
      }
      public void onSuccess(ContactEntry result) {
        showStatus("Created a contact.", false);
      }
    });
  }
}