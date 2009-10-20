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

package com.google.gwt.gdata.client;

/**
 * Tests for the RecurrenceExceptionEntry class.
 */
public class RecurrenceExceptionEntryTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", RecurrenceExceptionEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addWhen(When when)
    // Unit Test for addWhere(Where where)
    // Unit Test for addWho(Who who)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        RecurrenceExceptionEntry obj = RecurrenceExceptionEntry.newInstance();
        Who[] who = new Who[]{ Who.newInstance() };
        obj.setWho(who);
        assertEquals("who", obj.getWho().length, who.length);
        Transparency transparency = Transparency.newInstance();
        obj.setTransparency(transparency);
        assertSame("transparency", obj.getTransparency(), transparency);
        EventStatus eventstatus = EventStatus.newInstance();
        obj.setEventStatus(eventstatus);
        assertSame("eventstatus", obj.getEventStatus(), eventstatus);
        OriginalEvent originalevent = OriginalEvent.newInstance();
        obj.setOriginalEvent(originalevent);
        assertSame("originalevent", obj.getOriginalEvent(), originalevent);
        When[] when = new When[]{ When.newInstance() };
        obj.setWhen(when);
        assertEquals("when", obj.getWhen().length, when.length);
        Visibility visibility = Visibility.newInstance();
        obj.setVisibility(visibility);
        assertSame("visibility", obj.getVisibility(), visibility);
        Where[] where = new Where[]{ Where.newInstance() };
        obj.setWhere(where);
        assertEquals("where", obj.getWhere().length, where.length);
        Comments comments = Comments.newInstance();
        obj.setComments(comments);
        assertSame("comments", obj.getComments(), comments);
        finishGDataTest();
      }
    }, 10000);
  }
}
