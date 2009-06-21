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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Ordering class.
 */
public class OrderingTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_COMESAFTER", Ordering.REL_COMESAFTER);
    assertNotNull("REL_FIRST", Ordering.REL_FIRST);
    assertNotNull("REL_LAST", Ordering.REL_LAST);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Ordering.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    Ordering obj = Ordering.newInstance(JavaScriptObject.createObject());
    String ref = "myValue";
    obj.setRef(ref);
    assertEquals("ref", obj.getRef(), ref);
    String next = "myValue";
    obj.setNext(next);
    assertEquals("next", obj.getNext(), next);
    String prev = "myValue";
    obj.setPrev(prev);
    assertEquals("prev", obj.getPrev(), prev);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String orderid = "myValue";
    obj.setOrderId(orderid);
    assertEquals("orderid", obj.getOrderId(), orderid);
  }
}