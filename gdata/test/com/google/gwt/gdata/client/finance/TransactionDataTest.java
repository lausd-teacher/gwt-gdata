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
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests for the TransactionData class.
 */
public class TransactionDataTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", TransactionData.getConstructor());
    assertNotNull("newInstance()", TransactionData.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    TransactionData obj = TransactionData.newInstance(JavaScriptObject.createObject());
    DateTime date = DateTime.newInstance(new Date(), true);
    obj.setDate(date);
    assertEquals("date", obj.getDate().getDate(), date.getDate());
    Price price = Price.newInstance(JavaScriptObject.createObject());
    obj.setPrice(price);
    assertSame("price", obj.getPrice(), price);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    double shares = 600813;
    obj.setShares(shares);
    assertEquals("shares", obj.getShares(), shares);
    Commission commission = Commission.newInstance(JavaScriptObject.createObject());
    obj.setCommission(commission);
    assertSame("commission", obj.getCommission(), commission);
    String notes = "myValue";
    obj.setNotes(notes);
    assertEquals("notes", obj.getNotes(), notes);
  }
}
