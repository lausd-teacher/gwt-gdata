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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.GDataRequestParameters;

/**
 * Describes a feed of Sidewiki users.
 */
public class SidewikiUserFeed
    extends com.google.gwt.gdata.client.Feed<SidewikiUserEntry> {

  /**
   * Constructs a sidewiki user feed. 
   */
  @SuppressWarnings("unchecked")
  public static native SidewikiUserFeed newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiUserFeed();
  }-*/;

  protected SidewikiUserFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(SidewikiUserFeedCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(SidewikiUserFeedCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Inserts a new entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertBlogEntry(SidewikiUserEntry entry,
      SidewikiUserEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}