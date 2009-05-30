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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
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
    // obj.addParticipant(participant);
    // obj.addRecurrenceException(recurrenceException);
    // obj.addReminder(reminder);
    // obj.addTime(time);
  }

  public void testProperties() {
    EventEntry obj = EventEntry.newInstance(JavaScriptObject.createObject());
    OriginalEvent originalevent = OriginalEvent.newInstance(JavaScriptObject.createObject());
    obj.setOriginalEvent(originalevent);
    assertSame("originalevent", obj.getOriginalEvent(), originalevent);
    JsArray<com.google.gwt.gdata.client.Who> participants = ArrayHelper.toJsArray(Who.newInstance(JavaScriptObject.createObject()));
    obj.setParticipants(participants);
    assertEquals("participants", obj.getParticipants().length(), participants.length());
    Comments comments = Comments.newInstance(JavaScriptObject.createObject());
    obj.setComments(comments);
    assertSame("comments", obj.getComments(), comments);
    JsArray<com.google.gwt.gdata.client.Reminder> reminders = ArrayHelper.toJsArray(Reminder.newInstance(JavaScriptObject.createObject()));
    obj.setReminders(reminders);
    assertEquals("reminders", obj.getReminders().length(), reminders.length());
    EventStatus eventstatus = EventStatus.newInstance(JavaScriptObject.createObject());
    obj.setEventStatus(eventstatus);
    assertSame("eventstatus", obj.getEventStatus(), eventstatus);
    Recurrence recurrence = Recurrence.newInstance(JavaScriptObject.createObject());
    obj.setRecurrence(recurrence);
    assertSame("recurrence", obj.getRecurrence(), recurrence);
    JsArray<com.google.gwt.gdata.client.Where> locations = ArrayHelper.toJsArray(Where.newInstance(JavaScriptObject.createObject()));
    obj.setLocations(locations);
    assertEquals("locations", obj.getLocations().length(), locations.length());
    Transparency transparency = Transparency.newInstance(JavaScriptObject.createObject());
    obj.setTransparency(transparency);
    assertSame("transparency", obj.getTransparency(), transparency);
    JsArray<com.google.gwt.gdata.client.When> times = ArrayHelper.toJsArray(When.newInstance(JavaScriptObject.createObject()));
    obj.setTimes(times);
    assertEquals("times", obj.getTimes().length(), times.length());
    Visibility visibility = Visibility.newInstance(JavaScriptObject.createObject());
    obj.setVisibility(visibility);
    assertSame("visibility", obj.getVisibility(), visibility);
    JsArray<com.google.gwt.gdata.client.RecurrenceException> recurrenceexception = ArrayHelper.toJsArray(RecurrenceException.newInstance(JavaScriptObject.createObject()));
    obj.setRecurrenceException(recurrenceexception);
    assertEquals("recurrenceexception", obj.getRecurrenceException().length(), recurrenceexception.length());
  }
}
