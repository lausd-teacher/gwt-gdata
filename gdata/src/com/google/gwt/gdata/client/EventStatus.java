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
 * Describes the base set of values for event status.
 */
public class EventStatus extends JavaScriptObject {

  /**
   * The event has been canceled.
   */
  public static final String VALUE_CANCELED = getConstant("VALUE_CANCELED");

  /**
   * The event is planned.
   */
  public static final String VALUE_CONFIRMED = getConstant("VALUE_CONFIRMED");

  /**
   * The event is only tentatively scheduled.
   */
  public static final String VALUE_TENTATIVE = getConstant("VALUE_TENTATIVE");

  /**
   * Constructs an event status.
   * @return An EventStatus object.
   */
  public static native EventStatus newInstance() /*-{
    return new $wnd.google.gdata.EventStatus();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.EventStatus[name];
  }-*/;

  protected EventStatus() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return The value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value The value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}