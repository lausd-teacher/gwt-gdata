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

/**
 * Describes a feed of public attributes.
 */
public class AttributesFeed
    extends com.google.gwt.gdata.client.Feed<AttributesEntry> {

  /**
   * Constructs a Google Base attribute feed.
   * @return An AttributesFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native AttributesFeed newInstance() /*-{
    return new $wnd.google.gdata.gbase.AttributesFeed();
  }-*/;

  protected AttributesFeed() { }

  /**
   * Returns the link that provides the URI of the full feed
   * (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed
   * (without any query parameters).
   */
  public final native com.google.gwt.gdata.client.Link getFeedAtomLink() /*-{
    return this.getFeedAtomLink();
  }-*/;
  
  /**
   * Returns the link that provides the URI that can be used to batch
   * operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations to
   * query, insert, update and delete entries on this feed.
   */
  public final native com.google.gwt.gdata.client.Link getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(AttributesFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new attributes entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertAttributesEntry(AttributesEntry entry,
      AttributesEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}