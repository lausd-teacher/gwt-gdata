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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.CustomProperty;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.FeedLink;
import com.google.gwt.gdata.client.ResourceId;
import com.google.gwt.gdata.client.batch.Id;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;

/**
 * Tests for the MapEntry class.
 */
public class MapEntryTest extends MapsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", MapEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        MapEntry obj = MapEntry.newInstance();
        // Unit Test for getAtomAlternateLink()
        assertEquals("getAtomAlternateLink", obj.getAtomAlternateLink(), null);
        // Unit Test for getAtomFeedLink()
        assertEquals("getAtomFeedLink", obj.getAtomFeedLink(), null);
        finishGDataTest();
      }
    }, 10000);
  }

  @SuppressWarnings("unchecked")
  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        MapEntry obj = MapEntry.newInstance();
        FeedLink feedlink = FeedLink.newInstance();
        obj.setFeedLink(feedlink);
        assertSame("feedlink", obj.getFeedLink(), feedlink);
        ResourceId resourceid = ResourceId.newInstance();
        obj.setResourceId(resourceid);
        assertSame("resourceid", obj.getResourceId(), resourceid);
        Deleted deleted = Deleted.newInstance();
        obj.setDeleted(deleted);
        assertSame("deleted", obj.getDeleted(), deleted);
        CustomProperty[] customproperties = new CustomProperty[]{ CustomProperty.newInstance() };
        obj.setCustomProperties(customproperties);
        assertEquals("customproperties", obj.getCustomProperties().length, customproperties.length);
        obj.addCustomProperty(CustomProperty.newInstance());
        assertEquals("customproperties", obj.getCustomProperties().length, customproperties.length + 1);
        Id batchid = Id.newInstance();
        obj.setBatchId(batchid);
        assertSame("batchid", obj.getBatchId(), batchid);
        Operation batchoperation = Operation.newInstance();
        obj.setBatchOperation(batchoperation);
        assertSame("batchoperation", obj.getBatchOperation(), batchoperation);
        Status batchstatus = Status.newInstance();
        obj.setBatchStatus(batchstatus);
        assertSame("batchstatus", obj.getBatchStatus(), batchstatus);
        Interrupted batchinterrupted = Interrupted.newInstance();
        obj.setBatchInterrupted(batchinterrupted);
        assertSame("batchinterrupted", obj.getBatchInterrupted(), batchinterrupted);
        finishGDataTest();
      }
    }, 10000);
  }
}
