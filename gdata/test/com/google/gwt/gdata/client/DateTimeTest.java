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

import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests for the DateTime class.
 */
public class DateTimeTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", DateTime.getConstructor());
    assertNotNull("newInstance()", DateTime.newInstance(new Date(), false));
  }

  public void testOther() {
    // DateTime obj = DateTime.newInstance(new Date(), true);
    // obj.equals(otherDateTime);
    // obj.fromIso8601(isoString);
    // obj.toIso8601(dateTime);
    // obj.toIso8601(dateTime);
  }

  public void testProperties() {
    DateTime obj = DateTime.newInstance(new Date(), false);
    Date date = new Date();
    obj.setDate(date);
    assertEquals("date", obj.getDate(), date);
    boolean dateonly = true;
    obj.setDateOnly(dateonly);
    assertSame("dateonly", obj.isDateOnly(), dateonly);
  }
}
