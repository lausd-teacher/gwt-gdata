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
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.finance.FinanceService;
import com.google.gwt.gdata.client.finance.PortfolioEntry;
import com.google.gwt.gdata.client.finance.PortfolioFeed;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to update a portfolio.
 */
public class FinanceUpdatePortfolioDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new FinanceUpdatePortfolioDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to update an existing portfolio of the " +
          "authenticated user. It retrieves a list of the user's portfolios, and updates " +
          "the first portfolio with a title that starts with 'GWT-Finance-Client' with a new title.</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Updating a Portfolio";
      }
    };
  }

  private FinanceService service;
  private FlexTable mainPanel;
  private final String scope = "http://finance.google.com/finance/feeds/";

  public FinanceUpdatePortfolioDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_UpdatePortfolioDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update a portfolio");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Finance.", true);
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
          updatePortfolio(targetEntry);
        }
      }
    });
  }
  public void updatePortfolio(PortfolioEntry entry) {
    showStatus("Updating portfolio...", false);
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Finance-Client: updated title");
    entry.updateEntry(new AsyncCallback<PortfolioEntry>() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving the portfolios feed, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(PortfolioEntry result) {
        showStatus("Updated a portfolio.", false);
      }
    });
  }
}