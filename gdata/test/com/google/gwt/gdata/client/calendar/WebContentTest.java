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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the WebContent class.
 */
public class WebContentTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", WebContent.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    WebContent obj = WebContent.newInstance(JavaScriptObject.createObject());
    // Unit Test for addGadgetPref(WebContentGadgetPref gadgetPref)
    // Unit Test for getGadgetPref(String name)
    // Unit Test for getGadgetPrefs()
    assertEquals("getGadgetPrefs", obj.getGadgetPrefs(), null);
    // Unit Test for setGadgetPrefs(JsArray gadgetPrefs)
  }

  public void testProperties() {
    WebContent obj = WebContent.newInstance(JavaScriptObject.createObject());
    double width = 600813;
    obj.setWidth(width);
    assertEquals("width", obj.getWidth(), width);
    String url = "myValue";
    obj.setUrl(url);
    assertEquals("url", obj.getUrl(), url);
    double height = 600813;
    obj.setHeight(height);
    assertEquals("height", obj.getHeight(), height);
  }
}