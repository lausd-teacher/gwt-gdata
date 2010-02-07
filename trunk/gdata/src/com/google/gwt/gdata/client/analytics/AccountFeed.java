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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.gdata.client.Feed;

/**
 * Feed element in account feed.
 */
public class AccountFeed
    extends Feed<AccountFeed, AccountEntry> {

  /**
   * Analytics account feed.
   */
  public static final String KIND_ANALYTICS_ACCOUNTS =
    getConstant("KIND_ANALYTICS_ACCOUNTS");

  /**
   * Constructs an account feed.
   * @return An AccountFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native AccountFeed newInstance() /*-{
    return new $wnd.google.gdata.analytics.AccountFeed();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.AccountFeed[name];
  }-*/;

  protected AccountFeed() { }

  /**
   * Adds a new segment.
   * 
   * @param segment Segment to add.
   */
  public final native void addSegment(Segment segment) /*-{
    this.addSegment(segment);
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native com.google.gwt.gdata.client.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed.
   */
  public final native com.google.gwt.gdata.client.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the segments.
   * 
   * @return Segments.
   */
  public final native Segment[] getSegments() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getSegments());
  }-*/;

  /**
   * Sets the segments.
   * 
   * @param segments Segments, where each segment is added using addSegment().
   */
  public final native void setSegments(Segment[] segments) /*-{
    this.setSegments(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(segments)
    );
  }-*/;

}