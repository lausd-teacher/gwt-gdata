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
 * Tests for the Who class.
 */
public class WhoTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_EVENT_ATTENDEE", Who.REL_EVENT_ATTENDEE);
        assertNotNull("REL_EVENT_ORGANIZER", Who.REL_EVENT_ORGANIZER);
        assertNotNull("REL_EVENT_PERFORMER", Who.REL_EVENT_PERFORMER);
        assertNotNull("REL_EVENT_SPEAKER", Who.REL_EVENT_SPEAKER);
        assertNotNull("REL_MESSAGE_BCC", Who.REL_MESSAGE_BCC);
        assertNotNull("REL_MESSAGE_CC", Who.REL_MESSAGE_CC);
        assertNotNull("REL_MESSAGE_FROM", Who.REL_MESSAGE_FROM);
        assertNotNull("REL_MESSAGE_REPLY_TO", Who.REL_MESSAGE_REPLY_TO);
        assertNotNull("REL_MESSAGE_TO", Who.REL_MESSAGE_TO);
        assertNotNull("REL_TASK_ASSIGNED_TO", Who.REL_TASK_ASSIGNED_TO);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Who.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  @SuppressWarnings("unchecked")
  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Who obj = Who.newInstance();
        AttendeeType attendeetype = AttendeeType.newInstance();
        obj.setAttendeeType(attendeetype);
        assertSame("attendeetype", obj.getAttendeeType(), attendeetype);
        AttendeeStatus attendeestatus = AttendeeStatus.newInstance();
        obj.setAttendeeStatus(attendeestatus);
        assertSame("attendeestatus", obj.getAttendeeStatus(), attendeestatus);
        String valuestring = "myValue";
        obj.setValueString(valuestring);
        assertEquals("valuestring", obj.getValueString(), valuestring);
        String rel = "myValue";
        obj.setRel(rel);
        assertEquals("rel", obj.getRel(), rel);
        EntryLink entrylink = EntryLink.newInstance();
        obj.setEntryLink(entrylink);
        assertSame("entrylink", obj.getEntryLink(), entrylink);
        String email = "myValue";
        obj.setEmail(email);
        assertEquals("email", obj.getEmail(), email);
        finishGDataTest();
      }
    }, 10000);
  }
}
