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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Money;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CostBasis class.
 */
public class CostBasisTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", CostBasis.getConstructor());
    assertNotNull("newInstance()", CostBasis.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    CostBasis obj = CostBasis.newInstance(JavaScriptObject.createObject());
    JsArray<Money> money = ArrayHelper.toJsArray(Money.newInstance(JavaScriptObject.createObject()));
    obj.setMoney(money);
    assertEquals("money", obj.getMoney().length(), money.length());
    int lenMoney = obj.getMoney().length();
    obj.addMoney(Money.newInstance(JavaScriptObject.createObject()));
    assertEquals("money", obj.getMoney().length(), lenMoney + 1);
  }
}
