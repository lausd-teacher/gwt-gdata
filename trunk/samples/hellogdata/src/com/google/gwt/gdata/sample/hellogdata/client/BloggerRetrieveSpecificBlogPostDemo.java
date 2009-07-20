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
import com.google.gwt.gdata.client.blogger.BlogEntry;
import com.google.gwt.gdata.client.blogger.BlogFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to retrieve a specific blog post entry.
 */
public class BloggerRetrieveSpecificBlogPostDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new BloggerRetrieveSpecificBlogPostDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample returns a specific blog post by querying the " +
          "entry's URI with getBlogPostFeed().</p>\n";
      }

      @Override
      public String getName() {
        return "Blogger - Retrieve a specific blog post";
      }
    };
  }

  private BloggerService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.blogger.com/feeds/";

  public BloggerRetrieveSpecificBlogPostDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_RetrieveSpecificBlogPostDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      Button loginButton = new Button();
      loginButton.setText("Login to Blogger to start demo...");
      loginButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          User.login(scope);
        }
      });
      mainPanel.setWidget(0, 0, loginButton);
    }
  }
  public void showData(PostEntry entry) {
    mainPanel.clear();
    mainPanel.insertRow(0);
    mainPanel.addCell(0);
    mainPanel.setWidget(0, 0, new HTML("<h2>" + entry.getTitle().getText() + "</h2>"));
    mainPanel.insertRow(1);
    mainPanel.addCell(1);
    mainPanel.setWidget(1, 0, new HTML("<i>By " + entry.getAuthors()[0].getName().getValue() + " on " + entry.getPublished().getValue().getDate().toString() + "</i>"));
    mainPanel.insertRow(2);
    mainPanel.addCell(2);
    mainPanel.setWidget(2, 0, new HTML(entry.getContent().getText()));
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
    showStatus("Loading Blogger accounts feed...", false);
    service.getBlogFeed("http://www.blogger.com/feeds/default/blogs", new AsyncCallback<BlogFeed>() {
      public void onFailure(Throwable caught) {
        String message = caught.getMessage();
        if (message.contains("No Blogger account was found for the currently logged-in user")) {
          showStatus("No Blogger account was found for the currently logged-in user.", true);
        } else {
          showStatus("An error occurred while retrieving the Blogger Blog feed, see details below:\n" + message, true);
        }
      }
      public void onSuccess(BlogFeed result) {
        BlogEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no Blogger accounts.", false);
        } else {
          BlogEntry blog = entries[0];
          String postsFeedUri = blog.getEntryPostLink().getHref();
          showStatus("Loading Blogger blog posts feed...", false);
          service.getBlogPostFeed(postsFeedUri, new AsyncCallback<BlogPostFeed>() {
          public void onFailure(Throwable caught) {
            showStatus("An error occurred while retrieving the Blogger Posts feed, see details below:\n" + caught.getMessage(), true);
          }
          public void onSuccess(BlogPostFeed result) {
            PostEntry[] entries = result.getEntries();
            if (entries.length == 0) {
              showStatus("No post entries found for the current blog.", false);
            } else {
              String postEntryUri = entries[0].getSelfLink().getHref();
              showStatus("Loading Blogger blog post entry...", false);
              service.getPostEntry(postEntryUri, new AsyncCallback<PostEntry>() {
                public void onFailure(Throwable caught) {
                  showStatus("An error occurred while retrieving the Blogger Post entry, see details below:\n" + caught.getMessage(), true);
                }
                public void onSuccess(PostEntry result) {
                  showData(result);
                }
              });
            }
          }
        });
        }
      }
    });
  }
}