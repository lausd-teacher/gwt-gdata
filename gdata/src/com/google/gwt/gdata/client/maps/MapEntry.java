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

import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.FeedLink;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Describes a map entry.
 */
public class MapEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a map entry.
   * @return A MapEntry object.
   */
  public static native MapEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.MapEntry();
  }-*/;

  protected MapEntry() { }
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  
  public final void deleteEntry(MapEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native com.google.gwt.gdata.client.Link
      getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed
   * (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed
   * (without any query parameters).
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the nested feed link. This element is optional.
   * 
   * @return Nested feed link.
   */
  @SuppressWarnings("unchecked")
  public final native FeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the resource id. This element is optional.
   * 
   * @return Resource id.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;
  
  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final MapEntry getSelf(MapEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(deleted);
  }-*/;

  /**
   * Sets the nested feed link. This element is optional.
   * 
   * @param feedLink Nested feed link.
   */
  @SuppressWarnings("unchecked")
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   * 
   * @param resourceId Resource id.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(resourceId);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(MapEntryCallback callback) {
    this.update(callback);
  }

}