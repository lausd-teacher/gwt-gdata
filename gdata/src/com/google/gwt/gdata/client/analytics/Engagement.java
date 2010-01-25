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
 * Engagement goal.
 */
public class Engagement extends JavaScriptObject {

  /**
   * Equal to.
   */
  public static final String COMPARISON_EQ = getConstant("COMPARISON_EQ");

  /**
   * Greater than.
   */
  public static final String COMPARISON_GT = getConstant("COMPARISON_GT");

  /**
   * Less than.
   */
  public static final String COMPARISON_LT = getConstant("COMPARISON_LT");

  /**
   * PagesVisited engagement.
   */
  public static final String TYPE_PAGES_VISITED = getConstant("TYPE_PAGES_VISITED");

  /**
   * TimeOnSite engagement.
   */
  public static final String TYPE_TIME_ON_SITE = getConstant("TYPE_TIME_ON_SITE");

  /**
   * Constructs an engagement.
   * 
   * @return An instance of Engagement.
   */
  public static native Engagement newInstance() /*-{
    return new $wnd.google.gdata.analytics.Engagement();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.Engagement[name];
  }-*/;

  protected Engagement() { }

  /**
   * Returns the engagement goal's comparison operation.
   * This attribute is required.
   * 
   * @return Engagement goal's comparison operation.
   */
  public final native String getComparison() /*-{
    return this.getComparison();
  }-*/;

  /**
   * Returns the threshold value. This attribute is required.
   * 
   * @return Threshold value.
   */
  public final native double getThresholdValue() /*-{
    return this.getThresholdValue();
  }-*/;

  /**
   * Returns the goal's threshold type. This attribute is required.
   * 
   * @return Goal's threshold type.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the engagement goal's comparison operation.
   * This attribute is required.
   * 
   * @param comparison Engagement goal's comparison operation.
   */
  public final native void setComparison(String comparison) /*-{
    this.setComparison(comparison);
  }-*/;

  /**
   * Sets the threshold value. This attribute is required.
   * 
   * @param thresholdValue Threshold value.
   */
  public final native void setThresholdValue(double thresholdValue) /*-{
    this.setThresholdValue(thresholdValue);
  }-*/;

  /**
   * Sets the goal's threshold type. This attribute is required.
   * 
   * @param type Goal's threshold type.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

}