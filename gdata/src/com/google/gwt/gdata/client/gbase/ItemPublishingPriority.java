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
 * Describes an item publishing priority.
 */
public class ItemPublishingPriority extends JavaScriptObject {

  /**
   * The item will be published immediately.
   */
  public static final String VALUE_HIGH = getConstant("VALUE_HIGH");

  /**
   * The item will be published in a short while.
   */
  public static final String VALUE_LOW = getConstant("VALUE_LOW");

  /**
   * Constructs an item publishing priority.
   * @return An ItemPublishingPriority object.
   */
  public static native ItemPublishingPriority newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemPublishingPriority();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.ItemPublishingPriority[name];
  }-*/;

  protected ItemPublishingPriority() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;
  
  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}