/*
 * Copyright 2008 Google Inc.
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

package com.google.gwt.gdata.sample.hellogdata.client;

import com.google.gwt.accounts.client.AuthSubStatus;
import com.google.gwt.accounts.client.User;
import com.google.gwt.gdata.client.analytics.AccountEntry;
import com.google.gwt.gdata.client.analytics.AccountFeed;
import com.google.gwt.gdata.client.analytics.AnalyticsService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to access 50 of the account names,
 * profile names, profile ids and table ids to which your login has access.
 */
public class AnalyticsYourAccountsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new AnalyticsYourAccountsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample demonstrates how to access 50 of " +
        "the account names, profile names, profile ids and table ids to which your " +
        "login has access.</p>\n";
      }

      @Override
      public String getName() {
        return "Analytics - Your Accounts";
      }
    };
  }

  private AnalyticsService service;
  private FlexTable mainPanel;
  private final String scope = "https://www.google.com/analytics/feeds/";

  public AnalyticsYourAccountsDemo() {
    service = AnalyticsService.newInstance("HelloGData_Analytics_YourAccountsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      showStatus("You are not logged on to Google Analytics.", true);
    }
  }
  public void showData(AccountEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Account Name", "Profile Name", "Profile Id", "Table Id" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      AccountEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getPropertyValue("ga:AccountName")));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(entry.getPropertyValue("ga:ProfileId")));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 3, new Label(entry.getTableId().getValue()));
    }
  }
  public void showStatus(String message, boolean isError) {
    mainPanel.clear();
    mainPanel.insertRow(0);
    mainPanel.addCell(0);
    Label msg = new Label(message);
    if (isError) {
      msg.setStylePrimaryName("hm-error");
    }
    mainPanel.setWidget(0, 0, msg);
  }
  public void startDemo() {
    showStatus("Loading Analytics accounts feed...", false);
    service.getAccountFeed("https://www.google.com/analytics/feeds/accounts/default?max-results=50", new AsyncCallback<AccountFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Analytics account was found for the currently logged-in user")) {
          showStatus("No Analytics account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Analytics Accounts feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(AccountFeed result) {
        AccountEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no Analytics accounts.", false);
        } else {
          showData(result.getEntries());
        }
      }
    });
  }
}