/*
 * Copyright 2009 Google Inc.
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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Contacts service.
 */
public class ContactsService extends GoogleService {

  /**
   * Google Contacts service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a ContactsService object.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A ContactsService object.
   */
  public static native ContactsService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.contacts.ContactsService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.ContactsService[name];
  }-*/;

  protected ContactsService() { }

  /**
   * Deletes a contact entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteContactEntry(String uri,
      ContactEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a contact group entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteContactGroupEntry(String uri,
      ContactGroupEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Retrieves a contact entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactEntry(String uri,
      ContactEntryCallback callback) {
    this.getEntry(uri, callback, "getContactEntry");
  }

  /**
   * Retrieves the feed of contacts.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactFeed(ContactQuery query,
      ContactFeedCallback callback) {
    this.getFeed(query, callback, "getContactFeed");
  }

  /**
   * Retrieves the feed of contacts.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactFeed(String uri,
      ContactFeedCallback callback) {
    this.getFeed(uri, callback, "getContactFeed");
  }

  /**
   * Retrieves a contact group entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactGroupEntry(String uri,
      ContactGroupEntryCallback callback) {
    this.getEntry(uri, callback, "getContactGroupEntry");
  }

  /**
   * Retrieves the feed of contact groups.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactGroupFeed(ContactQuery query,
      ContactGroupFeedCallback callback) {
    this.getFeed(query, callback);
  }

  /**
   * Retrieves the feed of contact groups.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getContactGroupFeed(String uri,
      ContactGroupFeedCallback callback) {
    this.getFeed(uri, callback, "getContactGroupFeed");
  }

  /**
   * Inserts a new contact entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertContactEntry(String uri, ContactEntry entry,
      ContactEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new contact group entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertContactGroupEntry(String uri,
      ContactGroupEntry entry, ContactGroupEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates a contact entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateContactEntry(String uri, ContactEntry entry,
      ContactEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
  /**
   * Updates a contact group entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateContactGroupEntry(String uri,
      ContactGroupEntry entry, ContactGroupEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

}