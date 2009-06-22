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
 * Describes an entry in the feed of public item types.
 */
public class ItemTypesEntry extends com.google.gwt.gdata.client.Entry<ItemTypesEntry> {

  /**
   * Constructs a Google Base item type entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: attributes, authors, categories, content, id, itemType, links, title, and updated.
   */
  public static native ItemTypesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemTypesEntry(
      params
    );
  }-*/;

  protected ItemTypesEntry() { }

  /**
   * Returns the gm attributes. This element is optional.
   * 
   * @return Gm attributes or undefined for none.
   */
  public final native GmAttributes getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the item type as defined in /itemtypes feed. This element is required.
   * 
   * @return Item type as defined in /itemtypes feed or undefined for none.
   */
  public final native GmItemType getItemType() /*-{
    return this.getItemType();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry or undefined for none.
   */
  public final native com.google.gwt.gdata.client.atom.Link getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Sets the gm attributes. This element is optional.
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

  /**
   * Sets the gm attributes. This element is optional.
   * 
   * @param attributes Gm attributes, or object to use as a parameter to the google.gdata.gbase.GmAttributes constructor, or undefined for none.
   */
  public final native void setAttributes(GmAttributes attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

  /**
   * Sets the item type as defined in /itemtypes feed. This element is required.
   */
  public final native void setItemType() /*-{
    this.setItemType();
  }-*/;

  /**
   * Sets the item type as defined in /itemtypes feed. This element is required.
   * 
   * @param itemType Item type as defined in /itemtypes feed, or object to use as a parameter to the google.gdata.gbase.GmItemType constructor, or undefined for none.
   */
  public final native void setItemType(GmItemType itemType) /*-{
    this.setItemType(
      itemType
    );
  }-*/;

}
