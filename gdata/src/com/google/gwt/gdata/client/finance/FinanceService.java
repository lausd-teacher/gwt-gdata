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
   * Deletes a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deletePortfolioEntry(String uri,
      PortfolioEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deletePortfolioEntry(String uri,
      PortfolioEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteTransactionEntry(String uri,
      TransactionEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteTransactionEntry(String uri,
      TransactionEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioEntry(String uri,
      PortfolioEntryCallback callback) {
    this.getEntry(uri, callback, null, "getPortfolioEntry");
  }

  /**
   * Retrieves a Finance portfolio entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPortfolioEntry(String uri,
      PortfolioEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getPortfolioEntry");
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioFeed(PortfolioQuery query,
      PortfolioFeedCallback callback) {
    this.getFeed(query, callback, null, "getPortfolioFeed");
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPortfolioFeed(PortfolioQuery query,
      PortfolioFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getPortfolioFeed");
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPortfolioFeed(String uri,
      PortfolioFeedCallback callback) {
    this.getFeed(uri, callback, null, "getPortfolioFeed");
  }

  /**
   * Retrieves the feed of all the user's portfolios.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPortfolioFeed(String uri,
      PortfolioFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getPortfolioFeed");
  }

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionEntry(String uri,
      PositionEntryCallback callback) {
    this.getEntry(uri, callback, null, "getPositionEntry");
  }

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPositionEntry(String uri,
      PositionEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getPositionEntry");
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionFeed(PositionQuery query,
      PositionFeedCallback callback) {
    this.getFeed(query, callback, null, "getPositionFeed");
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPositionFeed(PositionQuery query,
      PositionFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getPositionFeed");
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPositionFeed(String uri,
      PositionFeedCallback callback) {
    this.getFeed(uri, callback, null, "getPositionFeed");
  }

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPositionFeed(String uri,
      PositionFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getPositionFeed");
  }

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getTransactionEntry(String uri,
      TransactionEntryCallback callback) {
    this.getEntry(uri, callback, null, "getTransactionEntry");
  }

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getTransactionEntry(String uri,
      TransactionEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getTransactionEntry");
  }

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getTransactionFeed(String uri,
      TransactionFeedCallback callback) {
    this.getFeed(uri, callback, null, "getTransactionFeed");
  }

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getTransactionFeed(String uri,
      TransactionFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getTransactionFeed");
  }

  /**
   * Inserts a new portfolio entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertPortfolioEntry(String uri, PortfolioEntry entry,
      PortfolioEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new transaction entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertTransactionEntry(String uri,
      TransactionEntry entry, TransactionEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Updates a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updatePortfolioEntry(String uri, PortfolioEntry entry,
      PortfolioEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a portfolio entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updatePortfolioEntry(String uri, PortfolioEntry entry,
      PortfolioEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

  /**
   * Updates a transaction entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateTransactionEntry(String uri, TransactionEntry entry,
      TransactionEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a transaction entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateTransactionEntry(String uri, TransactionEntry entry,
      TransactionEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

}