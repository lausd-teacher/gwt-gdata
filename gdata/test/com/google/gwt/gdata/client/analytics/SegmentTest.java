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
 * Tests for the Segment class.
 */
public class SegmentTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Segment.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataSource obj = DataSource.newInstance();
        Property prop = Property.newInstance();
        prop.setName("prop1");
        prop.setValue("val1");
        obj.addProperty(prop);
        assertEquals("addProperty", 1, obj.getProperties().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Segment obj = Segment.newInstance();
        Property[] properties = new Property[]{ Property.newInstance() };
        obj.setProperties(properties);
        assertEquals("properties", obj.getProperties().length, properties.length);
        String name = "myValue";
        obj.setName(name);
        assertEquals("name", obj.getName(), name);
        Definition definition = Definition.newInstance();
        obj.setDefinition(definition);
        assertSame("definition", obj.getDefinition(), definition);
        String id = "myValue";
        obj.setId(id);
        assertEquals("id", obj.getId(), id);
        finishGDataTest();
      }
    }, 10000);
  }
}
