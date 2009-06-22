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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Feed element in data feed.
 */
public class DataFeed extends com.google.gwt.gdata.client.Feed<DataEntry> {

  /**
   * Constructs a data feed using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: aggregates, authors, dataSources, endDate, entries, generator, id, itemsPerPage, links, startDate, startIndex, title, totalResults, and updated.
   */
  public static native DataFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.DataFeed(
      params
    );
  }-*/;

  protected DataFeed() { }

  /**
   * Adds a new data source.
   * 
   * @param dataSource Data source to add, or object to use as a parameter to the google.gdata.analytics.DataSource constructor.
   */
  public final native void addDataSource(DataSource dataSource) /*-{
    this.addDataSource(
      dataSource
    );
  }-*/;

  /**
   * Returns the aggregates. This element is optional.
   * 
   * @return Aggregates or undefined for none.
   */
  public final native Aggregates getAggregates() /*-{
    return this.getAggregates();
  }-*/;

  /**
   * Returns the data sources.
   * 
   * @return Data sources.
   */
  public final native JsArray<DataSource> getDataSources() /*-{
    return this.getDataSources();
  }-*/;

  /**
   * Returns the end date. This element is required.
   * 
   * @return End date or undefined for none.
   */
  public final native EndDate getEndDate() /*-{
    return this.getEndDate();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the start date. This element is required.
   * 
   * @return Start date or undefined for none.
   */
  public final native StartDate getStartDate() /*-{
    return this.getStartDate();
  }-*/;

  /**
   * Sets the aggregates. This element is optional.
   */
  public final native void setAggregates() /*-{
    this.setAggregates();
  }-*/;

  /**
   * Sets the aggregates. This element is optional.
   * 
   * @param aggregates Aggregates, or object to use as a parameter to the google.gdata.analytics.Aggregates constructor, or undefined for none.
   */
  public final native void setAggregates(Aggregates aggregates) /*-{
    this.setAggregates(
      aggregates
    );
  }-*/;

  /**
   * Sets the data sources.
   */
  public final native void setDataSources() /*-{
    this.setDataSources();
  }-*/;

  /**
   * Sets the data sources.
   * 
   * @param dataSources Data sources, where each data source is added using the addDataSource() function, or undefined to clear the data sources.
   */
  public final native void setDataSources(JsArray<DataSource> dataSources) /*-{
    this.setDataSources(
      dataSources
    );
  }-*/;

  /**
   * Sets the end date. This element is required.
   */
  public final native void setEndDate() /*-{
    this.setEndDate();
  }-*/;

  /**
   * Sets the end date. This element is required.
   * 
   * @param endDate End date, or object to use as a parameter to the google.gdata.analytics.EndDate constructor, or undefined for none.
   */
  public final native void setEndDate(EndDate endDate) /*-{
    this.setEndDate(
      endDate
    );
  }-*/;

  /**
   * Sets the start date. This element is required.
   */
  public final native void setStartDate() /*-{
    this.setStartDate();
  }-*/;

  /**
   * Sets the start date. This element is required.
   * 
   * @param startDate Start date, or object to use as a parameter to the google.gdata.analytics.StartDate constructor, or undefined for none.
   */
  public final native void setStartDate(StartDate startDate) /*-{
    this.setStartDate(
      startDate
    );
  }-*/;

}
