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
import com.google.gwt.gdata.client.opensearch.ItemsPerPage;
import com.google.gwt.gdata.client.opensearch.StartIndex;
import com.google.gwt.gdata.client.opensearch.TotalResults;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class Feed extends com.google.gwt.gdata.client.atom.Feed {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Feed;
  }-*/;

  /**
   * Constructs a Google Data API feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Feed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Feed(
      params
    );
  }-*/;

  /**
   * Constructs a Google Data API feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Feed newInstance() /*-{
    return new $wnd.google.gdata.Feed();
  }-*/;

  protected Feed() { }

  /**
   * Returns the link that provides the URI that can be used to post new entries to the feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getEntryPostLink() /*-{
    return this.getEntryPostLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the items-per-page count.
   * 
   * @return
   */
  public final native ItemsPerPage getItemsPerPage() /*-{
    return this.getItemsPerPage();
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel
   * @param opt_type
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel, String type) /*-{
    return this.getLink(
      rel,
      type
    );
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel
   * @param opt_type
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel) /*-{
    return this.getLink(
      rel,
      undefined
    );
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the associated service using the feeds self link.
   * 
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Feed getSelf(AsyncCallback<Feed> callback) /*-{
    return this.getSelf(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the feed or entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getSelfLink() /*-{
    return this.getSelfLink();
  }-*/;

  /**
   * Returns the start index.
   * 
   * @return
   */
  public final native StartIndex getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Returns the total results count.
   * 
   * @return
   */
  public final native TotalResults getTotalResults() /*-{
    return this.getTotalResults();
  }-*/;

  /**
   * Inserts a new entry into the feed.
   * 
   * @param entry
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Entry insertEntry(Entry entry, AsyncCallback<Entry> callback) /*-{
    return this.insertEntry(
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Sets the items-per-page count.
   * 
   * @param itemsPerPage
   */
  public final native void setItemsPerPage(ItemsPerPage itemsPerPage) /*-{
    this.setItemsPerPage(
      itemsPerPage
    );
  }-*/;

  /**
   * Sets the items-per-page count.
   * 
   * @param itemsPerPage
   */
  public final native void setItemsPerPage() /*-{
    this.setItemsPerPage();
  }-*/;

  /**
   * Sets the start index.
   * 
   * @param startIndex
   */
  public final native void setStartIndex(StartIndex startIndex) /*-{
    this.setStartIndex(
      startIndex
    );
  }-*/;

  /**
   * Sets the start index.
   * 
   * @param startIndex
   */
  public final native void setStartIndex() /*-{
    this.setStartIndex();
  }-*/;

  /**
   * Sets the total results count.
   * 
   * @param totalResults
   */
  public final native void setTotalResults(TotalResults totalResults) /*-{
    this.setTotalResults(
      totalResults
    );
  }-*/;

  /**
   * Sets the total results count.
   * 
   * @param totalResults
   */
  public final native void setTotalResults() /*-{
    this.setTotalResults();
  }-*/;

}
