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

/**
 * Tests for the Rating class.
 */
public class RatingTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_OVERALL", Rating.REL_OVERALL);
        assertNotNull("REL_PRICE", Rating.REL_PRICE);
        assertNotNull("REL_QUALITY", Rating.REL_QUALITY);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Rating.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Rating obj = Rating.newInstance();
        double min = 600813;
        obj.setMin(min);
        assertEquals("min", obj.getMin(), min);
        double value = 600813;
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        double average = 600813;
        obj.setAverage(average);
        assertEquals("average", obj.getAverage(), average);
        double numraters = 600813;
        obj.setNumRaters(numraters);
        assertEquals("numraters", obj.getNumRaters(), numraters);
        String rel = "myValue";
        obj.setRel(rel);
        assertEquals("rel", obj.getRel(), rel);
        double max = 600813;
        obj.setMax(max);
        assertEquals("max", obj.getMax(), max);
        finishGDataTest();
      }
    }, 10000);
  }
}
