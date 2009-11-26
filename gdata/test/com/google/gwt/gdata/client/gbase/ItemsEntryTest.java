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

import com.google.gwt.gdata.client.batch.Id;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;

/**
 * Tests for the ItemsEntry class.
 */
public class ItemsEntryTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ItemsEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        ItemsEntry obj = ItemsEntry.newInstance();
        // Unit Test for getAttributes()
        assertEquals("getAttributes", obj.getAttributes().keys().length, 0);
        // Unit Test for getHtmlLink()
        assertEquals("getHtmlLink", obj.getHtmlLink(), null);
        // Unit Test for setAttribute(String name, Attribute attribute)
        // Unit Test for setAttributes(JavaScriptObject attributes)
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ItemsEntry obj = ItemsEntry.newInstance();
        MediaFeedLink feedlink = MediaFeedLink.newInstance();
        obj.setMediaFeedLink(feedlink);
        assertSame("feedlink", obj.getMediaFeedLink(), feedlink);
        Status batchstatus = Status.newInstance();
        obj.setBatchStatus(batchstatus);
        assertSame("batchstatus", obj.getBatchStatus(), batchstatus);
        Operation batchoperation = Operation.newInstance();
        obj.setBatchOperation(batchoperation);
        assertSame("batchoperation", obj.getBatchOperation(), batchoperation);
        Id batchid = Id.newInstance();
        obj.setBatchId(batchid);
        assertSame("batchid", obj.getBatchId(), batchid);
        Interrupted batchinterrupted = Interrupted.newInstance();
        obj.setBatchInterrupted(batchinterrupted);
        assertSame("batchinterrupted", obj.getBatchInterrupted(), batchinterrupted);
        finishGDataTest();
      }
    }, 10000);
  }
}
