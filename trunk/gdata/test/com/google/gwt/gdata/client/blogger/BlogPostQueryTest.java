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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the BlogPostQuery class.
 */
public class BlogPostQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("ORDERBY_EDITED", BlogPostQuery.ORDERBY_EDITED);
    assertNotNull("ORDERBY_PUBLISHED", BlogPostQuery.ORDERBY_PUBLISHED);
    assertNotNull("ORDERBY_UPDATED", BlogPostQuery.ORDERBY_UPDATED);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", BlogPostQuery.getConstructor());
    assertNotNull("newInstance()", BlogPostQuery.newInstance("myValue"));
  }

  public void testProperties() {
    BlogPostQuery obj = BlogPostQuery.newInstance("myValue");
    String orderby = "myValue";
    obj.setOrderBy(orderby);
    assertEquals("orderby", obj.getOrderBy(), orderby);
  }
}
