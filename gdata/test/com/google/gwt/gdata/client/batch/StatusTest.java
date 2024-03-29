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

package com.google.gwt.gdata.client.batch;

/**
 * Tests for the Status class.
 */
public class StatusTest extends BatchTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Status.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Status obj = Status.newInstance();
        String contenttype = "myValue";
        obj.setContentType(contenttype);
        assertEquals("contenttype", obj.getContentType(), contenttype);
        double code = 600813;
        obj.setCode(code);
        assertEquals("code", obj.getCode(), code);
        String content = "myValue";
        obj.setContent(content);
        assertEquals("content", obj.getContent(), content);
        String reason = "myValue";
        obj.setReason(reason);
        assertEquals("reason", obj.getReason(), reason);
        finishGDataTest();
      }
    }, 10000);
  }
}
