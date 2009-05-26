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
import com.google.gwt.gdata.client.ExtendedProperty;

/**
 * Comment unavailable.
 */
public class CalendarExtendedProperty extends ExtendedProperty {

  /**
   * Indicates that this extended property can be accessed or modified through the current calendar.
   */
  public static final String REALM_CALENDAR = getConstant("REALM_CALENDAR");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarExtendedProperty;
  }-*/;

  /**
   * Constructs a calendar extended property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarExtendedProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarExtendedProperty(
      params
    );
  }-*/;

  /**
   * Constructs a calendar extended property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarExtendedProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarExtendedProperty();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarExtendedProperty[name];
  }-*/;

  protected CalendarExtendedProperty() { }

}
