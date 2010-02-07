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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.Feed;

/**
 * Describes a feature feed.
 */
public class FeatureFeed
    extends Feed<FeatureFeed, FeatureEntry> {

  /**
   * Constructs a feature feed.
   * @return A FeatureFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native FeatureFeed newInstance() /*-{
    return new $wnd.google.gdata.maps.FeatureFeed();
  }-*/;

  protected FeatureFeed() { }

  /**
   * Returns the link that provides the URI of the full feed
   * (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed
   * (without any query parameters).
   */
  public final native MapsLink getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to batch
   * operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations
   * to query, insert, update and delete entries on this feed.
   */
  public final native MapsLink getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native MapsLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

}