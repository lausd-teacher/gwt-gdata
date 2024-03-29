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
 * Tests for the Im class.
 */
public class ImTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("PROTOCOL_AIM", Im.PROTOCOL_AIM);
        assertNotNull("PROTOCOL_GOOGLE_TALK", Im.PROTOCOL_GOOGLE_TALK);
        assertNotNull("PROTOCOL_ICQ", Im.PROTOCOL_ICQ);
        assertNotNull("PROTOCOL_JABBER", Im.PROTOCOL_JABBER);
        assertNotNull("PROTOCOL_MSN", Im.PROTOCOL_MSN);
        assertNotNull("PROTOCOL_NETMEETING", Im.PROTOCOL_NETMEETING);
        assertNotNull("PROTOCOL_QQ", Im.PROTOCOL_QQ);
        assertNotNull("PROTOCOL_SKYPE", Im.PROTOCOL_SKYPE);
        assertNotNull("PROTOCOL_YAHOO", Im.PROTOCOL_YAHOO);
        assertNotNull("REL_HOME", Im.REL_HOME);
        assertNotNull("REL_OTHER", Im.REL_OTHER);
        assertNotNull("REL_WORK", Im.REL_WORK);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Im.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Im obj = Im.newInstance();
        boolean primary = true;
        obj.setPrimary(primary);
        assertSame("primary", obj.getPrimary(), primary);
        String rel = "myValue";
        obj.setRel(rel);
        assertEquals("rel", obj.getRel(), rel);
        String label = "myValue";
        obj.setLabel(label);
        assertEquals("label", obj.getLabel(), label);
        String protocol = "myValue";
        obj.setProtocol(protocol);
        assertEquals("protocol", obj.getProtocol(), protocol);
        String address = "myValue";
        obj.setAddress(address);
        assertEquals("address", obj.getAddress(), address);
        finishGDataTest();
      }
    }, 10000);
  }
}
