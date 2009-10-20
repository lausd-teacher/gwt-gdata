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
 * Tests for the DataSource class.
 */
public class DataSourceTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", DataSource.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addProperty(Property property)
    // Unit Test for getPropertyValue(String name)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        DataSource obj = DataSource.newInstance();
        Property[] properties = new Property[]{ Property.newInstance() };
        obj.setProperties(properties);
        assertEquals("properties", obj.getProperties().length, properties.length);
        TableName tablename = TableName.newInstance();
        obj.setTableName(tablename);
        assertSame("tablename", obj.getTableName(), tablename);
        TableId tableid = TableId.newInstance();
        obj.setTableId(tableid);
        assertSame("tableid", obj.getTableId(), tableid);
        finishGDataTest();
      }
    }, 10000);
  }
}
