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

package com.google.gwt.gdata.client.calendar;

/**
 * Describes feed of a Calendar event's comments.
 */
public class CalendarCommentFeed
    extends com.google.gwt.gdata.client.Feed<CalendarCommentEntry> {

  /**
   * Constructs a Calendar event's comments feed.
   * @return A CalendarCommentFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native CalendarCommentFeed newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarCommentFeed();
  }-*/;

  protected CalendarCommentFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(CalendarCommentFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new calendar comment entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCommentEntry(CalendarCommentEntry entry,
      CalendarCommentEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}