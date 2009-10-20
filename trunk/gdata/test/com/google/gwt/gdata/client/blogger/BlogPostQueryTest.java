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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Tests for the BlogPostQuery class.
 */
public class BlogPostQueryTest extends BloggerTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("ORDERBY_EDITED", BlogPostQuery.ORDERBY_EDITED);
        assertNotNull("ORDERBY_PUBLISHED", BlogPostQuery.ORDERBY_PUBLISHED);
        assertNotNull("ORDERBY_UPDATED", BlogPostQuery.ORDERBY_UPDATED);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", BlogPostQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setPublishedMax(String publishedMax)
    // Unit Test for setPublishedMin(String publishedMin)
    // Unit Test for setStartIndex(String startIndex)
    // Unit Test for setUpdatedMax(String updatedMax)
    // Unit Test for setUpdatedMin(String updatedMin)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        BlogPostQuery obj = BlogPostQuery.newInstance("myValue");
        DateTime publishedmax = DateTime.newInstance(new Date(), false);
        obj.setPublishedMax(publishedmax);
        assertEquals("publishedmax", obj.getPublishedMax().getDate(), publishedmax.getDate());
        DateTime updatedmin = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMin(updatedmin);
        assertEquals("updatedmin", obj.getUpdatedMin().getDate(), updatedmin.getDate());
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        DateTime publishedmin = DateTime.newInstance(new Date(), false);
        obj.setPublishedMin(publishedmin);
        assertEquals("publishedmin", obj.getPublishedMin().getDate(), publishedmin.getDate());
        String orderby = "myValue";
        obj.setOrderBy(orderby);
        assertEquals("orderby", obj.getOrderBy(), orderby);
        double maxresults = 600813;
        obj.setMaxResults(maxresults);
        assertEquals("maxresults", obj.getMaxResults(), maxresults);
        DateTime updatedmax = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMax(updatedmax);
        assertEquals("updatedmax", obj.getUpdatedMax().getDate(), updatedmax.getDate());
        finishGDataTest();
      }
    }, 10000);
  }
}
