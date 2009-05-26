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
 * Comment unavailable.
 */
public class AttendeeStatus extends JavaScriptObject {

  /**
   * Attendee has accepted.
   */
  public static final String VALUE_ACCEPTED = getConstant("VALUE_ACCEPTED");

  /**
   * Attendee has declined.
   */
  public static final String VALUE_DECLINED = getConstant("VALUE_DECLINED");

  /**
   * Invitation has been sent, but the person has not accepted.
   */
  public static final String VALUE_INVITED = getConstant("VALUE_INVITED");

  /**
   * Attendee has accepted tentatively.
   */
  public static final String VALUE_TENTATIVE = getConstant("VALUE_TENTATIVE");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.AttendeeStatus;
  }-*/;

  /**
   * Constructs an attendee status using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AttendeeStatus newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.AttendeeStatus(
      params
    );
  }-*/;

  /**
   * Constructs an attendee status using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AttendeeStatus newInstance() /*-{
    return new $wnd.google.gdata.AttendeeStatus();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.AttendeeStatus[name];
  }-*/;

  protected AttendeeStatus() { }

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
