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

package com.google.gwt.gdata.client.gbase;

/**
 * Tests for the GmAttributes class.
 */
public class GmAttributesTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GmAttributes.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        GmAttributes obj = GmAttributes.newInstance();
        obj.addAttribute(GmAttribute.newInstance());
        assertEquals("addAttribute", 1, obj.getAttributes().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        GmAttributes obj = GmAttributes.newInstance();
        GmAttribute[] attributes = new GmAttribute[]{ GmAttribute.newInstance() };
        obj.setAttributes(attributes);
        assertEquals("attributes", obj.getAttributes().length, attributes.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
