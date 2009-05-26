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
 * Tests for the Where class.
 */
public class WhereTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_EVENT", Where.REL_EVENT);
    assertNotNull("REL_EVENT_ALTERNATE", Where.REL_EVENT_ALTERNATE);
    assertNotNull("REL_EVENT_PARKING", Where.REL_EVENT_PARKING);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Where.getConstructor());
    assertNotNull("newInstance()", Where.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    Where obj = Where.newInstance(JavaScriptObject.createObject());
    String valuestring = "myValue";
    obj.setValueString(valuestring);
    assertEquals("valuestring", obj.getValueString(), valuestring);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
    EntryLink entrylink = EntryLink.newInstance(JavaScriptObject.createObject());
    obj.setEntryLink(entrylink);
    assertSame("entrylink", obj.getEntryLink(), entrylink);
  }
}
