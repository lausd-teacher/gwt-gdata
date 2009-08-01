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
  public static native AnalyticsService newInstance(String applicationName) /*-{
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
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteAccountEntry(String uri, AccountEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteDataEntry(String uri, DataEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Retrieves an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getAccountEntry(String uri, AccountEntryCallback callback) /*-{
    this.getAccountEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of accounts and profiles to which a given user has access.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getAccountFeed(AccountQuery query, AccountFeedCallback callback) /*-{
    this.getAccountFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of accounts and profiles to which a given user has access.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getAccountFeed(String uri, AccountFeedCallback callback) /*-{
    this.getAccountFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getDataEntry(String uri, DataEntryCallback callback) /*-{
    this.getDataEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getDataFeed(DataQuery query, DataFeedCallback callback) /*-{
    this.getDataFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getDataFeed(String uri, DataFeedCallback callback) /*-{
    this.getDataFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Inserts a new account entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertAccountEntry(String uri, AccountEntry entry, AccountEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new data entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertDataEntry(String uri, DataEntry entry, DataEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates an account entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateAccountEntry(String uri, AccountEntry entry, AccountEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a data entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateDataEntry(String uri, DataEntry entry, DataEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
}