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
 * Entry element for abpagevariation feed.
 */
public class AbPageVariationEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs an ab page variation entry.
   * 
   * @return An instance of AbPageVariationEntry.
   */
  public static native AbPageVariationEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.AbPageVariationEntry();
  }-*/;

  protected AbPageVariationEntry() { }

  /**
   * Returns the A/B experiment page variation ID. This element is optional.
   * 
   * @return A/B experiment page variation ID.
   */
  public final native GwoAbPageVariationId getAbPageVariationId() /*-{
    return this.getAbPageVariationId();
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
   * Sets the A/B experiment page variation ID. This element is optional.
   * 
   * @param abPageVariationId A/B experiment page variation ID.
   */
  public final native void setAbPageVariationId(GwoAbPageVariationId abPageVariationId) /*-{
    this.setAbPageVariationId(abPageVariationId);
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