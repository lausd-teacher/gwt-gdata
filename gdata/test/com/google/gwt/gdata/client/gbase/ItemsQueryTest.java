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
 * Tests for the ItemsQuery class.
 */
public class ItemsQueryTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("CONTENT_ADJUSTMENTS", ItemsQuery.CONTENT_ADJUSTMENTS);
        assertNotNull("CONTENT_ALL", ItemsQuery.CONTENT_ALL);
        assertNotNull("CONTENT_ATTRIBUTES", ItemsQuery.CONTENT_ATTRIBUTES);
        assertNotNull("CONTENT_META", ItemsQuery.CONTENT_META);
        assertNotNull("CONTENT_NONE", ItemsQuery.CONTENT_NONE);
        assertNotNull("CONTENT_STATS", ItemsQuery.CONTENT_STATS);
        assertNotNull("CONTENT_THUMBNAILS", ItemsQuery.CONTENT_THUMBNAILS);
        assertNotNull("ORDERBY_MODIFICATION_TIME", ItemsQuery.ORDERBY_MODIFICATION_TIME);
        assertNotNull("ORDERBY_RELEVANCY", ItemsQuery.ORDERBY_RELEVANCY);
        assertNotNull("SORTORDER_ASCENDING", ItemsQuery.SORTORDER_ASCENDING);
        assertNotNull("SORTORDER_DESCENDING", ItemsQuery.SORTORDER_DESCENDING);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ItemsQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setAdjust(String adjust)
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setPublishedMax(String publishedMax)
    // Unit Test for setPublishedMin(String publishedMin)
    // Unit Test for setRefine(String refine)
    // Unit Test for setStartIndex(String startIndex)
    // Unit Test for setUpdatedMax(String updatedMax)
    // Unit Test for setUpdatedMin(String updatedMin)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ItemsQuery obj = ItemsQuery.newInstance("myValue");
        String crowdby = "myValue";
        obj.setCrowdby(crowdby);
        assertEquals("crowdby", obj.getCrowdby(), crowdby);
        DateTime updatedmin = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMin(updatedmin);
        assertEquals("updatedmin", obj.getUpdatedMin().getDate(), updatedmin.getDate());
        String bq = "myValue";
        obj.setBq(bq);
        assertEquals("bq", obj.getBq(), bq);
        DateTime publishedmin = DateTime.newInstance(new Date(), false);
        obj.setPublishedMin(publishedmin);
        assertEquals("publishedmin", obj.getPublishedMin().getDate(), publishedmin.getDate());
        String orderby = "myValue";
        obj.setOrderby(orderby);
        assertEquals("orderby", obj.getOrderby(), orderby);
        String content = "myValue";
        obj.setContent(content);
        assertEquals("content", obj.getContent(), content);
        String author = "myValue";
        obj.setAuthor(author);
        assertEquals("author", obj.getAuthor(), author);
        DateTime updatedmax = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMax(updatedmax);
        assertEquals("updatedmax", obj.getUpdatedMax().getDate(), updatedmax.getDate());
        String sortorder = "myValue";
        obj.setSortorder(sortorder);
        assertEquals("sortorder", obj.getSortorder(), sortorder);
        DateTime publishedmax = DateTime.newInstance(new Date(), false);
        obj.setPublishedMax(publishedmax);
        assertEquals("publishedmax", obj.getPublishedMax().getDate(), publishedmax.getDate());
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        boolean adjust = true;
        obj.setAdjust(adjust);
        assertSame("adjust", obj.getAdjust(), adjust);
        boolean refine = true;
        obj.setRefine(refine);
        assertSame("refine", obj.getRefine(), refine);
        double maxresults = 600813;
        obj.setMaxResults(maxresults);
        assertEquals("maxresults", obj.getMaxResults(), maxresults);
        String fulltextquery = "myValue";
        obj.setFullTextQuery(fulltextquery);
        assertEquals("fulltextquery", obj.getFullTextQuery(), fulltextquery);
        finishGDataTest();
      }
    }, 10000);
  }
}
