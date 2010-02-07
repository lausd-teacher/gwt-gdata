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

import com.google.gwt.gdata.client.Feed;

/**
 * Describes a feed of a blog's posts.
 */
public class BlogPostFeed
    extends Feed<BlogPostFeed, PostEntry> {

  /**
   * Constructs a blog post feed.
   * @return A BlogPostFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native BlogPostFeed newInstance() /*-{
    return new $wnd.google.gdata.blogger.BlogPostFeed();
  }-*/;

  protected BlogPostFeed() { }

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native BloggerLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed.
   */
  public final native BloggerLink getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

}