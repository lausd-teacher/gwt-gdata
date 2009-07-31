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
import com.google.gwt.gdata.client.blogger.BlogEntry;
import com.google.gwt.gdata.client.blogger.BlogFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BlogPostQuery;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

import java.util.Date;

/**
 * The following example demonstrates how to query for blog posts.
 */
public class BloggerQueryBlogPostsDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new BloggerQueryBlogPostsDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample queries for blog posts that were published within " +
          "the last month.</p>\n";
      }

      @Override
      public String getName() {
        return "Blogger - Query for blog posts";
      }
    };
  }

  private BloggerService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.blogger.com/feeds/";

  public BloggerQueryBlogPostsDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_QueryBlogPostsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      startDemo();
    } else {
      showStatus("You are not logged on to Blogger.", true);
    }
  }
  public void showData(PostEntry[] entries) {
    mainPanel.clear();
    String[] labels = new String[] { "Title", "URL", "Published" };
    mainPanel.insertRow(0);
    for (int i = 0; i < labels.length; i++) {
      mainPanel.addCell(0);
      mainPanel.setWidget(0, i, new Label(labels[i]));
      mainPanel.getFlexCellFormatter().setStyleName(0, i, "hm-tableheader");
    }
    for (int i = 0; i < entries.length; i++) {
      PostEntry entry = entries[i];
      int row = mainPanel.insertRow(i + 1);
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 0, new Label(entry.getTitle().getText()));
      mainPanel.addCell(row);
      if (entry.getHtmlLink() == null) {
        mainPanel.setWidget(row, 1, new Label("Not available"));
      } else {
        String link = entry.getHtmlLink().getHref();
        mainPanel.setWidget(row, 1, new HTML("<a href=\"" + link + "\" target=\"_blank\">" + link +  "</a>"));
      }
      mainPanel.addCell(row);
      mainPanel.setWidget(row, 2, new Label(entry.getPublished().getValue().getDate().toString()));
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
      @SuppressWarnings("deprecation")
      public void onSuccess(BlogFeed result) {
        BlogEntry[] entries = result.getEntries();
        if (entries.length == 0) {
          showStatus("You have no Blogger accounts.", false);
        } else {
          BlogEntry blog = entries[0];
          String postsFeedUri = blog.getEntryPostLink().getHref();
          final BlogPostQuery query = BlogPostQuery.newInstance(postsFeedUri);
          Date minDate = new Date();
          minDate.setMonth(minDate.getMonth() - 1);
          query.setPublishedMin(DateTime.newInstance(minDate));
          query.setPublishedMax(DateTime.newInstance(new Date()));
          showStatus("Querying Blogger for blog posts...", false);
          service.getBlogPostFeed(query, new AsyncCallback<BlogPostFeed>() {
          public void onFailure(Throwable caught) {
            showStatus("An error occurred while querying Blogger for Posts, see details below:\n" + caught.getMessage(), true);
          }
          public void onSuccess(BlogPostFeed result) {
            showData(result.getEntries());
          }
        });
        }
      }
    });
  }
}