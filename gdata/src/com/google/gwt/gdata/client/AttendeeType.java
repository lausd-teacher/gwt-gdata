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
 * Describes the type of an event attendee.
 */
public class AttendeeType extends JavaScriptObject {

  /**
   * Optional attendee.
   */
  public static final String VALUE_OPTIONAL = getConstant("VALUE_OPTIONAL");

  /**
   * Required attendee.
   */
  public static final String VALUE_REQUIRED = getConstant("VALUE_REQUIRED");

  /**
   * Constructs an attendee type.
   * @return An AttendeeType object.
   */
  public static native AttendeeType newInstance() /*-{
    return new $wnd.google.gdata.AttendeeType();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.AttendeeType[name];
  }-*/;

  protected AttendeeType() { }

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