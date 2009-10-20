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
 * Tests for the FeedLink class.
 */
public class FeedLinkTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", FeedLink.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  @SuppressWarnings("unchecked")
  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        FeedLink obj = FeedLink.newInstance();
        assertEquals("getFeed", obj.getFeed(), null);
        finishGDataTest();
      }
    }, 10000);
  }

  @SuppressWarnings("unchecked")
  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        FeedLink obj = FeedLink.newInstance();
        boolean readonly = true;
        obj.setReadOnly(readonly);
        assertSame("readonly", obj.getReadOnly(), readonly);
        double counthint = 600813;
        obj.setCountHint(counthint);
        assertEquals("counthint", obj.getCountHint(), counthint);
        String rel = "myValue";
        obj.setRel(rel);
        assertEquals("rel", obj.getRel(), rel);
        String href = "myValue";
        obj.setHref(href);
        assertEquals("href", obj.getHref(), href);
        finishGDataTest();
      }
    }, 10000);
  }
}
