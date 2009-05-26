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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.GoogleService;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class BloggerService extends GoogleService {

  /**
   * Blogger service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.blogger.BloggerService;
  }-*/;

  /**
   * Constructor.
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
   * Retrieves the feed of a blogs comments.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogCommentFeed getBlogCommentFeed(BlogCommentQuery query, AsyncCallback<BlogCommentFeed> callback) /*-{
    return this.getBlogCommentFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blogs comments.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogCommentFeed getBlogCommentFeed(String uri, AsyncCallback<BlogCommentFeed> callback) /*-{
    return this.getBlogCommentFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a blog entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogEntry getBlogEntry(String uri, AsyncCallback<BlogEntry> callback) /*-{
    return this.getBlogEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a users blogs.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogFeed getBlogFeed(BlogQuery query, AsyncCallback<BlogFeed> callback) /*-{
    return this.getBlogFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a users blogs.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogFeed getBlogFeed(String uri, AsyncCallback<BlogFeed> callback) /*-{
    return this.getBlogFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blogs posts.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogPostFeed getBlogPostFeed(BlogPostQuery query, AsyncCallback<BlogPostFeed> callback) /*-{
    return this.getBlogPostFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blogs posts.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native BlogPostFeed getBlogPostFeed(String uri, AsyncCallback<BlogPostFeed> callback) /*-{
    return this.getBlogPostFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a comment entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native CommentEntry getCommentEntry(String uri, AsyncCallback<CommentEntry> callback) /*-{
    return this.getCommentEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog posts comments.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PostCommentFeed getPostCommentFeed(PostCommentQuery query, AsyncCallback<PostCommentFeed> callback) /*-{
    return this.getPostCommentFeed(
      query,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves the feed of a blog posts comments.
   * 
   * @param uriOrQuery
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PostCommentFeed getPostCommentFeed(String uri, AsyncCallback<PostCommentFeed> callback) /*-{
    return this.getPostCommentFeed(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.feed); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

  /**
   * Retrieves a post entry.
   * 
   * @param uri
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native PostEntry getPostEntry(String uri, AsyncCallback<PostEntry> callback) /*-{
    return this.getPostEntry(
      uri,
      function(result) { @com.google.gwt.gdata.client.impl.Utils::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/Object;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.Utils::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Ljava/lang/String;)(callback, error); }
    );
  }-*/;

}
