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

package com.google.gwt.gdata.client.analytics;

/**
 * Tests for the Goal class.
 */
public class GoalTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Goal.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Goal obj = Goal.newInstance();
        String name = "myValue";
        obj.setName(name);
        assertEquals("name", obj.getName(), name);
        double value = 600813;
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        Destination destination = Destination.newInstance();
        obj.setDestination(destination);
        assertSame("destination", obj.getDestination(), destination);
        double number = 600813;
        obj.setNumber(number);
        assertEquals("number", obj.getNumber(), number);
        boolean active = true;
        obj.setActive(active);
        assertSame("active", obj.getActive(), active);
        Engagement engagement = Engagement.newInstance();
        obj.setEngagement(engagement);
        assertSame("engagement", obj.getEngagement(), engagement);
        finishGDataTest();
      }
    }, 10000);
  }
}
