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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Auto prune mode.
 */
public class GwoAutoPruneMode extends JavaScriptObject {

  /**
   * Aggressive auto-prune mode.
   */
  public static final String VALUE_AGGRESSIVE = getConstant("VALUE_AGGRESSIVE");

  /**
   * Conservative auto-prune mode.
   */
  public static final String VALUE_CONSERVATIVE = getConstant("VALUE_CONSERVATIVE");

  /**
   * None auto-prune mode.
   */
  public static final String VALUE_NONE = getConstant("VALUE_NONE");

  /**
   * Normal auto-prune mode.
   */
  public static final String VALUE_NORMAL = getConstant("VALUE_NORMAL");

  /**
   * Constructs an auto-prune mode.
   * 
   * @return An instance of GwoAutoPruneMode.
   */
  public static native GwoAutoPruneMode newInstance() /*-{
    return new $wnd.google.gdata.analytics.GwoAutoPruneMode();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.GwoAutoPruneMode[name];
  }-*/;

  protected GwoAutoPruneMode() { }

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}