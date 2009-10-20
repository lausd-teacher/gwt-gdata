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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.impl.CallErrorException;

/**
 * Tests for the SidewikiService class.
 */
public class SidewikiServiceTest extends SidewikiTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("SERVICE_NAME", SidewikiService.SERVICE_NAME);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", SidewikiService.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testGetSidewikiEntries() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Sidewiki.testCookie_Name, GDataTestScripts.Sidewiki.testCookie_Value);
        SidewikiService svc = SidewikiService.newInstance(SidewikiService.SERVICE_NAME);
        SidewikiEntryQuery query = SidewikiEntryQuery.newInstance(GDataTestScripts.Sidewiki.testEntries_Feed_Link);
        query.setMaxResults(25);
        svc.getSidewikiEntryFeed(query, new SidewikiEntryFeedCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(SidewikiEntryFeed result) {
            if (result.getEntries().length != 24) {
              fail("Get Failed: " + result.getEntries().length);
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Sidewiki.testEntries_Feed_Title)) {
              fail("Get Failed: " + result.getTitle().getText());
            }
            finishGDataTest();
          }
        });
      }
    }, 10000);
  }
}
