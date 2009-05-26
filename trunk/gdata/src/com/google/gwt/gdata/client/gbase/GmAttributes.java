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
public class GmAttributes extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.GmAttributes;
  }-*/;

  /**
   * Constructs a gm attributes using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmAttributes newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.GmAttributes(
      params
    );
  }-*/;

  /**
   * Constructs a gm attributes using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmAttributes newInstance() /*-{
    return new $wnd.google.gdata.gbase.GmAttributes();
  }-*/;

  protected GmAttributes() { }

  /**
   * Adds a new list of attribute for an item type.
   * 
   * @param attribute
   */
  public final native void addAttribute(JavaScriptObject attribute) /*-{
    this.addAttribute(
      attribute
    );
  }-*/;

  /**
   * Adds a new list of attribute for an item type.
   * 
   * @param attribute
   */
  public final native void addAttribute(GmAttribute attribute) /*-{
    this.addAttribute(
      attribute
    );
  }-*/;

  /**
   * Returns the list of attribute for an item types.
   * 
   * @return
   */
  public final native GmAttribute[] getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   * 
   * @param attributes
   */
  public final native void setAttributes(JavaScriptObject[] attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   * 
   * @param attributes
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   * 
   * @param attributes
   */
  public final native void setAttributes(GmAttribute[] attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

}
