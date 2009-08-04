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
import com.google.gwt.gdata.client.blogger.BlogFeedCallback;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeedCallback;
import com.google.gwt.gdata.client.blogger.BloggerService;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.gdata.client.blogger.PostEntryCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * The following example demonstrates how to delete a blog post.
 */
public class BloggerDeleteBlogPostDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new BloggerDeleteBlogPostDemo();
      }

      @Override
      public String getDescription() {
        return "<p>This sample deletes the first blog post it finds that begins with " +
          "the prefix 'GWT-Blogger-Client'.</p>\n";
      }

      @Override
      public String getName() {
        return "Blogger - Delete a blog post";
      }
    };
  }

  private BloggerService service;
  private FlexTable mainPanel;
  private final String scope = "http://www.blogger.com/feeds/";

  public BloggerDeleteBlogPostDemo() {
    service = BloggerService.newInstance("HelloGData_Blogger_DeleteBlogPostDemo_v1.0");
    mainPanel = new FlexTable();
    initWidget(mainPanel);
    login();
  }
  public void login() {
    if (User.getStatus(scope) == AuthSubStatus.LOGGED_IN) {
      Button startButton = new Button("Delete a blog post");
      startButton.addClickListener(new ClickListener() {
        public void onClick(Widget sender) {
          startDemo();
        }
      });
      mainPanel.setWidget(0, 0, startButton);
    } else {
      showStatus("You are not logged on to Blogger.", true);
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
          showStatus("You have no Blogger accounts.", false);
        } else {
          BlogEntry blog = entries[0];
          String postsFeedUri = blog.getEntryPostLink().getHref();
          showStatus("Loading Blogger blog posts feed...", false);
          service.getBlogPostFeed(postsFeedUri, new BlogPostFeedCallback() {
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
              postEntry.getSelf(new PostEntryCallback() {
                public void onFailure(Throwable caught) {
                  showStatus("An error occurred while retrieving a Blogger Post entry, see details below:\n" + caught.getMessage(), true);
                }
                public void onSuccess(PostEntry result) {
                  showStatus("Deleting Blogger blog post entry...", false);
                  result.deleteEntry(new PostEntryCallback() {
                    public void onFailure(Throwable caught) {
                      showStatus("An error occurred while deleting a blog post, see details below:\n" + caught.getMessage(), true);
                    }
                    public void onSuccess(PostEntry result) {
                      showStatus("Deleted a blog post entry.", false);
                    }
                  });
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