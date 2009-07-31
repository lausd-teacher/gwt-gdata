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
import com.google.gwt.gdata.client.finance.FinanceService;
import com.google.gwt.gdata.client.finance.PortfolioEntry;
import com.google.gwt.gdata.client.finance.PortfolioFeed;
import com.google.gwt.gdata.client.finance.PositionData;
import com.google.gwt.gdata.client.finance.PositionEntry;
import com.google.gwt.gdata.client.finance.PositionFeed;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of positions.
 */
public class FinanceRetrievePositionsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new FinanceRetrievePositionsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>As well as portfolio and transaction feeds, the Google Finance Portfolio " +
          "Data API offers an intermediate, read-only feed know as the position feed. " +
          "This is a summary of all of the contents of a particular portfolio, " +
          "grouped by ticker symbol. Each entry in this feed, know as a position, " +
          "is derived from the transactions entered for that symbol. " +
          "Each position entry has position data that may include current number of " +
          "shares of a particular stock or mutual fund if specified in the transactions " +
          "as well as investment gain if requested and if " +
          "purchase price and date have been specified.</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Retrieving Positions";
      }
    };
  }

  private FinanceService service;
  private FlexTable mainPanel;
  private final String scope = "http://finance.google.com/finance/feeds/";

  public FinanceRetrievePositionsDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_RetrievePositionsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void getPositions(PortfolioEntry entry) {
    String portfolioId = entry.getId().getValue();
    String portfolioFeedUri = "http://finance.google.com/finance/feeds/default/" +
      "portfolios/" + portfolioId + "/positions";
    service.getPositionFeed(portfolioFeedUri, new AsyncCallback<PositionFeed>() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving the positions feed, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(PositionFeed result) {
        PositionEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("No transactions found.", false);
        } else {
          showData(entries);
        }
      }
    });
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      showStatus("You are not logged on to Google Finance.", true);
    }
  }
  public void showData(PositionEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Shares" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      PositionEntry entry = entries[i];
      PositionData data = entry.getPositionData();
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label("" + data.getShares()));
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
    showStatus("Loading portfolios feed...", false);
    service.getPortfolioFeed("http://finance.google.com/finance/feeds/default/portfolios", new AsyncCallback<PortfolioFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Finance account was found for the currently logged-in user")) {
          showStatus("No Finance account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the portfolios feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(PortfolioFeed result) {
        PortfolioEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no portfolios.", false);
        } else {
          getPositions(entries[0]);
        }
      }
    });
  }
}