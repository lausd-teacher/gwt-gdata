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

/**
 * Tests for the EventStatus class.
 */
public class EventStatusTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("VALUE_CANCELED", EventStatus.VALUE_CANCELED);
    assertNotNull("VALUE_CONFIRMED", EventStatus.VALUE_CONFIRMED);
    assertNotNull("VALUE_TENTATIVE", EventStatus.VALUE_TENTATIVE);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", EventStatus.newInstance());
  }

  public void testProperties() {
    EventStatus obj = EventStatus.newInstance();
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
  }
}
