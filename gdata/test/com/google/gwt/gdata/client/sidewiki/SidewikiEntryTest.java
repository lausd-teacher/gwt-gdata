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

import com.google.gwt.gdata.client.Rating;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Tests for the SidewikiEntry class.
 */
public class SidewikiEntryTest extends SidewikiTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", SidewikiEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        SidewikiEntry obj = SidewikiEntry.newInstance();
        // Unit Test for getHtmlLink()
        assertEquals("getHtmlLink", obj.getHtmlLink(), null);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        SidewikiEntry obj = SidewikiEntry.newInstance();
        Rating rating = Rating.newInstance();
        obj.setRating(rating);
        assertSame("rating", obj.getRating(), rating);
        ResourceId resourceid = ResourceId.newInstance();
        obj.setResourceId(resourceid);
        assertSame("resourceid", obj.getResourceId(), resourceid);
        Source entrysource = Source.newInstance();
        obj.setEntrySource(entrysource);
        assertSame("entrysource", obj.getEntrySource(), entrysource);
        finishGDataTest();
      }
    }, 10000);
  }
}
