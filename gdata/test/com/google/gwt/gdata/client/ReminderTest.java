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

import java.util.Date;

/**
 * Tests for the Reminder class.
 */
public class ReminderTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("METHOD_ALERT", Reminder.METHOD_ALERT);
        assertNotNull("METHOD_ALL", Reminder.METHOD_ALL);
        assertNotNull("METHOD_EMAIL", Reminder.METHOD_EMAIL);
        assertNotNull("METHOD_NONE", Reminder.METHOD_NONE);
        assertNotNull("METHOD_SMS", Reminder.METHOD_SMS);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Reminder.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        Reminder obj = Reminder.newInstance();
        Date value = new Date();
        obj.setAbsoluteTime(value);
        assertEquals("value", obj.getAbsoluteTime().getDate(), value);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Reminder obj = Reminder.newInstance();
        double minutes = 600813;
        obj.setMinutes(minutes);
        assertEquals("minutes", obj.getMinutes(), minutes);
        DateTime absolutetime = DateTime.newInstance(new Date(), false);
        obj.setAbsoluteTime(absolutetime);
        assertEquals("absolutetime", obj.getAbsoluteTime().getDate(), absolutetime.getDate());
        double hours = 600813;
        obj.setHours(hours);
        assertEquals("hours", obj.getHours(), hours);
        double days = 600813;
        obj.setDays(days);
        assertEquals("days", obj.getDays(), days);
        String method = "myValue";
        obj.setMethod(method);
        assertEquals("method", obj.getMethod(), method);
        finishGDataTest();
      }
    }, 10000);
  }
}
