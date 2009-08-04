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
import com.google.gwt.gdata.client.finance.PortfolioData;
import com.google.gwt.gdata.client.finance.PortfolioEntry;
import com.google.gwt.gdata.client.finance.PortfolioEntryCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a portfolio.
 */
public class FinanceCreatePortfolioDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new FinanceCreatePortfolioDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a new portfolio. " +
          "The portfolio feed post URL (http://finance.google.com/finance/feeds/default/portfolios) " +
          "is used to insert a new portfolio entry for the authenticated user.</p>\n";
      }

      @Override
      public String getName() {
        return "Finance - Creating a Portfolio";
      }
    };
  }

  private FinanceService service;
  private FlexTable mainPanel;
  private final String scope = "http://finance.google.com/finance/feeds/";

  public FinanceCreatePortfolioDemo() {
    service = FinanceService.newInstance("HelloGData_Finance_CreatePortfolioDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a portfolio");
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
    showStatus("Creating portfolio...", false);
    PortfolioEntry entry = PortfolioEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Finance-Client - inserted portfolio");
    PortfolioData data = PortfolioData.newInstance();
    data.setCurrencyCode("USD");
    entry.setPortfolioData(data);
    service.insertPortfolioEntry("http://finance.google.com/finance/feeds/default/portfolios", entry, new PortfolioEntryCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Finance account was found for the currently logged-in user")) {
          showStatus("No Finance account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while creating a portfolio, see details below:\n" + message, true);
        }
      }
      public void onSuccess(PortfolioEntry result) {
        showStatus("Created a portfolio.", false);
      }
    });
  }
}