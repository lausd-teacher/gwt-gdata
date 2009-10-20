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

import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Tests for the CalendarEventQuery class.
 */
public class CalendarEventQueryTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("ORDERBY_LAST_MODIFIED", CalendarEventQuery.ORDERBY_LAST_MODIFIED);
        assertNotNull("ORDERBY_START_TIME", CalendarEventQuery.ORDERBY_START_TIME);
        assertNotNull("SORTORDER_ASCENDING", CalendarEventQuery.SORTORDER_ASCENDING);
        assertNotNull("SORTORDER_DESCENDING", CalendarEventQuery.SORTORDER_DESCENDING);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CalendarEventQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setFutureEvents(String futureEvents)
    // Unit Test for setMaximumStartTime(String maximumStartTime)
    // Unit Test for setMaxResults(String maxResults)
    // Unit Test for setMinimumStartTime(String minimumStartTime)
    // Unit Test for setRecurrenceExpansionEnd(String recurrenceExpansionEnd)
    // Unit Test for setRecurrenceExpansionStart(String recurrenceExpansionStart)
    // Unit Test for setShowAllowGSync(String showAllowGSync)
    // Unit Test for setSingleEvents(String singleEvents)
    // Unit Test for setStartIndex(String startIndex)
    // Unit Test for setUpdatedMax(String updatedMax)
    // Unit Test for setUpdatedMin(String updatedMin)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        CalendarEventQuery obj = CalendarEventQuery.newInstance("myValue");
        boolean futureevents = true;
        obj.setFutureEvents(futureevents);
        assertSame("futureevents", obj.getFutureEvents(), futureevents);
        DateTime updatedmin = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMin(updatedmin);
        assertEquals("updatedmin", obj.getUpdatedMin().getDate(), updatedmin.getDate());
        boolean singleevents = true;
        obj.setSingleEvents(singleevents);
        assertSame("singleevents", obj.getSingleEvents(), singleevents);
        String sortorder = "myValue";
        obj.setSortOrder(sortorder);
        assertEquals("sortorder", obj.getSortOrder(), sortorder);
        DateTime minimumstarttime = DateTime.newInstance(new Date(), false);
        obj.setMinimumStartTime(minimumstarttime);
        assertEquals("minimumstarttime", obj.getMinimumStartTime().getDate(), minimumstarttime.getDate());
        String author = "myValue";
        obj.setAuthor(author);
        assertEquals("author", obj.getAuthor(), author);
        String orderby = "myValue";
        obj.setOrderBy(orderby);
        assertEquals("orderby", obj.getOrderBy(), orderby);
        DateTime updatedmax = DateTime.newInstance(new Date(), false);
        obj.setUpdatedMax(updatedmax);
        assertEquals("updatedmax", obj.getUpdatedMax().getDate(), updatedmax.getDate());
        boolean showallowgsync = true;
        obj.setShowAllowGSync(showallowgsync);
        assertSame("showallowgsync", obj.getShowAllowGSync(), showallowgsync);
        boolean showhidden = true;
        obj.setShowHidden(showhidden);
        assertSame("showhidden", obj.getShowHidden(), showhidden);
        DateTime maximumstarttime = DateTime.newInstance(new Date(), false);
        obj.setMaximumStartTime(maximumstarttime);
        assertEquals("maximumstarttime", obj.getMaximumStartTime().getDate(), maximumstarttime.getDate());
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        DateTime recurrenceexpansionstart = DateTime.newInstance(new Date(), false);
        obj.setRecurrenceExpansionStart(recurrenceexpansionstart);
        assertEquals("recurrenceexpansionstart", obj.getRecurrenceExpansionStart().getDate(), recurrenceexpansionstart.getDate());
        DateTime recurrenceexpansionend = DateTime.newInstance(new Date(), false);
        obj.setRecurrenceExpansionEnd(recurrenceexpansionend);
        assertEquals("recurrenceexpansionend", obj.getRecurrenceExpansionEnd().getDate(), recurrenceexpansionend.getDate());
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
