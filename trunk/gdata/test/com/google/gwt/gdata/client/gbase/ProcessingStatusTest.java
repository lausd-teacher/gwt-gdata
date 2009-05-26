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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ProcessingStatus class.
 */
public class ProcessingStatusTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("STATUS_FAILURE", ProcessingStatus.STATUS_FAILURE);
    assertNotNull("STATUS_IN_PROGRESS", ProcessingStatus.STATUS_IN_PROGRESS);
    assertNotNull("STATUS_PARTIAL_SUCCESS", ProcessingStatus.STATUS_PARTIAL_SUCCESS);
    assertNotNull("STATUS_SUCCESS", ProcessingStatus.STATUS_SUCCESS);
    assertNotNull("STATUS_UNKNOWN", ProcessingStatus.STATUS_UNKNOWN);
    assertNotNull("STATUS_UNPROCESSED", ProcessingStatus.STATUS_UNPROCESSED);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ProcessingStatus.getConstructor());
    assertNotNull("newInstance()", ProcessingStatus.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    ProcessingStatus obj = ProcessingStatus.newInstance(JavaScriptObject.createObject());
    String status = "myValue";
    obj.setStatus(status);
    assertEquals("status", obj.getStatus(), status);
    ItemsProcessed itemsprocessed = ItemsProcessed.newInstance(JavaScriptObject.createObject());
    obj.setItemsProcessed(itemsprocessed);
    assertSame("itemsprocessed", obj.getItemsProcessed(), itemsprocessed);
    ItemsInserted itemsinserted = ItemsInserted.newInstance(JavaScriptObject.createObject());
    obj.setItemsInserted(itemsinserted);
    assertSame("itemsinserted", obj.getItemsInserted(), itemsinserted);
    FeedErrors feederrors = FeedErrors.newInstance(JavaScriptObject.createObject());
    obj.setFeedErrors(feederrors);
    assertSame("feederrors", obj.getFeedErrors(), feederrors);
  }
}
