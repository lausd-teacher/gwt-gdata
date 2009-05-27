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
public class FeedLink extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.FeedLink;
  }-*/;

  /**
   * Constructs a nested feed link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeedLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.FeedLink(
      params
    );
  }-*/;

  /**
   * Constructs a nested feed link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeedLink newInstance() /*-{
    return new $wnd.google.gdata.FeedLink();
  }-*/;

  protected FeedLink() { }

  /**
   * Returns the hint at the number of entries in the feed.
   * 
   * @return
   */
  public final native double getCountHint() /*-{
    return this.getCountHint();
  }-*/;

  /**
   * Returns the nested feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Feed getFeed() /*-{
    return this.getFeed();
  }-*/;

  /**
   * Returns the feed URI.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns whether the contained feed is read-only.
   * 
   * @return
   */
  public final native boolean getReadOnly() /*-{
    return this.getReadOnly();
  }-*/;

  /**
   * Returns the feed relation type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the hint at the number of entries in the feed.
   * 
   * @param countHint
   */
  public final native void setCountHint(double countHint) /*-{
    this.setCountHint(
      countHint
    );
  }-*/;

  /**
   * Sets the hint at the number of entries in the feed.
   * 
   * @param countHint
   */
  public final native void setCountHint() /*-{
    this.setCountHint();
  }-*/;

  /**
   * Sets the nested feed.
   * 
   * @param feed
   */
  public final native void setFeed(Feed feed) /*-{
    this.setFeed(
      feed
    );
  }-*/;

  /**
   * Sets the nested feed.
   * 
   * @param feed
   */
  public final native void setFeed() /*-{
    this.setFeed();
  }-*/;

  /**
   * Sets the feed URI.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the feed URI.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets whether the contained feed is read-only.
   * 
   * @param readOnly
   */
  public final native void setReadOnly(boolean readOnly) /*-{
    this.setReadOnly(
      readOnly
    );
  }-*/;

  /**
   * Sets whether the contained feed is read-only.
   * 
   * @param readOnly
   */
  public final native void setReadOnly() /*-{
    this.setReadOnly();
  }-*/;

  /**
   * Sets the feed relation type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the feed relation type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

}
