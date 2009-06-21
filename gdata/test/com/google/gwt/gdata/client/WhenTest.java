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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests for the When class.
 */
public class WhenTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", When.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    When obj = When.newInstance(JavaScriptObject.createObject());
    // Unit Test for addReminder(Reminder reminder)
    // Unit Test for getReminder()
    assertEquals("getReminder", obj.getReminder(), null);
    // Unit Test for setEndTime(Date endTime)
    // Unit Test for setReminder(JsArray reminder)
    // Unit Test for setStartTime(Date startTime)
  }

  public void testProperties() {
    When obj = When.newInstance(JavaScriptObject.createObject());
    DateTime endtime = DateTime.newInstance(new Date(), false);
    obj.setEndTime(endtime);
    assertEquals("endtime", obj.getEndTime().getDate(), endtime.getDate());
    DateTime starttime = DateTime.newInstance(new Date(), false);
    obj.setStartTime(starttime);
    assertEquals("starttime", obj.getStartTime().getDate(), starttime.getDate());
    String valuestring = "myValue";
    obj.setValueString(valuestring);
    assertEquals("valuestring", obj.getValueString(), valuestring);
  }
}
