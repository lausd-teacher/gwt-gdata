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
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class AnalyticsService extends GoogleService {

  /**
   * Analytics service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   */
  public static native AnalyticsService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.analytics.AnalyticsService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.AnalyticsService[name];
  }-*/;

  protected AnalyticsService() { }

  /**
   * Retrieves an account entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AccountEntry getAccountEntry(String uri, AsyncCallback<AccountEntry> callback) /*-{
    return this.getAccountEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of accounts and profiles to which a given user has access.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AccountFeed getAccountFeed(AccountQuery query, AsyncCallback<AccountFeed> callback) /*-{
    return this.getAccountFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of accounts and profiles to which a given user has access.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AccountFeed getAccountFeed(String uri, AsyncCallback<AccountFeed> callback) /*-{
    return this.getAccountFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a data entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native DataEntry getDataEntry(String uri, AsyncCallback<DataEntry> callback) /*-{
    return this.getDataEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native DataFeed getDataFeed(DataQuery query, AsyncCallback<DataFeed> callback) /*-{
    return this.getDataFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native DataFeed getDataFeed(String uri, AsyncCallback<DataFeed> callback) /*-{
    return this.getDataFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
