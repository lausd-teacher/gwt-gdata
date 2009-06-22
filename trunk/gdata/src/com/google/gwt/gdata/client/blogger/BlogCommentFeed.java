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

/**
 * Describes a feed of an entire blog's comments.
 */
public class BlogCommentFeed extends com.google.gwt.gdata.client.Feed<CommentEntry> {

  /**
   * Constructs a blog comment feed using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, entries, generator, id, itemsPerPage, links, startIndex, subtitle, title, totalResults, and updated.
   */
  public static native BlogCommentFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.blogger.BlogCommentFeed(
      params
    );
  }-*/;

  protected BlogCommentFeed() { }

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed or undefined for none.
   */
  public final native BloggerLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed or undefined for none.
   */
  public final native BloggerLink getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

}
