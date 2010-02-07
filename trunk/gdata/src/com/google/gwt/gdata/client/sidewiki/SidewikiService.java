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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Sidewiki Data API service.
 */
public class SidewikiService extends GoogleService {

  /**
   * Google Sidewiki Data API service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a sidewiki service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A SidewikiService object.
   */
  public static native SidewikiService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.sidewiki.SidewikiService[name];
  }-*/;

  protected SidewikiService() { }
  
  /**
   * Retrieves a sidewiki entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntry(String uri,
      SidewikiEntryCallback callback) {
    this.getSidewikiEntry(uri, callback, null);
  }
  
  /**
   * Retrieves a sidewiki entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiEntry(String uri,
      SidewikiEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntryFeed(SidewikiEntryQuery query,
      SidewikiEntryFeedCallback callback) {
    this.getSidewikiEntryFeed(query, callback, null);
  }

  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiEntryFeed(SidewikiEntryQuery query,
      SidewikiEntryFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiEntryFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntryFeed(String uri,
      SidewikiEntryFeedCallback callback) {
    this.getSidewikiEntryFeed(uri, callback, null);
  }
  
  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiEntryFeed(String uri,
      SidewikiEntryFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiEntryFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves a sidewiki user entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserEntry(String uri,
      SidewikiUserEntryCallback callback) {
    this.getSidewikiUserEntry(uri, callback, null);
  }
  
  /**
   * Retrieves a sidewiki user entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiUserEntry(String uri,
      SidewikiUserEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiUserEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserFeed(SidewikiUserQuery query,
      SidewikiUserFeedCallback callback) {
    this.getSidewikiUserFeed(query, callback, null);
  }
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiUserFeed(SidewikiUserQuery query,
      SidewikiUserFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiUserFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserFeed(String uri,
      SidewikiUserFeedCallback callback) {
    this.getSidewikiUserFeed(uri, callback, null);
  }
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSidewikiUserFeed(String uri,
      SidewikiUserFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getSidewikiUserFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
}