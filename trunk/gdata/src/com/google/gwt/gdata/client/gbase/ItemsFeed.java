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
 * Comment unavailable.
 */
public class ItemsFeed extends com.google.gwt.gdata.client.Feed {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.ItemsFeed;
  }-*/;

  /**
   * Constructs a Google Base item feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemsFeed(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base item feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsFeed newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemsFeed();
  }-*/;

  protected ItemsFeed() { }

  /**
   * Returns the attribute.
   * 
   * @param name
   * 
   * @return
   */
  public final native JavaScriptObject getAttribute(String name) /*-{
    return this.getAttribute(
      name
    );
  }-*/;

  /**
   * Returns the attributes.
   * 
   * @return
   */
  public final native JsArray<Attribute> getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name
   * @param attribute
   */
  public final native void setAttribute(String name, Attribute attribute) /*-{
    this.setAttribute(
      name,
      attribute
    );
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name
   * @param attribute
   */
  public final native void setAttribute(String name) /*-{
    this.setAttribute(
      name,
      undefined
    );
  }-*/;

  /**
   * Sets the attributes.
   * 
   * @param attributes
   */
  public final native void setAttributes(JavaScriptObject attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

  /**
   * Sets the attributes.
   * 
   * @param attributes
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

}
