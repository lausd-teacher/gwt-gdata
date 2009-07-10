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
 * Tests for the PortfolioEntry class.
 */
public class PortfolioEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PortfolioEntry.newInstance());
  }

  public void testProperties() {
    PortfolioEntry obj = PortfolioEntry.newInstance();
    PortfolioFeedLink feedlink = PortfolioFeedLink.newInstance();
    obj.setFeedLink(feedlink);
    assertSame("feedlink", obj.getFeedLink(), feedlink);
    PortfolioData portfoliodata = PortfolioData.newInstance();
    obj.setPortfolioData(portfoliodata);
    assertSame("portfoliodata", obj.getPortfolioData(), portfoliodata);
  }
}
