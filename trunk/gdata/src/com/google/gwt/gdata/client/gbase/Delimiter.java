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
public class Delimiter extends JavaScriptObject {

  /**
   * Pipe delimiter.
   */
  public static final String VALUE_PIPE = getConstant("VALUE_PIPE");

  /**
   * Tab delimiter.
   */
  public static final String VALUE_TAB = getConstant("VALUE_TAB");

  /**
   * Tilde delimiter.
   */
  public static final String VALUE_TILDE = getConstant("VALUE_TILDE");

  /**
   * Constructs a delimiter using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Delimiter newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.Delimiter(
      params
    );
  }-*/;

  /**
   * Constructs a delimiter using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Delimiter newInstance() /*-{
    return new $wnd.google.gdata.gbase.Delimiter();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.Delimiter[name];
  }-*/;

  protected Delimiter() { }

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
