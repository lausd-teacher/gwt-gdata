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
 * Google Analytics goal.
 */
public class Goal extends JavaScriptObject {

  /**
   * Constructs a goal.
   * 
   * @return An instance of Goal.
   */
  public static native Goal newInstance() /*-{
    return new $wnd.google.gdata.analytics.Goal();
  }-*/;

  protected Goal() { }

  /**
   * Returns whether the goal is currently active.
   * This attribute is required.
   * 
   * @return Whether the goal is currently active.
   */
  public final native boolean getActive() /*-{
    return this.getActive();
  }-*/;

  /**
   * Returns the destination. This element is optional.
   * 
   * @return Destination.
   */
  public final native Destination getDestination() /*-{
    return this.getDestination();
  }-*/;

  /**
   * Returns the engagement. This element is optional.
   * 
   * @return Engagement.
   */
  public final native Engagement getEngagement() /*-{
    return this.getEngagement();
  }-*/;

  /**
   * Returns the goal's name. This attribute is required.
   * 
   * @return Goal's name.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the goal's number. This attribute is required.
   * 
   * @return Goal's number.
   */
  public final native double getNumber() /*-{
    return this.getNumber();
  }-*/;

  /**
   * Returns the goal's monetary value. This attribute is required.
   * 
   * @return Goal's monetary value.
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets whether the goal is currently active.
   * This attribute is required.
   * 
   * @param active Whether the goal is currently active.
   */
  public final native void setActive(boolean active) /*-{
    this.setActive(active);
  }-*/;

  /**
   * Sets the destination. This element is optional.
   * 
   * @param destination Destination.
   */
  public final native void setDestination(Destination destination) /*-{
    this.setDestination(destination);
  }-*/;

  /**
   * Sets the engagement. This element is optional.
   * 
   * @param engagement Engagement.
   */
  public final native void setEngagement(Engagement engagement) /*-{
    this.setEngagement(engagement);
  }-*/;

  /**
   * Sets the goal's name. This attribute is required.
   * 
   * @param name Goal's name.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the goal's number. This attribute is required.
   * 
   * @param number Goal's number.
   */
  public final native void setNumber(double number) /*-{
    this.setNumber(number);
  }-*/;

  /**
   * Sets the goal's monetary value. This attribute is required.
   * 
   * @param value Goal's monetary value.
   */
  public final native void setValue(double value) /*-{
    this.setValue(value);
  }-*/;

}