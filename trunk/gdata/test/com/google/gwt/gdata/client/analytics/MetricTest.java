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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Metric class.
 */
public class MetricTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("TYPE_CURRENCY", Metric.TYPE_CURRENCY);
    assertNotNull("TYPE_FLOAT", Metric.TYPE_FLOAT);
    assertNotNull("TYPE_INTEGER", Metric.TYPE_INTEGER);
    assertNotNull("TYPE_PERCENT", Metric.TYPE_PERCENT);
    assertNotNull("TYPE_TIME", Metric.TYPE_TIME);
    assertNotNull("TYPE_US_CURRENCY", Metric.TYPE_US_CURRENCY);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Metric.newInstance());
  }

  public void testProperties() {
    Metric obj = Metric.newInstance();
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    double confidenceinterval = 600813;
    obj.setConfidenceInterval(confidenceinterval);
    assertEquals("confidenceinterval", obj.getConfidenceInterval(), confidenceinterval);
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
  }
}
