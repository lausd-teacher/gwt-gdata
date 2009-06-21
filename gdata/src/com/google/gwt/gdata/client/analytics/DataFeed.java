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
 * Comment unavailable.
 */
public class DataFeed extends com.google.gwt.gdata.client.Feed<DataEntry> {

  /**
   * Constructs a data feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native DataFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.DataFeed(
      params
    );
  }-*/;

  /**
   * Constructs a data feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native DataFeed newInstance() /*-{
    return new $wnd.google.gdata.analytics.DataFeed();
  }-*/;

  protected DataFeed() { }

  /**
   * Adds a new data source.
   * 
   * @param dataSource
   */
  public final native void addDataSource(DataSource dataSource) /*-{
    this.addDataSource(
      dataSource
    );
  }-*/;

  /**
   * Returns the aggregates.
   * 
   * @return
   */
  public final native Aggregates getAggregates() /*-{
    return this.getAggregates();
  }-*/;

  /**
   * Returns the data sources.
   * 
   * @return
   */
  public final native JsArray<DataSource> getDataSources() /*-{
    return this.getDataSources();
  }-*/;

  /**
   * Returns the end date.
   * 
   * @return
   */
  public final native EndDate getEndDate() /*-{
    return this.getEndDate();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the start date.
   * 
   * @return
   */
  public final native StartDate getStartDate() /*-{
    return this.getStartDate();
  }-*/;

  /**
   * Sets the aggregates.
   * 
   * @param aggregates
   */
  public final native void setAggregates(Aggregates aggregates) /*-{
    this.setAggregates(
      aggregates
    );
  }-*/;

  /**
   * Sets the aggregates.
   * 
   * @param aggregates
   */
  public final native void setAggregates() /*-{
    this.setAggregates();
  }-*/;

  /**
   * Sets the data sources.
   * 
   * @param dataSources
   */
  public final native void setDataSources(JsArray<DataSource> dataSources) /*-{
    this.setDataSources(
      dataSources
    );
  }-*/;

  /**
   * Sets the data sources.
   * 
   * @param dataSources
   */
  public final native void setDataSources() /*-{
    this.setDataSources();
  }-*/;

  /**
   * Sets the end date.
   * 
   * @param endDate
   */
  public final native void setEndDate(EndDate endDate) /*-{
    this.setEndDate(
      endDate
    );
  }-*/;

  /**
   * Sets the end date.
   * 
   * @param endDate
   */
  public final native void setEndDate() /*-{
    this.setEndDate();
  }-*/;

  /**
   * Sets the start date.
   * 
   * @param startDate
   */
  public final native void setStartDate(StartDate startDate) /*-{
    this.setStartDate(
      startDate
    );
  }-*/;

  /**
   * Sets the start date.
   * 
   * @param startDate
   */
  public final native void setStartDate() /*-{
    this.setStartDate();
  }-*/;

}
