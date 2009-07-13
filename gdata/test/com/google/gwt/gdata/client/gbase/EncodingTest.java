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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Encoding class.
 */
public class EncodingTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("VALUE_LATIN1", Encoding.VALUE_LATIN1);
    assertNotNull("VALUE_UTF8", Encoding.VALUE_UTF8);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Encoding.newInstance());
  }

  public void testProperties() {
    Encoding obj = Encoding.newInstance();
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
  }
}