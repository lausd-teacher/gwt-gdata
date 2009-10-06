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

import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Sidewiki Data API service.
 */
public class SidewikiService extends GoogleService {

  /**
   * Google Sidewiki Data API service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a sidewiki service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A SidewikiService object.
   */
  public static native SidewikiService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.sidewiki.SidewikiService[name];
  }-*/;

  protected SidewikiService() { }

  /**
   * Deletes a sidewiki entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteSidewikiEntry(String uri,
      SidewikiEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a sidewiki user entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteSidewikiUserEntry(String uri,
      SidewikiUserEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }
  
  /**
   * Retrieves a sidewiki entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntry(String uri,
      SidewikiEntryCallback callback) {
    this.getEntry(uri, callback, "getSidewikiEntry");
  }

  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntryFeed(SidewikiEntryQuery query,
      SidewikiEntryFeedCallback callback) {
    this.getFeed(query, callback, "getSidewikiEntryFeed");
  }
  
  /**
   * Retrieves the feed of sidewiki entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiEntryFeed(String uri,
      SidewikiEntryFeedCallback callback) {
    this.getFeed(uri, callback, "getSidewikiEntryFeed");
  }
  
  /**
   * Retrieves a sidewiki user entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserEntry(String uri,
      SidewikiUserEntryCallback callback) {
    this.getEntry(uri, callback, "getSidewikiUserEntry");
  }
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserFeed(SidewikiUserQuery query,
      SidewikiUserFeedCallback callback) {
    this.getFeed(query, callback, "getSidewikiUserFeed");
  }
  
  /**
   * Retrieves the feed of sidewiki user entries.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSidewikiUserFeed(String uri,
      SidewikiUserFeedCallback callback) {
    this.getFeed(uri, callback, "getSidewikiUserFeed");
  }
  
  /**
   * Inserts a new sidewiki entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertSidewikiEntry(String uri, SidewikiEntry entry,
      SidewikiEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Inserts a new sidewiki user entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertSidewikiUserEntry(String uri, SidewikiUserEntry entry,
      SidewikiUserEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Updates a sidewiki entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateSidewikiEntry(String uri, SidewikiEntry entry,
      SidewikiEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a sidewiki user entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateSidewikiEntry(String uri, SidewikiUserEntry entry,
      SidewikiUserEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }
  
}