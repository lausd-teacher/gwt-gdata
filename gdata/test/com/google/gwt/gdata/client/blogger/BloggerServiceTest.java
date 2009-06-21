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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the BloggerService class.
 */
public class BloggerServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", BloggerService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", BloggerService.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for getBlogCommentFeed(BlogCommentQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogCommentFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogFeed(BlogQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogPostFeed(BlogPostQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getBlogPostFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCommentEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getPostCommentFeed(PostCommentQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getPostCommentFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getPostEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
  }
}
