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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ContactsService class.
 */
public class ContactsServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", ContactsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ContactsService.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for getContactEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getContactFeed(ContactQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getContactFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getContactGroupEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getContactGroupFeed(ContactQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getContactGroupFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
  }
}
