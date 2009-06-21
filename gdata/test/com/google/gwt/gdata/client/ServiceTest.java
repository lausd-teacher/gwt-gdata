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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Service class.
 */
public class ServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Service.newInstance("myValue", "myValue"));
  }

  public void testOther() {
    // Unit Test for deleteEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for insertEntry(String uri, JavaScriptObject entry, function(Object) continuation, function(Error) opt_errorHandler, Function entryClass)
    // Unit Test for setAltSupport(String alt, boolean supported)
    // Unit Test for setDeveloperKey(String developerKey)
    // Unit Test for setHeaders(JavaScriptObject headers)
    // Unit Test for supportsAlt(String alt)
    // Unit Test for updateEntry(String uri, JavaScriptObject entry, function(Object) continuation, function(Error) opt_errorHandler, Function entryClass)
  }

  public void testProperties() {
    Service obj = Service.newInstance("myValue", "myValue");
    boolean xd2supported = true;
    obj.setXd2Supported(xd2supported);
    assertSame("xd2supported", obj.isXd2Supported(), xd2supported);
  }
}
