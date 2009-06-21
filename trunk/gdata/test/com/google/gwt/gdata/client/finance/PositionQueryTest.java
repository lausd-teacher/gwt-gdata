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
 * Tests for the PositionQuery class.
 */
public class PositionQueryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PositionQuery.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for setIncludeReturns(String includeReturns)
    // Unit Test for setInlineTransactions(String inlineTransactions)
  }

  public void testProperties() {
    PositionQuery obj = PositionQuery.newInstance("myValue");
    boolean inlinetransactions = true;
    obj.setInlineTransactions(inlinetransactions);
    assertSame("inlinetransactions", obj.getInlineTransactions(), inlinetransactions);
    boolean includereturns = true;
    obj.setIncludeReturns(includereturns);
    assertSame("includereturns", obj.getIncludeReturns(), includereturns);
  }
}
