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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class Comments extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Comments;
  }-*/;

  /**
   * Constructs a Comments class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Comments newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Comments(
      params
    );
  }-*/;

  /**
   * Constructs a Comments class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Comments newInstance() /*-{
    return new $wnd.google.gdata.Comments();
  }-*/;

  protected Comments() { }

  /**
   * Returns the nested feed link.
   * 
   * @return
   */
  public final native FeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getFeedLinkClass() /*-{
    return this.getFeedLinkClass();
  }-*/;

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(JavaScriptObject feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink() /*-{
    this.setFeedLink();
  }-*/;

  /**
   * Sets the nested feed link.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

}
