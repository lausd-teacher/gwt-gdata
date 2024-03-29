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
 * Tests for the AclScope class.
 */
public class AclScopeTest extends AclTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("TYPE_DEFAULT", AclScope.TYPE_DEFAULT);
        assertNotNull("TYPE_DOMAIN", AclScope.TYPE_DOMAIN);
        assertNotNull("TYPE_GROUP", AclScope.TYPE_GROUP);
        assertNotNull("TYPE_USER", AclScope.TYPE_USER);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AclScope.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AclScope obj = AclScope.newInstance();
        String value = "myValue";
        obj.setValue(value);
        assertEquals("value", obj.getValue(), value);
        String type = "myValue";
        obj.setType(type);
        assertEquals("type", obj.getType(), type);
        finishGDataTest();
      }
    }, 10000);
  }
}
