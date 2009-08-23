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
import com.google.gwt.gdata.client.contacts.ContactEntry;
import com.google.gwt.gdata.client.contacts.ContactEntryCallback;
import com.google.gwt.gdata.client.contacts.ContactFeed;
import com.google.gwt.gdata.client.contacts.ContactFeedCallback;
import com.google.gwt.gdata.client.contacts.ContactQuery;
import com.google.gwt.gdata.client.contacts.ContactsService;
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import java.util.Date;

/**
 * The following example demonstrates how to delete a contact.
 */
public class ContactsDeleteContactDemo extends GDataDemo {

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
        return new ContactsDeleteContactDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrate how to delete a contact " +
            "entry. It queries for the most recently modified contact " +
            "entry of today from the authenicated user and delete the " +
            "entry.</p>\n";
      }

      @Override
      public String getName() {
        return "Contacts - Deleting contacts";
      }
    };
  }

  private ContactsService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/m8/feeds/";

  /**
   * Setup the Contacts service and create the main content panel.
   * If the user is not logged on to Contacts display a message,
   * otherwise start the demo by querying the user's contacts.
   */
  public ContactsDeleteContactDemo() {
    service = ContactsService.newInstance(
        "HelloGData_Contacts_DeleteContactDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a contact");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          queryContacts(
              "http://www.google.com/m8/feeds/contacts/default/full");
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Contacts.", true);
    }
  }

  /**
   * Delete a contact entry using the Contact service and
   * the contact entry uri.
   * On success and failure, display a status message.
   * 
   * @param contactEntryUri The uri of the contact entry to delete
   */
  private void deleteContact(String contactEntryUri) {
    showStatus("Deleting a contact...", false);
    service.deleteContactEntry(contactEntryUri, new ContactEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while deleting a contact: " +
            caught.getMessage(), true);
      }
      public void onSuccess(ContactEntry result) {
        showStatus("Deleted a contact.", false);
      }
    });
  }

  /**
   * Retrieves a contacts feed using a Query object.
   * In GData, feed URIs can contain query string parameters. The
   * GData query objects aid in building parameterized feed URIs.
   * On success, obtain the first contact entry with a title starting
   * with "GWT-Contacts-Client", this is the contact that will be deleted.
   * If no contact is found, display a message.
   * Otherwise call deleteContact to delete the contact entry.
   * Alternatively we could also have used targetContact.deleteEntry to
   * delete the contact, but the effect is the same.
   * 
   * @param contactsFeedUri The contacts feed uri.
   */
  private void queryContacts(String contactsFeedUri) {
    showStatus("Querying contacts...", false);
    ContactQuery query = ContactQuery.newInstance(contactsFeedUri);
    Date today = new Date();
    DateTime updatedMin = DateTime.newInstance(today, true);
    query.setUpdatedMin(updatedMin);
    query.setSortOrder(ContactQuery.SORTORDER_DESCENDING);
    service.getContactFeed(query, new ContactFeedCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the Contacts feed: " +
            caught.getMessage(), true);
      }
      public void onSuccess(ContactFeed result) {
        ContactEntry[] entries = result.getEntries();
        ContactEntry targetContact = null;
        for (ContactEntry contact : entries) {
          String title = contact.getTitle().getText();
          if (title.startsWith("GWT-Contacts-Client")) {
            targetContact = contact;
            break;
          }
        }
        if (targetContact == null) {
          showStatus("No contacts were found that were modified today and " +
              "contained 'GWT-Contacts-Client' in the title.", false);
        } else {
          String contactEntryUri = targetContact.getSelfLink().getHref();
          deleteContact(contactEntryUri);
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