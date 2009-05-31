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
 * Tests for the GmAttributes class.
 */
public class GmAttributesTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", GmAttributes.getConstructor());
    assertNotNull("newInstance()", GmAttributes.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    GmAttributes obj = GmAttributes.newInstance(JavaScriptObject.createObject());
    JsArray<GmAttribute> attributes = ArrayHelper.toJsArray(GmAttribute.newInstance(JavaScriptObject.createObject()));
    obj.setAttributes(attributes);
    assertEquals("attributes", obj.getAttributes().length(), attributes.length());
    int lenAttributes = obj.getAttributes().length();
    obj.addAttribute(GmAttribute.newInstance(JavaScriptObject.createObject()));
    assertEquals("attributes", obj.getAttributes().length(), lenAttributes + 1);
  }
}
