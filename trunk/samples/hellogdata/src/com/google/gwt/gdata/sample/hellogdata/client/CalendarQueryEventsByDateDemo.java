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
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.calendar.CalendarEventEntry;
import com.google.gwt.gdata.client.calendar.CalendarEventFeed;
import com.google.gwt.gdata.client.calendar.CalendarEventFeedCallback;
import com.google.gwt.gdata.client.calendar.CalendarEventQuery;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

import java.util.Date;

/**
 * The following example demonstrates how to query events by date.
 */
public class CalendarQueryEventsByDateDemo extends GDataDemo {

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
        return new CalendarQueryEventsByDateDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to perform a date query to retrieve " +
          "events. The date query serves as a filter against all event entries of the " +
          "private/full feed and return those events that has a start time between the " +
          "specified minimum and maximum start time. </p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Date query for events";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  /**
   * Setup the Calendar service and create the main content panel.
   * If the user is not logged on to Calendar display a message,
   * otherwise start the demo by querying the user's calendars.
   */
  public CalendarQueryEventsByDateDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_QueryEventsByDateDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      queryCalendars();
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
    }
  }
  
  @SuppressWarnings("deprecation")
  private void queryCalendars() {
    showStatus("Querying for events...", false);
    CalendarEventQuery query = CalendarEventQuery.newInstance("http://www.google.com/calendar/feeds/default/private/full");
    Date startDate = new Date();
    startDate.setMonth(startDate.getMonth() - 1);
    Date endDate = new Date();
    query.setMinimumStartTime(DateTime.newInstance(startDate));
    query.setMaximumStartTime(DateTime.newInstance(endDate));
    service.getEventsFeed(query, new CalendarEventFeedCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Calendar account was found for the currently logged-in user")) {
          showStatus("No Calendar account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Event feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(CalendarEventFeed result) {
        CalendarEventEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("No events found for the past month.", false);
        } else {
          showData(result.getEntries());
        }
      }
    });
  }

  /**
  * Displays a set of Calendar event entries in a tabular fashion with
  * the help of a GWT FlexTable widget. The data fields Title, URL 
  * and Updated are displayed.
  * 
  * @param entries The Calendar event entries to display.
  */
  private void showData(CalendarEventEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "URL", "Updated" };
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