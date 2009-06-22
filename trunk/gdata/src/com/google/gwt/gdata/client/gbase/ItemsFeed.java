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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Describes a feed of a user's private items.
 */
public class ItemsFeed extends com.google.gwt.gdata.client.Feed<ItemsEntry> {

  /**
   * Constructs a Google Base item feed using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: attributes, authors, categories, entries, generator, id, itemsPerPage, links, startIndex, title, totalResults, and updated.
   */
  public static native ItemsFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemsFeed(
      params
    );
  }-*/;

  protected ItemsFeed() { }

  /**
   * Returns the attributes. The returned object is a map from attribute name to the associated google.gdata.gbase.Attribute class.
   * 
   * @return Attributes.
   */
  public final native JsArray<Attribute> getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name name of attribute.
   */
  public final native void setAttribute(String name) /*-{
    this.setAttribute(
      name,
      undefined
    );
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name name of attribute.
   * @param attribute Attribute to add, or object to use as a parameter to the google.gdata.gbase.Attribute constructor, or undefined to remove.
   */
  public final native void setAttribute(String name, Attribute attribute) /*-{
    this.setAttribute(
      name,
      attribute
    );
  }-*/;

  /**
   * Sets the attributes. The parameter is a map from attribute name to the associated google.gdata.gbase.Attribute class.
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

  /**
   * Sets the attributes. The parameter is a map from attribute name to the associated google.gdata.gbase.Attribute class.
   * 
   * @param attributes Attributes, where each attribute is added using the setAttribute() function, or undefined to clear the attributes.
   */
  public final native void setAttributes(JavaScriptObject attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

}
