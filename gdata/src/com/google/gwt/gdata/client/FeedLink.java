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
 * Describes a nested feed link.
 * @param <F> The Feed type.
 */
@SuppressWarnings("unchecked")
public class FeedLink<F extends Feed> extends JavaScriptObject {

  /**
   * Constructs a nested feed link.
   * @return A FeedLink object.
   */
  public static native <F extends Feed> FeedLink<F> newInstance() /*-{
    return new $wnd.google.gdata.FeedLink();
  }-*/;

  protected FeedLink() { }

  /**
   * Returns the hint at the number of entries in the feed. This attribute is optional.
   * 
   * @return Hint at the number of entries in the feed.
   */
  public final native double getCountHint() /*-{
    return this.getCountHint();
  }-*/;

  /**
   * Returns the nested feed. This element is optional.
   * 
   * @return Nested feed.
   */
  public final native F getFeed() /*-{
    return this.getFeed();
  }-*/;

  /**
   * Returns the feed URI. This attribute is optional.
   * 
   * @return Feed URI.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns whether the contained feed is read-only. This attribute is optional.
   * 
   * @return Whether the contained feed is read-only.
   */
  public final native boolean getReadOnly() /*-{
    return this.getReadOnly();
  }-*/;

  /**
   * Returns the feed relation type. This attribute is optional.
   * 
   * @return Feed relation type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the hint at the number of entries in the feed. This attribute is optional.
   * 
   * @param countHint Hint at the number of entries in the feed.
   */
  public final native void setCountHint(double countHint) /*-{
    this.setCountHint(countHint);
  }-*/;

  /**
   * Sets the nested feed. This element is optional.
   * 
   * @param feed Nested feed.
   */
  public final native void setFeed(F feed) /*-{
    this.setFeed(feed);
  }-*/;

  /**
   * Sets the feed URI. This attribute is optional.
   * 
   * @param href Feed URI.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets whether the contained feed is read-only. This attribute is optional.
   * 
   * @param readOnly Whether the contained feed is read-only.
   */
  public final native void setReadOnly(boolean readOnly) /*-{
    this.setReadOnly(readOnly);
  }-*/;

  /**
   * Sets the feed relation type. This attribute is optional.
   * 
   * @param rel Feed relation type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}