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
import com.google.gwt.gdata.client.blogger.BlogFeedCallback;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeedCallback;
import com.google.gwt.gdata.client.blogger.BlogPostQuery;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

import java.util.Date;

/**
 * The following example demonstrates how to query for blog posts.
 */
public class BloggerQueryBlogPostsDemo extends GDataDemo {

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

  /**
   * Setup the Blogger service and create the main content panel.
   * If the user is not logged on to Blogger display a message,
   * otherwise start the demo by retrieving the user's blogs.
   */
  public BloggerQueryBlogPostsDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_QueryBlogPostsDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      getBlogs();
    } else {
      showStatus("You are not logged on to Blogger.", true);
    }
  }
  
  private void getBlogs() {
    showStatus("Loading blog feed...", false);
    service.getBlogFeed("http://www.blogger.com/feeds/default/blogs", new BlogFeedCallback() {
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
          showStatus("You have no Blogger blogs.", false);
        } else {
          BlogEntry targetBlog = entries[0];
          String postsFeedUri = targetBlog.getEntryPostLink().getHref();
          queryPosts(postsFeedUri);
        }
      }
    });
  }
  
  @SuppressWarnings("deprecation")
  private void queryPosts(String postsFeedUri) {
    final BlogPostQuery query = BlogPostQuery.newInstance(postsFeedUri);
    Date minDate = new Date();
    minDate.setMonth(minDate.getMonth() - 1);
    query.setPublishedMin(DateTime.newInstance(minDate));
    query.setPublishedMax(DateTime.newInstance(new Date()));
    showStatus("Querying Blogger for posts...", false);
    service.getBlogPostFeed(query, new BlogPostFeedCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while querying Blogger for Posts, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(BlogPostFeed result) {
        showData(result.getEntries());
      }
    });
  }

  /**
  * Displays a set of Blogger post entries in a tabular fashion with
  * the help of a GWT FlexTable widget. The data fields Title, URL 
  * and Published are displayed.
  * 
  * @param entries The Blogger post entries to display.
  */
  private void showData(PostEntry[] entries) {
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