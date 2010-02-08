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

/**
 * Tests for the WebContent class.
 */
public class WebContentTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", WebContent.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        WebContent obj = WebContent.newInstance();
        obj.addGadgetPref(WebContentGadgetPref.newInstance());
        assertEquals("addGadgetPref", 1, obj.getGadgetPrefs().length);
        assertNull(obj.getGadgetPref("myPref"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        WebContent obj = WebContent.newInstance();
        String display = "myValue";
        obj.setDisplay(display);
        assertEquals("display", obj.getDisplay(), display);
        double width = 600813;
        obj.setWidth(width);
        assertEquals("width", obj.getWidth(), width);
        WebContentGadgetPref[] gadgetprefs = new WebContentGadgetPref[]{ WebContentGadgetPref.newInstance() };
        obj.setGadgetPrefs(gadgetprefs);
        assertEquals("gadgetprefs", obj.getGadgetPrefs().length, gadgetprefs.length);
        String url = "myValue";
        obj.setUrl(url);
        assertEquals("url", obj.getUrl(), url);
        double height = 600813;
        obj.setHeight(height);
        assertEquals("height", obj.getHeight(), height);
        finishGDataTest();
      }
    }, 10000);
  }
}
