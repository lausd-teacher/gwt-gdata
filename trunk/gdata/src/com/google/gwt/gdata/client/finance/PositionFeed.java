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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.gdata.client.GDataRequestParameters;

/**
 * Describes a Finance position feed.
 */
public class PositionFeed
    extends com.google.gwt.gdata.client.Feed<PositionEntry> {

  /**
   * Constructs a Finance position feed.
   * @return A PositionFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native PositionFeed newInstance() /*-{
    return new $wnd.google.gdata.finance.PositionFeed();
  }-*/;

  protected PositionFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(PositionFeedCallback callback) {
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
  public final void getSelf(PositionFeedCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Inserts a new position entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertPositionEntry(PositionEntry entry,
      PositionEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}