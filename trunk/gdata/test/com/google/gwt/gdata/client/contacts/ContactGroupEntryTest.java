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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ContactGroupEntry class.
 */
public class ContactGroupEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ContactGroupEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    ContactGroupEntry obj = ContactGroupEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addExtendedProperty(ExtendedProperty extendedProperty)
    // Unit Test for getExtendedProperties()
    assertEquals("getExtendedProperties", obj.getExtendedProperties(), null);
    // Unit Test for setExtendedProperties(JsArray extendedProperties)
  }

  public void testProperties() {
    ContactGroupEntry obj = ContactGroupEntry.newInstance(JavaScriptObject.createObject());
    SystemGroup systemgroup = SystemGroup.newInstance(JavaScriptObject.createObject());
    obj.setSystemGroup(systemgroup);
    assertSame("systemgroup", obj.getSystemGroup(), systemgroup);
    Deleted deleted = Deleted.newInstance(JavaScriptObject.createObject());
    obj.setDeleted(deleted);
    assertSame("deleted", obj.getDeleted(), deleted);
  }
}
