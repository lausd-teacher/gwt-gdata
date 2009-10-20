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

package com.google.gwt.gdata.client.acl;

/**
 * Tests for the AclRole class.
 */
public class AclRoleTest extends AclTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("VALUE_NONE", AclRole.VALUE_NONE);
        assertNotNull("VALUE_OWNER", AclRole.VALUE_OWNER);
        assertNotNull("VALUE_PEEKER", AclRole.VALUE_PEEKER);
        assertNotNull("VALUE_READER", AclRole.VALUE_READER);
        assertNotNull("VALUE_WRITER", AclRole.VALUE_WRITER);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AclRole.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AclRole obj = AclRole.newInstance();
        String value = "myValue";
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        finishGDataTest();
      }
    }, 10000);
  }
}
