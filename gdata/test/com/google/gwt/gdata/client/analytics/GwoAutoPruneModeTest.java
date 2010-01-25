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
 * Tests for the GwoAutoPruneMode class.
 */
public class GwoAutoPruneModeTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("VALUE_AGGRESSIVE", GwoAutoPruneMode.VALUE_AGGRESSIVE);
        assertNotNull("VALUE_CONSERVATIVE", GwoAutoPruneMode.VALUE_CONSERVATIVE);
        assertNotNull("VALUE_NONE", GwoAutoPruneMode.VALUE_NONE);
        assertNotNull("VALUE_NORMAL", GwoAutoPruneMode.VALUE_NORMAL);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GwoAutoPruneMode.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        GwoAutoPruneMode obj = GwoAutoPruneMode.newInstance();
        String value = "myValue";
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        finishGDataTest();
      }
    }, 10000);
  }
}
