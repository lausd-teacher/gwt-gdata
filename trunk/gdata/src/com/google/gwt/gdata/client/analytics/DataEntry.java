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

/**
 * Entry element for data feed.
 */
public class DataEntry extends com.google.gwt.gdata.client.Entry<DataEntry> {

  /**
   * Constructs a data entry.
   * @return A DataEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native DataEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.DataEntry();
  }-*/;

  protected DataEntry() { }

  /**
   * Adds a new dimension.
   * 
   * @param dimension Dimension to add.
   */
  public final native void addDimension(Dimension dimension) /*-{
    this.addDimension(dimension);
  }-*/;

  /**
   * Adds a new metric.
   * 
   * @param metric Metric to add.
   */
  public final native void addMetric(Metric metric) /*-{
    this.addMetric(metric);
  }-*/;

  /**
   * Returns the dimension with the given name in this entry.
   * 
   * @param name The name of the dimension to retrieve.
   * @return The dimension with the given name.
   */
  public final native Dimension getDimension(String name) /*-{
    return this.getDimension(name);
  }-*/;

  /**
   * Returns the dimensions.
   * 
   * @return Dimensions.
   */
  public final native Dimension[] getDimensions() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getDimensions());
  }-*/;

  /**
   * Returns the metric with the given name in this entry.
   * 
   * @param name The name of the metric to retrieve.
   * @return The dimension with the given name.
   */
  public final native Metric getMetric(String name) /*-{
    return this.getMetric(name);
  }-*/;

  /**
   * Returns the metrics.
   * 
   * @return Metrics.
   */
  public final native Metric[] getMetrics() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getMetrics());
  }-*/;
  
  /**
   * Returns the value of the dimension or metric with the given name in this entry.
   * 
   * @param name The name of the dimension or metric to retrieve.
   * @return The value of the named dimension or metric.
   */
  public final native double getNumericValueOf(String name) /*-{
    return this.getValueOf(name);
  }-*/;

  /**
   * Returns the value of the dimension or metric with the given name in this entry.
   * 
   * @param name The name of the dimension or metric to retrieve.
   * @return The value of the named dimension or metric.
   */
  public final native String getStringValueOf(String name) /*-{
    return this.getValueOf(name);
  }-*/;
  
  /**
   * Sets the dimensions.
   * 
   * @param dimensions Dimensions, where each dimension is added using addDimension().
   */
  public final native void setDimensions(Dimension[] dimensions) /*-{
    this.setDimensions(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(dimensions)
    );
  }-*/;

  /**
   * Sets the metrics.
   * 
   * @param metrics Metrics, where each metric is added using addMetric().
   */
  public final native void setMetrics(Metric[] metrics) /*-{
    this.setMetrics(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(metrics)
    );
  }-*/;

}