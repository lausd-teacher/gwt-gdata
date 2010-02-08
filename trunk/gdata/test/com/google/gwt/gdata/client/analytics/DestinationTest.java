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
 * Tests for the Destination class.
 */
public class DestinationTest extends AnalyticsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("MATCHTYPE_EXACT", Destination.MATCHTYPE_EXACT);
        assertNotNull("MATCHTYPE_HEAD", Destination.MATCHTYPE_HEAD);
        assertNotNull("MATCHTYPE_REGEX", Destination.MATCHTYPE_REGEX);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Destination.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        Destination obj = Destination.newInstance();
        obj.addStep(Step.newInstance());
        assertEquals("addStep", 1, obj.getSteps().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Destination obj = Destination.newInstance();
        boolean step1required = true;
        obj.setStep1Required(step1required);
        assertSame("step1required", obj.getStep1Required(), step1required);
        String expression = "myValue";
        obj.setExpression(expression);
        assertEquals("expression", obj.getExpression(), expression);
        boolean casesensitive = true;
        obj.setCaseSensitive(casesensitive);
        assertSame("casesensitive", obj.getCaseSensitive(), casesensitive);
        Step[] steps = new Step[]{ Step.newInstance() };
        obj.setSteps(steps);
        assertEquals("steps", obj.getSteps().length, steps.length);
        String matchtype = "myValue";
        obj.setMatchType(matchtype);
        assertEquals("matchtype", obj.getMatchType(), matchtype);
        finishGDataTest();
      }
    }, 10000);
  }
}
