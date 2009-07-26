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
import com.google.gwt.gdata.client.finance.TransactionData;
import com.google.gwt.gdata.client.finance.TransactionEntry;
import com.google.gwt.gdata.client.finance.TransactionFeed;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to retrieve a list of transactions.
 */
public class FinanceRetrieveTransactionsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new FinanceRetrieveTransactionsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>In this example, all transactions for a particular ticker (e.g. NYSE:IBM) " +
          "are retrieved for a portfolio. The user's portfolio feed is queried and searched for " +
          "a portfolio starting with 'GWT-Finance-Client'. The transaction feed for NASDAQ:GOOG is " +
          "then queried for this portfolio and basic information is displayed. (This portfolio and " +
          "transaction were created in the examples above -- if no transactions for a given ticker " +
          "exist, the transaction feed will not exist and an error will be generated).</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Retrieving Transactions";
      }
    };
  }

  private FinanceService service;
  private FlexTable mainPanel;
  private final String scope = "http://finance.google.com/finance/feeds/";

  public FinanceRetrieveTransactionsDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_RetrieveTransactionsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void getTransactions(PortfolioEntry entry, String ticker) {
    String transactionFeedUri = entry.getEditLink().getHref() + "/positions/" 
      + ticker + "/transactions";
    service.getTransactionFeed(transactionFeedUri, new AsyncCallback<TransactionFeed>() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving the portfolios feed, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(TransactionFeed result) {
        TransactionEntry[] entries = result.getEntries();
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
      Button loginButton = new Button();
      loginButton.setText("Login to Finance to start demo...");
      loginButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          User.login(scope);
        }
      });
      mainPanel.setWidget(0, 0, loginButton);
    }
  }
  public void showData(TransactionEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Type", "Shares" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      TransactionEntry entry = entries[i];
      TransactionData data = entry.getTransactionData();
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(data.getType()));
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
        PortfolioEntry targetEntry = null;
        for (PortfolioEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("")) {
            targetEntry = entry;
            break;
          }
        }
        if (targetEntry == null) {
          showStatus("No portfolio found that contains 'GWT-Finance-Client' in the title.", false);
        } else {
          getTransactions(targetEntry, "NASDAQ:GOOG");
        }
      }
    });
  }
}