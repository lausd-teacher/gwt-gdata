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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PortfolioQuery class.
 */
public class PortfolioQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PortfolioQuery.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for setIncludeReturns(String includeReturns)
    // Unit Test for setInlinePositions(String inlinePositions)
  }

  public void testProperties() {
    PortfolioQuery obj = PortfolioQuery.newInstance("myValue");
    boolean includereturns = true;
    obj.setIncludeReturns(includereturns);
    assertSame("includereturns", obj.getIncludeReturns(), includereturns);
    boolean inlinepositions = true;
    obj.setInlinePositions(inlinepositions);
    assertSame("inlinepositions", obj.getInlinePositions(), inlinepositions);
  }
}