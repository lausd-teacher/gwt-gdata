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

/**
 * Tests for the SnippetsFeed class.
 */
public class SnippetsFeedTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", SnippetsFeed.newInstance());
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        SnippetsFeed obj = SnippetsFeed.newInstance();
        assertNull("getFeedBatchLink", obj.getFeedBatchLink());
        assertNull("getNextLink", obj.getNextLink());
        assertNull("getPreviousLink", obj.getPreviousLink());
        finishGDataTest();
      }
    }, 10000);
  }
}
