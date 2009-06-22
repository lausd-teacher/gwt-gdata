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
 * Describes a map entry.
 */
public class MapEntry extends com.google.gwt.gdata.client.Entry<MapEntry> {

  /**
   * Constructs a map entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, control, deleted, edited, feedLink, id, links, published, resourceId, summary, title, and updated.
   */
  public static native MapEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.MapEntry(
      params
    );
  }-*/;

  protected MapEntry() { }

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed (without any query parameters) or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries or undefined for none.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the nested feed link. This element is optional.
   * 
   * @return Nested feed link or undefined for none.
   */
  public final native FeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the resource id. This element is optional.
   * 
   * @return Resource id or undefined for none.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries, or object to use as a parameter to the google.gdata.Deleted constructor, or undefined for none.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the nested feed link. This element is optional.
   */
  public final native void setFeedLink() /*-{
    this.setFeedLink();
  }-*/;

  /**
   * Sets the nested feed link. This element is optional.
   * 
   * @param feedLink Nested feed link, or object to use as a parameter to the google.gdata.FeedLink constructor, or undefined for none.
   */
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   */
  public final native void setResourceId() /*-{
    this.setResourceId();
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   * 
   * @param resourceId Resource id, or object to use as a parameter to the google.gdata.ResourceId constructor, or undefined for none.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(
      resourceId
    );
  }-*/;

}
