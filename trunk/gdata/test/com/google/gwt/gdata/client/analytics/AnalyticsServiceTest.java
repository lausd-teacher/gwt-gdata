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
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the AnalyticsService class.
 */
public class AnalyticsServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void test1AccountGet() {
    UserTest.login(GDataTestScripts.Analytics.testCookie_Name, GDataTestScripts.Analytics.testCookie_Value);
    AnalyticsService svc = AnalyticsService.newInstance("test");
    svc.getAccountFeed(GDataTestScripts.Analytics.testAccounts_FeedLink,
        new AsyncCallback<AccountFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(AccountFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Analytics.testAccounts_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Analytics.testAccounts_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.Analytics.testAccounts_Feed = result;
            GDataTestScripts.Analytics.testAccount_Entry_Original = result.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(4000);
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", AnalyticsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", AnalyticsService.newInstance("myValue"));
  }
}
