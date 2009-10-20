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

/**
 * Tests for the Ordering class.
 */
public class OrderingTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_COMESAFTER", Ordering.REL_COMESAFTER);
        assertNotNull("REL_FIRST", Ordering.REL_FIRST);
        assertNotNull("REL_LAST", Ordering.REL_LAST);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Ordering.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Ordering obj = Ordering.newInstance();
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
        finishGDataTest();
      }
    }, 10000);
  }
}
