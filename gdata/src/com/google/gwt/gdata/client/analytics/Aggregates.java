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

/**
 * Describes an aggregates.
 */
public class Aggregates extends JavaScriptObject {

  /**
   * Constructs an aggregates.
   * @return An Aggregates object.
   */
  public static native Aggregates newInstance() /*-{
    return new $wnd.google.gdata.analytics.Aggregates();
  }-*/;

  protected Aggregates() { }

  /**
   * Adds a new metric.
   * 
   * @param metric Metric to add.
   */
  public final native void addMetric(Metric metric) /*-{
    this.addMetric(metric);
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