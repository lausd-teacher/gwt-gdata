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
 * Tests for the ExperimentEntry class.
 */
public class ExperimentEntryTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ExperimentEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ExperimentEntry obj = ExperimentEntry.newInstance();
        GwoVerificationCombo verificationcombo = GwoVerificationCombo.newInstance();
        obj.setVerificationCombo(verificationcombo);
        assertSame("verificationcombo", obj.getVerificationCombo(), verificationcombo);
        GwoExperimentNotes experimentnotes = GwoExperimentNotes.newInstance();
        obj.setExperimentNotes(experimentnotes);
        assertSame("experimentnotes", obj.getExperimentNotes(), experimentnotes);
        GwoExperimentId experimentid = GwoExperimentId.newInstance();
        obj.setExperimentId(experimentid);
        assertSame("experimentid", obj.getExperimentId(), experimentid);
        GwoNumAbPageVariations numabpagevariations = GwoNumAbPageVariations.newInstance();
        obj.setNumAbPageVariations(numabpagevariations);
        assertSame("numabpagevariations", obj.getNumAbPageVariations(), numabpagevariations);
        GwoNumSections numsections = GwoNumSections.newInstance();
        obj.setNumSections(numsections);
        assertSame("numsections", obj.getNumSections(), numsections);
        GwoTrackingScript trackingscript = GwoTrackingScript.newInstance();
        obj.setTrackingScript(trackingscript);
        assertSame("trackingscript", obj.getTrackingScript(), trackingscript);
        GwoVerificationComboCoverage verificationcombocoverage = GwoVerificationComboCoverage.newInstance();
        obj.setVerificationComboCoverage(verificationcombocoverage);
        assertSame("verificationcombocoverage", obj.getVerificationComboCoverage(), verificationcombocoverage);
        GwoControlScript controlscript = GwoControlScript.newInstance();
        obj.setControlScript(controlscript);
        assertSame("controlscript", obj.getControlScript(), controlscript);
        GwoStatus status = GwoStatus.newInstance();
        obj.setStatus(status);
        assertSame("status", obj.getStatus(), status);
        GwoCoverage coverage = GwoCoverage.newInstance();
        obj.setCoverage(coverage);
        assertSame("coverage", obj.getCoverage(), coverage);
        GwoSourceExperimentId sourceexperimentid = GwoSourceExperimentId.newInstance();
        obj.setSourceExperimentId(sourceexperimentid);
        assertSame("sourceexperimentid", obj.getSourceExperimentId(), sourceexperimentid);
        GwoConversionScript conversionscript = GwoConversionScript.newInstance();
        obj.setConversionScript(conversionscript);
        assertSame("conversionscript", obj.getConversionScript(), conversionscript);
        GwoAnalyticsAccountId analyticsaccountid = GwoAnalyticsAccountId.newInstance();
        obj.setAnalyticsAccountId(analyticsaccountid);
        assertSame("analyticsaccountid", obj.getAnalyticsAccountId(), analyticsaccountid);
        GwoExperimentType experimenttype = GwoExperimentType.newInstance();
        obj.setExperimentType(experimenttype);
        assertSame("experimenttype", obj.getExperimentType(), experimenttype);
        GwoAutoPruneMode autoprunemode = GwoAutoPruneMode.newInstance();
        obj.setAutoPruneMode(autoprunemode);
        assertSame("autoprunemode", obj.getAutoPruneMode(), autoprunemode);
        GwoNumCombinations numcombinations = GwoNumCombinations.newInstance();
        obj.setNumCombinations(numcombinations);
        assertSame("numcombinations", obj.getNumCombinations(), numcombinations);
        finishGDataTest();
      }
    }, 10000);
  }
}
