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
import com.google.gwt.gdata.client.threading.InReplyTo;

/**
 * Describes an entry for a comment on a post.
 */
public class CommentEntry extends com.google.gwt.gdata.client.Entry<CommentEntry> {

  /**
   * Constructs a comment entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, content, edited, id, inReplyTo, links, published, title, and updated.
   */
  public static native CommentEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.blogger.CommentEntry(
      params
    );
  }-*/;

  protected CommentEntry() { }

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native BloggerLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the in reply to. This element is optional.
   * 
   * @return In reply to or undefined for none.
   */
  public final native InReplyTo getInReplyTo() /*-{
    return this.getInReplyTo();
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
   * Sets the in reply to. This element is optional.
   */
  public final native void setInReplyTo() /*-{
    this.setInReplyTo();
  }-*/;

  /**
   * Sets the in reply to. This element is optional.
   * 
   * @param inReplyTo In reply to, or object to use as a parameter to the google.gdata.threading.InReplyTo constructor, or undefined for none.
   */
  public final native void setInReplyTo(InReplyTo inReplyTo) /*-{
    this.setInReplyTo(
      inReplyTo
    );
  }-*/;

}
