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
 * Tests for the AttributesEntry class.
 */
public class AttributesEntryTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", AttributesEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        AttributesEntry obj = AttributesEntry.newInstance();
        GmAttribute attribute = GmAttribute.newInstance();
        obj.setAttribute(attribute);
        assertSame("attribute", obj.getAttribute(), attribute);
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
