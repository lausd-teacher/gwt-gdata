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

import com.google.gwt.gdata.client.When;

/**
 * Tests for the Event class.
 */
public class EventTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_ANNIVERSARY", Event.REL_ANNIVERSARY);
        assertNotNull("REL_OTHER", Event.REL_OTHER);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Event.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Event obj = Event.newInstance();
        String rel = "myValue";
        obj.setRel(rel);
        assertEquals("rel", obj.getRel(), rel);
        When when = When.newInstance();
        obj.setWhen(when);
        assertSame("when", obj.getWhen(), when);
        String label = "myValue";
        obj.setLabel(label);
        assertEquals("label", obj.getLabel(), label);
        finishGDataTest();
      }
    }, 10000);
  }
}
