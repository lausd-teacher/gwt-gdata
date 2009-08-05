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

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new AccountsAuthSubAuthenticationDemo();
      }

      @Override
      public String getDescription() {
        return "<p>The following example demonstrates how to use AuthSub to authenticate " +
          "and identify authentication status for the supported GData systems</p>\n";
      }

      @Override
      public String getName() {
        return "Accounts - Authsub Authentication";
      }
    };
  }

  private FlexTable mainPanel;

  public AccountsAuthSubAuthenticationDemo() {
    mainPanel = new FlexTable();
    mainPanel.setCellPadding(4);
    mainPanel.setCellSpacing(0);
    initWidget(mainPanel);
    startDemo();
  }

  public void refreshDemo() {
    mainPanel.clear();
    startDemo();
  }
  
  public void startDemo() {
    String[][] systems = new String[][] {
        new String[] { "Google Analytics", "https://www.google.com/analytics/feeds/", "http://code.google.com/apis/gdata/images/service_icons/analytics.gif", "http://code.google.com/apis/analytics/" },
        new String[] { "Google Base", "http://www.google.com/base/feeds/", "http://code.google.com/apis/gdata/images/service_icons/base.gif", "http://code.google.com/apis/base/" },
        new String[] { "Google Blogger", "http://www.blogger.com/feeds/", "http://code.google.com/apis/gdata/images/service_icons/blogger.gif", "http://code.google.com/apis/blogger/" },
        new String[] { "Google Calendar", "http://www.google.com/calendar/feeds/", "http://code.google.com/apis/gdata/images/service_icons/calendar.gif", "http://code.google.com/apis/calendar/" },
        new String[] { "Google Contacts", "http://www.google.com/m8/feeds/", "http://code.google.com/apis/gdata/images/service_icons/contacts.gif", "http://code.google.com/apis/contacts/" },
        new String[] { "Google Finance", "http://finance.google.com/finance/feeds/", "http://code.google.com/apis/gdata/images/service_icons/finance.gif", "http://code.google.com/apis/finance/" },
        new String[] { "Google Maps", "http://maps.google.com/maps/feeds/", "http://code.google.com/apis/gdata/images/service_icons/maps.gif", "http://code.google.com/apis/maps/documentation/mapsdata/" }
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