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
 * Tests for the RecurrenceExceptionEntry class.
 */
public class RecurrenceExceptionEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", RecurrenceExceptionEntry.getConstructor());
    assertNotNull("newInstance()", RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // RecurrenceExceptionEntry obj = RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject());
    // obj.addWhen(when);
    // obj.addWhere(where);
    // obj.addWho(who);
  }

  public void testProperties() {
    RecurrenceExceptionEntry obj = RecurrenceExceptionEntry.newInstance(JavaScriptObject.createObject());
    OriginalEvent originalevent = OriginalEvent.newInstance(JavaScriptObject.createObject());
    obj.setOriginalEvent(originalevent);
    assertSame("originalevent", obj.getOriginalEvent(), originalevent);
    JsArray<com.google.gwt.gdata.client.Where> where = ArrayHelper.toJsArray(Where.newInstance(JavaScriptObject.createObject()));
    obj.setWhere(where);
    assertEquals("where", obj.getWhere().length(), where.length());
    Comments comments = Comments.newInstance(JavaScriptObject.createObject());
    obj.setComments(comments);
    assertSame("comments", obj.getComments(), comments);
    EventStatus eventstatus = EventStatus.newInstance(JavaScriptObject.createObject());
    obj.setEventStatus(eventstatus);
    assertSame("eventstatus", obj.getEventStatus(), eventstatus);
    Transparency transparency = Transparency.newInstance(JavaScriptObject.createObject());
    obj.setTransparency(transparency);
    assertSame("transparency", obj.getTransparency(), transparency);
    JsArray<com.google.gwt.gdata.client.Who> who = ArrayHelper.toJsArray(Who.newInstance(JavaScriptObject.createObject()));
    obj.setWho(who);
    assertEquals("who", obj.getWho().length(), who.length());
    Visibility visibility = Visibility.newInstance(JavaScriptObject.createObject());
    obj.setVisibility(visibility);
    assertSame("visibility", obj.getVisibility(), visibility);
    JsArray<com.google.gwt.gdata.client.When> when = ArrayHelper.toJsArray(When.newInstance(JavaScriptObject.createObject()));
    obj.setWhen(when);
    assertEquals("when", obj.getWhen().length(), when.length());
  }
}
