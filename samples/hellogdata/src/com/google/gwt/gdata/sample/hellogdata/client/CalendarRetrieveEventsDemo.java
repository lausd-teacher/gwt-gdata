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
import com.google.gwt.gdata.client.calendar.CalendarEventEntry;
import com.google.gwt.gdata.client.calendar.CalendarEventFeed;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to retrieve a list of a user's calendar events.
 */
public class CalendarRetrieveEventsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new CalendarRetrieveEventsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to retrieve all primary calendar " +
          "events from the authenticated user. The private/full feed is used to obtain " +
          "the events from the private calendar with full projection. The sample iterates " +
          "through the list of events and prints out each event's title.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Retrieve all events";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  public CalendarRetrieveEventsDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_RetrieveEventsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      Button loginButton = new Button();
      loginButton.setText("Login to Calendar to start demo...");
      loginButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          User.login(scope);
        }
      });
      mainPanel.setWidget(0, 0, loginButton);
    }
  }
  public void showData(CalendarEventEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Link", "Updated" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      CalendarEventEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      String link = entry.getHtmlLink().getHref();
      mainPanel.setWidget(row, 1, new HTML("<a href=\"" + link + "\">" + link + "</a>"));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(entry.getUpdated().getValue().getDate().toString()));
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
    showStatus("Loading Calendar events feed...", false);
    service.getEventsFeed("http://www.google.com/calendar/feeds/default/private/full", new AsyncCallback<CalendarEventFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Calendar account was found for the currently logged-in user")) {
          showStatus("No Calendar account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Events feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(CalendarEventFeed result) {
        CalendarEventEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("There are no Calendar events.", false);
        } else {
          showData(result.getEntries());
        }
      }
    });
  }
}