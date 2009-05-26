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
import com.google.gwt.gdata.client.FeedLink;

/**
 * Comment unavailable.
 */
public class ItemsEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.ItemsEntry;
  }-*/;

  /**
   * Constructs a Google Base item entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemsEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base item entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemsEntry();
  }-*/;

  protected ItemsEntry() { }

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
  public final native Attribute[] getAttributes() /*-{
    return this.getAttributes();
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
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name
   * @param attribute
   */
  public final native void setAttribute(String name, JavaScriptObject attribute) /*-{
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

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(JavaScriptObject feedLink) /*-{
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
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

}
