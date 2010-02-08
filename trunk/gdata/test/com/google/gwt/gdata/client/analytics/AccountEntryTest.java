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
 * Tests for the AccountEntry class.
 */
public class AccountEntryTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("KIND_ANALYTICS_ACCOUNT", AccountEntry.KIND_ANALYTICS_ACCOUNT);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AccountEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        AccountEntry obj = AccountEntry.newInstance();
        CustomVariable var = CustomVariable.newInstance();
        var.setIndex(0);
        var.setName("myVar");
        var.setScope(".");
        obj.addCustomVariable(var);
        assertEquals("addCustomVariable", 1, obj.getCustomVariables().length);
        Goal goal = Goal.newInstance();
        goal.setName("myGoal");
        goal.setValue(10);
        obj.addGoal(goal);
        assertEquals("addGoal", 1, obj.getGoals().length);
        Property prop = Property.newInstance();
        prop.setName("myProp");
        prop.setValue("myValue");
        obj.addProperty(prop);
        assertEquals("addProperty", 1, obj.getProperties().length);
        assertNull("getPropertyValue", obj.getPropertyValue("myProperty"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AccountEntry obj = AccountEntry.newInstance();
        Property[] properties = new Property[]{ Property.newInstance() };
        obj.setProperties(properties);
        assertEquals("properties", obj.getProperties().length, properties.length);
        Goal[] goals = new Goal[]{ Goal.newInstance() };
        obj.setGoals(goals);
        assertEquals("goals", obj.getGoals().length, goals.length);
        TableId tableid = TableId.newInstance();
        obj.setTableId(tableid);
        assertSame("tableid", obj.getTableId(), tableid);
        CustomVariable[] customvariables = new CustomVariable[]{ CustomVariable.newInstance() };
        obj.setCustomVariables(customvariables);
        assertEquals("customvariables", obj.getCustomVariables().length, customvariables.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
