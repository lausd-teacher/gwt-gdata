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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CalendarService class.
 */
public class CalendarServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", CalendarService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", CalendarService.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for getAclFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getAllCalendarsFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCalendarAclEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCalendarCommentEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCalendarEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCalendarEventEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCalendarsFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCommentsFeed(CalendarCommentQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getCommentsFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getEventsFeed(CalendarEventQuery uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getEventsFeed(String uriOrQuery, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getOwnCalendarsFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getSettingsEntry(String uri, function(Object) continuation, function(Error) opt_errorHandler)
    // Unit Test for getSettingsFeed(String uri, function(Object) continuation, function(Error) opt_errorHandler)
  }
}
