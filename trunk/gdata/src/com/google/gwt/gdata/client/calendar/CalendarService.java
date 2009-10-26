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

import com.google.gwt.gdata.client.GDataRequestParameters;
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
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a calendar acl entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteCalendarEntry(String uri,
      CalendarEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteCalendarEntry(String uri,
      CalendarEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a settings entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteSettingsEntry(String uri,
      SettingsEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a settings entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteSettingsEntry(String uri,
      SettingsEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAclFeed(String uri, CalendarAclFeedCallback callback) {
    this.getFeed(uri, callback, null, "getAclFeed");
  }

  /**
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAclFeed(String uri, CalendarAclFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getAclFeed");
  }

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAllCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getFeed(uri, callback, null, "getAllCalendarsFeed");
  }

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAllCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getAllCalendarsFeed");
  }

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback) {
    this.getEntry(uri, callback, null, "getCalendarAclEntry");
  }

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getCalendarAclEntry");
  }

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback) {
    this.getEntry(uri, callback, null, "getCalendarCommentEntry");
  }

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback,
      GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getCalendarCommentEntry");
  }

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarEntry(String uri,
      CalendarEntryCallback callback) {
    this.getEntry(uri, callback, null, "getCalendarEntry");
  }

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCalendarEntry(String uri,
      CalendarEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getCalendarEntry");
  }

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback) {
    this.getEntry(uri, callback, null, "getCalendarEventEntry");
  }

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getCalendarEventEntry");
  }

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getFeed(uri, callback, null, "getCalendarsFeed");
  }

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getCalendarsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCommentsFeed(CalendarCommentQuery query,
      CalendarCommentFeedCallback callback) {
    this.getFeed(query, callback, null, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCommentsFeed(CalendarCommentQuery query,
      CalendarCommentFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCommentsFeed(String uri,
      CalendarCommentFeedCallback callback) {
    this.getFeed(uri, callback, null, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCommentsFeed(String uri,
      CalendarCommentFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getCommentsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getEventsFeed(CalendarEventQuery query,
      CalendarEventFeedCallback callback) {
    this.getFeed(query, callback, null, "getEventsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getEventsFeed(CalendarEventQuery query,
      CalendarEventFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getEventsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getEventsFeed(String uri,
      CalendarEventFeedCallback callback) {
    this.getFeed(uri, callback, null, "getEventsFeed");
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getEventsFeed(String uri,
      CalendarEventFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getEventsFeed");
  }

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getOwnCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getFeed(uri, callback, null, "getOwnCalendarsFeed");
  }

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getOwnCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getOwnCalendarsFeed");
  }
  
  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSettingsEntry(String uri,
      SettingsEntryCallback callback) {
    this.getEntry(uri, callback, null, "getSettingsEntry");
  }
  
  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSettingsEntry(String uri,
      SettingsEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getSettingsEntry");
  }

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSettingsFeed(String uri,
      CalendarSettingsFeedCallback callback) {
    this.getFeed(uri, callback, null, "getSettingsFeed");
  }

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSettingsFeed(String uri,
      CalendarSettingsFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getSettingsFeed");
  }

  /**
   * Inserts a new calendar acl entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCalendarAclEntry(String uri,
      CalendarAclEntry entry, CalendarAclEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar comment entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCalendarCommentEntry(String uri,
      CalendarCommentEntry entry, CalendarCommentEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCalendarEntry(String uri,
      CalendarEntry entry, CalendarEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new calendar event entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCalendarEventEntry(String uri,
      CalendarEventEntry entry, CalendarEventEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new settings entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertSettingsEntry(String uri,
      SettingsEntry entry, SettingsEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates a calendar acl entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateCalendarAclEntry(String uri,
      CalendarAclEntry entry, CalendarAclEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a calendar acl entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateCalendarAclEntry(String uri,
      CalendarAclEntry entry, CalendarAclEntryCallback callback,
      GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
  
  /**
   * Updates a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateCalendarCommentEntry(String uri,
      CalendarCommentEntry entry, CalendarCommentEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a calendar comment entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateCalendarCommentEntry(String uri,
      CalendarCommentEntry entry, CalendarCommentEntryCallback callback,
      GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
  
  /**
   * Updates a calendar entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateCalendarEntry(String uri,
      CalendarEntry entry, CalendarEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a calendar entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateCalendarEntry(String uri,
      CalendarEntry entry, CalendarEntryCallback callback,
      GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
  
  /**
   * Updates a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateCalendarEventEntry(String uri,
      CalendarEventEntry entry, CalendarEventEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a calendar event entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateCalendarEventEntry(String uri,
      CalendarEventEntry entry, CalendarEventEntryCallback callback,
      GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
  
  /**
   * Updates a settings entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateSettingsEntry(String uri,
      SettingsEntry entry, SettingsEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a settings entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateSettingsEntry(String uri,
      SettingsEntry entry, SettingsEntryCallback callback,
      GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

}