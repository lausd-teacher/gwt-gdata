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
   * Retrieves an ab page variation entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAbPageVariationEntry(String uri,
      AbPageVariationEntryCallback callback) {
    this.getAbPageVariationEntry(uri, callback, null);
  }

  /**
   * Retrieves an ab page variation entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getAbPageVariationEntry(String uri,
      AbPageVariationEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getAbPageVariationEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed with information about page variations
   * in an A/B experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAbPageVariationFeed(String uri,
      AbPageVariationFeedCallback callback) {
    this.getAbPageVariationFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed with information about page variations
   * in an A/B experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getAbPageVariationFeed(String uri,
      AbPageVariationFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getAbPageVariationFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAccountEntry(String uri,
      AccountEntryCallback callback) {
    this.getAccountEntry(uri, callback, null);
  }

  /**
   * Retrieves an account entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getAccountEntry(String uri,
      AccountEntryCallback callback, GDataRequestParameters parameters) /*-{
    this.getAccountEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

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
    this.getAccountFeed(query, callback, null);
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
  public final native void getAccountFeed(AccountQuery query,
      AccountFeedCallback callback, GDataRequestParameters parameters) /*-{
    this.getAccountFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed of accounts and profiles to which a given user has
   * access.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAccountFeed(String uri, AccountFeedCallback callback) {
    this.getAccountFeed(uri, callback, null);
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
  public final native void getAccountFeed(String uri, AccountFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getAccountFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a combination entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCombinationEntry(String uri,
      CombinationEntryCallback callback) {
    this.getCombinationEntry(uri, callback, null);
  }

  /**
   * Retrieves a combination entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCombinationEntry(String uri,
      CombinationEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getCombinationEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed with information about experiment combinations
   * in an experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCombinationFeed(String uri,
      CombinationFeedCallback callback) {
    this.getCombinationFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed with information about experiment combinations
   * in an experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getCombinationFeed(String uri,
      CombinationFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getCombinationFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataEntry(String uri, DataEntryCallback callback) {
    this.getDataEntry(uri, callback, null);
  }

  /**
   * Retrieves a data entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getDataEntry(String uri, DataEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getDataEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataFeed(DataQuery query, DataFeedCallback callback) {
    this.getDataFeed(query, callback, null);
  }
  
  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getDataFeed(DataQuery query, DataFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getDataFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDataFeed(String uri, DataFeedCallback callback) {
    this.getDataFeed(uri, callback, null);
  }

  /**
   * Retrieves the arbitrary data from an Analytics profile.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getDataFeed(String uri, DataFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getDataFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves an experiment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getExperimentEntry(String uri,
      ExperimentEntryCallback callback) {
    this.getExperimentEntry(uri, callback, null);
  }

  /**
   * Retrieves an experiment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getExperimentEntry(String uri,
      ExperimentEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getExperimentEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed with information about experiments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getExperimentFeed(String uri,
      ExperimentFeedCallback callback) {
    this.getExperimentFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed with information about experiments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getExperimentFeed(String uri,
      ExperimentFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getExperimentFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a section entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSectionEntry(String uri,
      SectionEntryCallback callback) {
    this.getSectionEntry(uri, callback, null);
  }

  /**
   * Retrieves a section entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSectionEntry(String uri,
      SectionEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getSectionEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed with information about sections in a
   * multivariate experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSectionFeed(String uri,
      SectionFeedCallback callback) {
    this.getSectionFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed with information about sections in a
   * multivariate experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSectionFeed(String uri,
      SectionFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getSectionFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves a variation entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getVariationEntry(String uri,
      VariationEntryCallback callback) {
    this.getVariationEntry(uri, callback, null);
  }

  /**
   * Retrieves a variation entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getVariationEntry(String uri,
      VariationEntryCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getVariationEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Retrieves the feed with information about section variations in a
   * multivariate experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getVariationFeed(String uri,
      VariationFeedCallback callback) {
    this.getVariationFeed(uri, callback, null);
  }

  /**
   * Retrieves the feed with information about section variations in a
   * multivariate experiment.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getVariationFeed(String uri,
      VariationFeedCallback callback,
      GDataRequestParameters parameters) /*-{
    this.getVariationFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;
  
}