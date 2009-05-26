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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.opensearch.ItemsPerPage;
import com.google.gwt.gdata.client.opensearch.StartIndex;
import com.google.gwt.gdata.client.opensearch.TotalResults;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Feed class.
 */
public class FeedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Feed.getConstructor());
    assertNotNull("newInstance()", Feed.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // Feed obj = Feed.newInstance(JavaScriptObject.createObject());
    // obj.insertEntry(entry, continuation, opt_errorHandler);
  }

  public void testProperties() {
    Feed obj = Feed.newInstance(JavaScriptObject.createObject());
    TotalResults totalresults = TotalResults.newInstance(JavaScriptObject.createObject());
    obj.setTotalResults(totalresults);
    assertSame("totalresults", obj.getTotalResults(), totalresults);
    StartIndex startindex = StartIndex.newInstance(JavaScriptObject.createObject());
    obj.setStartIndex(startindex);
    assertSame("startindex", obj.getStartIndex(), startindex);
    ItemsPerPage itemsperpage = ItemsPerPage.newInstance(JavaScriptObject.createObject());
    obj.setItemsPerPage(itemsperpage);
    assertSame("itemsperpage", obj.getItemsPerPage(), itemsperpage);
  }
}
