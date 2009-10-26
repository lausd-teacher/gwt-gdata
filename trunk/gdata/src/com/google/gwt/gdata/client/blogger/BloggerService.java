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

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.GoogleService;

/**
 * Blogger service.
 */
public class BloggerService extends GoogleService {

  /**
   * Blogger service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a blogger service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A BloggerService object.
   */
  public static native BloggerService newInstance(String applicationName) /*-{
    return new $wnd.google.gdata.blogger.BloggerService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.blogger.BloggerService[name];
  }-*/;

  protected BloggerService() { }

  /**
   * Deletes a blog entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteBlogEntry(String uri, BlogEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a blog entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteBlogEntry(String uri, BlogEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteCommentEntry(String uri,
      CommentEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteCommentEntry(String uri,
      CommentEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a post entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deletePostEntry(String uri, PostEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a post entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deletePostEntry(String uri, PostEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogCommentFeed(BlogCommentQuery query,
      BlogCommentFeedCallback callback) {
    this.getFeed(query, callback, null, "getBlogCommentFeed");
  }

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogCommentFeed(BlogCommentQuery query,
      BlogCommentFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getBlogCommentFeed");
  }

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogCommentFeed(String uri,
      BlogCommentFeedCallback callback) {
    this.getFeed(uri, callback, null, "getBlogCommentFeed");
  }

  /**
   * Retrieves the feed of a blog's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogCommentFeed(String uri,
      BlogCommentFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getBlogCommentFeed");
  }

  /**
   * Retrieves a blog entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogEntry(String uri, BlogEntryCallback callback) {
    this.getEntry(uri, callback, null, "getBlogEntry");
  }

  /**
   * Retrieves a blog entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogEntry(String uri, BlogEntryCallback callback,
      GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getBlogEntry");
  }

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogFeed(BlogQuery query, BlogFeedCallback callback) {
    this.getFeed(query, callback, null, "getBlogFeed");
  }

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogFeed(BlogQuery query, BlogFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getBlogFeed");
  }

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogFeed(String uri, BlogFeedCallback callback) {
    this.getFeed(uri, callback, null, "getBlogFeed");
  }

  /**
   * Retrieves the feed of a user's blogs.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogFeed(String uri, BlogFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getBlogFeed");
  }

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogPostFeed(BlogPostQuery query,
      BlogPostFeedCallback callback) {
    this.getFeed(query, callback, null, "getBlogPostFeed");
  }

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogPostFeed(BlogPostQuery query,
      BlogPostFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getBlogPostFeed");
  }

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getBlogPostFeed(String uri, BlogPostFeedCallback callback) {
    this.getFeed(uri, callback, null, "getBlogPostFeed");
  }

  /**
   * Retrieves the feed of a blog's posts.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getBlogPostFeed(String uri, BlogPostFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getBlogPostFeed");
  }
  
  /**
   * Retrieves a comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getCommentEntry(String uri,
      CommentEntryCallback callback) {
    this.getEntry(uri, callback, null, "getCommentEntry");
  }
  
  /**
   * Retrieves a comment entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getCommentEntry(String uri,
      CommentEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getCommentEntry");
  }

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPostCommentFeed(PostCommentQuery query,
      PostCommentFeedCallback callback) {
    this.getFeed(query, callback, null, "getPostCommentFeed");
  }

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPostCommentFeed(PostCommentQuery query,
      PostCommentFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getPostCommentFeed");
  }

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPostCommentFeed(String uri,
      PostCommentFeedCallback callback) {
    this.getFeed(uri, callback, null, "getPostCommentFeed");
  }

  /**
   * Retrieves the feed of a blog post's comments.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPostCommentFeed(String uri,
      PostCommentFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getPostCommentFeed");
  }

  /**
   * Retrieves a post entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getPostEntry(String uri, PostEntryCallback callback) {
    this.getEntry(uri, callback, null, "getPostEntry");
  }

  /**
   * Retrieves a post entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getPostEntry(String uri, PostEntryCallback callback,
      GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getPostEntry");
  }

  /**
   * Inserts a new blog entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertBlogEntry(String uri, BlogEntry entry,
      BlogEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new comment entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertCommentEntry(String uri, CommentEntry entry,
      CommentEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  /**
   * Inserts a new post entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertPostEntry(String uri, PostEntry entry,
      PostEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }
  
  /**
   * Updates a blog entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateBlogEntry(String uri, BlogEntry entry,
      BlogEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a blog entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateBlogEntry(String uri, BlogEntry entry,
      BlogEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

  /**
   * Updates a comment entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateCommentEntry(String uri, CommentEntry entry,
      CommentEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a comment entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateCommentEntry(String uri, CommentEntry entry,
      CommentEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }
  
  /**
   * Updates a post entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updatePostEntry(String uri, PostEntry entry,
      PostEntryCallback callback) {
    this.updateEntry(uri, entry, callback, null);
  }
  
  /**
   * Updates a post entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updatePostEntry(String uri, PostEntry entry,
      PostEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

}