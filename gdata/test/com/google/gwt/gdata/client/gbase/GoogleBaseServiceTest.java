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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the GoogleBaseService class.
 */
public class GoogleBaseServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", GoogleBaseService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", GoogleBaseService.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for getAttributesEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getAttributesFeed(AttributesQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getAttributesFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemsEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemsFeed(ItemsQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemsFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemTypesEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemTypesFeed(ItemTypesQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getItemTypesFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getLocalesEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getLocalesFeed(LocalesQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getLocalesFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getMediaEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getMediaFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getSnippetsEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getSnippetsFeed(SnippetsQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getSnippetsFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
  }
}
