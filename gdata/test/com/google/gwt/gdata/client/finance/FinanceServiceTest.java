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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the FinanceService class.
 */
public class FinanceServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", FinanceService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", FinanceService.newInstance("myValue"));
  }
  
  public void testCreateAndDeletePortfolio() {
    UserTest.login(GDataTestScripts.Finance.testCookie_Name, GDataTestScripts.Finance.testCookie_Value);
    FinanceService svc = FinanceService.newInstance("test");
    PortfolioEntry newEntry = PortfolioEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Entry_Title_Created);
    newEntry.setPortfolioData(PortfolioData.newInstance());
    newEntry.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Entry_Currency_Created);
    svc.insertEntry(GDataTestScripts.Finance.testPortfolios_Feed_Link, newEntry, new AsyncCallback<PortfolioEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(PortfolioEntry result) {
        if (!result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Entry_Title_Created) ||
            !result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Entry_Currency_Created)) {
          fail("Create Failed");
        }
        result.deleteEntry(new AsyncCallback<PortfolioEntry>() {
          public void onFailure(Throwable caught) {
            fail("Delete Failed: " + caught.getMessage());
          }
          public void onSuccess(PortfolioEntry result) {
          }
        });
        finishTest();
      }
    });
    delayTestFinish(10000);
  }
  
  public void testGetPortfolio() {
    UserTest.login(GDataTestScripts.Finance.testCookie_Name, GDataTestScripts.Finance.testCookie_Value);
    FinanceService svc = FinanceService.newInstance("test");
    svc.getPortfolioEntry(GDataTestScripts.Finance.testPortfolio_Entry_Link,
        new AsyncCallback<PortfolioEntry>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PortfolioEntry result) {
            if (!GDataTestScripts.Finance.testPortfolio_Entry_Title.equals(result.getTitle().getText()) ||
                !GDataTestScripts.Finance.testPortfolio_Entry_Currency.equals(result.getPortfolioData().getCurrencyCode()) ||
                GDataTestScripts.Finance.testPortfolio_Entry_GainPercentage != result.getPortfolioData().getGainPercentage() ||
                GDataTestScripts.Finance.testPortfolio_Entry_ReturnOverall != result.getPortfolioData().getReturnOverall() ||
                GDataTestScripts.Finance.testPortfolio_Entry_ReturnYTD != result.getPortfolioData().getReturnYTD()) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }

  public void testGetPortfolios() {
    UserTest.login(GDataTestScripts.Finance.testCookie_Name, GDataTestScripts.Finance.testCookie_Value);
    FinanceService svc = FinanceService.newInstance("test");
    svc.getPortfolioFeed(GDataTestScripts.Finance.testPortfolios_Feed_Link,
        new AsyncCallback<PortfolioFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PortfolioFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolios_Feed_Title)) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  
  public void testUpdatePortfolio() {
    UserTest.login(GDataTestScripts.Finance.testCookie_Name, GDataTestScripts.Finance.testCookie_Value);
    FinanceService svc = FinanceService.newInstance("test");
    svc.getPortfolioEntry(GDataTestScripts.Finance.testPortfolio_Entry_Link,
        new AsyncCallback<PortfolioEntry>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PortfolioEntry result) {
            result.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Entry_Title_Updated);
            result.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Entry_Currency_Updated);
            result.updateEntry(new AsyncCallback<PortfolioEntry>() {
              public void onFailure(Throwable caught) {
                fail("Update Failed: " + caught.getMessage());
              }
              public void onSuccess(PortfolioEntry result) {
                if (!result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Entry_Title_Updated) ||
                    !result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Entry_Currency_Updated)) {
                  fail("Update Failed");
                }
                result.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Entry_Title);
                result.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Entry_Currency);
                result.updateEntry(new AsyncCallback<PortfolioEntry>() {
                  public void onFailure(Throwable caught) {
                    fail("Revert Failed: " + caught.getMessage());
                  }
                  public void onSuccess(PortfolioEntry result) {
                    if (!result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Entry_Title) ||
                        !result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Entry_Currency)) {
                      fail("Revert Failed");
                    }
                    finishTest();
                  }
                });
                finishTest();
              }
            });
          }
    });
    this.delayTestFinish(10000);
  }
}
