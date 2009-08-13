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
import com.google.gwt.gdata.client.finance.PortfolioFeedCallback;
import com.google.gwt.gdata.client.finance.TransactionEntry;
import com.google.gwt.gdata.client.finance.TransactionEntryCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to update a transaction.
 */
public class FinanceUpdateTransactionDemo extends GDataDemo {

  /**
   * This method is used by the main sample app to obtain
   * information on this sample and a sample instance.
   * 
   * @return An instance of this demo.
   */
  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new FinanceUpdateTransactionDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to update an existing transaction within " +
          "the portfolio of the authenticated user. It retrieves and updates the first " +
          "NASDAQ:GOOG transaction with the 'GWT-Finance-Client' portfolio (Note: The transaction " +
          "must exist before it can be updated; otherwise an error is generated.)</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Updating a transaction";
      }
    };
  }

  private FinanceService service;
  private FlexTable mainPanel;
  private final String scope = "http://finance.google.com/finance/feeds/";

  /**
   * Setup the Finance service and create the main content panel.
   * If the user is not logged on to Finance display a message,
   * otherwise start the demo by retrieving the user's portfolios.
   */
  public FinanceUpdateTransactionDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_UpdateTransactionDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update a transaction");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getPortfolios();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Finance.", true);
    }
  }
  
  private void getPortfolios() {
    showStatus("Loading portfolios feed...", false);
    service.getPortfolioFeed("http://finance.google.com/finance/feeds/default/portfolios", new PortfolioFeedCallback() {
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
        PortfolioEntry targetPortfolio = null;
        for (PortfolioEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("GWT-Finance-Client")) {
            targetPortfolio = entry;
            break;
          }
        }
        if (targetPortfolio == null) {
          showStatus("No portfolio found that contains 'GWT-Finance-Client' in the title.", false);
        } else {
          final String ticker = "NASDAQ:GOOG";
          int transactionId = 1;
          String transactionEntryUri = targetPortfolio.getEditLink().getHref() + "/positions/" + ticker + "/transactions/" + transactionId;
          getTransaction(transactionEntryUri);
        }
      }
    });
  }
  
  private void getTransaction(String transactionEntryUri) {
    showStatus("Retrieving transaction...", false);
    service.getTransactionEntry(transactionEntryUri, new TransactionEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving a transaction, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(TransactionEntry result) {
        if (result == null) {
          showStatus("No transaction found.", false);
        } else {
          updateTransaction(result);
        }
      }
    });
  }

  /**
   * Displays a status message to the user.
   * 
   * @param message The message to display.
   * @param isError Indicates whether the status is an error status.
   */
  private void showStatus(String message, boolean isError) {
    mainPanel.clear();
    mainPanel.insertRow(0);
    mainPanel.addCell(0);
    Label msg = new Label(message);
    if (isError) {
      msg.setStylePrimaryName("hm-error");
    }
    mainPanel.setWidget(0, 0, msg);
  }
  
  private void updateTransaction(TransactionEntry transactionEntry) {
    showStatus("Updating transaction...", false);
    transactionEntry.getTransactionData().setShares(271.82);
    transactionEntry.updateEntry(new TransactionEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while updating a transaction, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(TransactionEntry result) {
        showStatus("Updated a transaction.", false);
      }
    });
  }
}