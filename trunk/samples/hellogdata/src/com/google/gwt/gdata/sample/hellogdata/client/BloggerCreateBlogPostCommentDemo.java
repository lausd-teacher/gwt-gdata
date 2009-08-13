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
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.blogger.BlogEntry;
import com.google.gwt.gdata.client.blogger.BlogFeed;
import com.google.gwt.gdata.client.blogger.BlogFeedCallback;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeedCallback;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.CommentEntry;
import com.google.gwt.gdata.client.blogger.CommentEntryCallback;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to create a blog post comment.
 */
public class BloggerCreateBlogPostCommentDemo extends GDataDemo {

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
        return new BloggerCreateBlogPostCommentDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample adds a new comment to a blog post. The comment's contents " +
          "contain the text 'GWT-Blogger-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Blogger - Create a comment";
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
  public BloggerCreateBlogPostCommentDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_CreateBlogPostCommentDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Create a blog comment");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          getBlogs();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
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
          getPosts(postsFeedUri);
        }
      }
    });
  }
  
  private void getPosts(String postsFeedUri) {
    showStatus("Loading posts feed...", false);
    service.getBlogPostFeed(postsFeedUri, new BlogPostFeedCallback() {
    public void onFailure(Throwable caught) {
      showStatus("An error occurred while retrieving the Blogger Posts feed, see details below:\n" + caught.getMessage(), true);
    }
    public void onSuccess(BlogPostFeed result) {
      PostEntry targetPost = null;
      // get the first public post
      for (PostEntry post : result.getEntries()) {
        if (post.getRepliesLink() != null) {
          targetPost = post;
          break;
        }
      }
      if (targetPost == null) {
        showStatus("The target blog contains no public posts.", false);
      } else {
        String postEntryId = targetPost.getId().getValue();
        JsArrayString match = regExpMatch("blog-(\\d+)\\.post-(\\d+)", postEntryId);
        if (match.length() > 1) {
          insertComment(match.get(1), match.get(2));
        } else {
          showStatus("Error parsing the blog post id.", true);
        }
      }
    }
    });
  }
  
  private void insertComment(String blogId, String postId) {
    showStatus("Creating blog comment entry...", false);
    CommentEntry comment = CommentEntry.newInstance();
    comment.setContent(Text.newInstance());
    comment.getContent().setText("GWT-Blogger-Client - Great post!");
    String commentsFeedUri = "http://www.blogger.com/feeds/" + blogId + "/" + postId + "/comments/default";
    service.insertCommentEntry(commentsFeedUri, comment, new CommentEntryCallback() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while creating the Blogger post comment, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(CommentEntry result) {
        showStatus("Created a comment.", false);
      }
    });
  }
  
  private native JsArrayString regExpMatch(String regEx, String target) /*-{
    var re = new RegExp();
    return re.compile(regEx).exec(target);
  }-*/;

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