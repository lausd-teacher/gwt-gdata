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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CustomProperty class.
 */
public class CustomPropertyTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", CustomProperty.newInstance());
  }

  public void testProperties() {
    CustomProperty obj = CustomProperty.newInstance();
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    String unit = "myValue";
    obj.setUnit(unit);
    assertEquals("unit", obj.getUnit(), unit);
  }
}
