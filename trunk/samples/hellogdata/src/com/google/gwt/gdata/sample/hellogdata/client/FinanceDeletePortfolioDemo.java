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
import com.google.gwt.gdata.client.finance.PortfolioEntryCallback;
import com.google.gwt.gdata.client.finance.PortfolioFeed;
import com.google.gwt.gdata.client.finance.PortfolioFeedCallback;
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a portfolio.
 */
public class FinanceDeletePortfolioDemo extends GDataDemo {

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
        return new FinanceDeletePortfolioDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to delete an existing portfolio of the " +
          "authenticated user. It retrieves a list of the user's portfolios, and delete the " +
          "first portfolio with title that starts with 'GWT-Finance-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Deleting a portfolio";
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
  public FinanceDeletePortfolioDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_DeletePortfolioDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a portfolio");
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
  
  private void deletePortfolio(String portfolioEntryUri) {
    showStatus("Deleting portfolio...", false);
    service.deletePortfolioEntry(portfolioEntryUri, new PortfolioEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the portfolios feed: " + caught.getMessage(), true);
      }
      public void onSuccess(PortfolioEntry result) {
        showStatus("Deleted a portfolio.", false);
      }
    });
  }
  
  private void getPortfolios() {
    showStatus("Loading portfolios feed...", false);
    service.getPortfolioFeed("http://finance.google.com/finance/feeds/default/portfolios", new PortfolioFeedCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the portfolios feed: " + caught.getMessage(), true);
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
          String portfolioEntryUri = targetPortfolio.getSelfLink().getHref();
          deletePortfolio(portfolioEntryUri);
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
}