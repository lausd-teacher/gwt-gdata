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
import com.google.gwt.gdata.client.analytics.DataEntry;
import com.google.gwt.gdata.client.analytics.DataFeed;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to get the top browser languages in the United States for a given site.
 */
public class AnalyticsLanguagesDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new AnalyticsLanguagesDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample demonstrates how to get " +
        "the top browser languages in the United States.</p>" +
        "<div><strong>Note:</strong>if you have no visitors to your site from the " +
        "United States, you will see no data.</div>\n";
      }

      @Override
      public String getName() {
        return "Analytics - Languages By Country";
      }
    };
  }

  private AnalyticsService service;
  private FlexTable mainPanel;
  private final String scope = "https://www.google.com/analytics/feeds/";

  public AnalyticsLanguagesDemo() {
    service = AnalyticsService.newInstance("HelloGData_Analytics_LanguagesDemo_v1.0");
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
  public void showData(DataEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Country", "Language", "Visits" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      DataEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getStringValueOf("ga:country")));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(entry.getStringValueOf("ga:language")));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(new Double(entry.getNumericValueOf("ga:visits")).toString()));
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
          String tableId = entries[0].getTableId().getValue();
          String dataFeedUri = "https://www.google.com/analytics/feeds/data" +
            "?start-date=2009-07-01" +
            "&end-date=2009-07-31" +
            "&dimensions=ga:country,ga:language" +
            "&metrics=ga:visits" +
            "&sort=ga:country,-ga:visits" +
            "&max-results=30" +
            "&filters=" + URL.encodeComponent("ga:country==United States") +
            "&ids=" + tableId;
          showStatus("Loading data feed...", false);
          service.getDataFeed(dataFeedUri, new AsyncCallback<DataFeed>() {
            public void onFailure(Throwable caught) {
              showStatus("An error occurred while retrieving the Analytics Data feed, see details below:\n" + caught.getMessage(), true);
            }
            public void onSuccess(DataFeed result) {
              showData(result.getEntries());
            }
          });
        }
      }
    });
  }
}