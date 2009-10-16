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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the SidewikiService class.
 */
public class SidewikiServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", SidewikiService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", SidewikiService.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for getSidewikiEntry(String uri, function(Object) callback, function(Error) opt_errorHandler)
    // Unit Test for getSidewikiEntryFeed(SidewikiEntryQuery query, function(Object) callback, function(Error) opt_errorHandler)
    // Unit Test for getSidewikiEntryFeed(String uri, function(Object) callback, function(Error) opt_errorHandler)
    // Unit Test for getSidewikiUserEntry(String uri, function(Object) callback, function(Error) opt_errorHandler)
    // Unit Test for getSidewikiUserFeed(SidewikiUserQuery query, function(Object) callback, function(Error) opt_errorHandler)
    // Unit Test for getSidewikiUserFeed(String uri, function(Object) callback, function(Error) opt_errorHandler)
  }
}
