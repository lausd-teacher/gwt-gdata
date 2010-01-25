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
 * Tests for the GwoLink class.
 */
public class GwoLinkTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_CONFIGURATION_URL", GwoLink.REL_CONFIGURATION_URL);
        assertNotNull("REL_GOAL_URL", GwoLink.REL_GOAL_URL);
        assertNotNull("REL_PAGE_VARIATION_URL", GwoLink.REL_PAGE_VARIATION_URL);
        assertNotNull("REL_PREVIEW_URL", GwoLink.REL_PREVIEW_URL);
        assertNotNull("REL_REPORT_URL", GwoLink.REL_REPORT_URL);
        assertNotNull("REL_TEST_URL", GwoLink.REL_TEST_URL);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GwoLink.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }
}
