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

import com.google.gwt.gdata.client.QueryParameterDefinition;

/**
 * Tests for the AccountQuery class.
 */
public class AccountQueryTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AccountQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        AccountQuery obj = AccountQuery.newInstance("http://www.google.com/feeds/");
        assertNotNull("getPath", obj.getPath());
        assertNotNull("getUri", obj.getUri());
        obj.setParamDef("par1", QueryParameterDefinition.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AccountQuery obj = AccountQuery.newInstance("myValue");
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        boolean prettyprint = true;
        obj.setPrettyprint(prettyprint);
        assertEquals("prettyprint", obj.getPrettyprint(), prettyprint);
        double maxresults = 600813;
        obj.setMaxResults(maxresults);
        assertEquals("maxresults", obj.getMaxResults(), maxresults);
        double val1 = 10;
        obj.setNumericParam("par1", val1);
        assertNotNull("numericParam", obj.getNumericParam("par1"));
        assertEquals("numericParam", val1, obj.getNumericParam("par1"));
        String val2 = "myValue";
        obj.setStringParam("par2", val2);
        assertNotNull("stringParam", obj.getStringParam("par2"));
        assertEquals("stringParam", val2, obj.getStringParam("par2"));
        finishGDataTest();
      }
    }, 10000);
  }
}
