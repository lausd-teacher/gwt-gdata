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
    assertNotNull("newInstance()", CalendarEntry.newInstance());
  }

  public void testOther() {
    CalendarEntry obj = CalendarEntry.newInstance();
    // Unit Test for addLocation(Where location)
    // Unit Test for getAccessControlListLink()
    assertEquals("getAccessControlListLink", obj.getAccessControlListLink(), null);
    // Unit Test for getAtomAlternateLink()
    assertEquals("getAtomAlternateLink", obj.getAtomAlternateLink(), null);
    // Unit Test for getEventFeedLink()
    assertEquals("getEventFeedLink", obj.getEventFeedLink(), null);
    // Unit Test for getRelatedLink()
    assertEquals("getRelatedLink", obj.getRelatedLink(), null);
  }

  public void testProperties() {
    CalendarEntry obj = CalendarEntry.newInstance();
    SelectedProperty selected = SelectedProperty.newInstance();
    obj.setSelected(selected);
    assertSame("selected", obj.getSelected(), selected);
    ColorProperty color = ColorProperty.newInstance();
    obj.setColor(color);
    assertSame("color", obj.getColor(), color);
    TimesCleanedProperty timescleaned = TimesCleanedProperty.newInstance();
    obj.setTimesCleaned(timescleaned);
    assertSame("timescleaned", obj.getTimesCleaned(), timescleaned);
    TimeZoneProperty timezone = TimeZoneProperty.newInstance();
    obj.setTimeZone(timezone);
    assertSame("timezone", obj.getTimeZone(), timezone);
    HiddenProperty hidden = HiddenProperty.newInstance();
    obj.setHidden(hidden);
    assertSame("hidden", obj.getHidden(), hidden);
    OverrideNameProperty overridename = OverrideNameProperty.newInstance();
    obj.setOverrideName(overridename);
    assertSame("overridename", obj.getOverrideName(), overridename);
    Where[] locations = new Where[]{ Where.newInstance() };
    obj.setLocations(locations);
    assertEquals("locations", obj.getLocations().length, locations.length);
    AccessLevelProperty accesslevel = AccessLevelProperty.newInstance();
    obj.setAccessLevel(accesslevel);
    assertSame("accesslevel", obj.getAccessLevel(), accesslevel);
  }
}
