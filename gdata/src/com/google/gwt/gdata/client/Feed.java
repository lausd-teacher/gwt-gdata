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

import com.google.gwt.gdata.client.impl.Callback;
import com.google.gwt.gdata.client.opensearch.ItemsPerPage;
import com.google.gwt.gdata.client.opensearch.StartIndex;
import com.google.gwt.gdata.client.opensearch.TotalResults;

/**
 * Describes a feed for the Google Data API.
 * 
 * @param <F> Feed type associated with bound subtype.
 * @param <E> Entry type associated with bound subtype.
 */
@SuppressWarnings("unchecked")
public class Feed<F extends Feed, E extends Entry>
    extends com.google.gwt.gdata.client.atom.Feed<E> {
  
  /**
   * Constructs a feed.
   * @return A Feed object.
   */
  public static native <F extends Feed, E extends Entry> Feed<F, E> newInstance() /*-{
    return new $wnd.google.gdata.Feed();
  }-*/;

  protected Feed() { }

  /**
   * Returns the link that provides the URI that can be used to post new
   * entries to the feed.
   * 
   * @return Link that provides the URI that can be used to post new entries
   * to the feed.
   */
  public final native com.google.gwt.gdata.client.Link getEntryPostLink() /*-{
    return this.getEntryPostLink();
  }-*/;

  /**
   * Returns the entity tag of the feed. This attribute is optional.
   * 
   * @return Entity tag of the feed. 
   */
  public final native String getEtag() /*-{
    return this.getEtag();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query
   * parameters).
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native com.google.gwt.gdata.client.Link getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the items-per-page count.
   * 
   * @return Items-per-page count.
   */
  public final native ItemsPerPage getItemsPerPage() /*-{
    return this.getItemsPerPage();
  }-*/;
  
  /**
   * Returns the kind of the feed. This attribute is optional.
   * 
   * @return Kind of the feed.
   */
  public final native String getKind() /*-{
    return this.getKind();
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel Link relation type to filter on or null to ignore.
   * @param type MIME type of the link target to filter on.
   * @return First link whose relation and type is a match or null for none. 
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel,
      String type) /*-{
    return this.getLink(rel, type);
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel Link relation type to filter on or null to ignore.
   * @return First link whose relation and type is a match or null for none.
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel) /*-{
    return this.getLink(rel);
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final native void getSelf(Callback<F> callback) /*-{
    this.getSelf(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final native void getSelf(Callback<F> callback,
      GDataRequestParameters parameters) /*-{
    this.getSelf(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.feed : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); },
      parameters
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the feed or entry.
   * 
   * @return Link that provides the URI of the feed or entry.
   */
  public final native com.google.gwt.gdata.client.Link getSelfLink() /*-{
    return this.getSelfLink();
  }-*/;

  /**
   * Returns the start index.
   * 
   * @return Start index.
   */
  public final native StartIndex getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Returns the total results count.
   * 
   * @return Total results count.
   */
  public final native TotalResults getTotalResults() /*-{
    return this.getTotalResults();
  }-*/;

  /**
   * Inserts a new entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final native void insertEntry(E entry, Callback<E> callback) /*-{
    this.insertEntry(
      entry,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Sets the entity tag of the feed. This attribute is optional.
   * 
   * @param etag Entity tag of the feed. 
   */
  public final native void setEtag(String etag) /*-{
    this.setEtag(etag);
  }-*/;

  /**
   * Sets the items-per-page count.
   * 
   * @param itemsPerPage Sets the items-per-page count.
   * This element is optional.
   */
  public final native void setItemsPerPage(ItemsPerPage itemsPerPage) /*-{
    this.setItemsPerPage(itemsPerPage);
  }-*/;
  
  /**
   * Sets the kind of the feed. This attribute is optional.
   * 
   * @param kind Kind of the feed.
   */
  public final native void setKind(String kind) /*-{
    this.setKind(kind);
  }-*/;

  /**
   * Sets the start index.
   * 
   * @param startIndex Start index.
   */
  public final native void setStartIndex(StartIndex startIndex) /*-{
    this.setStartIndex(startIndex);
  }-*/;

  /**
   * Sets the total results count.
   * 
   * @param totalResults Total results count.
   */
  public final native void setTotalResults(TotalResults totalResults) /*-{
    this.setTotalResults(totalResults);
  }-*/;

}
