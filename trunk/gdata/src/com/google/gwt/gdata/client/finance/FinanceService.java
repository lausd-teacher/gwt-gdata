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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Google Finance service.
 */
public class FinanceService extends GoogleService {

  /**
   * Google Finance service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   * 
   * @param applicationName Name of application (used for tracking).
   */
  public static native FinanceService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.finance.FinanceService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.finance.FinanceService[name];
  }-*/;

  protected FinanceService() { }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native PortfolioEntry getPortfolioEntry(String uri, AsyncCallback<PortfolioEntry> callback) /*-{
    return this.getPortfolioEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PortfolioFeed getPortfolioFeed(PortfolioQuery query, AsyncCallback<PortfolioFeed> callback) /*-{
    return this.getPortfolioFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PortfolioFeed getPortfolioFeed(String uri, AsyncCallback<PortfolioFeed> callback) /*-{
    return this.getPortfolioFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native PositionEntry getPositionEntry(String uri, AsyncCallback<PositionEntry> callback) /*-{
    return this.getPositionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PositionFeed getPositionFeed(PositionQuery query, AsyncCallback<PositionFeed> callback) /*-{
    return this.getPositionFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PositionFeed getPositionFeed(String uri, AsyncCallback<PositionFeed> callback) /*-{
    return this.getPositionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native TransactionEntry getTransactionEntry(String uri, AsyncCallback<TransactionEntry> callback) /*-{
    return this.getTransactionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native TransactionFeed getTransactionFeed(String uri, AsyncCallback<TransactionFeed> callback) /*-{
    return this.getTransactionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
