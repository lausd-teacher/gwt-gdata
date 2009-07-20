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
import com.google.gwt.gdata.client.atom.Category;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.blogger.BlogEntry;
import com.google.gwt.gdata.client.blogger.BlogFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to update a blog post.
 */
public class BloggerUpdateBlogPostDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new BloggerUpdateBlogPostDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample updates the first blog post it finds that begins with the " +
          "prefix 'GWT-Blogger-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Blogger - Update a blog post";
      }
    };
  }

  private BloggerService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.blogger.com/feeds/";

  public BloggerUpdateBlogPostDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_UpdateBlogPostDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Update a blog post");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
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
            PostEntry postEntry = null;
            for (PostEntry entry : result.getEntries()) {
              String title = entry.getTitle().getText();
              if (title.startsWith("GWT-Blogger-Client")) {
                postEntry = entry;
                break;
              }
            }
            if (postEntry == null) {
              showStatus("Did not find a post entry whose title starts with the prefix 'GWT-Blogger-Client'.", false);
            } else {
              postEntry.getSelf(new AsyncCallback<PostEntry>() {
                public void onFailure(Throwable caught) {
                  showStatus("An error occurred while retrieving a Blogger Post entry, see details below:\n" + caught.getMessage(), true);
                }
                public void onSuccess(PostEntry result) {
                  updatePost(result);
                }
              });
            }
          }
        });
        }
      }
    });
  }
  public void updatePost(PostEntry postEntry) {
    showStatus("Updating blog post entry...", false);
    postEntry.getTitle().setText("GWT-Blogger-Client: updated title");
    postEntry.setContent(Text.newInstance());
    postEntry.getContent().setText("My updated post");
    Category[] categories = postEntry.getCategories();
    for (Category category : categories) {
      if (category.getTerm().equals("Label1")) {
        category.setTerm("Label1-updated");
      }
    }
    postEntry.updateEntry(new AsyncCallback<PostEntry>() {
      public void onFailure(Throwable caught) {
        showStatus("An error occurred while updating a blog post, see details below:\n" + caught.getMessage(), true);
      }
      public void onSuccess(PostEntry result) {
        showStatus("Updated a blog entry titled '" + result.getTitle().getText() + "'.", false);
      }
    });
  }
}