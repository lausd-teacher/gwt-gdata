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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.GoogleService;

/**
 * Maps service.
 */
public class MapsService extends GoogleService {

  /**
   * Maps service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a Maps service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A MapsService object.
   */
  public static native MapsService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.maps.MapsService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.maps.MapsService[name];
  }-*/;

  protected MapsService() { }

  /**
   * Deletes a feature entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteFeatureEntry(String uri,
      FeatureEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }


  /**
   * Deletes a map entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteMapEntry(String uri, MapEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }


  /**
   * Retrieves a feature entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getFeatureEntry(String uri,
      FeatureEntryCallback callback) {
    this.getEntry(uri, callback, "getFeatureEntry");
  }

  /**
   * Retrieves the feed of map features.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getFeatureFeed(FeatureQuery query,
      FeatureFeedCallback callback) {
    this.getFeed(query, callback, "getFeatureFeed");
  }

  /**
   * Retrieves the feed of map features.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getFeatureFeed(String uri,
      FeatureFeedCallback callback) {
    this.getFeed(uri, callback, "getFeatureFeed");
  }

  /**
   * Retrieves a map entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getMapEntry(String uri, MapEntryCallback callback) {
    this.getEntry(uri, callback, "getMapEntry");
  }

  /**
   * Retrieves the feed of user-created maps.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getMapFeed(MapQuery query, MapFeedCallback callback) {
    this.getFeed(query, callback, "getMapFeed");
  }

  /**
   * Retrieves the feed of user-created maps.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getMapFeed(String uri, MapFeedCallback callback) {
    this.getFeed(uri, callback, "getMapFeed");
  }
  
  /**
   * Inserts a new feature entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertFeatureEntry(String uri, FeatureEntry entry,
      FeatureEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new map entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertMapEntry(String uri, MapEntry entry,
      MapEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Updates a feature entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateFeatureEntry(String uri, FeatureEntry entry,
      FeatureEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a map entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateMapEntry(String uri, MapEntry entry,
      MapEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

}