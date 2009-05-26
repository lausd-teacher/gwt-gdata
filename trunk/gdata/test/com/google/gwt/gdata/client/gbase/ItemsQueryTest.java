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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ItemsQuery class.
 */
public class ItemsQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
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
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ItemsQuery.getConstructor());
    assertNotNull("newInstance()", ItemsQuery.newInstance("myValue"));
  }

  public void testProperties() {
    ItemsQuery obj = ItemsQuery.newInstance("myValue");
    String crowdby = "myValue";
    obj.setCrowdby(crowdby);
    assertEquals("crowdby", obj.getCrowdby(), crowdby);
    String bq = "myValue";
    obj.setBq(bq);
    assertEquals("bq", obj.getBq(), bq);
    String orderby = "myValue";
    obj.setOrderby(orderby);
    assertEquals("orderby", obj.getOrderby(), orderby);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
    String author = "myValue";
    obj.setAuthor(author);
    assertEquals("author", obj.getAuthor(), author);
    String sortorder = "myValue";
    obj.setSortorder(sortorder);
    assertEquals("sortorder", obj.getSortorder(), sortorder);
    String fulltextquery = "myValue";
    obj.setFullTextQuery(fulltextquery);
    assertEquals("fulltextquery", obj.getFullTextQuery(), fulltextquery);
  }
}
