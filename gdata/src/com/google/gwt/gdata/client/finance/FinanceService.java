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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class FinanceService extends GoogleService {

  /**
   * Google Finance service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.finance.FinanceService;
  }-*/;

  /**
   * Constructor.
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
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PortfolioEntry getPortfolioEntry(String uri, AsyncCallback<PortfolioEntry> callback) /*-{
    return this.getPortfolioEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the users portfolios.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PortfolioFeed getPortfolioFeed(PortfolioQuery query, AsyncCallback<PortfolioFeed> callback) /*-{
    return this.getPortfolioFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the users portfolios.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PortfolioFeed getPortfolioFeed(String uri, AsyncCallback<PortfolioFeed> callback) /*-{
    return this.getPortfolioFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance position entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PositionEntry getPositionEntry(String uri, AsyncCallback<PositionEntry> callback) /*-{
    return this.getPositionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PositionFeed getPositionFeed(PositionQuery query, AsyncCallback<PositionFeed> callback) /*-{
    return this.getPositionFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the positions belonging to the portfolio.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PositionFeed getPositionFeed(String uri, AsyncCallback<PositionFeed> callback) /*-{
    return this.getPositionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Finance transaction entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native TransactionEntry getTransactionEntry(String uri, AsyncCallback<TransactionEntry> callback) /*-{
    return this.getTransactionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of all the transactions belonging to the position.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native TransactionFeed getTransactionFeed(String uri, AsyncCallback<TransactionFeed> callback) /*-{
    return this.getTransactionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

}
