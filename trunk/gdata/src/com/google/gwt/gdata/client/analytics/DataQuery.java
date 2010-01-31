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

import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the arbitrary data from an Analytics profile.
 */
public class DataQuery extends Query {

  /**
   * Constructs a data query.
   * 
   * @param feedUri URI of feed.
   * @return A DataQuery object.
   */
  public static native DataQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.analytics.DataQuery(
      feedUri
    );
  }-*/;

  protected DataQuery() { }

  /**
   * Returns the row keys.
   * 
   * @return Row keys.
   */
  public final native String getDimensions() /*-{
    return this.getDimensions();
  }-*/;

  /**
   * Returns the last day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @return Last day for which to retrieve data in form YYYY-MM-DD.
   */
  public final native String getEndDate() /*-{
    return this.getEndDate();
  }-*/;

  /**
   * Returns the dimension value filters.
   * 
   * @return Dimension value filters.
   */
  public final native String getFilters() /*-{
    return this.getFilters();
  }-*/;

  /**
   * Returns the Google Analytics profile ID, prefixed by 'ga:'.
   * 
   * @return Google Analytics profile ID, prefixed by 'ga:'.
   */
  public final native String getIds() /*-{
    return this.getIds();
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
   * Returns the comma separated list of numeric value fields.
   * 
   * @return Comma separated list of numeric value fields.
   */
  public final native String getMetrics() /*-{
    return this.getMetrics();
  }-*/;

  /**
   * Returns the whether to indent the elements.
   * 
   * @return Whether to indent the elements.
   */
  public final native boolean getPrettyprint() /*-{
    return this.getPrettyprint();
  }-*/;

  /**
   * Returns the segment to be applied.
   * 
   * @return Segment to be applied.
   */
  public final native String getSegment() /*-{
    return this.getSegment();
  }-*/;

  /**
   * Returns the comma separated list of sort keys in order of importance.
   * 
   * @return Comma separated list of sort keys in order of importance.
   */
  public final native String getSort() /*-{
    return this.getSort();
  }-*/;

  /**
   * Returns the first day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @return First day for which to retrieve data in form YYYY-MM-DD.
   */
  public final native String getStartDate() /*-{
    return this.getStartDate();
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
   * Sets the row keys.
   * 
   * @param dimensions Row keys.
   */
  public final native void setDimensions(String dimensions) /*-{
    this.setDimensions(dimensions);
  }-*/;

  /**
   * Sets the last day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @param endDate Last day for which to retrieve data in form YYYY-MM-DD.
   */
  public final native void setEndDate(String endDate) /*-{
    this.setEndDate(endDate);
  }-*/;

  /**
   * Sets the dimension value filters.
   * 
   * @param filters Dimension value filters.
   */
  public final native void setFilters(String filters) /*-{
    this.setFilters(
      filters
    );
  }-*/;

  /**
   * Sets the Google Analytics profile ID, prefixed by 'ga:'.
   * 
   * @param ids Google Analytics profile ID, prefixed by 'ga:'.
   */
  public final native void setIds(String ids) /*-{
    this.setIds(ids);
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
   * Sets the comma separated list of numeric value fields.
   * 
   * @param metrics Comma separated list of numeric value fields.
   */
  public final native void setMetrics(String metrics) /*-{
    this.setMetrics(metrics);
  }-*/;

  /**
   * Sets the whether to indent the elements. The default value is false.
   * 
   * @param prettyprint Whether to indent the elements.
   */
  public final native void setPrettyprint(boolean prettyprint) /*-{
    this.setPrettyprint(prettyprint);
  }-*/;

  /**
   * Sets the segment to be applied.
   * 
   * @param segment Segment to be applied.
   */
  public final native void setSegment(String segment) /*-{
    this.setSegment(segment);
  }-*/;

  /**
   * Sets the comma separated list of sort keys in order of importance.
   * 
   * @param sort Comma separated list of sort keys in order of importance.
   */
  public final native void setSort(String sort) /*-{
    this.setSort(sort);
  }-*/;

  /**
   * Sets the first day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @param startDate First day for which to retrieve data in form YYYY-MM-DD.
   */
  public final native void setStartDate(String startDate) /*-{
    this.setStartDate(startDate);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved. The default
   * value is 1.
   * 
   * @param startIndex 1-based index of the first result to be retrieved.
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(startIndex);
  }-*/;
  
}