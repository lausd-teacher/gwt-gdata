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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the GmAttribute class.
 */
public class GmAttributeTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("IMPORTANCE_OPTIONAL", GmAttribute.IMPORTANCE_OPTIONAL);
    assertNotNull("IMPORTANCE_RECOMMENDED", GmAttribute.IMPORTANCE_RECOMMENDED);
    assertNotNull("IMPORTANCE_REQUIRED", GmAttribute.IMPORTANCE_REQUIRED);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", GmAttribute.getConstructor());
    assertNotNull("newInstance()", GmAttribute.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    GmAttribute obj = GmAttribute.newInstance(JavaScriptObject.createObject());
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    JsArray<GmValue> values = ArrayHelper.toJsArray(GmValue.newInstance(JavaScriptObject.createObject()));
    obj.setValues(values);
    assertEquals("values", obj.getValues().length(), values.length());
    int lenValues = obj.getValues().length();
    obj.addValue(GmValue.newInstance(JavaScriptObject.createObject()));
    assertEquals("values", obj.getValues().length(), lenValues + 1);
    double count = 600813;
    obj.setCount(count);
    assertEquals("count", obj.getCount(), count);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    String importance = "myValue";
    obj.setImportance(importance);
    assertEquals("importance", obj.getImportance(), importance);
  }
}
