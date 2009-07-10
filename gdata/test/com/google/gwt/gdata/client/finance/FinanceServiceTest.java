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

  public void test1PortfoliosGet() {
    UserTest.login(GDataTestScripts.Finance.testCookie_Name, GDataTestScripts.Finance.testCookie_Value);
    FinanceService svc = FinanceService.newInstance("test");
    svc.getPortfolioFeed(GDataTestScripts.Finance.testPortfolios_FeedLink,
        new AsyncCallback<PortfolioFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PortfolioFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolios_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Finance.testPortfolios_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.Finance.testPortfolios_Feed = result;
            GDataTestScripts.Finance.testPortfolio_Entry_Original = result.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void test2PortfolioGet() {
    assertEquals(GDataTestScripts.Finance.testPortfolio_Title_Original, GDataTestScripts.Finance.testPortfolio_Entry_Original.getTitle().getText());
    assertEquals(GDataTestScripts.Finance.testPortfolio_Currency_Original, GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().getCurrencyCode());
    assertEquals(GDataTestScripts.Finance.testPortfolio_GainPercentage_Original, GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().getGainPercentage());
    assertEquals(GDataTestScripts.Finance.testPortfolio_ReturnOverall_Original, GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().getReturnOverall());
    assertEquals(GDataTestScripts.Finance.testPortfolio_ReturnYTD_Original, GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().getReturnYTD());
  }
  public void test3PortfolioUpdate() {
    GDataTestScripts.Finance.testPortfolio_Entry_Original.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Title_Updated);
    GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Currency_Updated);
    GDataTestScripts.Finance.testPortfolio_Entry_Original.updateEntry(new AsyncCallback<PortfolioEntry>() {
      public void onFailure(Throwable caught) {
        fail("Update Failed: " + caught.getMessage());
      }
      public void onSuccess(PortfolioEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Title_Updated) &&
            result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Currency_Updated)) {
          GDataTestScripts.Finance.testPortfolio_Entry_Original.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Title_Original);
          GDataTestScripts.Finance.testPortfolio_Entry_Original.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Currency_Original);
          GDataTestScripts.Finance.testPortfolio_Entry_Original.updateEntry(new AsyncCallback<PortfolioEntry>() {
            public void onFailure(Throwable caught) {
              fail("Revert Failed: " + caught.getMessage());
            }
            public void onSuccess(PortfolioEntry result) {
              if (result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Title_Original) &&
                  result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Currency_Original)) {
                finishTest();
              } else { 
                fail("Revert Failed");
              }
            }
          });
          finishTest();
        } else { 
          fail("Update Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test4PortfolioCreate() {
    FinanceService svc = FinanceService.newInstance("test");
    PortfolioEntry newEntry = PortfolioEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Finance.testPortfolio_Title_Created);
    newEntry.setPortfolioData(PortfolioData.newInstance());
    newEntry.getPortfolioData().setCurrencyCode(GDataTestScripts.Finance.testPortfolio_Currency_Created);
    svc.insertEntry(GDataTestScripts.Finance.testPortfolios_FeedLink, newEntry, new AsyncCallback<PortfolioEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(PortfolioEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Finance.testPortfolio_Title_Created) &&
            result.getPortfolioData().getCurrencyCode().equals(GDataTestScripts.Finance.testPortfolio_Currency_Created)) {
          GDataTestScripts.Finance.testPortfolio_Entry_Created = result;
          finishTest();
        } else { 
          fail("Create Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test5PortfolioDelete() {
    GDataTestScripts.Finance.testPortfolio_Entry_Created.deleteEntry(new AsyncCallback<PortfolioEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(PortfolioEntry result) {
        FinanceService svc = FinanceService.newInstance("test");
        svc.getPortfolioFeed(GDataTestScripts.Finance.testPortfolios_FeedLink,
          new AsyncCallback<PortfolioFeed>() {
            public void onFailure(Throwable caught) {
              fail("Delete Failed: " + caught.getMessage());
            }
            public void onSuccess(PortfolioFeed result) {
              if (result.getEntries().length != 1) {
                fail("Delete Failed");
              }
              finishTest();
            }
        });
      }
    });
  }
  public void testConstants() {
    assertNotNull("SERVICE_NAME", FinanceService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", FinanceService.newInstance("myValue"));
  }
}
