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

/**
 * Describes a blog entry in the feed of a user's blogs.
 */
public class BlogEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a blog entry.
   * @return A BlogEntry object.
   */
  public static native BlogEntry newInstance() /*-{
    return new $wnd.google.gdata.blogger.BlogEntry();
  }-*/;

  protected BlogEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(BlogEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the link that provides the URI that can be used to post new
   * entries to the feed.
   * 
   * @return Link that provides the URI that can be used to post new entries to
   * the feed.
   */
  public final native BloggerLink getEntryPostLink() /*-{
    return this.getEntryPostLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query
   * parameters).
   * 
   * @return Link that provides the URI of the full feed (without any query
   * parameters).
   */
  public final native BloggerLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native BloggerLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return Link that provides the URI of the web content.
   */
  public final native BloggerLink getRepliesLink() /*-{
    return this.getRepliesLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final BlogEntry getSelf(BlogEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Returns the link to blog settings feed.
   * 
   * @return Link to blog settings feed.
   */
  public final native BloggerLink getSettingsLink() /*-{
    return this.getSettingsLink();
  }-*/;

  /**
   * Returns the link to blog templates feed.
   * 
   * @return Link to blog templates feed.
   */
  public final native BloggerLink getTemplateLink() /*-{
    return this.getTemplateLink();
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(BlogEntryCallback callback) {
    this.update(callback);
  }
  
}