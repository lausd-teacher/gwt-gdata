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
 * Tests for the Query class.
 */
public class QueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Query.newInstance("myValue"));
  }

  public void testOther() {
    Query obj = Query.newInstance("myValue");
    // Unit Test for getPath()
    assertEquals("getPath", obj.getPath(), "");
    // Unit Test for getUri()
    assertEquals("getUri", obj.getUri(), "");
    // Unit Test for setParam(String name, JavaScriptObject value)
    // Unit Test for setParamDef(String name, JavaScriptObject paramDef)
  }
}
