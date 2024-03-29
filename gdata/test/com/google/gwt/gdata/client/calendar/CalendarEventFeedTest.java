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

/**
 * Tests for the CalendarEventFeed class.
 */
public class CalendarEventFeedTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CalendarEventFeed.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        CalendarEventFeed obj = CalendarEventFeed.newInstance();
        assertNull("getFeedBatchLink", obj.getFeedBatchLink());
        assertNull("getNextLink", obj.getNextLink());
        assertNull("getPreviousLink", obj.getPreviousLink());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        CalendarEventFeed obj = CalendarEventFeed.newInstance();
        TimeZoneProperty timezone = TimeZoneProperty.newInstance();
        obj.setTimeZone(timezone);
        assertSame("timezone", obj.getTimeZone(), timezone);
        AllowGSyncProperty allowgsync = AllowGSyncProperty.newInstance();
        obj.setAllowGSync(allowgsync);
        assertSame("allowgsync", obj.getAllowGSync(), allowgsync);
        AllowGSync2Property allowgsync2 = AllowGSync2Property.newInstance();
        obj.setAllowGSync2(allowgsync2);
        assertSame("allowgsync2", obj.getAllowGSync2(), allowgsync2);
        TimesCleanedProperty timescleaned = TimesCleanedProperty.newInstance();
        obj.setTimesCleaned(timescleaned);
        assertSame("timescleaned", obj.getTimesCleaned(), timescleaned);
        finishGDataTest();
      }
    }, 10000);
  }
}
