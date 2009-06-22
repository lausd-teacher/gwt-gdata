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
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Google Calendar service.
 */
public class CalendarService extends GoogleService {

  /**
   * Google Calendar service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   * 
   * @param applicationName Name of application (used for tracking).
   */
  public static native CalendarService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.calendar.CalendarService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarService[name];
  }-*/;

  protected CalendarService() { }

  /**
   * Retrieves the feed of a calendar's Access Control List (ACL).
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarAclFeed getAclFeed(String uri, AsyncCallback<CalendarAclFeed> callback) /*-{
    return this.getAclFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all of the calendars a user is subscribed to.
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarFeed getAllCalendarsFeed(String uri, AsyncCallback<CalendarFeed> callback) /*-{
    return this.getAllCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Calendar ACL entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native CalendarAclEntry getCalendarAclEntry(String uri, AsyncCallback<CalendarAclEntry> callback) /*-{
    return this.getCalendarAclEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Calendar event's comment entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native CalendarCommentEntry getCalendarCommentEntry(String uri, AsyncCallback<CalendarCommentEntry> callback) /*-{
    return this.getCalendarCommentEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Calendar entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native CalendarEntry getCalendarEntry(String uri, AsyncCallback<CalendarEntry> callback) /*-{
    return this.getCalendarEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Calendar event entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native CalendarEventEntry getCalendarEventEntry(String uri, AsyncCallback<CalendarEventEntry> callback) /*-{
    return this.getCalendarEventEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the read-only feed of a user's calendars.
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarFeed getCalendarsFeed(String uri, AsyncCallback<CalendarFeed> callback) /*-{
    return this.getCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarCommentFeed getCommentsFeed(CalendarCommentQuery query, AsyncCallback<CalendarCommentFeed> callback) /*-{
    return this.getCommentsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar event's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarCommentFeed getCommentsFeed(String uri, AsyncCallback<CalendarCommentFeed> callback) /*-{
    return this.getCommentsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarEventFeed getEventsFeed(CalendarEventQuery query, AsyncCallback<CalendarEventFeed> callback) /*-{
    return this.getEventsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a calendar's events.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarEventFeed getEventsFeed(String uri, AsyncCallback<CalendarEventFeed> callback) /*-{
    return this.getEventsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of the calendars a user owns.
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarFeed getOwnCalendarsFeed(String uri, AsyncCallback<CalendarFeed> callback) /*-{
    return this.getOwnCalendarsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Calendar Settings property entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native SettingsEntry getSettingsEntry(String uri, AsyncCallback<SettingsEntry> callback) /*-{
    return this.getSettingsEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of user personal settings.
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native CalendarSettingsFeed getSettingsFeed(String uri, AsyncCallback<CalendarSettingsFeed> callback) /*-{
    return this.getSettingsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
