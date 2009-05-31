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
 * Tests for the ExtendedProperty class.
 */
public class ExtendedPropertyTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REALM_SHARED", ExtendedProperty.REALM_SHARED);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ExtendedProperty.getConstructor());
    assertNotNull("newInstance()", ExtendedProperty.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    ExtendedProperty obj = ExtendedProperty.newInstance(JavaScriptObject.createObject());
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
    String realm = "myValue";
    obj.setRealm(realm);
    assertEquals("realm", obj.getRealm(), realm);
  }
}