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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class AccessLevelProperty extends JavaScriptObject {

  /**
   * On a calendar, allows full owner access except an editor may not change access control settings on the calendar.
   */
  public static final String VALUE_EDITOR = getConstant("VALUE_EDITOR");

  /**
   * The event shows up as busy time only.
   */
  public static final String VALUE_FREEBUSY = getConstant("VALUE_FREEBUSY");

  /**
   * The event is not visible.
   */
  public static final String VALUE_NONE = getConstant("VALUE_NONE");

  /**
   * Indicates that an event may be modified by way of a set of local overrides that will not be propagated back to the organizer.
   */
  public static final String VALUE_OVERRIDE = getConstant("VALUE_OVERRIDE");

  /**
   * The user is the event organizer or the owner of the calendar.
   */
  public static final String VALUE_OWNER = getConstant("VALUE_OWNER");

  /**
   * The event details are readable.
   */
  public static final String VALUE_READ = getConstant("VALUE_READ");

  /**
   * The participant can read and reply to the event invitation.
   */
  public static final String VALUE_RESPOND = getConstant("VALUE_RESPOND");

  /**
   * The calendar server itself.
   */
  public static final String VALUE_ROOT = getConstant("VALUE_ROOT");

  /**
   * Constructs an access level property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccessLevelProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.AccessLevelProperty(
      params
    );
  }-*/;

  /**
   * Constructs an access level property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccessLevelProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.AccessLevelProperty();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.AccessLevelProperty[name];
  }-*/;

  protected AccessLevelProperty() { }

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
