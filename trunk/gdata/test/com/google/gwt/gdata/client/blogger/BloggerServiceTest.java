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
import com.google.gwt.gdata.client.impl.CallErrorException;

/**
 * Tests for the BloggerService class.
 */
public class BloggerServiceTest extends BloggerTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("SERVICE_NAME", BloggerService.SERVICE_NAME);
        finishGDataTest();
      }
    }, 10000);
  }
  
  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", BloggerService.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }
  
  public void testCreateAndDeletePost() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BlogPostQuery query = BlogPostQuery.newInstance(GDataTestScripts.Blogger.testPosts_Feed_Link);
        query.setMaxResults(25);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getBlogPostFeed(query, new BlogPostFeedCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(BlogPostFeed result) {
            PostEntry post = PostEntry.newInstance();
            post.setTitle(Text.newInstance());
            post.getTitle().setText(GDataTestScripts.Blogger.testPost_Entry_Title_Created);
            post.setContent(Text.newInstance());
            post.getContent().setText(GDataTestScripts.Blogger.testPost_Entry_Contents_Created);
            Category cat = Category.newInstance();
            cat.setScheme(GDataTestScripts.Blogger.testPost_Entry_CategoryScheme_Created);
            cat.setTerm(GDataTestScripts.Blogger.testPost_Entry_CategoryTerm_Created);
            post.setCategories(new Category[]{ cat });
            result.insertPostEntry(post, new PostEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Create Failed: " + caught.getMessage());
              }
              public void onSuccess(PostEntry result) {
                if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Title_Created) ||
                    !result.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Contents_Created) ||
                    result.getCategories().length != 1 ||
                    !result.getCategories()[0].getScheme().equals(GDataTestScripts.Blogger.testPost_Entry_CategoryScheme_Created) ||
                    !result.getCategories()[0].getTerm().equals(GDataTestScripts.Blogger.testPost_Entry_CategoryTerm_Created)) {
                  fail("Create Failed");
                }
                result.deleteEntry(new PostEntryCallback() {
                  public void onFailure(CallErrorException caught) {
                    fail("Delete Failed: " + caught.getMessage());
                  }
                  public void onSuccess(PostEntry result) {
                    finishGDataTest();
                  }
                });
              }
            });
          }
        });
      }
    }, 20000);
  }
  
  public void testGetBlog() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getBlogEntry(GDataTestScripts.Blogger.testBlog_Entry_Link,
            new BlogEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(BlogEntry result) {
                if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testBlog_Entry_Title)) {
                  fail("Get Failed");
                }
                finishGDataTest();
              }
        });
      }
    }, 14000);
  }
  
  public void testGetBlogs() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getBlogFeed(GDataTestScripts.Blogger.testBlogs_Feed_Link,
            new BlogFeedCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(BlogFeed result) {
                if (result.getEntries().length == 0) {
                  fail("Get Failed");
                }
                if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testBlogs_Feed_Title)) {
                  fail("Get Failed");
                }
                finishGDataTest();
              }
        });
      }
    }, 14000);
  }
  
  public void testGetPost() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getPostEntry(GDataTestScripts.Blogger.testPost_Entry_Link, new PostEntryCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PostEntry result) {
            if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Title) ||
                !result.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Entry_Url) ||
                !result.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Contents)) {
              fail("Get Failed");
            }
            finishGDataTest();
          }
        });
      }
    }, 14000);
  }
  
  public void testGetPosts() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BlogPostQuery query = BlogPostQuery.newInstance(GDataTestScripts.Blogger.testPosts_Feed_Link);
        query.setMaxResults(25);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getBlogPostFeed(query, new BlogPostFeedCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(BlogPostFeed result) {
            if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPosts_Feed_Title)) {
              fail("Get Failed");
            }
            finishGDataTest();
          }
        });
      }
    }, 14000);
  }
  
  public void testUpdatePost() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.Blogger.testCookie_Name, GDataTestScripts.Blogger.testCookie_Value);
        BloggerService svc = BloggerService.newInstance("test");
        svc.getPostEntry(GDataTestScripts.Blogger.testPost_Entry_Link, new PostEntryCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(PostEntry result) {
            result.getTitle().setText(GDataTestScripts.Blogger.testPost_Entry_Title_Updated);
            result.getContent().setText(GDataTestScripts.Blogger.testPost_Entry_Contents_Updated);
            result.updateEntry(new PostEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Update Failed: " + caught.getMessage());
              }
              public void onSuccess(PostEntry result) {
                if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Title_Updated) ||
                    !result.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Entry_Url) ||
                    !result.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Contents_Updated)) {
                  fail("Update Failed");
                }
                result.getTitle().setText(GDataTestScripts.Blogger.testPost_Entry_Title);
                result.getContent().setText(GDataTestScripts.Blogger.testPost_Entry_Contents);
                result.updateEntry(new PostEntryCallback() {
                  public void onFailure(CallErrorException caught) {
                    fail("Revert Failed: " + caught.getMessage());
                  }
                  public void onSuccess(PostEntry result) {
                    if (!result.getTitle().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Title) ||
                        !result.getHtmlLink().getHref().equals(GDataTestScripts.Blogger.testPost_Entry_Url) ||
                        !result.getContent().getText().equals(GDataTestScripts.Blogger.testPost_Entry_Contents)) {
                      fail("Revert Failed");
                    }
                    finishGDataTest();
                  }
                });
              }
            });
          }
        });
      }
    }, 20000);
  }
}
