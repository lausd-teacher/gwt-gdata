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
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAclFeed(String uri, CalendarAclFeedCallback callback) {
    this.getAclFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getAclFeed(String uri, CalendarAclFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getAclFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAllCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getAllCalendarsFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getAllCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getAllCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback) {
    this.getCalendarAclEntry(uri, callback, null);
  }

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCalendarAclEntry(String uri,
      CalendarAclEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getCalendarAclEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback) {
    this.getCalendarCommentEntry(uri, callback, null);
  }

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCalendarCommentEntry(String uri,
      CalendarCommentEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getCalendarCommentEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarEntry(String uri,
      CalendarEntryCallback callback) {
    this.getCalendarEntry(uri, callback, null);
  }

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCalendarEntry(String uri,
      CalendarEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getCalendarEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback) {
    this.getCalendarEventEntry(uri, callback, null);
  }

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCalendarEventEntry(String uri,
      CalendarEventEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getCalendarEventEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getCalendarsFeed(uri, callback, null);
  }

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCommentsFeed(CalendarCommentQuery query,
      CalendarCommentFeedCallback callback) {
    this.getCommentsFeed(query, callback, null);
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCommentsFeed(CalendarCommentQuery query,
      CalendarCommentFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getCommentsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCommentsFeed(String uri,
      CalendarCommentFeedCallback callback) {
    this.getCommentsFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCommentsFeed(String uri,
      CalendarCommentFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getCommentsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getEventsFeed(CalendarEventQuery query,
      CalendarEventFeedCallback callback) {
    this.getEventsFeed(query, callback, null);
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getEventsFeed(CalendarEventQuery query,
      CalendarEventFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getEventsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getEventsFeed(String uri,
      CalendarEventFeedCallback callback) {
    this.getEventsFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getEventsFeed(String uri,
      CalendarEventFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getEventsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getOwnCalendarsFeed(String uri,
      CalendarFeedCallback callback) {
    this.getOwnCalendarsFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getOwnCalendarsFeed(String uri,
      CalendarFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getOwnCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSettingsEntry(String uri,
      SettingsEntryCallback callback) {
    this.getSettingsEntry(uri, callback, null);
  }
  
  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSettingsEntry(String uri,
      SettingsEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getSettingsEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
  );
  }-*/;

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSettingsFeed(String uri,
      CalendarSettingsFeedCallback callback) {
    this.getSettingsFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSettingsFeed(String uri,
      CalendarSettingsFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getSettingsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

}