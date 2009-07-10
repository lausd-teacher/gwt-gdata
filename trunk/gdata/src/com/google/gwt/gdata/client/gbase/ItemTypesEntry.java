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

/**
 * Describes an entry in the feed of public item types.
 */
public class ItemTypesEntry extends com.google.gwt.gdata.client.Entry<ItemTypesEntry> {

  /**
   * Constructs a Google Base item type entry.
   * @return An ItemTypesEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native ItemTypesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemTypesEntry();
  }-*/;

  protected ItemTypesEntry() { }

  /**
   * Returns the gm attributes. This element is optional.
   * 
   * @return Gm attributes.
   */
  public final native GmAttributes getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the item type as defined in /itemtypes feed. This element is required.
   * 
   * @return Item type as defined in /itemtypes feed.
   */
  public final native GmItemType getItemType() /*-{
    return this.getItemType();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry.
   */
  public final native com.google.gwt.gdata.client.atom.Link getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Sets the gm attributes. This element is optional.
   * 
   * @param attributes Gm attributes.
   */
  public final native void setAttributes(GmAttributes attributes) /*-{
    this.setAttributes(attributes);
  }-*/;

  /**
   * Sets the item type as defined in itemtypes feed. This element is required.
   * 
   * @param itemType Item type as defined in /itemtypes feed.
   */
  public final native void setItemType(GmItemType itemType) /*-{
    this.setItemType(itemType);
  }-*/;

}