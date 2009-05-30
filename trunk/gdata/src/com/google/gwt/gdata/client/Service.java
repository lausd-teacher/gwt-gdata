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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class Service extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.client.Service;
  }-*/;

  /**
   * Creates a service that supports Atom only.
   */
  public static native Service newInstance(String serviceName, String applicationName) /*-{
    return new $wnd.google.gdata.client.Service(
      serviceName,
      applicationName
    );
  }-*/;

  protected Service() { }

  /**
   * Deletes an entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   */
  public final native void deleteEntry(String uri, AsyncCallback<Entry> callback) /*-{
    this.deleteEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves data of an entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getEntry(String uri, AsyncCallback<JavaScriptObject> callback, Entry entryClass, boolean authenticationRequired) /*-{
    this.getEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Entry::getConstructor()(),
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of an entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getEntry(String uri, AsyncCallback<Entry> callback, boolean authenticationRequired) /*-{
    this.getEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of an entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getEntry(String uri, AsyncCallback<Entry> callback, Entry entryClass) /*-{
    this.getEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Entry::getConstructor()(),
      undefined
    );
  }-*/;

  /**
   * Retrieves data of an entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getEntry(String uri, AsyncCallback<Entry> callback) /*-{
    this.getEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      undefined
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param opt_feedClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getFeed(Query query, AsyncCallback<JavaScriptObject> callback, Feed feedClass, boolean authenticationRequired) /*-{
    this.getFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Feed::getConstructor()(),
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param opt_feedClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getFeed(Query query, AsyncCallback<Feed> callback, boolean authenticationRequired) /*-{
    this.getFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param opt_feedClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getFeed(Query query, AsyncCallback<Feed> callback, Feed feedClass) /*-{
    this.getFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Feed::getConstructor()(),
      undefined
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param opt_feedClass
   * @param opt_authenticationRequired
   * 
   * @return
   */
  public final native void getFeed(Query query, AsyncCallback<Feed> callback) /*-{
    this.getFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      undefined
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param feedClass
   * @param authenticationRequired
   */
  public final native void getFeed(String uri, AsyncCallback<Feed> callback, Feed feedClass, boolean authenticationRequired) /*-{
    this.getFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Feed::getConstructor()(),
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param feedClass
   * @param authenticationRequired
   */
  public final native void getFeed(String uri, AsyncCallback<Feed> callback, boolean authenticationRequired) /*-{
    this.getFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      authenticationRequired
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param feedClass
   * @param authenticationRequired
   */
  public final native void getFeed(String uri, AsyncCallback<Feed> callback, Feed feedClass) /*-{
    this.getFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Feed::getConstructor()(),
      undefined
    );
  }-*/;

  /**
   * Retrieves data of a feed.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * @param feedClass
   * @param authenticationRequired
   */
  public final native void getFeed(String uri, AsyncCallback<Feed> callback) /*-{
    this.getFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined,
      undefined
    );
  }-*/;

  /**
   * Inserts a new entry.
   * 
   * @param uri
   * @param entry
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   */
  public final native void insertEntry(String uri, JavaScriptObject entry, AsyncCallback<Entry> callback, Entry entryClass) /*-{
    this.insertEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Entry::getConstructor()()
    );
  }-*/;

  /**
   * Inserts a new entry.
   * 
   * @param uri
   * @param entry
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   */
  public final native void insertEntry(String uri, JavaScriptObject entry, AsyncCallback<Entry> callback) /*-{
    this.insertEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined
    );
  }-*/;

  /**
   * Tests whether XD2 transport is supported by this service.
   * 
   * @return
   */
  public final native boolean isXd2Supported() /*-{
    return this.isXd2Supported();
  }-*/;

  /**
   * Sets services support for an alt format.
   * 
   * @param alt
   * @param supported
   */
  public final native void setAltSupport(String alt, boolean supported) /*-{
    this.setAltSupport(
      alt,
      supported
    );
  }-*/;

  /**
   * Sets developer key of this service.
   * 
   * @param developerKey
   */
  public final native void setDeveloperKey(String developerKey) /*-{
    this.setDeveloperKey(
      developerKey
    );
  }-*/;

  /**
   * Sets headers that are to be sent on every request.
   * 
   * @param headers
   */
  public final native void setHeaders(JavaScriptObject headers) /*-{
    this.setHeaders(
      headers
    );
  }-*/;

  /**
   * Sets whether XD2 transport is supported by this service.
   * 
   * @param xd2Supported
   */
  public final native void setXd2Supported(boolean xd2Supported) /*-{
    this.setXd2Supported(
      xd2Supported
    );
  }-*/;

  /**
   * Tests whether service supports an alt format.
   * 
   * @param alt
   * 
   * @return
   */
  public final native boolean supportsAlt(String alt) /*-{
    return this.supportsAlt(
      alt
    );
  }-*/;

  /**
   * Updates an entry.
   * 
   * @param uri
   * @param entry
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   */
  public final native void updateEntry(String uri, JavaScriptObject entry, AsyncCallback<Entry> callback, Entry entryClass) /*-{
    this.updateEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      @com.google.gwt.gdata.client.Entry::getConstructor()()
    );
  }-*/;

  /**
   * Updates an entry.
   * 
   * @param uri
   * @param entry
   * @param continuation
   * @param opt_errorHandler
   * @param opt_entryClass
   */
  public final native void updateEntry(String uri, JavaScriptObject entry, AsyncCallback<Entry> callback) /*-{
    this.updateEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); },
      undefined
    );
  }-*/;

}
