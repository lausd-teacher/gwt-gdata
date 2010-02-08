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
 * Tests for the DataEntry class.
 */
public class DataEntryTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("KIND_ANALYTICS_DATAROW",
            DataEntry.KIND_ANALYTICS_DATAROW);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", DataEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataEntry obj = DataEntry.newInstance();
        Dimension dim = Dimension.newInstance();
        dim.setName("dim1");
        dim.setValue("val1");
        obj.addDimension(dim);
        assertEquals("addDimension", 1, obj.getDimensions().length);
        assertEquals("getDimension", dim.getValue(), obj.getDimension(dim.getName()).getValue());
        Metric met = Metric.newInstance();
        obj.addMetric(met);
        assertEquals("addMetric", 1, obj.getMetrics().length);
        assertNull("getMetric", obj.getMetric("metric"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataEntry obj = DataEntry.newInstance();
        Dimension[] dimensions = new Dimension[]{ Dimension.newInstance() };
        obj.setDimensions(dimensions);
        assertEquals("dimensions", obj.getDimensions().length, dimensions.length);
        Metric[] metrics = new Metric[]{ Metric.newInstance() };
        obj.setMetrics(metrics);
        assertEquals("metrics", obj.getMetrics().length, metrics.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
