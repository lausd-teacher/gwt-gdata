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
 * The errors of a feed.
 */
public class FeedErrors extends JavaScriptObject {

  /**
   * Constructs a feed errors.
   * @return A FeedError object.
   */
  public static native FeedErrors newInstance() /*-{
    return new $wnd.google.gdata.gbase.FeedErrors();
  }-*/;

  protected FeedErrors() { }

  /**
   * Adds a new feed error.
   * 
   * @param feedError Feed error to add.
   */
  public final native void addFeedError(FeedError feedError) /*-{
    this.addFeedError(feedError);
  }-*/;

  /**
   * Returns the feed errors.
   * 
   * @return Feed errors.
   */
  public final native FeedError[] getFeedError() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getFeedError());
  }-*/;

  /**
   * Sets the feed errors.
   * 
   * @param feedError Feed errors, where each feed error is added using
   * addFeedError().
   */
  public final native void setFeedError(FeedError[] feedError) /*-{
    this.setFeedError(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(feedError)
    );
  }-*/;

}