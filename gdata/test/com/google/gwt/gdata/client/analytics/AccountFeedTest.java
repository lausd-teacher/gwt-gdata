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

package com.google.gwt.gdata.client.analytics;

/**
 * Tests for the AccountFeed class.
 */
public class AccountFeedTest extends AnalyticsTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("KIND_ANALYTICS_ACCOUNTS", AccountFeed.KIND_ANALYTICS_ACCOUNTS);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AccountFeed.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        AccountFeed obj = AccountFeed.newInstance();
        // Unit Test for addSegment(Segment segment)
        // Unit Test for getNextLink()
        assertEquals("getNextLink", obj.getNextLink(), null);
        // Unit Test for getPreviousLink()
        assertEquals("getPreviousLink", obj.getPreviousLink(), null);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    AccountFeed obj = AccountFeed.newInstance();
    Segment[] segments = new Segment[]{ Segment.newInstance() };
    obj.setSegments(segments);
    assertEquals("segments", obj.getSegments().length, segments.length);
  }
  
}
