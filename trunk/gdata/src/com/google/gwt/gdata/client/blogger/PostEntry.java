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

import com.google.gwt.gdata.client.mediarss.MediaThumbnail;
import com.google.gwt.gdata.client.threading.Total;

/**
 * Describes a blog post entry.
 */
public class PostEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a post entry.
   * @return A PostEntry object.
   */
  public static native PostEntry newInstance() /*-{
    return new $wnd.google.gdata.blogger.PostEntry();
  }-*/;

  protected PostEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(PostEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the link that identifies a resource related to the entry.
   * 
   * @return Link that identifies a resource related to the entry.
   */
  public final native BloggerLink getEnclosureLink() /*-{
    return this.getEnclosureLink();
  }-*/;

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
  public final native BloggerLink getRepliesHtmlLink() /*-{
    return this.getRepliesHtmlLink();
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
  public final PostEntry getSelf(PostEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Returns the media thumbnail. This element is optional.
   * 
   * @return Media thumbnail.
   */
  public final native MediaThumbnail getThumbnail() /*-{
    return this.getThumbnail();
  }-*/;

  /**
   * Returns the total. This element is optional.
   * 
   * @return Total.
   */
  public final native Total getTotal() /*-{
    return this.getTotal();
  }-*/;
  
  /**
   * Sets the media thumbnail. This element is optional.
   * 
   * @param thumbnail Media thumbnail.
   */
  public final native void setThumbnail(MediaThumbnail thumbnail) /*-{
    this.setThumbnail(thumbnail);
  }-*/;

  /**
   * Sets the total. This element is optional.
   * 
   * @param total Total.
   */
  public final native void setTotal(Total total) /*-{
    this.setTotal(total);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(PostEntryCallback callback) {
    this.update(callback);
  }
  
}