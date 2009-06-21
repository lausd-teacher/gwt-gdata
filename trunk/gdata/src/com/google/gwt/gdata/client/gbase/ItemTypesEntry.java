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

/**
 * Comment unavailable.
 */
public class ItemTypesEntry extends com.google.gwt.gdata.client.Entry<ItemTypesEntry> {

  /**
   * Constructs a Google Base item type entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemTypesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemTypesEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base item type entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemTypesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemTypesEntry();
  }-*/;

  protected ItemTypesEntry() { }

  /**
   * Returns the gm attributes.
   * 
   * @return
   */
  public final native GmAttributes getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the item type as defined in /itemtypes feed.
   * 
   * @return
   */
  public final native GmItemType getItemType() /*-{
    return this.getItemType();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Sets the gm attributes.
   * 
   * @param attributes
   */
  public final native void setAttributes(GmAttributes attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

  /**
   * Sets the gm attributes.
   * 
   * @param attributes
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

  /**
   * Sets the item type as defined in /itemtypes feed.
   * 
   * @param itemType
   */
  public final native void setItemType(GmItemType itemType) /*-{
    this.setItemType(
      itemType
    );
  }-*/;

  /**
   * Sets the item type as defined in /itemtypes feed.
   * 
   * @param itemType
   */
  public final native void setItemType() /*-{
    this.setItemType();
  }-*/;

}
