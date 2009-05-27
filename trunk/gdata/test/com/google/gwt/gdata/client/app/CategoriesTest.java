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

package com.google.gwt.gdata.client.app;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.atom.Category;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Categories class.
 */
public class CategoriesTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("FIXED_NO", Categories.FIXED_NO);
    assertNotNull("FIXED_YES", Categories.FIXED_YES);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Categories.getConstructor());
    assertNotNull("newInstance()", Categories.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // Categories obj = Categories.newInstance(JavaScriptObject.createObject());
    // obj.addCategory(category);
  }

  public void testProperties() {
    Categories obj = Categories.newInstance(JavaScriptObject.createObject());
    String scheme = "myValue";
    obj.setScheme(scheme);
    assertEquals("scheme", obj.getScheme(), scheme);
    String fixed = "myValue";
    obj.setFixed(fixed);
    assertEquals("fixed", obj.getFixed(), fixed);
    JsArray<com.google.gwt.gdata.client.atom.Category> categories = ArrayHelper.toJsArray(Category.newInstance(JavaScriptObject.createObject()));
    obj.setCategories(categories);
    assertSame("categories", obj.getCategories(), categories);
    String href = "myValue";
    obj.setHref(href);
    assertEquals("href", obj.getHref(), href);
  }
}
