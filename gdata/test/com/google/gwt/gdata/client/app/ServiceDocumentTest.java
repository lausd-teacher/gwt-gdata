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
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ServiceDocument class.
 */
public class ServiceDocumentTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ServiceDocument.getConstructor());
    assertNotNull("newInstance()", ServiceDocument.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    ServiceDocument obj = ServiceDocument.newInstance(JavaScriptObject.createObject());
    JsArray<Workspace> workspaces = ArrayHelper.toJsArray(Workspace.newInstance(JavaScriptObject.createObject()));
    obj.setWorkspaces(workspaces);
    assertEquals("workspaces", obj.getWorkspaces().length(), workspaces.length());
    int lenWorkspaces = obj.getWorkspaces().length();
    obj.addWorkspace(Workspace.newInstance(JavaScriptObject.createObject()));
    assertEquals("workspaces", obj.getWorkspaces().length(), lenWorkspaces + 1);
  }
}
