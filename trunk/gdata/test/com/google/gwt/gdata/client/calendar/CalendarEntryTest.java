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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Where;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CalendarEntry class.
 */
public class CalendarEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", CalendarEntry.getConstructor());
    assertNotNull("newInstance()", CalendarEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    CalendarEntry obj = CalendarEntry.newInstance(JavaScriptObject.createObject());
    SelectedProperty selected = SelectedProperty.newInstance(JavaScriptObject.createObject());
    obj.setSelected(selected);
    assertSame("selected", obj.getSelected(), selected);
    ColorProperty color = ColorProperty.newInstance(JavaScriptObject.createObject());
    obj.setColor(color);
    assertSame("color", obj.getColor(), color);
    TimesCleanedProperty timescleaned = TimesCleanedProperty.newInstance(JavaScriptObject.createObject());
    obj.setTimesCleaned(timescleaned);
    assertSame("timescleaned", obj.getTimesCleaned(), timescleaned);
    TimeZoneProperty timezone = TimeZoneProperty.newInstance(JavaScriptObject.createObject());
    obj.setTimeZone(timezone);
    assertSame("timezone", obj.getTimeZone(), timezone);
    HiddenProperty hidden = HiddenProperty.newInstance(JavaScriptObject.createObject());
    obj.setHidden(hidden);
    assertSame("hidden", obj.getHidden(), hidden);
    OverrideNameProperty overridename = OverrideNameProperty.newInstance(JavaScriptObject.createObject());
    obj.setOverrideName(overridename);
    assertSame("overridename", obj.getOverrideName(), overridename);
    JsArray<Where> locations = ArrayHelper.toJsArray(Where.newInstance(JavaScriptObject.createObject()));
    obj.setLocations(locations);
    assertEquals("locations", obj.getLocations().length(), locations.length());
    int lenLocations = obj.getLocations().length();
    obj.addLocation(Where.newInstance(JavaScriptObject.createObject()));
    assertEquals("locations", obj.getLocations().length(), lenLocations + 1);
    AccessLevelProperty accesslevel = AccessLevelProperty.newInstance(JavaScriptObject.createObject());
    obj.setAccessLevel(accesslevel);
    assertSame("accesslevel", obj.getAccessLevel(), accesslevel);
  }
}
