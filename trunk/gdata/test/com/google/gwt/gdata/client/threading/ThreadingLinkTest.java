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

package com.google.gwt.gdata.client.threading;

import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Tests for the ThreadingLink class.
 */
public class ThreadingLinkTest extends ThreadingTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("REL_REPLIES", ThreadingLink.REL_REPLIES);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ThreadingLink.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for setUpdated(Date updated)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ThreadingLink obj = ThreadingLink.newInstance();
        double count = 600813;
        obj.setCount(count);
        assertEquals("count", obj.getCount(), count);
        DateTime updated = DateTime.newInstance(new Date(), false);
        obj.setUpdated(updated);
        assertEquals("updated", obj.getUpdated().getDate(), updated.getDate());
        finishGDataTest();
      }
    }, 10000);
  }
}
