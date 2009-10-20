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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Tests for the AttributesQuery class.
 */
public class AttributesQueryTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", AttributesQuery.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setMaxValues(String maxValues)
    // Unit Test for setPublishedMax(String publishedMax)
    // Unit Test for setPublishedMin(String publishedMin)
    // Unit Test for setStartIndex(String startIndex)
    // Unit Test for setUpdatedMax(String updatedMax)
    // Unit Test for setUpdatedMin(String updatedMin)
  }

  public void testProperties() {
    AttributesQuery obj = AttributesQuery.newInstance("myValue");
    DateTime updatedmin = DateTime.newInstance(new Date(), false);
    obj.setUpdatedMin(updatedmin);
    assertEquals("updatedmin", obj.getUpdatedMin().getDate(), updatedmin.getDate());
    String bq = "myValue";
    obj.setBq(bq);
    assertEquals("bq", obj.getBq(), bq);
    DateTime publishedmin = DateTime.newInstance(new Date(), false);
    obj.setPublishedMin(publishedmin);
    assertEquals("publishedmin", obj.getPublishedMin().getDate(), publishedmin.getDate());
    String author = "myValue";
    obj.setAuthor(author);
    assertEquals("author", obj.getAuthor(), author);
    DateTime updatedmax = DateTime.newInstance(new Date(), false);
    obj.setUpdatedMax(updatedmax);
    assertEquals("updatedmax", obj.getUpdatedMax().getDate(), updatedmax.getDate());
    DateTime publishedmax = DateTime.newInstance(new Date(), false);
    obj.setPublishedMax(publishedmax);
    assertEquals("publishedmax", obj.getPublishedMax().getDate(), publishedmax.getDate());
    double startindex = 600813;
    obj.setStartIndex(startindex);
    assertEquals("startindex", obj.getStartIndex(), startindex);
    double maxvalues = 600813;
    obj.setMaxValues(maxvalues);
    assertEquals("maxvalues", obj.getMaxValues(), maxvalues);
    double maxresults = 600813;
    obj.setMaxResults(maxresults);
    assertEquals("maxresults", obj.getMaxResults(), maxresults);
    String fulltextquery = "myValue";
    obj.setFullTextQuery(fulltextquery);
    assertEquals("fulltextquery", obj.getFullTextQuery(), fulltextquery);
  }
}
