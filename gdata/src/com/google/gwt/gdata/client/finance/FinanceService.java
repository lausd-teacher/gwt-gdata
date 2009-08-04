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
   * Deletes a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deletePortfolioEntry(String uri, PortfolioEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteTransactionEntry(String uri, TransactionEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPortfolioEntry(String uri, PortfolioEntryCallback callback) /*-{
    this.getPortfolioEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPortfolioFeed(PortfolioQuery query, PortfolioFeedCallback callback) /*-{
    this.getPortfolioFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPortfolioFeed(String uri, PortfolioFeedCallback callback) /*-{
    this.getPortfolioFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPositionEntry(String uri, PositionEntryCallback callback) /*-{
    this.getPositionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPositionFeed(PositionQuery query, PositionFeedCallback callback) /*-{
    this.getPositionFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getPositionFeed(String uri, PositionFeedCallback callback) /*-{
    this.getPositionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getTransactionEntry(String uri, TransactionEntryCallback callback) /*-{
    this.getTransactionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final native void getTransactionFeed(String uri, TransactionFeedCallback callback) /*-{
    this.getTransactionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Inserts a new portfolio entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertPortfolioEntry(String uri, PortfolioEntry entry, PortfolioEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new transaction entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertTransactionEntry(String uri, TransactionEntry entry, TransactionEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Updates a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updatePortfolioEntry(String uri, PortfolioEntry entry, PortfolioEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a transaction entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateTransactionEntry(String uri, TransactionEntry entry, TransactionEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

}