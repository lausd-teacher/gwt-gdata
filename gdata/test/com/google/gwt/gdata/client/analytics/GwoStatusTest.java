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
 * Tests for the GwoStatus class.
 */
public class GwoStatusTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("VALUE_ARCHIVED", GwoStatus.VALUE_ARCHIVED);
        assertNotNull("VALUE_FINISHED", GwoStatus.VALUE_FINISHED);
        assertNotNull("VALUE_NEW", GwoStatus.VALUE_NEW);
        assertNotNull("VALUE_PAUSED", GwoStatus.VALUE_PAUSED);
        assertNotNull("VALUE_RUNNING", GwoStatus.VALUE_RUNNING);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GwoStatus.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        GwoStatus obj = GwoStatus.newInstance();
        String value = "myValue";
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        finishGDataTest();
      }
    }, 10000);
  }
}
