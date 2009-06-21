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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PortfolioData class.
 */
public class PortfolioDataTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PortfolioData.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    PortfolioData obj = PortfolioData.newInstance(JavaScriptObject.createObject());
    double gainpercentage = 600813;
    obj.setGainPercentage(gainpercentage);
    assertEquals("gainpercentage", obj.getGainPercentage(), gainpercentage);
    double return3m = 600813;
    obj.setReturn3m(return3m);
    assertEquals("return3m", obj.getReturn3m(), return3m);
    Gain gain = Gain.newInstance(JavaScriptObject.createObject());
    obj.setGain(gain);
    assertSame("gain", obj.getGain(), gain);
    double return1y = 600813;
    obj.setReturn1y(return1y);
    assertEquals("return1y", obj.getReturn1y(), return1y);
    double returnoverall = 600813;
    obj.setReturnOverall(returnoverall);
    assertEquals("returnoverall", obj.getReturnOverall(), returnoverall);
    double return4w = 600813;
    obj.setReturn4w(return4w);
    assertEquals("return4w", obj.getReturn4w(), return4w);
    double return1w = 600813;
    obj.setReturn1w(return1w);
    assertEquals("return1w", obj.getReturn1w(), return1w);
    CostBasis costbasis = CostBasis.newInstance(JavaScriptObject.createObject());
    obj.setCostBasis(costbasis);
    assertSame("costbasis", obj.getCostBasis(), costbasis);
    double return3y = 600813;
    obj.setReturn3y(return3y);
    assertEquals("return3y", obj.getReturn3y(), return3y);
    DaysGain daysgain = DaysGain.newInstance(JavaScriptObject.createObject());
    obj.setDaysGain(daysgain);
    assertSame("daysgain", obj.getDaysGain(), daysgain);
    MarketValue marketvalue = MarketValue.newInstance(JavaScriptObject.createObject());
    obj.setMarketValue(marketvalue);
    assertSame("marketvalue", obj.getMarketValue(), marketvalue);
    String currencycode = "myValue";
    obj.setCurrencyCode(currencycode);
    assertEquals("currencycode", obj.getCurrencyCode(), currencycode);
    double returnytd = 600813;
    obj.setReturnYTD(returnytd);
    assertEquals("returnytd", obj.getReturnYTD(), returnytd);
    double return5y = 600813;
    obj.setReturn5y(return5y);
    assertEquals("return5y", obj.getReturn5y(), return5y);
  }
}
