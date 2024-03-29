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

/**
 * Tests for the CalendarEntry class.
 */
public class CalendarEntryTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CalendarEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        CalendarEntry obj = CalendarEntry.newInstance();
        obj.addLocation(Where.newInstance());
        assertEquals("addLocation", 1, obj.getLocations().length);
        assertNull("getAccessControlListLink", obj.getAccessControlListLink());
        assertNull("getAtomAlternateLink", obj.getAtomAlternateLink());
        assertNull("getEventFeedLink", obj.getEventFeedLink());
        assertNull("getRelatedLink", obj.getRelatedLink());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
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
        boolean incomplete = true;
        obj.setIncomplete(incomplete);
        assertEquals("incomplete", obj.getIncomplete(), incomplete);
        OverrideNameProperty overridename = OverrideNameProperty.newInstance();
        obj.setOverrideName(overridename);
        assertSame("overridename", obj.getOverrideName(), overridename);
        Where[] locations = new Where[]{ Where.newInstance() };
        obj.setLocations(locations);
        assertEquals("locations", obj.getLocations().length, locations.length);
        AccessLevelProperty accesslevel = AccessLevelProperty.newInstance();
        obj.setAccessLevel(accesslevel);
        assertSame("accesslevel", obj.getAccessLevel(), accesslevel);
        finishGDataTest();
      }
    }, 10000);
  }
}
