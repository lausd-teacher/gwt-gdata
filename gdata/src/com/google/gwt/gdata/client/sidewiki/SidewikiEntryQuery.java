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

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of Sidewiki entries.
 */
public class SidewikiEntryQuery extends Query {

  /**
   * Orders by entry creation date.
   */
  public static final String SORTORDER_PUBLISHED = getConstant("SORTORDER_PUBLISHED");

  /**
   * Orders by entry quality.
   */
  public static final String SORTORDER_QUALITY = getConstant("SORTORDER_QUALITY");

  /**
   * Orders by entry last modification date.
   */
  public static final String SORTORDER_UPDATED = getConstant("SORTORDER_UPDATED");

  /**
   * Constructs a SidewikiEntryQuery.
   * 
   * @param feedUri URI of feed.
   * @return A SidewikiEntryQuery object.
   */
  public static native SidewikiEntryQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiEntryQuery(feedUri);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.sidewiki.SidewikiEntryQuery[name];
  }-*/;

  protected SidewikiEntryQuery() { }

  /**
   * Returns the flag indicating whether to show less useful entries.
   * 
   * @return Flag indicating whether to show less useful entries.
   */
  public final native boolean getIncludeLessUseful() /*-{
    return this.getIncludeLessUseful();
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
   * Returns the order in which to sort entries.
   * 
   * @return Order in which to sort entries.
   */
  public final native String getSortOrder() /*-{
    return this.getSortOrder();
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
   * Returns the maximum updated date.
   * 
   * @return Maximum updated date.
   */
  public final native DateTime getUpdatedMax() /*-{
    return this.getUpdatedMax();
  }-*/;

  /**
   * Returns the minimum updated date.
   * 
   * @return Minimum updated date.
   */
  public final native DateTime getUpdatedMin() /*-{
    return this.getUpdatedMin();
  }-*/;

  /**
   * Sets the flag indicating whether to show less useful entries.
   * 
   * @param includeLessUseful Flag indicating whether to show less
   * useful entries.
   */
  public final native void setIncludeLessUseful(boolean includeLessUseful) /*-{
    this.setIncludeLessUseful(includeLessUseful);
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
   * Sets the order in which to sort entries.
   * 
   * @param sortOrder Order in which to sort entries.
   */
  public final native void setSortOrder(String sortOrder) /*-{
    this.setSortOrder(sortOrder);
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

  /**
   * Sets the maximum updated date.
   * 
   * @param updatedMax Maximum updated date.
   */
  public final native void setUpdatedMax(DateTime updatedMax) /*-{
    this.setUpdatedMax(updatedMax);
  }-*/;

  /**
   * Sets the minimum updated date.
   * 
   * @param updatedMin Minimum updated date.
   */
  public final native void setUpdatedMin(DateTime updatedMin) /*-{
    this.setUpdatedMin(updatedMin);
  }-*/;

}