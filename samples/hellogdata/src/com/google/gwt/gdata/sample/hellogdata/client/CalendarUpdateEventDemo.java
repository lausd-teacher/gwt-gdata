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
import com.google.gwt.gdata.client.calendar.CalendarEventEntry;
import com.google.gwt.gdata.client.calendar.CalendarEventEntryCallback;
import com.google.gwt.gdata.client.calendar.CalendarEventFeed;
import com.google.gwt.gdata.client.calendar.CalendarEventFeedCallback;
import com.google.gwt.gdata.client.calendar.CalendarEventQuery;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to update a Calendar event.
 */
public class CalendarUpdateEventDemo extends GDataDemo {

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
        return new CalendarUpdateEventDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to update the title of an existing event. " +
          "A full text query is used to locate those events with the specified text, " +
          "and the first match will be updated with the new title. The private/full feed is " +
          "used for event update.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Update an event";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  /**
   * Setup the Calendar service and create the main content panel.
   * If the user is not logged on to Calendar display a message,
   * otherwise start the demo by querying the user's calendar events.
   */
  public CalendarUpdateEventDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_UpdateEventDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update an event");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          queryEvents();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Calendar.", true);
    }
  }
  
  private void queryEvents() {
    showStatus("Querying for events...", false);
    CalendarEventQuery query = CalendarEventQuery.newInstance("http://www.google.com/calendar/feeds/default/private/full");
    query.setFullTextQuery("GWT-Calendar-Client");
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
          showStatus("No events found containing the text 'GWT-Calendar-Client'.", false);
        } else {
          CalendarEventEntry targetEvent = entries[0];
          updateEvent(targetEvent);
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
  
  private void updateEvent(CalendarEventEntry targetEvent) {
    targetEvent.setTitle(Text.newInstance());
    targetEvent.getTitle().setText("GWT-Calendar-Client - updated event");
    showStatus("Updating a Calendar event...", false);
    targetEvent.updateEntry(new CalendarEventEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while updating a Calendar event, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(CalendarEventEntry result) {
        showStatus("Updated a Calendar event.", false);
      }
    });
  }
}