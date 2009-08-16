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
import com.google.gwt.gdata.client.PostalAddress;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.impl.CallErrorException;
import com.google.gwt.gdata.client.maps.FeatureEntry;
import com.google.gwt.gdata.client.maps.FeatureEntryCallback;
import com.google.gwt.gdata.client.maps.KmlContent;
import com.google.gwt.gdata.client.maps.MapEntry;
import com.google.gwt.gdata.client.maps.MapFeed;
import com.google.gwt.gdata.client.maps.MapFeedCallback;
import com.google.gwt.gdata.client.maps.MapsService;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a map feature.
 */
public class MapsCreateMapFeatureDemo extends GDataDemo {

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
        return new MapsCreateMapFeatureDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample code demonstrates how to create and insert a new map feature. " +
          "It retrieves a list of the user's maps and inserts a feature with a title " +
          "that starts with 'GWT-Maps-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Maps - Creating a map feature";
      }
    };
  }

  private MapsService service;
  private FlexTable mainPanel;
  private final String scope = "http://maps.google.com/maps/feeds/maps/";

  /**
   * Setup the Google Maps service and create the main content panel.
   * If the user is not logged on to Google Maps display a message,
   * otherwise start the demo by retrieving the user's maps.
   */
  public MapsCreateMapFeatureDemo() {
    service = MapsService.newInstance("HelloGData_Maps_CreateMapFeatureDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a map feature");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getMaps();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Google Maps.", true);
    }
  }
  
  private void getMaps() {
    showStatus("Loading maps feed...", false);
    service.getMapFeed("http://maps.google.com/maps/feeds/maps/default/full", new MapFeedCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while retrieving the maps feed: " + caught.getMessage(), true);
      }
      public void onSuccess(MapFeed result) {
        MapEntry[] entries = result.getEntries();
        MapEntry targetMap = null;
        for (MapEntry entry : entries) {
          if (entry.getTitle().getText().startsWith("GWT-Maps-Client")) {
            targetMap = entry;
            break;
          }
        }
        if (targetMap == null) {
          showStatus("No map found that contains 'GWT-Maps-Client' in the title.", false);
        } else {
          String mapEntryUri = targetMap.getId().getValue();
          insertMapFeature(mapEntryUri);
        }
      }
    });
  }
  
  private void insertMapFeature(String mapId) {
    showStatus("Creating map feature...", false);
    FeatureEntry entry = FeatureEntry.newInstance();
    entry.setTitle(Text.newInstance());
    entry.getTitle().setText("GWT-Maps-Client - inserted feature");
    PostalAddress address = PostalAddress.newInstance();
    address.setLabel("Google Headquarters");
    address.setRel(PostalAddress.REL_WORK);
    address.setValue("1600 Amphitheatre Parkway\nMountain View, CA 94043");
    entry.setPostalAddress(address);
    KmlContent kml = KmlContent.newInstance();
    kml.setType(KmlContent.TYPE_APPLICATION_VND_GOOGLE_EARTH_KML_XML);
    kml.setText("<Placemark><name>Faulkner's Birthplace</name><description/><Point><coordinates>-89.520753,34.360902,0.0</coordinates></Point></Placemark>");
    entry.setContent(kml);
    String featuresFeedUri = mapId.replace("/feeds/maps/", "/feeds/features/") + "/full";
    service.insertFeatureEntry(featuresFeedUri, entry, new FeatureEntryCallback() {
      public void onFailure(CallErrorException caught) {
        showStatus("An error occurred while creating a map feature: " + caught.getMessage(), true);
      }
      public void onSuccess(FeatureEntry result) {
        showStatus("Created a map feature.", false);
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