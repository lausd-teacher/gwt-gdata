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

import com.google.gwt.gdata.client.threading.InReplyTo;

/**
 * Describes an entry for a comment on a post.
 */
public class CommentEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a comment entry.
   * @return A CommentEntry object.
   */
  public static native CommentEntry newInstance() /*-{
    return new $wnd.google.gdata.blogger.CommentEntry();
  }-*/;

  protected CommentEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteEntry(CommentEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents.
   */
  public final native BloggerLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the in reply to. This element is optional.
   * 
   * @return In reply to.
   */
  public final native InReplyTo getInReplyTo() /*-{
    return this.getInReplyTo();
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
   * Returns the current representation of the entry by requesting it from the associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   * @return current representation of the entry.
   */
  public final CommentEntry getSelf(CommentEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Sets the in reply to. This element is optional.
   * 
   * @param inReplyTo In reply to.
   */
  public final native void setInReplyTo(InReplyTo inReplyTo) /*-{
    this.setInReplyTo(inReplyTo);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateEntry(CommentEntryCallback callback) {
    this.update(callback);
  }
  
}