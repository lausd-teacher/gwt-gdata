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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the MediaText class.
 */
public class MediaTextTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("TYPE_HTML", MediaText.TYPE_HTML);
    assertNotNull("TYPE_PLAIN", MediaText.TYPE_PLAIN);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", MediaText.getConstructor());
    assertNotNull("newInstance()", MediaText.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    MediaText obj = MediaText.newInstance(JavaScriptObject.createObject());
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
    String start = "myValue";
    obj.setStart(start);
    assertEquals("start", obj.getStart(), start);
    String lang = "myValue";
    obj.setLang(lang);
    assertEquals("lang", obj.getLang(), lang);
    String end = "myValue";
    obj.setEnd(end);
    assertEquals("end", obj.getEnd(), end);
  }
}