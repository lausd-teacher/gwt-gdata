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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests for the SidewikiEntryQuery class.
 */
public class SidewikiEntryQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SORTORDER_PUBLISHED",
        SidewikiEntryQuery.SORTORDER_PUBLISHED);
    assertNotNull("SORTORDER_QUALITY", SidewikiEntryQuery.SORTORDER_QUALITY);
    assertNotNull("SORTORDER_UPDATED", SidewikiEntryQuery.SORTORDER_UPDATED);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", SidewikiEntryQuery.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setStartIndex(String startIndex)
    // Unit Test for setUpdatedMax(String updatedMax)
    // Unit Test for setUpdatedMin(String updatedMin)
  }

  public void testProperties() {
    SidewikiEntryQuery obj = SidewikiEntryQuery.newInstance("myValue");
    DateTime updatedmin = DateTime.newInstance(new Date(), false);
    obj.setUpdatedMin(updatedmin);
    assertEquals("updatedmin", obj.getUpdatedMin().getDate(),
        updatedmin.getDate());
    double startindex = 600813;
    obj.setStartIndex(startindex);
    assertEquals("startindex", obj.getStartIndex(), startindex);
    String sortorder = "myValue";
    obj.setSortOrder(sortorder);
    assertEquals("sortorder", obj.getSortOrder(), sortorder);
    double maxresults = 600813;
    obj.setMaxResults(maxresults);
    assertEquals("maxresults", obj.getMaxResults(), maxresults);
    DateTime updatedmax = DateTime.newInstance(new Date(), false);
    obj.setUpdatedMax(updatedmax);
    assertEquals("updatedmax", obj.getUpdatedMax().getDate(),
        updatedmax.getDate());
  }
}