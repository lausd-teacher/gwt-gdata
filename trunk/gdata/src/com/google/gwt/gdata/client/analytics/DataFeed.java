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

import com.google.gwt.gdata.client.GDataRequestParameters;

/**
 * Feed element in data feed.
 */
public class DataFeed extends com.google.gwt.gdata.client.Feed<DataEntry> {

  /**
   * Constructs a data feed.
   */
  @SuppressWarnings("unchecked")
  public static native DataFeed newInstance() /*-{
    return new $wnd.google.gdata.analytics.DataFeed();
  }-*/;

  protected DataFeed() { }

  /**
   * Adds a new data source.
   * 
   * @param dataSource Data source to add.
   */
  public final native void addDataSource(DataSource dataSource) /*-{
    this.addDataSource(dataSource);
  }-*/;

  /**
   * Returns the aggregates. This element is optional.
   * 
   * @return Aggregates.
   */
  public final native Aggregates getAggregates() /*-{
    return this.getAggregates();
  }-*/;

  /**
   * Returns the data sources.
   * 
   * @return Data sources.
   */
  public final native DataSource[] getDataSources() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getDataSources());
  }-*/;

  /**
   * Returns the end date. This element is required.
   * 
   * @return End date.
   */
  public final native EndDate getEndDate() /*-{
    return this.getEndDate();
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
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(DataFeedCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(DataFeedCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Returns the start date. This element is required.
   * 
   * @return Start date.
   */
  public final native StartDate getStartDate() /*-{
    return this.getStartDate();
  }-*/;

  /**
   * Inserts a new data entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertDataEntry(DataEntry entry,
      DataEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

  /**
   * Sets the aggregates. This element is optional.
   * 
   * @param aggregates Aggregates.
   */
  public final native void setAggregates(Aggregates aggregates) /*-{
    this.setAggregates(aggregates);
  }-*/;

  /**
   * Sets the data sources.
   * 
   * @param dataSources Data sources, where each data source is added using the
   * addDataSource() function, or undefined to clear the data sources.
   */
  public final native void setDataSources(DataSource[] dataSources) /*-{
    this.setDataSources(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(dataSources)
    );
  }-*/;

  /**
   * Sets the end date. This element is required.
   * 
   * @param endDate End date.
   */
  public final native void setEndDate(EndDate endDate) /*-{
    this.setEndDate(endDate);
  }-*/;

  /**
   * Sets the start date. This element is required.
   * 
   * @param startDate Start date, or object to use as a parameter to the
   * google.gdata.analytics.StartDate constructor, or undefined for none.
   */
  public final native void setStartDate(StartDate startDate) /*-{
    this.setStartDate(startDate);
  }-*/;

}