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
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Workspace class.
 */
public class WorkspaceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Workspace.getConstructor());
    assertNotNull("newInstance()", Workspace.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // Workspace obj = Workspace.newInstance(JavaScriptObject.createObject());
    // obj.addCollection(collection);
  }

  public void testProperties() {
    Workspace obj = Workspace.newInstance(JavaScriptObject.createObject());
    Text title = Text.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    JsArray<com.google.gwt.gdata.client.app.Collection> collections = ArrayHelper.toJsArray(Collection.newInstance(JavaScriptObject.createObject()));
    obj.setCollections(collections);
    assertEquals("collections", obj.getCollections().length(), collections.length());
  }
}