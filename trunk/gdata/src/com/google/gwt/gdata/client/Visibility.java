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
 * Describes the base set of values for event visibility. Similar to CLASS in RFC 2445.
 */
public class Visibility extends JavaScriptObject {

  /**
   * Allow some readers to see the event.
   */
  public static final String VALUE_CONFIDENTIAL = getConstant("VALUE_CONFIDENTIAL");

  /**
   * Inherit the behavior from the preferences of the owner of the calendar on which the event appears.
   */
  public static final String VALUE_DEFAULT = getConstant("VALUE_DEFAULT");

  /**
   * Allow fewest readers to see the event.
   */
  public static final String VALUE_PRIVATE = getConstant("VALUE_PRIVATE");

  /**
   * Allow most readers to see the event.
   */
  public static final String VALUE_PUBLIC = getConstant("VALUE_PUBLIC");

  /**
   * Constructs an event visibility.
   * @return A Visibility object.
   */
  public static native Visibility newInstance() /*-{
    return new $wnd.google.gdata.Visibility();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Visibility[name];
  }-*/;

  protected Visibility() { }

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