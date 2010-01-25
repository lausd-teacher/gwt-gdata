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
 * Entry element for section feed.
 */
public class SectionEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a section entry.
   * 
   * @return An instance of SectionEntry.
   */
  public static native SectionEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.SectionEntry();
  }-*/;

  protected SectionEntry() { }

  /**
   * Returns the experiment ID. This element is optional.
   * 
   * @return Experiment ID.
   */
  public final native GwoExperimentId getExperimentId() /*-{
    return this.getExperimentId();
  }-*/;

  /**
   * Returns the number of section variations. This element is optional.
   * 
   * @return Number of section variations.
   */
  public final native GwoNumVariations getNumVariations() /*-{
    return this.getNumVariations();
  }-*/;

  /**
   * Returns the script snippet to mark the beginning of a section.
   * This element is optional.
   * 
   * @return Script snippet to mark the beginning of a section.
   */
  public final native GwoSectionBeginScript getSectionBeginScript() /*-{
    return this.getSectionBeginScript();
  }-*/;

  /**
   * Returns the script snippet to mark the end of a section.
   * This element is optional.
   * 
   * @return Script snippet to mark the end of a section.
   */
  public final native GwoSectionEndScript getSectionEndScript() /*-{
    return this.getSectionEndScript();
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
   * Sets the experiment ID. This element is optional.
   * 
   * @param experimentId Experiment ID.
   */
  public final native void setExperimentId(GwoExperimentId experimentId) /*-{
    this.setExperimentId(experimentId);
  }-*/;

  /**
   * Sets the number of section variations. This element is optional.
   * 
   * @param numVariations Number of section variations.
   */
  public final native void setNumVariations(
        GwoNumVariations numVariations) /*-{
    this.setNumVariations(numVariations);
  }-*/;

  /**
   * Sets the script snippet to mark the beginning of a section.
   * This element is optional.
   * 
   * @param sectionBeginScript Script snippet to mark the
   * beginning of a section.
   */
  public final native void setSectionBeginScript(
        GwoSectionBeginScript sectionBeginScript) /*-{
    this.setSectionBeginScript(
      sectionBeginScript
    );
  }-*/;

  /**
   * Sets the script snippet to mark the end of a section.
   * This element is optional.
   * 
   * @param sectionEndScript Script snippet to mark the end of a section.
   */
  public final native void setSectionEndScript(
        GwoSectionEndScript sectionEndScript) /*-{
    this.setSectionEndScript(
      sectionEndScript
    );
  }-*/;

  /**
   * Sets the section ID. This element is optional.
   * 
   * @param sectionId Section ID.
   */
  public final native void setSectionId(GwoSectionId sectionId) /*-{
    this.setSectionId(sectionId);
  }-*/;

}