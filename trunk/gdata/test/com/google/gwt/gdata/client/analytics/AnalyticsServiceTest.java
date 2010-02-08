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

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.impl.CallErrorException;

/**
 * Tests for the AnalyticsService class.
 */
public class AnalyticsServiceTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("SERVICE_NAME", AnalyticsService.SERVICE_NAME);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AnalyticsService.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }
  
  public void testGetAccounts() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Analytics.testCookie_Name, GDataTestScripts.Analytics.testCookie_Value);
        AnalyticsService svc = AnalyticsService.newInstance(AnalyticsService.SERVICE_NAME);
        svc.getAccountFeed(GDataTestScripts.Analytics.testAccounts_Feed_Link,
            new AccountFeedCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(AccountFeed result) {
                if (result.getEntries().length == 0) {
                  fail("Get Failed");
                }
                if (!result.getTitle().getText().equals(GDataTestScripts.Analytics.testAccounts_Feed_Title)) {
                  fail("Get Failed");
                }
                finishGDataTest();
              }
        });
      }
    }, 14000);
  }
}
