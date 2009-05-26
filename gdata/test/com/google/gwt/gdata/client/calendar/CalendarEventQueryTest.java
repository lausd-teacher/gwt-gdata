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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CalendarEventQuery class.
 */
public class CalendarEventQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("ORDERBY_LAST_MODIFIED", CalendarEventQuery.ORDERBY_LAST_MODIFIED);
    assertNotNull("ORDERBY_START_TIME", CalendarEventQuery.ORDERBY_START_TIME);
    assertNotNull("SORTORDER_ASCENDING", CalendarEventQuery.SORTORDER_ASCENDING);
    assertNotNull("SORTORDER_DESCENDING", CalendarEventQuery.SORTORDER_DESCENDING);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", CalendarEventQuery.getConstructor());
    assertNotNull("newInstance()", CalendarEventQuery.newInstance("myValue"));
  }

  public void testProperties() {
    CalendarEventQuery obj = CalendarEventQuery.newInstance("myValue");
    String sortorder = "myValue";
    obj.setSortOrder(sortorder);
    assertEquals("sortorder", obj.getSortOrder(), sortorder);
    String author = "myValue";
    obj.setAuthor(author);
    assertEquals("author", obj.getAuthor(), author);
    String orderby = "myValue";
    obj.setOrderBy(orderby);
    assertEquals("orderby", obj.getOrderBy(), orderby);
    String fulltextquery = "myValue";
    obj.setFullTextQuery(fulltextquery);
    assertEquals("fulltextquery", obj.getFullTextQuery(), fulltextquery);
  }
}
