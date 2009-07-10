/*
 * Copyright 2009 Google Inc.
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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.atom.Category;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the BloggerService class.
 */
public class BloggerServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void test1BlogGet() {
    UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
    BloggerService svc = BloggerService.newInstance("test");
    svc.getBlogFeed(GDataTestScripts.Blogger.testBlogs_FeedLink,
        new AsyncCallback<BlogFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(BlogFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testBlogs_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Blogger.testBlogs_FeedId) ||
              !result.getEntries()[0].getEntryPostLink().getHref().equals(GDataTestScripts.Blogger.testPost_FeedLink)) {
              fail("Get Failed");
            }
            GDataTestScripts.Blogger.testBlogs_Feed = result;
            GDataTestScripts.Blogger.testBlog_Entry_Original = GDataTestScripts.Blogger.testBlogs_Feed.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(4000);
  }
  public void test2PostGet() {
    BlogPostQuery query = BlogPostQuery.newInstance(GDataTestScripts.Blogger.testPost_FeedLink);
    query.setMaxResults(25);
    BloggerService svc = BloggerService.newInstance("test");
    svc.getBlogPostFeed(query, new AsyncCallback<BlogPostFeed>() {
      public void onFailure(Throwable caught) {
        fail("Get Failed: " + caught.getMessage());
      }
      public void onSuccess(BlogPostFeed result) {
        if (result.getEntries().length != 1) {
          fail("Get Failed");
        }
        GDataTestScripts.Blogger.testPost_Feed = result;
        GDataTestScripts.Blogger.testPost_Entry_Original = result.getEntries()[0];
        if (!GDataTestScripts.Blogger.testPost_Entry_Original.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Title_Original) ||
            !GDataTestScripts.Blogger.testPost_Entry_Original.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Url_Original) ||
            !GDataTestScripts.Blogger.testPost_Entry_Original.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Contents_Original)) {
          fail("Get Failed");
        }
        finishTest();
      }
    });
    this.delayTestFinish(4000);
  }
  public void test3PostUpdate() {
    GDataTestScripts.Blogger.testPost_Entry_Original.getTitle().setText(GDataTestScripts.Blogger.testPost_Title_Updated);
    GDataTestScripts.Blogger.testPost_Entry_Original.getContent().setText(GDataTestScripts.Blogger.testPost_Contents_Updated);
    GDataTestScripts.Blogger.testPost_Entry_Original.updateEntry(new AsyncCallback<PostEntry>() {
      public void onFailure(Throwable caught) {
        fail("Updated Failed: " + caught.getMessage());
      }
      public void onSuccess(PostEntry result) {
        if (!GDataTestScripts.Blogger.testPost_Entry_Original.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Title_Updated) ||
            !GDataTestScripts.Blogger.testPost_Entry_Original.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Url_Original) ||
            !GDataTestScripts.Blogger.testPost_Entry_Original.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Contents_Updated)) {
          fail("Get Failed");
        }
        GDataTestScripts.Blogger.testPost_Entry_Original.getTitle().setText(GDataTestScripts.Blogger.testPost_Title_Original);
        GDataTestScripts.Blogger.testPost_Entry_Original.getContent().setText(GDataTestScripts.Blogger.testPost_Contents_Original);
        GDataTestScripts.Blogger.testPost_Entry_Original.updateEntry(new AsyncCallback<PostEntry>() {
          public void onFailure(Throwable caught) {
            fail("Revert Failed: " + caught.getMessage());
          }
          public void onSuccess(PostEntry result) {
            if (!GDataTestScripts.Blogger.testPost_Entry_Original.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Title_Original) ||
                !GDataTestScripts.Blogger.testPost_Entry_Original.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Url_Original) ||
                !GDataTestScripts.Blogger.testPost_Entry_Original.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Contents_Original)) {
              fail("Revert Failed");
            }
            finishTest();
          }
        });
      }
    });
    this.delayTestFinish(5000);
  }
  public void test4PostCreate() {
    PostEntry post = PostEntry.newInstance();
    post.setTitle(Text.newInstance());
    post.getTitle().setText(GDataTestScripts.Blogger.testPost_Title_Created);
    post.setContent(Text.newInstance());
    post.getContent().setText(GDataTestScripts.Blogger.testPost_Contents_Created);
    Category cat = Category.newInstance();
    cat.setScheme(GDataTestScripts.Blogger.testPost_CategoryScheme_Created);
    cat.setTerm(GDataTestScripts.Blogger.testPost_CategoryTerm_Created);
    post.setCategories(new Category[]{ cat });
    GDataTestScripts.Blogger.testPost_Feed.insertEntry(post, new AsyncCallback<PostEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(PostEntry result) {
        if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Title_Created) ||
            !result.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Contents_Created) ||
            result.getCategories().length != 1 ||
            !result.getCategories()[0].getScheme().equals(GDataTestScripts.Blogger.testPost_CategoryScheme_Created) ||
            !result.getCategories()[0].getTerm().equals(GDataTestScripts.Blogger.testPost_CategoryTerm_Created)) {
          fail("Create Failed");
        }
        GDataTestScripts.Blogger.testPost_Entry_Created = result;
        finishTest();
      }
    });
    this.delayTestFinish(5000);
  }
  public void test5PostDelete() {
    GDataTestScripts.Blogger.testPost_Entry_Created.deleteEntry(new AsyncCallback<PostEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(PostEntry result) {
        BlogPostQuery query = BlogPostQuery.newInstance(GDataTestScripts.Blogger.testPost_FeedLink);
        query.setMaxResults(25);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getBlogPostFeed(query, new AsyncCallback<BlogPostFeed>() {
          public void onFailure(Throwable caught) {
            fail("Delete Failed: " + caught.getMessage());
          }
          public void onSuccess(BlogPostFeed result) {
            if (result.getEntries().length != 1) {
              fail("Delete Failed");
            }
            finishTest();
          }
        });
      }
    });
    // this.delayTestFinish(20000);
  }
  public void testConstants() {
    assertNotNull("SERVICE_NAME", BloggerService.SERVICE_NAME);
  }
  public void testConstructors() {
    assertNotNull("newInstance()", BloggerService.newInstance("myValue"));
  }
}
