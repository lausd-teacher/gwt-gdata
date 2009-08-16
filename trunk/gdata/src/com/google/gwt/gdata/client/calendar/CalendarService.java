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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Calendar service.
 */
public class CalendarService extends GoogleService {

  /**
   * Google Calendar service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a Calendar service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A CalendarService object.
   */
  public static native CalendarService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.calendar.CalendarService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarService[name];
  }-*/;

  protected CalendarService() { }

  /**
   * Deletes a calendar acl entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteCalendarAclEntry(String uri, CalendarAclEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteCalendarCommentEntry(String uri, CalendarCommentEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteCalendarEntry(String uri, CalendarEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteCalendarEventEntry(String uri, CalendarEventEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a settings entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteSettingsEntry(String uri, SettingsEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getAclFeed(String uri, CalendarAclFeedCallback callback) {
    this.getFeed(uri, callback, "getAclFeed");
  }

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getAllCalendarsFeed(String uri, CalendarFeedCallback callback) {
    this.getFeed(uri, callback, "getAllCalendarsFeed");
  }

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCalendarAclEntry(String uri, CalendarAclEntryCallback callback) {
    this.getEntry(uri, callback, "getCalendarAclEntry");
  }

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCalendarCommentEntry(String uri, CalendarCommentEntryCallback callback) {
    this.getEntry(uri, callback, "getCalendarCommentEntry");
  }

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCalendarEntry(String uri, CalendarEntryCallback callback) {
    this.getEntry(uri, callback, "getCalendarEntry");
  }

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCalendarEventEntry(String uri, CalendarEventEntryCallback callback) {
    this.getEntry(uri, callback, "getCalendarEventEntry");
  }

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCalendarsFeed(String uri, CalendarFeedCallback callback) {
    this.getFeed(uri, callback, "getCalendarsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCommentsFeed(CalendarCommentQuery query, CalendarCommentFeedCallback callback) {
    this.getFeed(query, callback, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getCommentsFeed(String uri, CalendarCommentFeedCallback callback) {
    this.getFeed(uri, callback, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getEventsFeed(CalendarEventQuery query, CalendarEventFeedCallback callback) {
    this.getFeed(query, callback, "getEventsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getEventsFeed(String uri, CalendarEventFeedCallback callback) {
    this.getFeed(uri, callback, "getEventsFeed");
  }

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getOwnCalendarsFeed(String uri, CalendarFeedCallback callback) {
    this.getFeed(uri, callback, "getOwnCalendarsFeed");
  }
  
  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getSettingsEntry(String uri, SettingsEntryCallback callback) {
    this.getEntry(uri, callback, "getSettingsEntry");
  }

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getSettingsFeed(String uri, CalendarSettingsFeedCallback callback) {
    this.getFeed(uri, callback, "getSettingsFeed");
  }

  /**
   * Inserts a new calendar acl entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertCalendarAclEntry(String uri, CalendarAclEntry entry, CalendarAclEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar comment entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertCalendarCommentEntry(String uri, CalendarCommentEntry entry, CalendarCommentEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertCalendarEntry(String uri, CalendarEntry entry, CalendarEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar event entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertCalendarEventEntry(String uri, CalendarEventEntry entry, CalendarEventEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new settings entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertSettingsEntry(String uri, SettingsEntry entry, SettingsEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates a calendar acl entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateCalendarAclEntry(String uri, CalendarAclEntry entry, CalendarAclEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
  /**
   * Updates a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateCalendarCommentEntry(String uri, CalendarCommentEntry entry, CalendarCommentEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
  /**
   * Updates a calendar entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateCalendarEntry(String uri, CalendarEntry entry, CalendarEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
  /**
   * Updates a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateCalendarEventEntry(String uri, CalendarEventEntry entry, CalendarEventEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
  /**
   * Updates a settings entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateSettingsEntry(String uri, SettingsEntry entry, SettingsEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

}