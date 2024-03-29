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

import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Tests for the ContactQuery class.
 */
public class ContactQueryTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("ORDERBY_EDITED", ContactQuery.ORDERBY_EDITED);
        assertNotNull("ORDERBY_LAST_MODIFIED", ContactQuery.ORDERBY_LAST_MODIFIED);
        assertNotNull("ORDERBY_NONE", ContactQuery.ORDERBY_NONE);
        assertNotNull("SORTORDER_ASCENDING", ContactQuery.SORTORDER_ASCENDING);
        assertNotNull("SORTORDER_DESCENDING", ContactQuery.SORTORDER_DESCENDING);
        assertNotNull("SORTORDER_NONE", ContactQuery.SORTORDER_NONE);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ContactQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        @SuppressWarnings("unused")
        ContactQuery obj = ContactQuery.newInstance(
            "http://www.google.com/feeds");
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ContactQuery obj = ContactQuery.newInstance("myValue");
        DateTime updatedmin = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMin(updatedmin);
        assertEquals("updatedmin", obj.getUpdatedMin().getDate(), updatedmin.getDate());
        String group = "myValue";
        obj.setGroup(group);
        assertEquals("group", obj.getGroup(), group);
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        String sortorder = "myValue";
        obj.setSortOrder(sortorder);
        assertEquals("sortorder", obj.getSortOrder(), sortorder);
        boolean showdeleted = true;
        obj.setShowDeleted(showdeleted);
        assertSame("showdeleted", obj.getShowDeleted(), showdeleted);
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
