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
import com.google.gwt.gdata.client.calendar.CalendarEventEntryCallback;
import com.google.gwt.gdata.client.calendar.CalendarEventFeed;
import com.google.gwt.gdata.client.calendar.CalendarEventFeedCallback;
import com.google.gwt.gdata.client.calendar.CalendarEventQuery;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a Calendar event.
 */
public class CalendarDeleteEventDemo extends GDataDemo {

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
        return new CalendarDeleteEventDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to delete an existing event. " +
          "A full text query is used to locate those events with the specified text, " +
          "and the first match will be deleted from the authenticated user's primary " +
          "calendar. The private/full feed is used for event deletion.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Delete an event";
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
  public CalendarDeleteEventDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_DeleteEventDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete an event");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          queryCalendars();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
    }
  }
  
  private void deleteEvent(String eventEntryUri) {
    showStatus("Deleting event...", false);
    service.deleteCalendarEventEntry(eventEntryUri, new CalendarEventEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while deleting a Calendar event: " + caught.getMessage(), true);
      }
      public void onSuccess(CalendarEventEntry result) {
        showStatus("Deleted a Calendar event.", false);
      }
    });
  }
  
  private void queryCalendars() {
    showStatus("Querying for events...", false);
    CalendarEventQuery query = CalendarEventQuery.newInstance("http://www.google.com/calendar/feeds/default/private/full");
    query.setFullTextQuery("GWT-Calendar-Client");
    service.getEventsFeed(query, new CalendarEventFeedCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the Event feed: " + caught.getMessage(), true);
      }
      public void onSuccess(CalendarEventFeed result) {
        CalendarEventEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("No events found containing the text 'GWT-Calendar-Client'.", false);
        } else {
          CalendarEventEntry targetEvent = entries[0];
          String eventEntryUri = targetEvent.getSelfLink().getHref();
          deleteEvent(eventEntryUri);
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