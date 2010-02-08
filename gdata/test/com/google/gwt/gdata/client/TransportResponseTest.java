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
 * Tests for the TransportResponse class.
 */
public class TransportResponseTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", TransportResponse.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        TransportResponse obj = TransportResponse.newInstance();
        obj.addHeader("myHeader", "myValue");
        assertEquals("getResponseHeader", "myValue", obj.getResponseHeader("myHeader"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        TransportResponse obj = TransportResponse.newInstance();
        double status = 600813;
        obj.setStatus(status);
        assertEquals("status", obj.getStatus(), status);
        String responsexml = "myValue";
        obj.setResponseXml(responsexml);
        assertEquals("responsexml", obj.getResponseXml(), responsexml);
        String statustext = "myValue";
        obj.setStatusText(statustext);
        assertEquals("statustext", obj.getStatusText(), statustext);
        String responsetext = "myValue";
        obj.setResponseText(responsetext);
        assertEquals("responsetext", obj.getResponseText(), responsetext);
        finishGDataTest();
      }
    }, 10000);
  }
}
