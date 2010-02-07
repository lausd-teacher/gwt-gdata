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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of Sidewiki users.
 */
public class SidewikiUserQuery extends Query {

  /**
   * Constructs a Sidewiki User Query.
   * 
   * @param feedUri URI of feed.
   * @return A SidewikiUserQuery object.
   */
  public static native SidewikiUserQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiUserQuery(feedUri);
  }-*/;

  protected SidewikiUserQuery() { }

  /**
   * Returns the full-text query string.
   * 
   * @return Full-text query string.
   */
  public final native String getFullTextQuery() /*-{
    return this.getFullTextQuery();
  }-*/;

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return Maximum number of results to be retrieved.
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the 1-based index of the first result to be retrieved.
   * 
   * @return 1-based index of the first result to be retrieved.
   */
  public final native double getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Sets the full-text query string.
   * 
   * @param fullTextQuery Full-text query string.
   */
  public final native void setFullTextQuery(String fullTextQuery) /*-{
    this.setFullTextQuery(fullTextQuery);
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults Maximum number of results to be retrieved.
   */
  public final native void setMaxResults(double maxResults) /*-{
    this.setMaxResults(maxResults);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * The default value is 1.
   * 
   * @param startIndex 1-based index of the first result to be retrieved.
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(startIndex);
  }-*/;

}