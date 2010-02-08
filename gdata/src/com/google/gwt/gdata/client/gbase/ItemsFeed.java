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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.gdata.client.Feed;

/**
 * Describes a feed of a user's private items.
 */
public class ItemsFeed
    extends Feed<ItemsFeed, ItemsEntry> {

  /**
   * Constructs a Google Base item feed.
   * @return An ItemsFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native ItemsFeed newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemsFeed();
  }-*/;

  protected ItemsFeed() { }
  
  /**
   * Returns the attribute.
   * 
   * @param name Name of attribute.
   * @return Attribute.
   */
  public final Attribute[] getAttribute(String name) {
    return this.getAttributes().get(name);
  }

  /**
   * Returns the attributes. The returned object is a map from attribute name
   * to the associated Attribute class.
   * 
   * @return Attributes.
   */
  public final native MapAttribute getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to batch
   * operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations to
   * query, insert, update and delete entries on this feed.
   */
  public final native com.google.gwt.gdata.client.Link getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
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
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed.
   */
  public final native com.google.gwt.gdata.client.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name name of attribute.
   * @param attribute Attribute to add.
   */
  public final native void setAttribute(String name, Attribute attribute) /*-{
    this.setAttribute(name, attribute);
  }-*/;

  /**
   * Sets the attributes. The parameter is a map from attribute name to the
   * associated Attribute class.
   * 
   * @param attributes Attributes, where each attribute is added using
   * setAttribute().
   */
  public final native void setAttributes(MapAttribute attributes) /*-{
    this.setAttributes(attributes);
  }-*/;

}