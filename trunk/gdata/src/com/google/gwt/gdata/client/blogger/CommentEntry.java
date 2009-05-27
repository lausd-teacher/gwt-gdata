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
 * Comment unavailable.
 */
public class CommentEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.blogger.CommentEntry;
  }-*/;

  /**
   * Constructs a comment entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CommentEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.blogger.CommentEntry(
      params
    );
  }-*/;

  /**
   * Constructs a comment entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CommentEntry newInstance() /*-{
    return new $wnd.google.gdata.blogger.CommentEntry();
  }-*/;

  protected CommentEntry() { }

  /**
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native BloggerLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the in reply to.
   * 
   * @return
   */
  public final native InReplyTo getInReplyTo() /*-{
    return this.getInReplyTo();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return
   */
  public final native BloggerLink getRepliesLink() /*-{
    return this.getRepliesLink();
  }-*/;

  /**
   * Sets the in reply to.
   * 
   * @param inReplyTo
   */
  public final native void setInReplyTo(InReplyTo inReplyTo) /*-{
    this.setInReplyTo(
      inReplyTo
    );
  }-*/;

  /**
   * Sets the in reply to.
   * 
   * @param inReplyTo
   */
  public final native void setInReplyTo() /*-{
    this.setInReplyTo();
  }-*/;

}
