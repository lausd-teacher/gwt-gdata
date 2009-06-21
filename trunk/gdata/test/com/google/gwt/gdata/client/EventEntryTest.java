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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the EventEntry class.
 */
public class EventEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", EventEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    EventEntry obj = EventEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addLocation(Where location)
    // Unit Test for addParticipant(Who participant)
    // Unit Test for addRecurrenceException(RecurrenceException recurrenceException)
    // Unit Test for addReminder(Reminder reminder)
    // Unit Test for addTime(When time)
    // Unit Test for getLocations()
    assertEquals("getLocations", obj.getLocations(), null);
    // Unit Test for getParticipants()
    assertEquals("getParticipants", obj.getParticipants(), null);
    // Unit Test for getRecurrenceException()
    assertEquals("getRecurrenceException", obj.getRecurrenceException(), null);
    // Unit Test for getReminders()
    assertEquals("getReminders", obj.getReminders(), null);
    // Unit Test for getTimes()
    assertEquals("getTimes", obj.getTimes(), null);
    // Unit Test for setLocations(JsArray locations)
    // Unit Test for setParticipants(JsArray participants)
    // Unit Test for setRecurrenceException(JsArray recurrenceException)
    // Unit Test for setReminders(JsArray reminders)
    // Unit Test for setTimes(JsArray times)
  }

  public void testProperties() {
    EventEntry obj = EventEntry.newInstance(JavaScriptObject.createObject());
    OriginalEvent originalevent = OriginalEvent.newInstance(JavaScriptObject.createObject());
    obj.setOriginalEvent(originalevent);
    assertSame("originalevent", obj.getOriginalEvent(), originalevent);
    Comments comments = Comments.newInstance(JavaScriptObject.createObject());
    obj.setComments(comments);
    assertSame("comments", obj.getComments(), comments);
    EventStatus eventstatus = EventStatus.newInstance(JavaScriptObject.createObject());
    obj.setEventStatus(eventstatus);
    assertSame("eventstatus", obj.getEventStatus(), eventstatus);
    Recurrence recurrence = Recurrence.newInstance(JavaScriptObject.createObject());
    obj.setRecurrence(recurrence);
    assertSame("recurrence", obj.getRecurrence(), recurrence);
    Transparency transparency = Transparency.newInstance(JavaScriptObject.createObject());
    obj.setTransparency(transparency);
    assertSame("transparency", obj.getTransparency(), transparency);
    Visibility visibility = Visibility.newInstance(JavaScriptObject.createObject());
    obj.setVisibility(visibility);
    assertSame("visibility", obj.getVisibility(), visibility);
  }
}
