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
 * Metric value.
 */
public class Metric extends JavaScriptObject {

  /**
   * Currency metric.
   */
  public static final String TYPE_CURRENCY = getConstant("TYPE_CURRENCY");

  /**
   * Float metric.
   */
  public static final String TYPE_FLOAT = getConstant("TYPE_FLOAT");

  /**
   * Integer metric.
   */
  public static final String TYPE_INTEGER = getConstant("TYPE_INTEGER");

  /**
   * Percent metric.
   */
  public static final String TYPE_PERCENT = getConstant("TYPE_PERCENT");

  /**
   * Time metric.
   */
  public static final String TYPE_TIME = getConstant("TYPE_TIME");

  /**
   * Us currency metric.
   */
  public static final String TYPE_US_CURRENCY = getConstant("TYPE_US_CURRENCY");

  /**
   * Constructs a metric using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: confidenceInterval, name, type, and value.
   */
  public static native Metric newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.Metric(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.Metric[name];
  }-*/;

  protected Metric() { }

  /**
   * Returns the 95 confidence interval for this metric (lower is better). This attribute is optional.
   * 
   * @return 95 confidence interval for this metric (lower is better) or undefined for none.
   */
  public final native double getConfidenceInterval() /*-{
    return this.getConfidenceInterval();
  }-*/;

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name or undefined for none.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the the format of data represented by the metric. This attribute is optional.
   * 
   * @return The format of data represented by the metric or undefined for none.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value or undefined for none.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the 95 confidence interval for this metric (lower is better). This attribute is optional.
   */
  public final native void setConfidenceInterval() /*-{
    this.setConfidenceInterval();
  }-*/;

  /**
   * Sets the 95 confidence interval for this metric (lower is better). This attribute is optional.
   * 
   * @param confidenceInterval 95 confidence interval for this metric (lower is better) or undefined for none.
   */
  public final native void setConfidenceInterval(double confidenceInterval) /*-{
    this.setConfidenceInterval(
      confidenceInterval
    );
  }-*/;

  /**
   * Sets the name. This attribute is required.
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the name. This attribute is required.
   * 
   * @param name Name or undefined for none.
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the the format of data represented by the metric. This attribute is optional.
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the the format of data represented by the metric. This attribute is optional.
   * 
   * @param type The format of data represented by the metric or undefined for none.
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the value. This attribute is required.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value or undefined for none.
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
