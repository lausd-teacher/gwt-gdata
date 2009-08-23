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
 * Describes a gm attributes.
 */
public class GmAttributes extends JavaScriptObject {

  /**
   * Constructs a gm attributes.
   * @return A GmAttributes object.
   */
  public static native GmAttributes newInstance() /*-{
    return new $wnd.google.gdata.gbase.GmAttributes();
  }-*/;

  protected GmAttributes() { }

  /**
   * Adds a new list of attribute for an item type.
   * 
   * @param attribute List of attribute for an item type to add.
   */
  public final native void addAttribute(GmAttribute attribute) /*-{
    this.addAttribute(attribute);
  }-*/;

  /**
   * Returns the list of attribute for an item types.
   * 
   * @return List of attribute for an item types.
   */
  public final native GmAttribute[] getAttributes() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getAttributes());
  }-*/;

  /**
   * Sets the list of attribute for an item types.
   * 
   * @param attributes List of attribute for an item types, where each list
   * of attribute for an item type is added using addAttribute().
   */
  public final native void setAttributes(GmAttribute[] attributes) /*-{
    this.setAttributes(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(attributes)
    );
  }-*/;

}