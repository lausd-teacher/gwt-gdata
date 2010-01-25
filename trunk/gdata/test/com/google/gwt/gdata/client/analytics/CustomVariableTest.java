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

package com.google.gwt.gdata.client.analytics;

/**
 * Tests for the CustomVariable class.
 */
public class CustomVariableTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("SCOPE_HIT", CustomVariable.SCOPE_HIT);
        assertNotNull("SCOPE_VISIT", CustomVariable.SCOPE_VISIT);
        assertNotNull("SCOPE_VISITOR", CustomVariable.SCOPE_VISITOR);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CustomVariable.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        CustomVariable obj = CustomVariable.newInstance();
        String scope = "myValue";
        obj.setScope(scope);
        assertEquals("scope", obj.getScope(), scope);
        String name = "myValue";
        obj.setName(name);
        assertEquals("name", obj.getName(), name);
        double index = 600813;
        obj.setIndex(index);
        assertEquals("index", obj.getIndex(), index);
        finishGDataTest();
      }
    }, 10000);
  }
}
