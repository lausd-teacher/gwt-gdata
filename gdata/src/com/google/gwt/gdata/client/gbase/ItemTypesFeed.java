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
 * Describes a feed of public item types.
 */
public class ItemTypesFeed
    extends com.google.gwt.gdata.client.Feed<ItemTypesEntry> {

  /**
   * Constructs a Google Base item type feed.
   * @return An ItemTypesFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native ItemTypesFeed newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemTypesFeed();
  }-*/;

  protected ItemTypesFeed() { }

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
  public final void getSelf(ItemTypesFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new item types entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertItemTypesEntry(ItemTypesEntry entry,
      ItemTypesEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}