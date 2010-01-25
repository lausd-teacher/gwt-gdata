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
 * Destination-URL goal.
 */
public class Destination extends JavaScriptObject {

  /**
   * Exact destination.
   */
  public static final String MATCHTYPE_EXACT = getConstant("MATCHTYPE_EXACT");

  /**
   * Head destination.
   */
  public static final String MATCHTYPE_HEAD = getConstant("MATCHTYPE_HEAD");

  /**
   * Regex destination.
   */
  public static final String MATCHTYPE_REGEX = getConstant("MATCHTYPE_REGEX");

  /**
   * Constructs a destination.
   * 
   * @return An instance of Destination.
   */
  public static native Destination newInstance() /*-{
    return new $wnd.google.gdata.analytics.Destination();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.Destination[name];
  }-*/;

  protected Destination() { }

  /**
   * Adds a new step.
   * 
   * @param step Step to add.
   */
  public final native void addStep(Step step) /*-{
    this.addStep(step);
  }-*/;

  /**
   * Returns whether path URL matching is case sensitive.
   * This attribute is required.
   * 
   * @return Whether path URL matching is case sensitive.
   */
  public final native boolean getCaseSensitive() /*-{
    return this.getCaseSensitive();
  }-*/;

  /**
   * Returns the goal's path expression. This attribute is required.
   * 
   * @return Goal's path expression.
   */
  public final native String getExpression() /*-{
    return this.getExpression();
  }-*/;

  /**
   * Returns the the match type for the path expression.
   * This attribute is required.
   * 
   * @return The match type for the path expression.
   */
  public final native String getMatchType() /*-{
    return this.getMatchType();
  }-*/;

  /**
   * Returns whether step 1 is required for this goal.
   * This attribute is required.
   * 
   * @return Whether step 1 is required for this goal.
   */
  public final native boolean getStep1Required() /*-{
    return this.getStep1Required();
  }-*/;

  /**
   * Returns the steps.
   * 
   * @return Steps.
   */
  public final native Step[] getSteps() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getSteps());
  }-*/;

  /**
   * Sets whether path URL matching is case sensitive.
   * This attribute is required.
   * 
   * @param caseSensitive Whether path URL matching is case sensitive.
   */
  public final native void setCaseSensitive(boolean caseSensitive) /*-{
    this.setCaseSensitive(caseSensitive);
  }-*/;

  /**
   * Sets the goal's path expression. This attribute is required.
   * 
   * @param expression Goal's path expression.
   */
  public final native void setExpression(String expression) /*-{
    this.setExpression(expression);
  }-*/;

  /**
   * Sets the the match type for the path expression.
   * This attribute is required.
   * 
   * @param matchType The match type for the path expression.
   */
  public final native void setMatchType(String matchType) /*-{
    this.setMatchType(matchType);
  }-*/;

  /**
   * Sets whether step 1 is required for this goal.
   * This attribute is required.
   * 
   * @param step1Required Whether step 1 is required for this goal.
   */
  public final native void setStep1Required(boolean step1Required) /*-{
    this.setStep1Required(step1Required);
  }-*/;

  /**
   * Sets the steps.
   * 
   * @param steps Steps, where each step is added using addStep().
   */
  public final native void setSteps(Step[] steps) /*-{
    this.setSteps(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(steps)
    );
  }-*/;

}