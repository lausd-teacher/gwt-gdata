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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Collection class.
 */
public class CollectionTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Collection.getConstructor());
    assertNotNull("newInstance()", Collection.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // Collection obj = Collection.newInstance(JavaScriptObject.createObject());
    // obj.addAccept(accept);
    // obj.addAccept(accept);
    // obj.addCategories(categories);
    // obj.addCategories(categories);
  }

  public void testProperties() {
    Collection obj = Collection.newInstance(JavaScriptObject.createObject());
    Accept[] accepts = new Accept[]{ Accept.newInstance(JavaScriptObject.createObject()) };
    obj.setAccepts(accepts);
    assertSame("accepts", obj.getAccepts(), accepts);
    Text title = Text.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    Categories[] categorieses = new Categories[]{ Categories.newInstance(JavaScriptObject.createObject()) };
    obj.setCategorieses(categorieses);
    assertSame("categorieses", obj.getCategorieses(), categorieses);
    String href = "myValue";
    obj.setHref(href);
    assertEquals("href", obj.getHref(), href);
  }
}
