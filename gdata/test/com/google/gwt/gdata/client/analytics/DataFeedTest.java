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
 * Tests for the DataFeed class.
 */
public class DataFeedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", DataFeed.newInstance());
  }

  public void testOther() {
    DataFeed obj = DataFeed.newInstance();
    // Unit Test for addDataSource(DataSource dataSource)
    // Unit Test for getNextLink()
    assertEquals("getNextLink", obj.getNextLink(), null);
    // Unit Test for getPreviousLink()
    assertEquals("getPreviousLink", obj.getPreviousLink(), null);
  }

  public void testProperties() {
    DataFeed obj = DataFeed.newInstance();
    DataSource[] datasources = new DataSource[]{ DataSource.newInstance() };
    obj.setDataSources(datasources);
    assertEquals("datasources", obj.getDataSources().length, datasources.length);
    EndDate enddate = EndDate.newInstance();
    obj.setEndDate(enddate);
    assertSame("enddate", obj.getEndDate(), enddate);
    Aggregates aggregates = Aggregates.newInstance();
    obj.setAggregates(aggregates);
    assertSame("aggregates", obj.getAggregates(), aggregates);
    StartDate startdate = StartDate.newInstance();
    obj.setStartDate(startdate);
    assertSame("startdate", obj.getStartDate(), startdate);
  }
}
