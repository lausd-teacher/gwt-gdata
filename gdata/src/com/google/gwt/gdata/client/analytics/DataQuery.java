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
 * Comment unavailable.
 */
public class DataQuery extends Query {

  /**
   * Constructor.
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
   * @return
   */
  public final native String getDimensions() /*-{
    return this.getDimensions();
  }-*/;

  /**
   * Returns the last day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @return
   */
  public final native String getEndDate() /*-{
    return this.getEndDate();
  }-*/;

  /**
   * Returns the dimension value filters.
   * 
   * @return
   */
  public final native String getFilters() /*-{
    return this.getFilters();
  }-*/;

  /**
   * Returns the Google Analytics profile ID, prefixed by ga:.
   * 
   * @return
   */
  public final native String getIds() /*-{
    return this.getIds();
  }-*/;

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the comma separated list of numeric value fields.
   * 
   * @return
   */
  public final native String getMetrics() /*-{
    return this.getMetrics();
  }-*/;

  /**
   * Returns the whether to indent the elements.
   * 
   * @return
   */
  public final native boolean getPrettyprint() /*-{
    return this.getPrettyprint();
  }-*/;

  /**
   * Returns the comma separated list of sort keys in order of importance.
   * 
   * @return
   */
  public final native String getSort() /*-{
    return this.getSort();
  }-*/;

  /**
   * Returns the first day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @return
   */
  public final native String getStartDate() /*-{
    return this.getStartDate();
  }-*/;

  /**
   * Returns the 1-based index of the first result to be retrieved.
   * 
   * @return
   */
  public final native double getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Sets the row keys.
   * 
   * @param dimensions
   */
  public final native void setDimensions(String dimensions) /*-{
    this.setDimensions(
      dimensions
    );
  }-*/;

  /**
   * Sets the last day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @param endDate
   */
  public final native void setEndDate(String endDate) /*-{
    this.setEndDate(
      endDate
    );
  }-*/;

  /**
   * Sets the dimension value filters.
   * 
   * @param filters
   */
  public final native void setFilters(String filters) /*-{
    this.setFilters(
      filters
    );
  }-*/;

  /**
   * Sets the Google Analytics profile ID, prefixed by ga:.
   * 
   * @param ids
   */
  public final native void setIds(String ids) /*-{
    this.setIds(
      ids
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults
   */
  public final native void setMaxResults(double maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults
   */
  public final native void setMaxResults(String maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the comma separated list of numeric value fields.
   * 
   * @param metrics
   */
  public final native void setMetrics(String metrics) /*-{
    this.setMetrics(
      metrics
    );
  }-*/;

  /**
   * Sets the whether to indent the elements.
   * 
   * @param prettyprint
   */
  public final native void setPrettyprint(boolean prettyprint) /*-{
    this.setPrettyprint(
      prettyprint
    );
  }-*/;

  /**
   * Sets the whether to indent the elements.
   * 
   * @param prettyprint
   */
  public final native void setPrettyprint(String prettyprint) /*-{
    this.setPrettyprint(
      prettyprint
    );
  }-*/;

  /**
   * Sets the comma separated list of sort keys in order of importance.
   * 
   * @param sort
   */
  public final native void setSort(String sort) /*-{
    this.setSort(
      sort
    );
  }-*/;

  /**
   * Sets the first day for which to retrieve data in form YYYY-MM-DD.
   * 
   * @param startDate
   */
  public final native void setStartDate(String startDate) /*-{
    this.setStartDate(
      startDate
    );
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * 
   * @param startIndex
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(
      startIndex
    );
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * 
   * @param startIndex
   */
  public final native void setStartIndex(String startIndex) /*-{
    this.setStartIndex(
      startIndex
    );
  }-*/;

}
