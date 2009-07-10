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
 * Tests for the Aggregates class.
 */
public class AggregatesTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Aggregates.newInstance());
  }

  public void testOther() {
    // Unit Test for addMetric(Metric metric)
  }

  public void testProperties() {
    Aggregates obj = Aggregates.newInstance();
    Metric[] metrics = new Metric[]{ Metric.newInstance() };
    obj.setMetrics(metrics);
    assertEquals("metrics", obj.getMetrics().length, metrics.length);
  }
}
