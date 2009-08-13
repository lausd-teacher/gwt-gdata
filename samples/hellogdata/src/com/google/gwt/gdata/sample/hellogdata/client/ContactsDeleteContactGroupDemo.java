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
import com.google.gwt.gdata.client.contacts.ContactGroupEntryCallback;
import com.google.gwt.gdata.client.contacts.ContactGroupFeed;
import com.google.gwt.gdata.client.contacts.ContactGroupFeedCallback;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a contact group.
 */
public class ContactsDeleteContactGroupDemo extends GDataDemo {

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
        return new ContactsDeleteContactGroupDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrate how to delete a contact group entry. It locates the " +
          "contact group that has a title that starts with 'GWT-Contacts-Client' and delete the group. </p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Deleting contact groups";
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
  public ContactsDeleteContactGroupDemo() {
    service = ContactsService.newInstance("HelloGData_Contacts_DeleteContactGroupDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a contact group");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getContactGroups();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Contacts.", true);
    }
  }
  
  private void deleteContactGroup(String contactGroupEntryUri) {
    showStatus("Deleting a contact group...", false);
    service.deleteContactGroupEntry(contactGroupEntryUri, new ContactGroupEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while deleting a contact group, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(ContactGroupEntry result) {
        showStatus("Deleted a contact group.", false);
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
        ContactGroupEntry targetGroup = null;
        for (ContactGroupEntry group : entries) {
          String title = group.getTitle().getText();
          if (title.startsWith("GWT-Contacts-Client")) {
            targetGroup = group;
            break;
          }
        }
        if (targetGroup == null) {
          showStatus("No contacts were found with a title starting with 'GWT-Contacts-Client'.", false);
        } else {
          String contactGroupEntryUri = targetGroup.getSelfLink().getHref();
          deleteContactGroup(contactGroupEntryUri);
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