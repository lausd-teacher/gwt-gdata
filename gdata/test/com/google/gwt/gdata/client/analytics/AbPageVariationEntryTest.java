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
 * Tests for the AbPageVariationEntry class.
 */
public class AbPageVariationEntryTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AbPageVariationEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AbPageVariationEntry obj = AbPageVariationEntry.newInstance();
        GwoAbPageVariationId abpagevariationid = GwoAbPageVariationId.newInstance();
        obj.setAbPageVariationId(abpagevariationid);
        assertSame("abpagevariationid", obj.getAbPageVariationId(), abpagevariationid);
        GwoExperimentId experimentid = GwoExperimentId.newInstance();
        obj.setExperimentId(experimentid);
        assertSame("experimentid", obj.getExperimentId(), experimentid);
        finishGDataTest();
      }
    }, 10000);
  }
}
