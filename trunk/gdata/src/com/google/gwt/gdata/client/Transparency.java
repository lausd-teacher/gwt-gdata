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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes the base set of values for event transparency.
 */
public class Transparency extends JavaScriptObject {

  /**
   * Indicates event consumes time on calendar; event time will be marked as busy in a free/busy search.
   */
  public static final String VALUE_OPAQUE = getConstant("VALUE_OPAQUE");

  /**
   * Indicates event doesn't consume any time on calendar; event time will not be marked as busy in a free/busy search.
   */
  public static final String VALUE_TRANSPARENT = getConstant("VALUE_TRANSPARENT");

  /**
   * Constructs an event transparency using an object parameter whose property names match the setter method to use for each property.
   * @return A Transparency object.
   */
  public static native Transparency newInstance() /*-{
    return new $wnd.google.gdata.Transparency();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Transparency[name];
  }-*/;

  protected Transparency() { }

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