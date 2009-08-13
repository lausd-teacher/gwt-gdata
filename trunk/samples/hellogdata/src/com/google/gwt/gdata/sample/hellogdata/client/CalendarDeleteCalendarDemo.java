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
import com.google.gwt.gdata.client.calendar.CalendarEntryCallback;
import com.google.gwt.gdata.client.calendar.CalendarFeed;
import com.google.gwt.gdata.client.calendar.CalendarFeedCallback;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a calendar.
 */
public class CalendarDeleteCalendarDemo extends GDataDemo {

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
        return new CalendarDeleteCalendarDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to delete an existing calendar of the " +
          "authenticated user. It retrieves a list of the user's own calendars, and delete " +
          "the first calendar with title that starts with 'GWT-Calendar-Client'. The " +
          "owncalendars feed is used for calendar deletion.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Delete a calendar";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  /**
   * Setup the Calendar service and create the main content panel.
   * If the user is not logged on to Calendar display a message,
   * otherwise start the demo by retrieving the user's calendars.
   */
  public CalendarDeleteCalendarDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_DeleteCalendarDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a calendar");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getCalendars();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
    }
  }
  
  private void deleteCalendar(String calendarEntryUri) {
    showStatus("Deleting calendar...", false);
    service.deleteCalendarEntry(calendarEntryUri, new CalendarEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while deleting a calendar, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(CalendarEntry result) {
        showStatus("Deleted a calendar.", false);
      }
    });
  }
  
  private void getCalendars() {
    showStatus("Loading calendars...", false);
    service.getOwnCalendarsFeed("http://www.google.com/calendar/feeds/default/owncalendars/full", new CalendarFeedCallback() {
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
          CalendarEntry targetCalendar = null;
          for (CalendarEntry entry : entries) {
            String title = entry.getTitle().getText();
            if (title.startsWith("GWT-Calendar-Client")) {
              targetCalendar = entry;
              break;
            }
          }
          if (targetCalendar == null) {
            showStatus("Did not find a calendar entry whose title starts with the prefix 'GWT-Calendar-Client'.", false);
          } else {
            String calendarEntryUri = targetCalendar.getSelfLink().getHref();
            deleteCalendar(calendarEntryUri);
          }
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