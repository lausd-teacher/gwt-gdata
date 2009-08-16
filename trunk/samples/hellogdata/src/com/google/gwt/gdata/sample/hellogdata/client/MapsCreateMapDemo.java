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
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.gdata.client.maps.MapEntry;
import com.google.gwt.gdata.client.maps.MapEntryCallback;
import com.google.gwt.gdata.client.maps.MapsService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a map.
 */
public class MapsCreateMapDemo extends GDataDemo {

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
        return new MapsCreateMapDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a new map. " +
          "The map feed post URL (http://maps.google.com/maps/feeds/maps/default/full) " +
          "is used to insert a new map entry for the authenticated user.</p>\n";
      }

      @Override
      public String getName() {
        return "Maps - Creating a map";
      }
    };
  }

  private MapsService service;
  private FlexTable mainPanel;
  private final String scope = "http://maps.google.com/maps/feeds/maps/";

  /**
   * Setup the Google Maps service and create the main content panel.
   * If the user is not logged on to Google Maps display a message,
   * otherwise start the demo by creating a map.
   */
  public MapsCreateMapDemo() {
    service = MapsService.newInstance("HelloGData_Maps_CreateMapDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a map");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          createMap();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Maps.", true);
    }
  }
  
  private void createMap() {
    showStatus("Creating map...", false);
    MapEntry entry = MapEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Maps-Client - inserted map");
    service.insertMapEntry("http://maps.google.com/maps/feeds/maps/default/full", entry, new MapEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while creating a map: " + caught.getMessage(), true);
      }
      public void onSuccess(MapEntry result) {
        showStatus("Created a map.", false);
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