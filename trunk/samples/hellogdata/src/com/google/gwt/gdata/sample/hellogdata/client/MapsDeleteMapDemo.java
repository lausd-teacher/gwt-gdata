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
import com.google.gwt.gdata.client.maps.MapEntry;
import com.google.gwt.gdata.client.maps.MapEntryCallback;
import com.google.gwt.gdata.client.maps.MapFeed;
import com.google.gwt.gdata.client.maps.MapFeedCallback;
import com.google.gwt.gdata.client.maps.MapsService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a map.
 */
public class MapsDeleteMapDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new MapsDeleteMapDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to delete an existing map of the " +
          "authenticated user. It retrieves a list of the user's maps, and deletes " +
          "the first map with a title that starts with 'GWT-Maps-Client' with a new title.</p>\n";
      }

      @Override
      public String getName() {
        return "Maps - Deleting a map";
      }
    };
  }

  private MapsService service;
  private FlexTable mainPanel;
  private final String scope = "http://maps.google.com/maps/feeds/maps/";

  public MapsDeleteMapDemo() {
    service = MapsService.newInstance("HelloGData_Maps_DeleteMapDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a map");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Maps.", true);
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
    showStatus("Loading maps feed...", false);
    service.getMapFeed("http://maps.google.com/maps/feeds/maps/default/full", new MapFeedCallback() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Maps account was found for the currently logged-in user")) {
          showStatus("No Maps account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the maps feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(MapFeed result) {
        MapEntry[] entries = result.getEntries();
        MapEntry targetEntry = null;
        for (MapEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("GWT-Maps-Client")) {
            targetEntry = entry;
            break;
          }
        }
        if (targetEntry == null) {
          showStatus("No map found that contains 'GWT-Maps-Client' in the title.", false);
        } else {
          deleteMap(targetEntry);
        }
      }
    });
  }
  public void deleteMap(MapEntry entry) {
    showStatus("Deleting map...", false);
    entry.deleteEntry(new MapEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while retrieving the maps feed, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(MapEntry result) {
        showStatus("Deleted a map.", false);
      }
    });
  }
}