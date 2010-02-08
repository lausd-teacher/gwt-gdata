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
 * Tests for the CombinationEntry class.
 */
public class CombinationEntryTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CombinationEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        CombinationEntry obj = CombinationEntry.newInstance();
        GwoComboString combostring = GwoComboString.newInstance();
        obj.setComboString(combostring);
        assertSame("combostring", obj.getComboString(), combostring);
        GwoExperimentId experimentid = GwoExperimentId.newInstance();
        obj.setExperimentId(experimentid);
        assertSame("experimentid", obj.getExperimentId(), experimentid);
        GwoComboActive comboactive = GwoComboActive.newInstance();
        obj.setComboActive(comboactive);
        assertSame("comboactive", obj.getComboActive(), comboactive);
        GwoComboId comboid = GwoComboId.newInstance();
        obj.setComboId(comboid);
        assertSame("comboid", obj.getComboId(), comboid);
        finishGDataTest();
      }
    }, 10000);
  }
}