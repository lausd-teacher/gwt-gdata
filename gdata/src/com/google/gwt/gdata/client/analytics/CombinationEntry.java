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
 * Entry element for combination feed.
 */
public class CombinationEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a combination entry.
   * 
   * @return An instance of CombinationEntry.
   */
  public static native CombinationEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.CombinationEntry();
  }-*/;

  protected CombinationEntry() { }

  /**
   * Returns the flag indicating if the combination is active.
   * This element is optional.
   * 
   * @return Flag indicating if the combination is active.
   */
  public final native GwoComboActive getComboActive() /*-{
    return this.getComboActive();
  }-*/;

  /**
   * Returns the combination ID. This element is optional.
   * 
   * @return Combination ID.
   */
  public final native GwoComboId getComboId() /*-{
    return this.getComboId();
  }-*/;

  /**
   * Returns the string that specifies a combination in an experiment.
   * This element is optional.
   * 
   * @return String that specifies a combination in an experiment.
   */
  public final native GwoComboString getComboString() /*-{
    return this.getComboString();
  }-*/;

  /**
   * Returns the experiment ID. This element is optional.
   * 
   * @return Experiment ID.
   */
  public final native GwoExperimentId getExperimentId() /*-{
    return this.getExperimentId();
  }-*/;

  /**
   * Sets the flag indicating if the combination is active.
   * This element is optional.
   * 
   * @param comboActive Flag indicating if the combination is active.
   */
  public final native void setComboActive(GwoComboActive comboActive) /*-{
    this.setComboActive(comboActive);
  }-*/;

  /**
   * Sets the combination ID. This element is optional.
   * 
   * @param comboId Combination ID.
   */
  public final native void setComboId(GwoComboId comboId) /*-{
    this.setComboId(comboId);
  }-*/;

  /**
   * Sets the string that specifies a combination in an experiment.
   * This element is optional.
   * 
   * @param comboString String that specifies a combination in an experiment.
   */
  public final native void setComboString(GwoComboString comboString) /*-{
    this.setComboString(comboString);
  }-*/;

  /**
   * Sets the experiment ID. This element is optional.
   * 
   * @param experimentId Experiment ID.
   */
  public final native void setExperimentId(GwoExperimentId experimentId) /*-{
    this.setExperimentId(experimentId);
  }-*/;

}