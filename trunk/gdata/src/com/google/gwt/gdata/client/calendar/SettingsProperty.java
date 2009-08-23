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
 * User preference name-value pair.
 */
public class SettingsProperty extends JavaScriptObject {

  /**
   * AlternateCalendar settings property.
   */
  public static final String NAME_ALTERNATE_CALENDAR =
      getConstant("NAME_ALTERNATE_CALENDAR");

  /**
   * Country settings property.
   */
  public static final String NAME_COUNTRY = getConstant("NAME_COUNTRY");

  /**
   * CustomCalMode settings property.
   */
  public static final String NAME_CUSTOM_CAL_MODE =
      getConstant("NAME_CUSTOM_CAL_MODE");

  /**
   * DateFieldOrder settings property.
   */
  public static final String NAME_DATE_FIELD_ORDER =
      getConstant("NAME_DATE_FIELD_ORDER");

  /**
   * DefaultCalMode settings property.
   */
  public static final String NAME_DEFAULT_CAL_MODE =
      getConstant("NAME_DEFAULT_CAL_MODE");

  /**
   * DisplayAllTimezones settings property.
   */
  public static final String NAME_DISPLAY_ALL_TIMEZONES =
      getConstant("NAME_DISPLAY_ALL_TIMEZONES");

  /**
   * Format24HourTime settings property.
   */
  public static final String NAME_FORMAT_24_HOUR_TIME =
      getConstant("NAME_FORMAT_24_HOUR_TIME");

  /**
   * HideInvitations settings property.
   */
  public static final String NAME_HIDE_INVITATIONS =
      getConstant("NAME_HIDE_INVITATIONS");

  /**
   * HideWeekends settings property.
   */
  public static final String NAME_HIDE_WEEKENDS =
      getConstant("NAME_HIDE_WEEKENDS");

  /**
   * Locale settings property.
   */
  public static final String NAME_LOCALE = getConstant("NAME_LOCALE");

  /**
   * ShowDeclinedEvents settings property.
   */
  public static final String NAME_SHOW_DECLINED_EVENTS =
      getConstant("NAME_SHOW_DECLINED_EVENTS");

  /**
   * Timezone settings property.
   */
  public static final String NAME_TIMEZONE = getConstant("NAME_TIMEZONE");

  /**
   * TimezoneLabel settings property.
   */
  public static final String NAME_TIMEZONE_LABEL =
      getConstant("NAME_TIMEZONE_LABEL");

  /**
   * UserLocation settings property.
   */
  public static final String NAME_USER_LOCATION =
      getConstant("NAME_USER_LOCATION");

  /**
   * Weather settings property.
   */
  public static final String NAME_WEATHER = getConstant("NAME_WEATHER");

  /**
   * WeekStart settings property.
   */
  public static final String NAME_WEEK_START = getConstant("NAME_WEEK_START");

  /**
   * Constructs a settings property.
   * @return A SettingsProperty object.
   */
  public static native SettingsProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.SettingsProperty();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.SettingsProperty[name];
  }-*/;

  protected SettingsProperty() { }

  /**
   * Returns the Property name. This attribute is required.
   * 
   * @return Property name.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the Property value. This attribute is required.
   * 
   * @return Property value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the Property name. This attribute is required.
   * 
   * @param name Property name.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the Property value. This attribute is required.
   * 
   * @param value Property value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}