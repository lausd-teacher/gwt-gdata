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
 * Tests for the GeoPt class.
 */
public class GeoPtTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GeoPt.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setTime(Date time)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        GeoPt obj = GeoPt.newInstance();
        double lat = 600813;
        obj.setLat(lat);
        assertEquals("lat", obj.getLat(), lat);
        DateTime time = DateTime.newInstance(new Date(), false);
        obj.setTime(time);
        assertEquals("time", obj.getTime().getDate(), time.getDate());
        double lon = 600813;
        obj.setLon(lon);
        assertEquals("lon", obj.getLon(), lon);
        double elev = 600813;
        obj.setElev(elev);
        assertEquals("elev", obj.getElev(), elev);
        String label = "myValue";
        obj.setLabel(label);
        assertEquals("label", obj.getLabel(), label);
        finishGDataTest();
      }
    }, 10000);
  }
}
