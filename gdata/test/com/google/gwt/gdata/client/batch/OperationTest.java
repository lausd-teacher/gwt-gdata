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

package com.google.gwt.gdata.client.batch;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Operation class.
 */
public class OperationTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("TYPE_DELETE", Operation.TYPE_DELETE);
    assertNotNull("TYPE_INSERT", Operation.TYPE_INSERT);
    assertNotNull("TYPE_QUERY", Operation.TYPE_QUERY);
    assertNotNull("TYPE_UPDATE", Operation.TYPE_UPDATE);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Operation.newInstance());
  }

  public void testProperties() {
    Operation obj = Operation.newInstance();
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
  }
}