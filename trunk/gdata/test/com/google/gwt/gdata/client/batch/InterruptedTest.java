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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Interrupted class.
 */
public class InterruptedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Interrupted.newInstance());
  }

  public void testProperties() {
    Interrupted obj = Interrupted.newInstance();
    String contenttype = "myValue";
    obj.setContentType(contenttype);
    assertEquals("contenttype", obj.getContentType(), contenttype);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
    double successcount = 600813;
    obj.setSuccessCount(successcount);
    assertEquals("successcount", obj.getSuccessCount(), successcount);
    double skippedcount = 600813;
    obj.setSkippedCount(skippedcount);
    assertEquals("skippedcount", obj.getSkippedCount(), skippedcount);
    double errorcount = 600813;
    obj.setErrorCount(errorcount);
    assertEquals("errorcount", obj.getErrorCount(), errorcount);
    String reason = "myValue";
    obj.setReason(reason);
    assertEquals("reason", obj.getReason(), reason);
    double totalcount = 600813;
    obj.setTotalCount(totalcount);
    assertEquals("totalcount", obj.getTotalCount(), totalcount);
  }
}
