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
 * Describes an aggregates.
 */
public class Aggregates extends JavaScriptObject {

  /**
   * Constructs an aggregates using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: metrics.
   */
  public static native Aggregates newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.Aggregates(
      params
    );
  }-*/;

  protected Aggregates() { }

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
   * Returns the metrics.
   * 
   * @return Metrics.
   */
  public final native JsArray<Metric> getMetrics() /*-{
    return this.getMetrics();
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
