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

import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Blogger service.
 */
public class BloggerService extends GoogleService {

  /**
   * Blogger service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructor.
   * 
   * @param applicationName Name of application (used for tracking).
   */
  public static native BloggerService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.blogger.BloggerService(
      applicationName
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.blogger.BloggerService[name];
  }-*/;

  protected BloggerService() { }

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogCommentFeed getBlogCommentFeed(BlogCommentQuery query, AsyncCallback<BlogCommentFeed> callback) /*-{
    return this.getBlogCommentFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogCommentFeed getBlogCommentFeed(String uri, AsyncCallback<BlogCommentFeed> callback) /*-{
    return this.getBlogCommentFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a blog entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native BlogEntry getBlogEntry(String uri, AsyncCallback<BlogEntry> callback) /*-{
    return this.getBlogEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogFeed getBlogFeed(BlogQuery query, AsyncCallback<BlogFeed> callback) /*-{
    return this.getBlogFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogFeed getBlogFeed(String uri, AsyncCallback<BlogFeed> callback) /*-{
    return this.getBlogFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogPostFeed getBlogPostFeed(BlogPostQuery query, AsyncCallback<BlogPostFeed> callback) /*-{
    return this.getBlogPostFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native BlogPostFeed getBlogPostFeed(String uri, AsyncCallback<BlogPostFeed> callback) /*-{
    return this.getBlogPostFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a comment entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native CommentEntry getCommentEntry(String uri, AsyncCallback<CommentEntry> callback) /*-{
    return this.getCommentEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PostCommentFeed getPostCommentFeed(PostCommentQuery query, AsyncCallback<PostCommentFeed> callback) /*-{
    return this.getPostCommentFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param uriOrQuery URI of feed or query.
   * @param continuation Function to call with feed retrieved. For example: function(feedRoot) { var feed feedRoot.feed; var entries feed.entry; }; .
   * 
   * @return Retrieved feed.
   */
  public final native PostCommentFeed getPostCommentFeed(String uri, AsyncCallback<PostCommentFeed> callback) /*-{
    return this.getPostCommentFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a post entry.
   * 
   * @param uri URI of entry.
   * @param continuation Function to call with entry retrieved. For example: function(entryRoot) { var entry entryRoot.entry; }; .
   * 
   * @return Retrieved entry.
   */
  public final native PostEntry getPostEntry(String uri, AsyncCallback<PostEntry> callback) /*-{
    return this.getPostEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

}
