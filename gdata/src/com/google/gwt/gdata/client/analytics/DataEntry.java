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
 * Entry element for data feed.
 */
public class DataEntry extends com.google.gwt.gdata.client.Entry<DataEntry> {

  /**
   * Constructs a data entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: dimensions, id, links, metrics, title, and updated.
   */
  public static native DataEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.DataEntry(
      params
    );
  }-*/;

  protected DataEntry() { }

  /**
   * Adds a new dimension.
   * 
   * @param dimension Dimension to add, or object to use as a parameter to the google.gdata.analytics.Dimension constructor.
   */
  public final native void addDimension(Dimension dimension) /*-{
    this.addDimension(
      dimension
    );
  }-*/;

  /**
   * Adds a new metric.
   * 
   * @param metric Metric to add, or object to use as a parameter to the google.gdata.analytics.Metric constructor.
   */
  public final native void addMetric(Metric metric) /*-{
    this.addMetric(
      metric
    );
  }-*/;

  /**
   * Returns the dimension with the given name in this entry.
   * 
   * @param name The name of the dimension to retrieve
   * 
   * @return The dimension with the given name, or null if no such dimension is present
   */
  public final native Dimension getDimension(String name) /*-{
    return this.getDimension(
      name
    );
  }-*/;

  /**
   * Returns the dimensions.
   * 
   * @return Dimensions.
   */
  public final native JsArray<Dimension> getDimensions() /*-{
    return this.getDimensions();
  }-*/;

  /**
   * Returns the metric with the given name in this entry.
   * 
   * @param name The name of the metric to retrieve
   * 
   * @return The dimension with the given name, or null if no such metric is present
   */
  public final native Metric getMetric(String name) /*-{
    return this.getMetric(
      name
    );
  }-*/;

  /**
   * Returns the metrics.
   * 
   * @return Metrics.
   */
  public final native JsArray<Metric> getMetrics() /*-{
    return this.getMetrics();
  }-*/;

  /**
   * Returns the value of the dimension or metric with the given name in this entry.
   * 
   * @param name The name of the dimension or metric to retrieve
   * 
   * @return The value of the named dimension or metric, or null if no dimension or metric with the given name exists in this entry
   */
  public final native String getValueOf(String name) /*-{
    return this.getValueOf(
      name
    );
  }-*/;

  /**
   * Sets the dimensions.
   */
  public final native void setDimensions() /*-{
    this.setDimensions();
  }-*/;

  /**
   * Sets the dimensions.
   * 
   * @param dimensions Dimensions, where each dimension is added using the addDimension() function, or undefined to clear the dimensions.
   */
  public final native void setDimensions(JsArray<Dimension> dimensions) /*-{
    this.setDimensions(
      dimensions
    );
  }-*/;

  /**
   * Sets the metrics.
   */
  public final native void setMetrics() /*-{
    this.setMetrics();
  }-*/;

  /**
   * Sets the metrics.
   * 
   * @param metrics Metrics, where each metric is added using the addMetric() function, or undefined to clear the metrics.
   */
  public final native void setMetrics(JsArray<Metric> metrics) /*-{
    this.setMetrics(
      metrics
    );
  }-*/;

}
