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

import com.google.gwt.gdata.client.analytics.AccountEntry;
import com.google.gwt.gdata.client.analytics.AccountFeed;
import com.google.gwt.gdata.client.analytics.AnalyticsService;
import com.google.gwt.gdata.client.analytics.DataEntry;
import com.google.gwt.gdata.client.analytics.DataFeed;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example creates a map with default values.
 */
public class AnalyticsLanguagesDemo extends GDataDemo {

  private static HTML descHTML = null;
  private static final String descString = "<p>This sample demonstrates how to get " +
    "the top browser languages in the United States.</p>" +
    "<div><strong>Note:</strong>if you have no visitors to your site from the " +
    "United States, you will see no data.</div>\n";

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new AnalyticsLanguagesDemo();
      }

      @Override
      public HTML getDescriptionHTML() {
        if (descHTML == null) {
          descHTML = new HTML(descString);
        }
        descHTML.setStylePrimaryName("hm-description");
        return descHTML;
      }

      @Override
      public String getName() {
        return "Analytics - Languages By Country";
      }
    };
  }

  private AnalyticsService service;
  private FlexTable mainPanel;

  public AnalyticsLanguagesDemo() {
    mainPanel = new FlexTable();
    service = AnalyticsService.newInstance("HelloGData_Analytics_AccountsSample_v1.0");
    service.getAccountFeed("https://www.google.com/analytics/feeds/accounts/default?max-results=50", new AsyncCallback<AccountFeed>() {
      public void onFailure(Throwable caught) {
      }
      public void onSuccess(AccountFeed result) {
        AccountEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          Label msg = new Label("You have no analytics accounts.");
          msg.setStylePrimaryName("hm-error");
          mainPanel.insertRow(0);
          mainPanel.addCell(0);
          mainPanel.setWidget(0, 0, msg);
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
          service.getDataFeed(dataFeedUri, new AsyncCallback<DataFeed>() {
            public void onFailure(Throwable caught) {
            }
            public void onSuccess(DataFeed result) {
              String[] labels = new String[] { "Country", "Language", "Visits" };
              mainPanel.insertRow(0);
              for (int i = 0; i < labels.length; i++) {
                mainPanel.addCell(0);
                mainPanel.setWidget(0, i, new Label(labels[i]));
                mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
              }
              DataEntry[] entries = result.getEntries();
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
          });
        }
      }
    });
    initWidget(mainPanel);
  }
}