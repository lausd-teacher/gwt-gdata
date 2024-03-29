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
 * Tests for the When class.
 */
public class WhenTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", When.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        When obj = When.newInstance();
        obj.addReminder(Reminder.newInstance());
        assertEquals("addReminder", 1, obj.getReminder().length);
        obj.setEndTime(DateTime.newInstance(new Date()));
        obj.setStartTime(DateTime.newInstance(new Date()));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        When obj = When.newInstance();
        DateTime endtime = DateTime.newInstance(new Date(), false);
        obj.setEndTime(endtime);
        assertEquals("endtime", obj.getEndTime().getDate(), endtime.getDate());
        Reminder[] reminder = new Reminder[]{ Reminder.newInstance() };
        obj.setReminder(reminder);
        assertEquals("reminder", obj.getReminder().length, reminder.length);
        DateTime starttime = DateTime.newInstance(new Date(), false);
        obj.setStartTime(starttime);
        assertEquals("starttime", obj.getStartTime().getDate(), starttime.getDate());
        String valuestring = "myValue";
        obj.setValueString(valuestring);
        assertEquals("valuestring", obj.getValueString(), valuestring);
        finishGDataTest();
      }
    }, 10000);
  }
}
