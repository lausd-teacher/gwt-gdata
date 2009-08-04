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

/**
 * Describes a version feed.
 */
public class VersionFeed extends com.google.gwt.gdata.client.Feed<VersionEntry> {

  /**
   * Constructs a version feed.
   * @return A VersionFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native VersionFeed newInstance() /*-{
    return new $wnd.google.gdata.maps.VersionFeed();
  }-*/;

  protected VersionFeed() { }

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed (without any query parameters).
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native com.google.gwt.gdata.client.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Inserts a new version entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertVersionEntry(VersionEntry entry, VersionEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}