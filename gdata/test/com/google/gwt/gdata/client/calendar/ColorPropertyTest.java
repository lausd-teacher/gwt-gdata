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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ColorProperty class.
 */
public class ColorPropertyTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("VALUE_RGB_0D7813", ColorProperty.VALUE_RGB_0D7813);
    assertNotNull("VALUE_RGB_1B887A", ColorProperty.VALUE_RGB_1B887A);
    assertNotNull("VALUE_RGB_28754E", ColorProperty.VALUE_RGB_28754E);
    assertNotNull("VALUE_RGB_29527A", ColorProperty.VALUE_RGB_29527A);
    assertNotNull("VALUE_RGB_2952A3", ColorProperty.VALUE_RGB_2952A3);
    assertNotNull("VALUE_RGB_4A716C", ColorProperty.VALUE_RGB_4A716C);
    assertNotNull("VALUE_RGB_4E5D6C", ColorProperty.VALUE_RGB_4E5D6C);
    assertNotNull("VALUE_RGB_5229A3", ColorProperty.VALUE_RGB_5229A3);
    assertNotNull("VALUE_RGB_528800", ColorProperty.VALUE_RGB_528800);
    assertNotNull("VALUE_RGB_5A6986", ColorProperty.VALUE_RGB_5A6986);
    assertNotNull("VALUE_RGB_6E6E41", ColorProperty.VALUE_RGB_6E6E41);
    assertNotNull("VALUE_RGB_705770", ColorProperty.VALUE_RGB_705770);
    assertNotNull("VALUE_RGB_7A367A", ColorProperty.VALUE_RGB_7A367A);
    assertNotNull("VALUE_RGB_865A5A", ColorProperty.VALUE_RGB_865A5A);
    assertNotNull("VALUE_RGB_88880E", ColorProperty.VALUE_RGB_88880E);
    assertNotNull("VALUE_RGB_8D6F47", ColorProperty.VALUE_RGB_8D6F47);
    assertNotNull("VALUE_RGB_A32929", ColorProperty.VALUE_RGB_A32929);
    assertNotNull("VALUE_RGB_AB8B00", ColorProperty.VALUE_RGB_AB8B00);
    assertNotNull("VALUE_RGB_B1365F", ColorProperty.VALUE_RGB_B1365F);
    assertNotNull("VALUE_RGB_B1440E", ColorProperty.VALUE_RGB_B1440E);
    assertNotNull("VALUE_RGB_BE6D00", ColorProperty.VALUE_RGB_BE6D00);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ColorProperty.newInstance());
  }

  public void testProperties() {
    ColorProperty obj = ColorProperty.newInstance();
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
  }
}
