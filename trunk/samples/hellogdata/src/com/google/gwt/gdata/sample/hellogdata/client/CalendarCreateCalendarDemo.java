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
import com.google.gwt.gdata.client.Where;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.calendar.CalendarEntry;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.gdata.client.calendar.ColorProperty;
import com.google.gwt.gdata.client.calendar.HiddenProperty;
import com.google.gwt.gdata.client.calendar.TimeZoneProperty;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a calendar.
 */
public class CalendarCreateCalendarDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new CalendarCreateCalendarDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a new calendar. " +
        "The owncalendars feed is used to insert the new calendar entry for the " +
        "authenticated user. </p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Create new calendar";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  public CalendarCreateCalendarDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_CreateCalendarDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a calendar");
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
    String feedUri = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    CalendarEntry entry = CalendarEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Calendar-Client: insert calendar");
    entry.setSummary(Text.newInstance());
    entry.getSummary().setText("This is a test calendar created by GWT Client");
    entry.setTimeZone(TimeZoneProperty.newInstance());
    entry.getTimeZone().setValue("America/Los_Angeles");
    Where where = Where.newInstance();
    where.setLabel("Mountain View, CA");
    where.setValueString("Mountain View, CA");
    entry.addLocation(where);
    entry.setHidden(HiddenProperty.newInstance());
    entry.getHidden().setValue(false);
    entry.setColor(ColorProperty.newInstance());
    entry.getColor().setValue(ColorProperty.VALUE_RGB_2952A3);
    showStatus("Creating calendar...", false);
    service.insertEntry(feedUri, entry, new AsyncCallback<CalendarEntry>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Calendar account was found for the currently logged-in user")) {
          showStatus("No Calendar account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Calendar feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(CalendarEntry result) {
        showStatus("Created a Calendar entry titled '" + result.getTitle().getText() + "'", false);
      }
    });
  }
}