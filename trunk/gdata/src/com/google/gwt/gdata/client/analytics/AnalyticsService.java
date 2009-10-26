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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.GoogleService;

/**
 * Analytics service.
 */
public class AnalyticsService extends GoogleService {

  /**
   * Analytics service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs an analytics service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return An AnalyticsService object.
   */
  public static native AnalyticsService newInstance(
      String applicationName) /*-{
    return new $wnd.google.gdata.analytics.AnalyticsService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.AnalyticsService[name];
  }-*/;

  protected AnalyticsService() { }

  /**
   * Deletes an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteAccountEntry(String uri,
      AccountEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteAccountEntry(String uri,
      AccountEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Retrieves an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAccountEntry(String uri,
      AccountEntryCallback callback) {
    this.getEntry(uri, callback, null, "getAccountEntry");
  }

  /**
   * Retrieves an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAccountEntry(String uri,
      AccountEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getAccountEntry");
  }

  /**
   * Retrieves the feed of accounts and profiles to which a given user has
   * access.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAccountFeed(AccountQuery query,
      AccountFeedCallback callback) {
    this.getFeed(query, callback, null, "getAccountFeed");
  }

  /**
   * Retrieves the feed of accounts and profiles to which a given user has
   * access.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAccountFeed(AccountQuery query,
      AccountFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getAccountFeed");
  }

  /**
   * Retrieves the feed of accounts and profiles to which a given user has
   * access.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAccountFeed(String uri, AccountFeedCallback callback) {
    this.getFeed(uri, callback, null, "getAccountFeed");
  }

  /**
   * Retrieves the feed of accounts and profiles to which a given user has
   * access.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAccountFeed(String uri, AccountFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getAccountFeed");
  }

  /**
   * Retrieves a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataEntry(String uri, DataEntryCallback callback) {
    this.getEntry(uri, callback, null, "getDataEntry");
  }

  /**
   * Retrieves a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getDataEntry(String uri, DataEntryCallback callback,
      GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getDataEntry");
  }
  
  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataFeed(DataQuery query, DataFeedCallback callback) {
    this.getFeed(query, callback, null, "getDataFeed");
  }
  
  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getDataFeed(DataQuery query, DataFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getDataFeed");
  }

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataFeed(String uri, DataFeedCallback callback) {
    this.getFeed(uri, callback, null, "getDataFeed");
  }

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getDataFeed(String uri, DataFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getDataFeed");
  }

  /**
   * Inserts a new account entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertAccountEntry(String uri, AccountEntry entry,
      AccountEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates an account entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateAccountEntry(String uri, AccountEntry entry,
      AccountEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates an account entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateAccountEntry(String uri, AccountEntry entry,
      AccountEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
}