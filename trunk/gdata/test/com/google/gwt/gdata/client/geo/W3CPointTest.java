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

package com.google.gwt.gdata.client.geo;

/**
 * Tests for the W3CPoint class.
 */
public class W3CPointTest extends GeoTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", W3CPoint.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        W3CPoint obj = W3CPoint.newInstance();
        GeoLat geolatitude = GeoLat.newInstance();
        obj.setGeoLatitude(geolatitude);
        assertSame("geolatitude", obj.getGeoLatitude(), geolatitude);
        GeoLong geolongitude = GeoLong.newInstance();
        obj.setGeoLongitude(geolongitude);
        assertSame("geolongitude", obj.getGeoLongitude(), geolongitude);
        finishGDataTest();
      }
    }, 10000);
  }
}
