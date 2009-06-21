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
 * Tests for the RecurrenceExceptionEntry class.
 */
public class RecurrenceExceptionEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    RecurrenceExceptionEntry obj = RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addWhen(When when)
    // Unit Test for addWhere(Where where)
    // Unit Test for addWho(Who who)
    // Unit Test for getWhen()
    assertEquals("getWhen", obj.getWhen(), null);
    // Unit Test for getWhere()
    assertEquals("getWhere", obj.getWhere(), null);
    // Unit Test for getWho()
    assertEquals("getWho", obj.getWho(), null);
    // Unit Test for setWhen(JsArray when)
    // Unit Test for setWhere(JsArray where)
    // Unit Test for setWho(JsArray who)
  }

  public void testProperties() {
    RecurrenceExceptionEntry obj = RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject());
    Transparency transparency = Transparency.newInstance(JavaScriptObject.createObject());
    obj.setTransparency(transparency);
    assertSame("transparency", obj.getTransparency(), transparency);
    EventStatus eventstatus = EventStatus.newInstance(JavaScriptObject.createObject());
    obj.setEventStatus(eventstatus);
    assertSame("eventstatus", obj.getEventStatus(), eventstatus);
    OriginalEvent originalevent = OriginalEvent.newInstance(JavaScriptObject.createObject());
    obj.setOriginalEvent(originalevent);
    assertSame("originalevent", obj.getOriginalEvent(), originalevent);
    Visibility visibility = Visibility.newInstance(JavaScriptObject.createObject());
    obj.setVisibility(visibility);
    assertSame("visibility", obj.getVisibility(), visibility);
    Comments comments = Comments.newInstance(JavaScriptObject.createObject());
    obj.setComments(comments);
    assertSame("comments", obj.getComments(), comments);
  }
}
