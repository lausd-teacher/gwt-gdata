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
import com.google.gwt.gdata.client.calendar.CalendarEntry;
import com.google.gwt.gdata.client.calendar.CalendarFeed;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to update a calendar.
 */
public class CalendarUpdateCalendarDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new CalendarUpdateCalendarDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to update an existing calendar of the authenticated user. " +
          "It retrieves a list of the user's own calendars, and update the first calendar with a title " +
          "that starts with 'GWT-Calendar-Client'. The owncalendars feed is used to update an existing calendar.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Update a calendar";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  public CalendarUpdateCalendarDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_UpdateCalendarDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update a calendar");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
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
    showStatus("Loading calendars...", false);
    service.getOwnCalendarsFeed("http://www.google.com/calendar/feeds/default/owncalendars/full", new AsyncCallback<CalendarFeed>() {
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
          showStatus("You have no calendars.", false);
        } else {
          CalendarEntry calendarEntry = null;
          for (CalendarEntry entry : entries) {
            String title = entry.getTitle().getText();
            if (title.startsWith("GWT-Calendar-Client")) {
              calendarEntry = entry;
              break;
            }
          }
          if (calendarEntry == null) {
            showStatus("Did not find a calendar entry whose title starts with the prefix 'GWT-Calendar-Client'.", false);
          } else {
            calendarEntry.setTitle(Text.newInstance());
            calendarEntry.getTitle().setText("GWT-Calendar-Client: update calendar");
            showStatus("Updating calendar...", false);
            calendarEntry.updateEntry(new AsyncCallback<CalendarEntry>() {
              public void onFailure(Throwable caught) {
                showStatus("An error occurred while updating a calendar, see details below:\n" + caught.getMessage(), true);
              }
              public void onSuccess(CalendarEntry result) {
                showStatus("Updated a calendar.", false);
              }
            });
          }
        }
      }
    });
  }
}