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
import com.google.gwt.gdata.client.impl.MapString;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Atom service.
 */
public class Service extends JavaScriptObject {

  /**
   * Creates a service that supports Atom only.
   */
  public static native Service newInstance(String serviceName, String applicationName) /*-{
    return new $wnd.google.gdata.client.Service(serviceName, applicationName);
  }-*/;

  protected Service() { }

  /**
   * Deletes an entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this command.
   */
  @SuppressWarnings("unchecked")
  public final native <E extends com.google.gwt.gdata.client.Entry> void deleteEntry(String uri, AsyncCallback<E> callback) /*-{
    this.deleteEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Inserts a new entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  @SuppressWarnings("unchecked")
  public final native <E extends com.google.gwt.gdata.client.Entry> void insertEntry(String uri, E entry, AsyncCallback<E> callback) /*-{
    this.insertEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      undefined
    );
  }-*/;

  /**
   * Tests whether XD2 transport is supported by this service.
   * 
   * @return Whether XD2 transport is supported.
   */
  public final native boolean isXd2Supported() /*-{
    return this.isXd2Supported();
  }-*/;

  /**
   * Sets services support for an alt format.
   * 
   * @param alt alt format to set.
   * @param supported true if the alt format is supported by this service; false otherwise.
   */
  public final native void setAltSupport(String alt, boolean supported) /*-{
    this.setAltSupport(alt, supported);
  }-*/;

  /**
   * Sets developer key of this service.
   * 
   * @param developerKey Service-specific developer key (not GData API developer key).
   */
  public final native void setDeveloperKey(String developerKey) /*-{
    this.setDeveloperKey(developerKey);
  }-*/;

  /**
   * Sets headers that are to be sent on every request.
   * 
   * @param headers Map of headers to be sent on every request.
   */
  public final native void setHeaders(MapString headers) /*-{
    this.setHeaders(headers);
  }-*/;

  /**
   * Sets whether XD2 transport is supported by this service.
   * 
   * @param xd2Supported Whether XD2 transport is supported.
   */
  public final native void setXd2Supported(boolean xd2Supported) /*-{
    this.setXd2Supported(xd2Supported);
  }-*/;

  /**
   * Tests whether service supports an alt format.
   * 
   * @param alt alt format to test.
   * @return true if the alt format is supported by this service; false otherwise.
   */
  public final native boolean supportsAlt(String alt) /*-{
    return this.supportsAlt(alt);
  }-*/;


  /**
   * Updates an entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this command.
   */
  @SuppressWarnings("unchecked")
  public final native <E extends com.google.gwt.gdata.client.Entry> void updateEntry(String uri, E entry, AsyncCallback<E> callback) /*-{
    this.updateEntry(
      uri,
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      undefined
    );
  }-*/;

}
