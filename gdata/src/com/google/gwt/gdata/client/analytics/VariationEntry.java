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
 * Entry element for variation feed.
 */
public class VariationEntry
    extends com.google.gwt.gdata.client.Entry<VariationEntry> {

  /**
   * Constructs a variation entry.
   * 
   * @return An instance of VariationEntry.
   */
  public static native VariationEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.VariationEntry();
  }-*/;

  protected VariationEntry() { }

  /**
   * Returns the experiment ID. This element is optional.
   * 
   * @return Experiment ID.
   */
  public final native GwoExperimentId getExperimentId() /*-{
    return this.getExperimentId();
  }-*/;

  /**
   * Returns the section ID. This element is optional.
   * 
   * @return Section ID.
   */
  public final native GwoSectionId getSectionId() /*-{
    return this.getSectionId();
  }-*/;

  /**
   * Returns the variation ID. This element is optional.
   * 
   * @return Variation ID.
   */
  public final native GwoVariationId getVariationId() /*-{
    return this.getVariationId();
  }-*/;

  /**
   * Sets the experiment ID. This element is optional.
   * 
   * @param experimentId Experiment ID.
   */
  public final native void setExperimentId(GwoExperimentId experimentId) /*-{
    this.setExperimentId(experimentId);
  }-*/;

  /**
   * Sets the section ID. This element is optional.
   * 
   * @param sectionId Section ID.
   */
  public final native void setSectionId(GwoSectionId sectionId) /*-{
    this.setSectionId(sectionId);
  }-*/;

  /**
   * Sets the variation ID. This element is optional.
   * 
   * @param variationId Variation ID.
   */
  public final native void setVariationId(GwoVariationId variationId) /*-{
    this.setVariationId(variationId);
  }-*/;

}