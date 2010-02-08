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
 * Tests for the DataFeed class.
 */
public class DataFeedTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("KIND_ANALYTICS_DATA", DataFeed.KIND_ANALYTICS_DATA);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", DataFeed.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataFeed obj = DataFeed.newInstance();
        obj.addSegment(Segment.newInstance());
        assertEquals("addSegment", 1, obj.getSegments().length);
        obj.addDataSource(DataSource.newInstance());
        assertEquals("addDataSource", 1, obj.getDataSources().length);
        assertNull("getNextLink", obj.getNextLink());
        assertNull("getPreviousLink", obj.getPreviousLink());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataFeed obj = DataFeed.newInstance();
        DataSource[] datasources = new DataSource[]{ DataSource.newInstance() };
        obj.setDataSources(datasources);
        assertEquals("datasources", obj.getDataSources().length, datasources.length);
        Segment[] segments = new Segment[]{ Segment.newInstance() };
        obj.setSegments(segments);
        assertEquals("segments", obj.getSegments().length, segments.length);
        EndDate enddate = EndDate.newInstance();
        obj.setEndDate(enddate);
        assertSame("enddate", obj.getEndDate(), enddate);
        Aggregates aggregates = Aggregates.newInstance();
        obj.setAggregates(aggregates);
        assertSame("aggregates", obj.getAggregates(), aggregates);
        StartDate startdate = StartDate.newInstance();
        obj.setStartDate(startdate);
        assertSame("startdate", obj.getStartDate(), startdate);
        finishGDataTest();
      }
    }, 10000);
  }
}
