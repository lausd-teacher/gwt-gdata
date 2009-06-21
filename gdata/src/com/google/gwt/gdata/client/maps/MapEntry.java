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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.FeedLink;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Comment unavailable.
 */
public class MapEntry extends com.google.gwt.gdata.client.Entry<MapEntry> {

  /**
   * Constructs a map entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MapEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.MapEntry(
      params
    );
  }-*/;

  /**
   * Constructs a map entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MapEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.MapEntry();
  }-*/;

  protected MapEntry() { }

  /**
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the marker for deleted entries.
   * 
   * @return
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the nested feed link.
   * 
   * @return
   */
  public final native FeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the resource id.
   * 
   * @return
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink() /*-{
    this.setFeedLink();
  }-*/;

  /**
   * Sets the resource id.
   * 
   * @param resourceId
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(
      resourceId
    );
  }-*/;

  /**
   * Sets the resource id.
   * 
   * @param resourceId
   */
  public final native void setResourceId() /*-{
    this.setResourceId();
  }-*/;

}
