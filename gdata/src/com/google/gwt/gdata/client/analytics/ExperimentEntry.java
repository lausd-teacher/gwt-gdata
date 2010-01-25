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
 * Entry element for experiment feed.
 */
public class ExperimentEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs an experiment entry.
   * 
   * @return An instance of ExperimentEntry.
   */
  public static native ExperimentEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.ExperimentEntry();
  }-*/;

  protected ExperimentEntry() { }

  /**
   * Returns the Analytics account ID. This element is optional.
   * 
   * @return Analytics account ID.
   */
  public final native GwoAnalyticsAccountId getAnalyticsAccountId() /*-{
    return this.getAnalyticsAccountId();
  }-*/;

  /**
   * Returns the auto-prune mode. This element is optional.
   * 
   * @return Auto-prune mode.
   */
  public final native GwoAutoPruneMode getAutoPruneMode() /*-{
    return this.getAutoPruneMode();
  }-*/;

  /**
   * Returns the script to control the experiment.
   * This element is optional.
   * 
   * @return Script to control the experiment.
   */
  public final native GwoControlScript getControlScript() /*-{
    return this.getControlScript();
  }-*/;

  /**
   * Returns the script to record conversions.
   * This element is optional.
   * 
   * @return Script to record conversions.
   */
  public final native GwoConversionScript getConversionScript() /*-{
    return this.getConversionScript();
  }-*/;

  /**
   * Returns the percentage of traffic to send to the experiment.
   * This element is optional.
   * 
   * @return Percentage of traffic to send to the experiment.
   */
  public final native GwoCoverage getCoverage() /*-{
    return this.getCoverage();
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
   * Returns the experiment's notes. This element is optional.
   * 
   * @return Experiment's notes.
   */
  public final native GwoExperimentNotes getExperimentNotes() /*-{
    return this.getExperimentNotes();
  }-*/;

  /**
   * Returns the experiment type. This element is optional.
   * 
   * @return Experiment type.
   */
  public final native GwoExperimentType getExperimentType() /*-{
    return this.getExperimentType();
  }-*/;

  /**
   * Returns the number of page variations in an A/B experiment.
   * This element is optional.
   * 
   * @return Number of page variations in an A/B experiment.
   */
  public final native GwoNumAbPageVariations getNumAbPageVariations() /*-{
    return this.getNumAbPageVariations();
  }-*/;

  /**
   * Returns the number of combinations. This element is optional.
   * 
   * @return Number of combinations.
   */
  public final native GwoNumCombinations getNumCombinations() /*-{
    return this.getNumCombinations();
  }-*/;

  /**
   * Returns the number of sections in a multivariate experiment.
   * This element is optional.
   * 
   * @return Number of sections in a multivariate experiment.
   */
  public final native GwoNumSections getNumSections() /*-{
    return this.getNumSections();
  }-*/;

  /**
   * Returns the experiment ID that identifies the source experiment.
   * This element is optional.
   * 
   * @return Experiment ID that identifies the source experiment.
   */
  public final native GwoSourceExperimentId getSourceExperimentId() /*-{
    return this.getSourceExperimentId();
  }-*/;

  /**
   * Returns the experiment status. This element is optional.
   * 
   * @return Experiment status.
   */
  public final native GwoStatus getStatus() /*-{
    return this.getStatus();
  }-*/;

  /**
   * Returns the script to track this experiment.
   * This element is optional.
   * 
   * @return Script to track this experiment.
   */
  public final native GwoTrackingScript getTrackingScript() /*-{
    return this.getTrackingScript();
  }-*/;

  /**
   * Returns the verification combination index.
   * This element is optional.
   * 
   * @return Verification combination index.
   */
  public final native GwoVerificationCombo getVerificationCombo() /*-{
    return this.getVerificationCombo();
  }-*/;

  /**
   * Returns the percentage of traffic to send to the verify combo.
   * This element is optional.
   * 
   * @return Percentage of traffic to send to the verify combo.
   */
  public final native GwoVerificationComboCoverage
      getVerificationComboCoverage() /*-{
    return this.getVerificationComboCoverage();
  }-*/;

  /**
   * Sets the Analytics account ID. This element is optional.
   * 
   * @param analyticsAccountId Analytics account ID.
   */
  public final native void setAnalyticsAccountId(
      GwoAnalyticsAccountId analyticsAccountId) /*-{
    this.setAnalyticsAccountId(analyticsAccountId);
  }-*/;

  /**
   * Sets the auto-prune mode. This element is optional.
   * 
   * @param autoPruneMode Auto-prune mode.
   */
  public final native void setAutoPruneMode(
      GwoAutoPruneMode autoPruneMode) /*-{
    this.setAutoPruneMode(autoPruneMode);
  }-*/;

  /**
   * Sets the script to control the experiment. This element is optional.
   * 
   * @param controlScript Script to control the experiment.
   */
  public final native void setControlScript(
      GwoControlScript controlScript) /*-{
    this.setControlScript(controlScript);
  }-*/;

  /**
   * Sets the script to record conversions. This element is optional.
   * 
   * @param conversionScript Script to record conversions.
   */
  public final native void setConversionScript(
      GwoConversionScript conversionScript) /*-{
    this.setConversionScript(conversionScript);
  }-*/;

  /**
   * Sets the percentage of traffic to send to the experiment.
   * This element is optional.
   * 
   * @param coverage Percentage of traffic to send to the experiment.
   */
  public final native void setCoverage(GwoCoverage coverage) /*-{
    this.setCoverage(coverage);
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
   * Sets the experiment's notes. This element is optional.
   * 
   * @param experimentNotes Experiment's notes.
   */
  public final native void setExperimentNotes(
      GwoExperimentNotes experimentNotes) /*-{
    this.setExperimentNotes(experimentNotes);
  }-*/;

  /**
   * Sets the experiment type. This element is optional.
   * 
   * @param experimentType Experiment type.
   */
  public final native void setExperimentType(
      GwoExperimentType experimentType) /*-{
    this.setExperimentType(experimentType);
  }-*/;

  /**
   * Sets the number of page variations in an A/B experiment.
   * This element is optional.
   * 
   * @param numAbPageVariations Number of page variations in an A/B experiment.
   */
  public final native void setNumAbPageVariations(
      GwoNumAbPageVariations numAbPageVariations) /*-{
    this.setNumAbPageVariations(numAbPageVariations);
  }-*/;

  /**
   * Sets the number of combinations. This element is optional.
   * 
   * @param numCombinations Number of combinations.
   */
  public final native void setNumCombinations(
      GwoNumCombinations numCombinations) /*-{
    this.setNumCombinations(numCombinations);
  }-*/;
  
  /**
   * Sets the number of sections in a multivariate experiment. 
   * This element is optional.
   * 
   * @param numSections Number of sections in a multivariate experiment.
   */
  public final native void setNumSections(GwoNumSections numSections) /*-{
    this.setNumSections(numSections);
  }-*/;

  /**
   * Sets the experiment ID that identifies the source experiment.
   * This element is optional.
   * 
   * @param sourceExperimentId Experiment ID that identifies the
   * source experiment.
   */
  public final native void setSourceExperimentId(
      GwoSourceExperimentId sourceExperimentId) /*-{
    this.setSourceExperimentId(sourceExperimentId);
  }-*/;

  /**
   * Sets the experiment status. This element is optional.
   * 
   * @param status Experiment status.
   */
  public final native void setStatus(GwoStatus status) /*-{
    this.setStatus(status);
  }-*/;

  /**
   * Sets the script to track this experiment. This element is optional.
   * 
   * @param trackingScript Script to track this experiment.
   */
  public final native void setTrackingScript(
      GwoTrackingScript trackingScript) /*-{
    this.setTrackingScript(trackingScript);
  }-*/;

  /**
   * Sets the verification combination index. This element is optional.
   * 
   * @param verificationCombo Verification combination index.
   */
  public final native void setVerificationCombo(
      GwoVerificationCombo verificationCombo) /*-{
    this.setVerificationCombo(verificationCombo);
  }-*/;

  /**
   * Sets the percentage of traffic to send to the verify combo.
   * This element is optional.
   * 
   * @param verificationComboCoverage Percentage of traffic to send
   * to the verify combo.
   */
  public final native void setVerificationComboCoverage(
      GwoVerificationComboCoverage verificationComboCoverage) /*-{
    this.setVerificationComboCoverage(verificationComboCoverage);
  }-*/;

}