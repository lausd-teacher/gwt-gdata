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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the AccountEntry class.
 */
public class AccountEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", AccountEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    AccountEntry obj = AccountEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addProperty(Property property)
    // Unit Test for getProperties()
    assertEquals("getProperties", obj.getProperties(), null);
    // Unit Test for getPropertyValue(String name)
    // Unit Test for setProperties(JsArray properties)
  }

  public void testProperties() {
    AccountEntry obj = AccountEntry.newInstance(JavaScriptObject.createObject());
    TableId tableid = TableId.newInstance(JavaScriptObject.createObject());
    obj.setTableId(tableid);
    assertSame("tableid", obj.getTableId(), tableid);
  }
}
