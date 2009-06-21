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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class MapsService extends GoogleService {

  /**
   * Maps service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   */
  public static native MapsService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.maps.MapsService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.maps.MapsService[name];
  }-*/;

  protected MapsService() { }

  /**
   * Retrieves a feature entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native FeatureEntry getFeatureEntry(String uri, AsyncCallback<FeatureEntry> callback) /*-{
    return this.getFeatureEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of map features.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native FeatureFeed getFeatureFeed(FeatureQuery query, AsyncCallback<FeatureFeed> callback) /*-{
    return this.getFeatureFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of map features.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native FeatureFeed getFeatureFeed(String uri, AsyncCallback<FeatureFeed> callback) /*-{
    return this.getFeatureFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a map entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native MapEntry getMapEntry(String uri, AsyncCallback<MapEntry> callback) /*-{
    return this.getMapEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of user-created maps.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native MapFeed getMapFeed(MapQuery query, AsyncCallback<MapFeed> callback) /*-{
    return this.getMapFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of user-created maps.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native MapFeed getMapFeed(String uri, AsyncCallback<MapFeed> callback) /*-{
    return this.getMapFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
