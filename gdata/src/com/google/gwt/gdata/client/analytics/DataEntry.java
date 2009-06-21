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
public class DataEntry extends com.google.gwt.gdata.client.Entry<DataEntry> {

  /**
   * Constructs a data entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native DataEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.DataEntry(
      params
    );
  }-*/;

  /**
   * Constructs a data entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native DataEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.DataEntry();
  }-*/;

  protected DataEntry() { }

  /**
   * Adds a new dimension.
   * 
   * @param dimension
   */
  public final native void addDimension(Dimension dimension) /*-{
    this.addDimension(
      dimension
    );
  }-*/;

  /**
   * Adds a new metric.
   * 
   * @param metric
   */
  public final native void addMetric(Metric metric) /*-{
    this.addMetric(
      metric
    );
  }-*/;

  /**
   * Returns the dimension with the given name in this entry.
   * 
   * @param name
   * 
   * @return
   */
  public final native Dimension getDimension(String name) /*-{
    return this.getDimension(
      name
    );
  }-*/;

  /**
   * Returns the dimensions.
   * 
   * @return
   */
  public final native JsArray<Dimension> getDimensions() /*-{
    return this.getDimensions();
  }-*/;

  /**
   * Returns the metric with the given name in this entry.
   * 
   * @param name
   * 
   * @return
   */
  public final native Metric getMetric(String name) /*-{
    return this.getMetric(
      name
    );
  }-*/;

  /**
   * Returns the metrics.
   * 
   * @return
   */
  public final native JsArray<Metric> getMetrics() /*-{
    return this.getMetrics();
  }-*/;

  /**
   * Returns the value of the dimension or metric with the given name in this entry.
   * 
   * @param name
   * 
   * @return
   */
  public final native String getValueOf(String name) /*-{
    return this.getValueOf(
      name
    );
  }-*/;

  /**
   * Sets the dimensions.
   * 
   * @param dimensions
   */
  public final native void setDimensions(JsArray<Dimension> dimensions) /*-{
    this.setDimensions(
      dimensions
    );
  }-*/;

  /**
   * Sets the dimensions.
   * 
   * @param dimensions
   */
  public final native void setDimensions() /*-{
    this.setDimensions();
  }-*/;

  /**
   * Sets the metrics.
   * 
   * @param metrics
   */
  public final native void setMetrics(JsArray<Metric> metrics) /*-{
    this.setMetrics(
      metrics
    );
  }-*/;

  /**
   * Sets the metrics.
   * 
   * @param metrics
   */
  public final native void setMetrics() /*-{
    this.setMetrics();
  }-*/;

}
