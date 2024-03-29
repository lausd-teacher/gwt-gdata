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

package com.google.gwt.gdata.client.gbase;

/**
 * Tests for the GmAttribute class.
 */
public class GmAttributeTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("IMPORTANCE_OPTIONAL", GmAttribute.IMPORTANCE_OPTIONAL);
        assertNotNull("IMPORTANCE_RECOMMENDED", GmAttribute.IMPORTANCE_RECOMMENDED);
        assertNotNull("IMPORTANCE_REQUIRED", GmAttribute.IMPORTANCE_REQUIRED);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GmAttribute.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        GmAttribute obj = GmAttribute.newInstance();
        obj.addValue(GmValue.newInstance());
        assertEquals("addValue", 1, obj.getValues().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        GmAttribute obj = GmAttribute.newInstance();
        String name = "myValue";
        obj.setName(name);
        assertEquals("name", obj.getName(), name);
        GmValue[] values = new GmValue[]{ GmValue.newInstance() };
        obj.setValues(values);
        assertEquals("values", obj.getValues().length, values.length);
        double count = 600813;
        obj.setCount(count);
        assertEquals("count", obj.getCount(), count);
        String type = "myValue";
        obj.setType(type);
        assertEquals("type", obj.getType(), type);
        String importance = "myValue";
        obj.setImportance(importance);
        assertEquals("importance", obj.getImportance(), importance);
        finishGDataTest();
      }
    }, 10000);
  }
}
