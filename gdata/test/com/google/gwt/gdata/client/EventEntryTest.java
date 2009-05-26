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
    assertNotNull("getConstructor()", EventEntry.getConstructor());
    assertNotNull("newInstance()", EventEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // EventEntry obj = EventEntry.newInstance(JavaScriptObject.createObject());
    // obj.addLocation(location);
    // obj.addLocation(location);
    // obj.addParticipant(participant);
    // obj.addParticipant(participant);
    // obj.addRecurrenceException(recurrenceException);
    // obj.addRecurrenceException(recurrenceException);
    // obj.addReminder(reminder);
    // obj.addReminder(reminder);
    // obj.addTime(time);
    // obj.addTime(time);
  }

  public void testProperties() {
    EventEntry obj = EventEntry.newInstance(JavaScriptObject.createObject());
    OriginalEvent originalevent = OriginalEvent.newInstance(JavaScriptObject.createObject());
    obj.setOriginalEvent(originalevent);
    assertSame("originalevent", obj.getOriginalEvent(), originalevent);
    Who[] participants = new Who[]{ Who.newInstance(JavaScriptObject.createObject()) };
    obj.setParticipants(participants);
    assertSame("participants", obj.getParticipants(), participants);
    Comments comments = Comments.newInstance(JavaScriptObject.createObject());
    obj.setComments(comments);
    assertSame("comments", obj.getComments(), comments);
    Reminder[] reminders = new Reminder[]{ Reminder.newInstance(JavaScriptObject.createObject()) };
    obj.setReminders(reminders);
    assertSame("reminders", obj.getReminders(), reminders);
    EventStatus eventstatus = EventStatus.newInstance(JavaScriptObject.createObject());
    obj.setEventStatus(eventstatus);
    assertSame("eventstatus", obj.getEventStatus(), eventstatus);
    Recurrence recurrence = Recurrence.newInstance(JavaScriptObject.createObject());
    obj.setRecurrence(recurrence);
    assertSame("recurrence", obj.getRecurrence(), recurrence);
    Where[] locations = new Where[]{ Where.newInstance(JavaScriptObject.createObject()) };
    obj.setLocations(locations);
    assertSame("locations", obj.getLocations(), locations);
    Transparency transparency = Transparency.newInstance(JavaScriptObject.createObject());
    obj.setTransparency(transparency);
    assertSame("transparency", obj.getTransparency(), transparency);
    When[] times = new When[]{ When.newInstance(JavaScriptObject.createObject()) };
    obj.setTimes(times);
    assertSame("times", obj.getTimes(), times);
    Visibility visibility = Visibility.newInstance(JavaScriptObject.createObject());
    obj.setVisibility(visibility);
    assertSame("visibility", obj.getVisibility(), visibility);
    RecurrenceException[] recurrenceexception = new RecurrenceException[]{ RecurrenceException.newInstance(JavaScriptObject.createObject()) };
    obj.setRecurrenceException(recurrenceexception);
    assertSame("recurrenceexception", obj.getRecurrenceException(), recurrenceexception);
  }
}
