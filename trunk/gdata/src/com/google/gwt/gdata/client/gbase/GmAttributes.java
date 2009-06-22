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
 * Describes a gm attributes.
 */
public class GmAttributes extends JavaScriptObject {

  /**
   * Constructs a gm attributes using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: attributes.
   */
  public static native GmAttributes newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.GmAttributes(
      params
    );
  }-*/;

  protected GmAttributes() { }

  /**
   * Adds a new list of attribute for an item type.
   * 
   * @param attribute List of attribute for an item type to add, or object to use as a parameter to the google.gdata.gbase.GmAttribute constructor.
   */
  public final native void addAttribute(GmAttribute attribute) /*-{
    this.addAttribute(
      attribute
    );
  }-*/;

  /**
   * Returns the list of attribute for an item types.
   * 
   * @return List of attribute for an item types.
   */
  public final native JsArray<GmAttribute> getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   */
  public final native void setAttributes() /*-{
    this.setAttributes();
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   * 
   * @param attributes List of attribute for an item types, where each list of attribute for an item type is added using the addAttribute() function, or undefined to clear the list of attribute for an item types.
   */
  public final native void setAttributes(JsArray<GmAttribute> attributes) /*-{
    this.setAttributes(
      attributes
    );
  }-*/;

}
