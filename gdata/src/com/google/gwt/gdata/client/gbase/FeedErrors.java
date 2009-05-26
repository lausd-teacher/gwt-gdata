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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class FeedErrors extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.FeedErrors;
  }-*/;

  /**
   * Constructs a feed errors using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeedErrors newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.FeedErrors(
      params
    );
  }-*/;

  /**
   * Constructs a feed errors using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeedErrors newInstance() /*-{
    return new $wnd.google.gdata.gbase.FeedErrors();
  }-*/;

  protected FeedErrors() { }

  /**
   * Adds a new feed error.
   * 
   * @param feedError
   */
  public final native void addFeedError(JavaScriptObject feedError) /*-{
    this.addFeedError(
      feedError
    );
  }-*/;

  /**
   * Adds a new feed error.
   * 
   * @param feedError
   */
  public final native void addFeedError(FeedError feedError) /*-{
    this.addFeedError(
      feedError
    );
  }-*/;

  /**
   * Returns the feed errors.
   * 
   * @return
   */
  public final native FeedError[] getFeedError() /*-{
    return this.getFeedError();
  }-*/;

  /**
   * Sets the feed errors.
   * 
   * @param feedError
   */
  public final native void setFeedError(JavaScriptObject[] feedError) /*-{
    this.setFeedError(
      feedError
    );
  }-*/;

  /**
   * Sets the feed errors.
   * 
   * @param feedError
   */
  public final native void setFeedError() /*-{
    this.setFeedError();
  }-*/;

  /**
   * Sets the feed errors.
   * 
   * @param feedError
   */
  public final native void setFeedError(FeedError[] feedError) /*-{
    this.setFeedError(
      feedError
    );
  }-*/;

}
