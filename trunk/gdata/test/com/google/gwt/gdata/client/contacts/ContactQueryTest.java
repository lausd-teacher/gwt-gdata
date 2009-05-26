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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ContactQuery class.
 */
public class ContactQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("ORDERBY_EDITED", ContactQuery.ORDERBY_EDITED);
    assertNotNull("ORDERBY_LAST_MODIFIED", ContactQuery.ORDERBY_LAST_MODIFIED);
    assertNotNull("ORDERBY_NONE", ContactQuery.ORDERBY_NONE);
    assertNotNull("SORTORDER_ASCENDING", ContactQuery.SORTORDER_ASCENDING);
    assertNotNull("SORTORDER_DESCENDING", ContactQuery.SORTORDER_DESCENDING);
    assertNotNull("SORTORDER_NONE", ContactQuery.SORTORDER_NONE);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ContactQuery.getConstructor());
    assertNotNull("newInstance()", ContactQuery.newInstance("myValue"));
  }

  public void testProperties() {
    ContactQuery obj = ContactQuery.newInstance("myValue");
    String group = "myValue";
    obj.setGroup(group);
    assertEquals("group", obj.getGroup(), group);
    String sortorder = "myValue";
    obj.setSortOrder(sortorder);
    assertEquals("sortorder", obj.getSortOrder(), sortorder);
    String orderby = "myValue";
    obj.setOrderBy(orderby);
    assertEquals("orderby", obj.getOrderBy(), orderby);
  }
}
