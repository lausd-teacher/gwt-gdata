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
public class AttributesEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.AttributesEntry;
  }-*/;

  /**
   * Constructs a Google Base attribute entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AttributesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.AttributesEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base attribute entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AttributesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.AttributesEntry();
  }-*/;

  protected AttributesEntry() { }

  /**
   * Returns the list of attribute for an item type.
   * 
   * @return
   */
  public final native GmAttribute getAttribute() /*-{
    return this.getAttribute();
  }-*/;

  /**
   * Sets the list of attribute for an item type.
   * 
   * @param attribute
   */
  public final native void setAttribute(JavaScriptObject attribute) /*-{
    this.setAttribute(
      attribute
    );
  }-*/;

  /**
   * Sets the list of attribute for an item type.
   * 
   * @param attribute
   */
  public final native void setAttribute() /*-{
    this.setAttribute();
  }-*/;

  /**
   * Sets the list of attribute for an item type.
   * 
   * @param attribute
   */
  public final native void setAttribute(GmAttribute attribute) /*-{
    this.setAttribute(
      attribute
    );
  }-*/;

}
