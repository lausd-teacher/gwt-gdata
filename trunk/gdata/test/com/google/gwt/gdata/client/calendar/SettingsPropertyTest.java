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
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the SettingsProperty class.
 */
public class SettingsPropertyTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("NAME_ALTERNATE_CALENDAR", SettingsProperty.NAME_ALTERNATE_CALENDAR);
    assertNotNull("NAME_COUNTRY", SettingsProperty.NAME_COUNTRY);
    assertNotNull("NAME_CUSTOM_CAL_MODE", SettingsProperty.NAME_CUSTOM_CAL_MODE);
    assertNotNull("NAME_DATE_FIELD_ORDER", SettingsProperty.NAME_DATE_FIELD_ORDER);
    assertNotNull("NAME_DEFAULT_CAL_MODE", SettingsProperty.NAME_DEFAULT_CAL_MODE);
    assertNotNull("NAME_DISPLAY_ALL_TIMEZONES", SettingsProperty.NAME_DISPLAY_ALL_TIMEZONES);
    assertNotNull("NAME_FORMAT_24_HOUR_TIME", SettingsProperty.NAME_FORMAT_24_HOUR_TIME);
    assertNotNull("NAME_HIDE_INVITATIONS", SettingsProperty.NAME_HIDE_INVITATIONS);
    assertNotNull("NAME_HIDE_WEEKENDS", SettingsProperty.NAME_HIDE_WEEKENDS);
    assertNotNull("NAME_LOCALE", SettingsProperty.NAME_LOCALE);
    assertNotNull("NAME_SHOW_DECLINED_EVENTS", SettingsProperty.NAME_SHOW_DECLINED_EVENTS);
    assertNotNull("NAME_TIMEZONE", SettingsProperty.NAME_TIMEZONE);
    assertNotNull("NAME_TIMEZONE_LABEL", SettingsProperty.NAME_TIMEZONE_LABEL);
    assertNotNull("NAME_USER_LOCATION", SettingsProperty.NAME_USER_LOCATION);
    assertNotNull("NAME_WEATHER", SettingsProperty.NAME_WEATHER);
    assertNotNull("NAME_WEEK_START", SettingsProperty.NAME_WEEK_START);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", SettingsProperty.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    SettingsProperty obj = SettingsProperty.newInstance(JavaScriptObject.createObject());
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
  }
}
