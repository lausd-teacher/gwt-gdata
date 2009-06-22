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
 * Describes an entry in the feed of public attributes.
 */
public class AttributesEntry extends com.google.gwt.gdata.client.Entry<AttributesEntry> {

  /**
   * Constructs a Google Base attribute entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: attribute, authors, categories, content, id, links, title, and updated.
   */
  public static native AttributesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.AttributesEntry(
      params
    );
  }-*/;

  protected AttributesEntry() { }

  /**
   * Returns the list of attribute for an item type. This element is required.
   * 
   * @return List of attribute for an item type or undefined for none.
   */
  public final native GmAttribute getAttribute() /*-{
    return this.getAttribute();
  }-*/;

  /**
   * Sets the list of attribute for an item type. This element is required.
   */
  public final native void setAttribute() /*-{
    this.setAttribute();
  }-*/;

  /**
   * Sets the list of attribute for an item type. This element is required.
   * 
   * @param attribute List of attribute for an item type, or object to use as a parameter to the google.gdata.gbase.GmAttribute constructor, or undefined for none.
   */
  public final native void setAttribute(GmAttribute attribute) /*-{
    this.setAttribute(
      attribute
    );
  }-*/;

}
