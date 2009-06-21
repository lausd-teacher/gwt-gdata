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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the MapFeed class.
 */
public class MapFeedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapFeed.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    MapFeed obj = MapFeed.newInstance(JavaScriptObject.createObject());
    // Unit Test for getAtomFeedLink()
    assertEquals("getAtomFeedLink", obj.getAtomFeedLink(), null);
    // Unit Test for getNextLink()
    assertEquals("getNextLink", obj.getNextLink(), null);
  }
}