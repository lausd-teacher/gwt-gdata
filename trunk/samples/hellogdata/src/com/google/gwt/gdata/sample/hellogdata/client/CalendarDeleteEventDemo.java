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
import com.google.gwt.gdata.client.calendar.CalendarEventQuery;
import com.google.gwt.gdata.client.calendar.CalendarService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a Calendar event.
 */
public class CalendarDeleteEventDemo extends GDataDemo {

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

  public CalendarDeleteEventDemo() {
    service = CalendarService.newInstance("HelloGData_Calendar_DeleteEventDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete an event");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
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
    showStatus("Querying for Calendar events...", false);
    CalendarEventQuery query = CalendarEventQuery.newInstance("http://www.google.com/calendar/feeds/default/private/full");
    query.setFullTextQuery("GWT-Calendar-Client");
    service.getEventsFeed(query, new AsyncCallback<CalendarEventFeed>() {
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
          CalendarEventEntry eventEntry = entries[0];
          showStatus("Deleting a Calendar event...", false);
          eventEntry.deleteEntry(new AsyncCallback<CalendarEventEntry>() {
            public void onFailure(Throwable caught) {
              showStatus("An error occurred while deleting a Calendar event, see details below:\n" + caught.getMessage(), true);
            }
            public void onSuccess(CalendarEventEntry result) {
              showStatus("Deleted a Calendar event.", false);
            }
          });
        }
      }
    });
  }
}