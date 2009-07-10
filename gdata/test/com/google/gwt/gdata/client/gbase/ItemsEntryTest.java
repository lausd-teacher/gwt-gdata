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

import com.google.gwt.gdata.client.FeedLink;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ItemsEntry class.
 */
public class ItemsEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ItemsEntry.newInstance());
  }

  public void testOther() {
    ItemsEntry obj = ItemsEntry.newInstance();
    // Unit Test for getAttributes()
    assertEquals("getAttributes", obj.getAttributes().keys().length, 0);
    // Unit Test for getHtmlLink()
    assertEquals("getHtmlLink", obj.getHtmlLink(), null);
    // Unit Test for setAttribute(String name, Attribute attribute)
    // Unit Test for setAttributes(JavaScriptObject attributes)
  }

  public void testProperties() {
    ItemsEntry obj = ItemsEntry.newInstance();
    FeedLink feedlink = FeedLink.newInstance();
    obj.setFeedLink(feedlink);
    assertSame("feedlink", obj.getFeedLink(), feedlink);
  }
}
