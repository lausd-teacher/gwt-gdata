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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.gdata.client.GData;
import com.google.gwt.gdata.sample.hellogdata.client.GDataDemo.GDataDemoInfo;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Main class for implementing the HelloGData gwt-google-apis demo.
 */
public class HelloGData implements EntryPoint, HistoryListener {

  protected DemoList list = new DemoList();
  private GDataDemoInfo curInfo;
  private GDataDemo curGDataDemo;
  private HTML description = new HTML();
  private VerticalPanel innerPanel = new VerticalPanel();
  private FlexTable outerPanel = new FlexTable();

  public void onGDataLoad() {

    if (!GData.isLoaded()) {
      Window.alert("The GData API is not installed."
          + "  The GData API is unavailable or your GData key may be wrong.");
      return;
    }

    // Load all the MapsDemos.
    loadGDataDemos();

    innerPanel.setStylePrimaryName("hm-mapinnerpanel");
    innerPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

    HorizontalPanel horizPanel = new HorizontalPanel();
    list.setStylePrimaryName("hm-demolistbox");
    
    description.setStylePrimaryName("hm-description");
    
    innerPanel.add(horizPanel);
    innerPanel.add(description);
    innerPanel.setSpacing(10);

    History.addHistoryListener(this);

    outerPanel.setStylePrimaryName("hm-outerpanel");
    outerPanel.insertRow(0);
    outerPanel.insertRow(0);
    outerPanel.insertRow(0);
    outerPanel.insertRow(0);
    outerPanel.insertRow(0);

    outerPanel.addCell(0);
    outerPanel.addCell(1);
    outerPanel.addCell(2);
    outerPanel.addCell(3);
    outerPanel.addCell(4);

    outerPanel.setWidget(0, 0, new HTML(
        "This GData-enabled application was built using the GData "
            + "API Library for GWT, "
            + "<a href=\"http://code.google.com/p/gwt-gdata/\">"
            + "http://code.google.com/p/gwt-gdata/</a>. "
            + "The drop down list below allows you to select a scenario that "
            + "demonstrates a particular capability of the GData support."));

    outerPanel.setWidget(1, 0, innerPanel);

    DecoratorPanel decorator = new DecoratorPanel();
    decorator.add(outerPanel);

    RootPanel.get("hm-map").add(decorator);

    horizPanel.add(new Label("Select Demo: "));
    horizPanel.add(list);
    showInfo();
  }

  public void onHistoryChanged(String token) {
    // Find the MapsDemoInfo associated with the history context. If one is
    // found, show it (It may not be found, for example, when the user mis-
    // types a URL, or on startup, when the first context will be "").
    GDataDemoInfo info = list.find(token);
    if (info == null) {
      showInfo();
      Window.alert("Couldn't find " + token);
      return;
    }
    show(info, false);
  }
  
  public void onModuleLoad() {
    GData.loadGDataApi(null, new Runnable() {
      public void run() {
        onGDataLoad();
      }
    });
  }
  
  public void show(GDataDemoInfo info, boolean affectHistory) {
    // Don't bother re-displaying the existing GDataDemo. This can be an issue
    // in practice, because when the history context is set, our
    // onHistoryChanged() handler will attempt to show the currently-visible
    // GDataDemo.
    if (info == curInfo) {
      return;
    }
    curInfo = info;

    // Remove the old GDataDemo from the display area.
    if (curGDataDemo != null) {
      innerPanel.remove(curGDataDemo);
    }

    // Get the new GDataDemo instance, and display its description in the
    // MapsDemo list.
    curGDataDemo = info.getInstance();
    list.setGDataDemoSelection(info.getName());

    // If affectHistory is set, create a new item on the history stack. This
    // will ultimately result in onHistoryChanged() being called. It will call
    // show() again, but nothing will happen because it will request the exact
    // same GDataDemo we're already showing.
    if (affectHistory) {
      History.newItem(info.getName());
    }

    // Display the new GDataDemo and update the description panel.
    innerPanel.add(curGDataDemo);
    description.setHTML(info.getDescription());
    // outerPanel.setWidget(2, 0, info.getDescriptionHTML());

    outerPanel.setWidget(
        3,
        0,
        new HTML(
            "The concepts behind these demos"
                + " are explained in the "
                + "<a href=\"http://www.google.com/apis/gdata/documentation/index.html\">"
                + "Google GData API Concepts</a> document."));

    // info is an inner class of the class we want to display. Strip off the
    // generated anonymous class name.
    String strippedClassName = info.getClass().getName();
    int lastIndex = strippedClassName.lastIndexOf('$');
    if (lastIndex > 0) {
      strippedClassName = strippedClassName.substring(0, lastIndex);
    }

    outerPanel.setWidget(4, 0, new HTML("<h5> See source in "
        + strippedClassName + "</h5><h5>GData API version: " + GData.getVersion()
        + "</h5>"));

    curGDataDemo.onShow();
  }

  /**
   * Adds all GDataDemos to the list. Note that this does not create actual
   * instances of all GDataDemos yet (they are created on-demand). This can make
   * a significant difference in startup time.
   */
  protected void loadGDataDemos() {
    list.addGDataDemo(AnalyticsYourAccountsDemo.init());
    list.addGDataDemo(AnalyticsTopPagesDemo.init());
    list.addGDataDemo(AnalyticsBounceRateDemo.init());
    list.addGDataDemo(AnalyticsLanguagesDemo.init());
    list.addGDataDemo(AnalyticsTopSearchesDemo.init());
    list.addGDataDemo(AnalyticsVisitsDemo.init());
  }
  
  private void showInfo() {
    show(list.find("Analytics - Your Accounts"), false);
  }
}