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

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Finance service.
 */
public class FinanceService extends GoogleService {

  /**
   * Google Finance service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a Finance service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A FinanceService object.
   */
  public static native FinanceService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.finance.FinanceService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.finance.FinanceService[name];
  }-*/;

  protected FinanceService() { }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioEntry(String uri,
      PortfolioEntryCallback callback) {
    this.getPortfolioEntry(uri, callback, null);
  }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPortfolioEntry(String uri,
      PortfolioEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getPortfolioEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioFeed(PortfolioQuery query,
      PortfolioFeedCallback callback) {
    this.getPortfolioFeed(query, callback, null);
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPortfolioFeed(PortfolioQuery query,
      PortfolioFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getPortfolioFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioFeed(String uri,
      PortfolioFeedCallback callback) {
    this.getPortfolioFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPortfolioFeed(String uri,
      PortfolioFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getPortfolioFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionEntry(String uri,
      PositionEntryCallback callback) {
    this.getPositionEntry(uri, callback, null);
  }

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPositionEntry(String uri,
      PositionEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getPositionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionFeed(PositionQuery query,
      PositionFeedCallback callback) {
    this.getPositionFeed(query, callback, null);
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPositionFeed(PositionQuery query,
      PositionFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getPositionFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionFeed(String uri,
      PositionFeedCallback callback) {
    this.getPositionFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getPositionFeed(String uri,
      PositionFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getPositionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getTransactionEntry(String uri,
      TransactionEntryCallback callback) {
    this.getTransactionEntry(uri, callback, null);
  }

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getTransactionEntry(String uri,
      TransactionEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getTransactionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getTransactionFeed(String uri,
      TransactionFeedCallback callback) {
    this.getTransactionFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getTransactionFeed(String uri,
      TransactionFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getTransactionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

}