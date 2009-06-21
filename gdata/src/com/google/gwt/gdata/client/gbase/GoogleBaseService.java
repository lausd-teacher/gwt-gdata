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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class GoogleBaseService extends GoogleService {

  /**
   * Google Base service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   */
  public static native GoogleBaseService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.gbase.GoogleBaseService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.GoogleBaseService[name];
  }-*/;

  protected GoogleBaseService() { }

  /**
   * Retrieves a Google Base attribute entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AttributesEntry getAttributesEntry(String uri, AsyncCallback<AttributesEntry> callback) /*-{
    return this.getAttributesEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AttributesFeed getAttributesFeed(AttributesQuery query, AsyncCallback<AttributesFeed> callback) /*-{
    return this.getAttributesFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native AttributesFeed getAttributesFeed(String uri, AsyncCallback<AttributesFeed> callback) /*-{
    return this.getAttributesFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Google Base item entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemsEntry getItemsEntry(String uri, AsyncCallback<ItemsEntry> callback) /*-{
    return this.getItemsEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a users private items.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemsFeed getItemsFeed(ItemsQuery query, AsyncCallback<ItemsFeed> callback) /*-{
    return this.getItemsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a users private items.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemsFeed getItemsFeed(String uri, AsyncCallback<ItemsFeed> callback) /*-{
    return this.getItemsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Google Base item type entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemTypesEntry getItemTypesEntry(String uri, AsyncCallback<ItemTypesEntry> callback) /*-{
    return this.getItemTypesEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of public item types.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemTypesFeed getItemTypesFeed(ItemTypesQuery query, AsyncCallback<ItemTypesFeed> callback) /*-{
    return this.getItemTypesFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of public item types.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native ItemTypesFeed getItemTypesFeed(String uri, AsyncCallback<ItemTypesFeed> callback) /*-{
    return this.getItemTypesFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Google Base locale entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native LocalesEntry getLocalesEntry(String uri, AsyncCallback<LocalesEntry> callback) /*-{
    return this.getLocalesEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of locales.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native LocalesFeed getLocalesFeed(LocalesQuery query, AsyncCallback<LocalesFeed> callback) /*-{
    return this.getLocalesFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of locales.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native LocalesFeed getLocalesFeed(String uri, AsyncCallback<LocalesFeed> callback) /*-{
    return this.getLocalesFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Google Base media entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native MediaEntry getMediaEntry(String uri, AsyncCallback<MediaEntry> callback) /*-{
    return this.getMediaEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the media feed used for managing the media attachments for one Google Base Item.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native MediaFeed getMediaFeed(String uri, AsyncCallback<MediaFeed> callback) /*-{
    return this.getMediaFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a Google Base snippet entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native SnippetsEntry getSnippetsEntry(String uri, AsyncCallback<SnippetsEntry> callback) /*-{
    return this.getSnippetsEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native SnippetsFeed getSnippetsFeed(SnippetsQuery query, AsyncCallback<SnippetsFeed> callback) /*-{
    return this.getSnippetsFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native SnippetsFeed getSnippetsFeed(String uri, AsyncCallback<SnippetsFeed> callback) /*-{
    return this.getSnippetsFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
