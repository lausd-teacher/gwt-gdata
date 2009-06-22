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
import com.google.gwt.core.client.JsArray;

/**
 * The errors of a feed.
 */
public class FeedErrors extends JavaScriptObject {

  /**
   * Constructs a feed errors using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: feedError.
   */
  public static native FeedErrors newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.FeedErrors(
      params
    );
  }-*/;

  protected FeedErrors() { }

  /**
   * Adds a new feed error.
   * 
   * @param feedError Feed error to add, or object to use as a parameter to the google.gdata.gbase.FeedError constructor.
   */
  public final native void addFeedError(FeedError feedError) /*-{
    this.addFeedError(
      feedError
    );
  }-*/;

  /**
   * Returns the feed errors.
   * 
   * @return Feed errors.
   */
  public final native JsArray<FeedError> getFeedError() /*-{
    return this.getFeedError();
  }-*/;

  /**
   * Sets the feed errors.
   */
  public final native void setFeedError() /*-{
    this.setFeedError();
  }-*/;

  /**
   * Sets the feed errors.
   * 
   * @param feedError Feed errors, where each feed error is added using the addFeedError() function, or undefined to clear the feed errors.
   */
  public final native void setFeedError(JsArray<FeedError> feedError) /*-{
    this.setFeedError(
      feedError
    );
  }-*/;

}
