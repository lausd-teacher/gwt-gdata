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
 * Current experiment status.
 */
public class GwoStatus extends JavaScriptObject {

  /**
   * Archived experiment status.
   */
  public static final String VALUE_ARCHIVED = getConstant("VALUE_ARCHIVED");

  /**
   * Finished experiment status.
   */
  public static final String VALUE_FINISHED = getConstant("VALUE_FINISHED");

  /**
   * New experiment status.
   */
  public static final String VALUE_NEW = getConstant("VALUE_NEW");

  /**
   * Paused experiment status.
   */
  public static final String VALUE_PAUSED = getConstant("VALUE_PAUSED");

  /**
   * Running experiment status.
   */
  public static final String VALUE_RUNNING = getConstant("VALUE_RUNNING");

  /**
   * Constructs an experiment status.
   * 
   * @return An instance of GwoStatus.
   */
  public static native GwoStatus newInstance() /*-{
    return new $wnd.google.gdata.analytics.GwoStatus();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.GwoStatus[name];
  }-*/;

  protected GwoStatus() { }

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