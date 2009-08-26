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
 * Personal settings for Calendar application.
 */
public class CalendarSettingsFeed
    extends com.google.gwt.gdata.client.Feed<SettingsEntry> {

  /**
   * Constructs a calendar settings feed.
   * @return A CalendarSettingsFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native CalendarSettingsFeed newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarSettingsFeed();
  }-*/;

  protected CalendarSettingsFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(CalendarSettingsFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new settings entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertSettingsEntry(SettingsEntry entry,
      SettingsEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}