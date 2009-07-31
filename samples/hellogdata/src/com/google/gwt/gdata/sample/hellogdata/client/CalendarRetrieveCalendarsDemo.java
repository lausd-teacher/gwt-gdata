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
import com.google.gwt.gdata.client.calendar.CalendarEntry;
import com.google.gwt.gdata.client.calendar.CalendarFeed;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

/**
 * The following example demonstrates how to retrieve a list of a user's calendars.
 */
public class CalendarRetrieveCalendarsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new CalendarRetrieveCalendarsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code uses the allcalendars feed to retrieve the authenticated user's " +
          "list of calendars (primary, secondary and subscribed). The feed result is iterated through to " +
          "print out each calendar's title.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Retrieve all calendars";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  public CalendarRetrieveCalendarsDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_RetrieveCalendarsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
    }
  }
  public void showData(CalendarEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "Color", "Updated" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      CalendarEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 1, new Label(entry.getColor().getValue()));
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
    showStatus("Loading calendars feed...", false);
    service.getAllCalendarsFeed("http://www.google.com/calendar/feeds/default/allcalendars/full", new AsyncCallback<CalendarFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Calendar account was found for the currently logged-in user")) {
          showStatus("No Calendar account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Calendar feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(CalendarFeed result) {
        CalendarEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no Calendars.", false);
        } else {
          showData(result.getEntries());
        }
      }
    });
  }
}