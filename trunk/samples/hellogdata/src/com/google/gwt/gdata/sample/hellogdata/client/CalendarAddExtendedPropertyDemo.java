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
import com.google.gwt.gdata.client.When;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.calendar.CalendarEventEntry;
import com.google.gwt.gdata.client.calendar.CalendarEventEntryCallback;
import com.google.gwt.gdata.client.calendar.CalendarExtendedProperty;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import java.util.Date;

/**
 * The following example demonstrates how to add an extended property.
 */
public class CalendarAddExtendedPropertyDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new CalendarAddExtendedPropertyDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a single event with an " +
          "extended property in the form of a name-value pair to the authenticated user's primary " +
          "calendar. The private/full feed is used for event insertion.</p>\n";
      }

      @Override
      public String getName() {
        return "Calendar - Add extended property";
      }
    };
  }

  private CalendarService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.google.com/calendar/feeds/";

  public CalendarAddExtendedPropertyDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_AddExtendedPropertyDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create an event with an extended property");
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
  @SuppressWarnings("deprecation")
  public void startDemo() {
    showStatus("Creating Calendar event reminder...", false);
    CalendarEventEntry entry = CalendarEventEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Calendar-Client: add extended property");
    When when = When.newInstance();
    Date startTime = new Date();
    Date endTime = new Date();
    endTime.setHours(endTime.getHours() + 1);
    when.setStartTime(DateTime.newInstance(startTime));
    when.setEndTime(DateTime.newInstance(endTime));
    entry.addTime(when);
    CalendarExtendedProperty extendedProp = CalendarExtendedProperty.newInstance();
    extendedProp.setName("mydata");
    extendedProp.setValue("xyz");
    entry.addExtendedProperty(extendedProp);
    service.insertCalendarEventEntry("http://www.google.com/calendar/feeds/default/private/full", entry, new CalendarEventEntryCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Calendar account was found for the currently logged-in user")) {
          showStatus("No Calendar account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while creating a Calendar event reminder, see details below:\n" + message, true);
        }
      }
      public void onSuccess(CalendarEventEntry result) {
        showStatus("Created a Calendar event with an extended property.", false);
      }
    });
  }
}