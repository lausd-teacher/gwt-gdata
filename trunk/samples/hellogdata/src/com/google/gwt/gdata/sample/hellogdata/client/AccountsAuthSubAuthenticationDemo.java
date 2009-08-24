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
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to use AuthSub to authenticate and
 * identify authentication status for the supported GData systems.
 */
public class AccountsAuthSubAuthenticationDemo extends GDataDemo {

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
        return new AccountsAuthSubAuthenticationDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample demonstrates how to use AuthSub to " +
            "login, logout and retrieve the authentication status for the " +
            "current user across the supported GData systems.</p>";
      }

      @Override
      public String getName() {
        return "Accounts - Authsub Authentication";
      }
    };
  }

  private FlexTable mainPanel;

  /**
   * Create the main content panel for this demo and call
   * showAuthSubStatus to display the authentication status
   * for each GData system.
   */
  public AccountsAuthSubAuthenticationDemo() {
    mainPanel = new FlexTable();
    mainPanel.setCellPadding(4);
    mainPanel.setCellSpacing(0);
    initWidget(mainPanel);
    showAuthSubStatus();
  }

  /**
   * Refreshes this demo by clearing the contents of
   * the main panel and calling showAuthSubStatus to
   * display the authentication status for each GData system.
   */
  private void refreshDemo() {
    mainPanel.clear();
    showAuthSubStatus();
  }
  
  /**
   * Display the AuthSub authentication statuses in a
   * tabular fashion with the help of a GWT FlexTable widget.
   * We initialize an array containing the name, scope, icon
   * and url for each of the supported GData systems.
   * For each system a table row is added displaying the name
   * page link and icon, in addition to the AuthSub status
   * and a hyperlink for logging in or logging, as appropriate.
   * The User class contains the getStatus method which is used
   * to retrieve the authentication status for the current user
   * and for a given system (scope).
   */
  private void showAuthSubStatus() {
    String[][] systems = new String[][] {
        new String[] { "Google Analytics",
            "https://www.google.com/analytics/feeds/",
            "gdata-analytics.png",
            "http://code.google.com/apis/analytics/" },
        new String[] { "Google Base",
            "http://www.google.com/base/feeds/",
            "gdata-base.png",
            "http://code.google.com/apis/base/" },
        new String[] { "Google Blogger",
            "http://www.blogger.com/feeds/",
            "gdata-blogger.png",
            "http://code.google.com/apis/blogger/" },
        new String[] { "Google Calendar",
            "http://www.google.com/calendar/feeds/",
            "gdata-calendar.png",
            "http://code.google.com/apis/calendar/" },
        new String[] { "Google Contacts",
            "http://www.google.com/m8/feeds/",
            "gdata-contacts.png",
            "http://code.google.com/apis/contacts/" },
        new String[] { "Google Finance",
            "http://finance.google.com/finance/feeds/",
            "gdata-finance.png",
            "http://code.google.com/apis/finance/" },
        new String[] { "Google Maps",
            "http://maps.google.com/maps/feeds/",
            "gdata-maps.png",
            "http://code.google.com/apis/maps/documentation/mapsdata/" }
    };
    for (int i = 0; i < systems.length; i++) {
      String[] sys = systems[i];
      final String scope = sys[1];
      mainPanel.insertRow(i);
      mainPanel.addCell(i);
      mainPanel.addCell(i);
      mainPanel.addCell(i);
      mainPanel.addCell(i);
      Image icon = new Image(sys[2]);
      mainPanel.setWidget(i, 0, icon);
      Label name = new HTML("<a href=\"" + sys[3] + "\">" + sys[0] + "</a>");
      mainPanel.setWidget(i, 1, name);
      Label statusLabel = new Label();
      Hyperlink actionLink = new Hyperlink();
      AuthSubStatus status = User.getStatus(scope);
      if (status == AuthSubStatus.LOGGED_IN) {
        statusLabel.setText("Logged in");
        actionLink.setText("Log out");
        actionLink.addClickListener(new ClickListener() {
          public void onClick(Widget sender) {
            User.logout(scope);
            refreshDemo();
          }
        });
      } else if (status == AuthSubStatus.LOGGED_OUT) {
        statusLabel.setText("Logged out");
        actionLink.setText("Log in");
        actionLink.addClickListener(new ClickListener() {
          public void onClick(Widget sender) {
            User.login(scope);
          }
        });
      }
      mainPanel.setWidget(i, 2, statusLabel);
      mainPanel.setWidget(i, 3, actionLink);
    }
  }
}