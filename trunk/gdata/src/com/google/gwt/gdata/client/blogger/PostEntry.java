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
import com.google.gwt.gdata.client.mediarss.MediaThumbnail;
import com.google.gwt.gdata.client.threading.Total;

/**
 * Describes a blog post entry.
 */
public class PostEntry extends com.google.gwt.gdata.client.Entry<PostEntry> {

  /**
   * Constructs a post entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, control, edited, id, links, published, thumbnail, title, total, and updated.
   */
  public static native PostEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.blogger.PostEntry(
      params
    );
  }-*/;

  protected PostEntry() { }

  /**
   * Returns the link that identifies a resource related to the entry.
   * 
   * @return Link that identifies a resource related to the entry or undefined for none.
   */
  public final native BloggerLink getEnclosureLink() /*-{
    return this.getEnclosureLink();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to post new entries to the feed.
   * 
   * @return Link that provides the URI that can be used to post new entries to the feed or undefined for none.
   */
  public final native BloggerLink getEntryPostLink() /*-{
    return this.getEntryPostLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed (without any query parameters) or undefined for none.
   */
  public final native BloggerLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native BloggerLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return Link that provides the URI of the web content or undefined for none.
   */
  public final native BloggerLink getRepliesHtmlLink() /*-{
    return this.getRepliesHtmlLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return Link that provides the URI of the web content or undefined for none.
   */
  public final native BloggerLink getRepliesLink() /*-{
    return this.getRepliesLink();
  }-*/;

  /**
   * Returns the media thumbnail. This element is optional.
   * 
   * @return Media thumbnail or undefined for none.
   */
  public final native MediaThumbnail getThumbnail() /*-{
    return this.getThumbnail();
  }-*/;

  /**
   * Returns the total. This element is optional.
   * 
   * @return Total or undefined for none.
   */
  public final native Total getTotal() /*-{
    return this.getTotal();
  }-*/;

  /**
   * Sets the media thumbnail. This element is optional.
   */
  public final native void setThumbnail() /*-{
    this.setThumbnail();
  }-*/;

  /**
   * Sets the media thumbnail. This element is optional.
   * 
   * @param thumbnail Media thumbnail, or object to use as a parameter to the google.gdata.mediarss.MediaThumbnail constructor, or undefined for none.
   */
  public final native void setThumbnail(MediaThumbnail thumbnail) /*-{
    this.setThumbnail(
      thumbnail
    );
  }-*/;

  /**
   * Sets the total. This element is optional.
   */
  public final native void setTotal() /*-{
    this.setTotal();
  }-*/;

  /**
   * Sets the total. This element is optional.
   * 
   * @param total Total, or object to use as a parameter to the google.gdata.threading.Total constructor, or undefined for none.
   */
  public final native void setTotal(Total total) /*-{
    this.setTotal(
      total
    );
  }-*/;

}
