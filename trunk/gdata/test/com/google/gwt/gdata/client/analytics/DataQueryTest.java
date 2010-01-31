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
 * Tests for the DataQuery class.
 */
public class DataQueryTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", DataQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setPrettyprint(String prettyprint)
    // Unit Test for setStartIndex(String startIndex)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataQuery obj = DataQuery.newInstance("myValue");
        String startdate = "myValue";
        obj.setStartDate(startdate);
        assertEquals("startdate", obj.getStartDate(), startdate);
        String ids = "myValue";
        obj.setIds(ids);
        assertEquals("ids", obj.getIds(), ids);
        String enddate = "myValue";
        obj.setEndDate(enddate);
        assertEquals("enddate", obj.getEndDate(), enddate);
        String segment = "myValue";
        obj.setSegment(segment);
        assertEquals("segment", obj.getSegment(), segment);
        String metrics = "myValue";
        obj.setMetrics(metrics);
        assertEquals("metrics", obj.getMetrics(), metrics);
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        String sort = "myValue";
        obj.setSort(sort);
        assertEquals("sort", obj.getSort(), sort);
        String filters = "myValue";
        obj.setFilters(filters);
        assertEquals("filters", obj.getFilters(), filters);
        boolean prettyprint = true;
        obj.setPrettyprint(prettyprint);
        assertSame("prettyprint", obj.getPrettyprint(), prettyprint);
        String dimensions = "myValue";
        obj.setDimensions(dimensions);
        assertEquals("dimensions", obj.getDimensions(), dimensions);
        double maxresults = 600813;
        obj.setMaxResults(maxresults);
        assertEquals("maxresults", obj.getMaxResults(), maxresults);
        finishGDataTest();
      }
    }, 10000);
  }
}
