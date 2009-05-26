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
 * Tests for the ItemTypesQuery class.
 */
public class ItemTypesQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ItemTypesQuery.getConstructor());
    assertNotNull("newInstance()", ItemTypesQuery.newInstance("myValue"));
  }

  public void testProperties() {
    ItemTypesQuery obj = ItemTypesQuery.newInstance("myValue");
    String author = "myValue";
    obj.setAuthor(author);
    assertEquals("author", obj.getAuthor(), author);
    String fulltextquery = "myValue";
    obj.setFullTextQuery(fulltextquery);
    assertEquals("fulltextquery", obj.getFullTextQuery(), fulltextquery);
  }
}
