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
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the FeedLink class.
 */
public class FeedLinkTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", FeedLink.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    FeedLink obj = FeedLink.newInstance(JavaScriptObject.createObject());
    // Unit Test for getFeed()
    assertEquals("getFeed", obj.getFeed(), null);
    // Unit Test for setFeed(Feed feed)
  }

  public void testProperties() {
    FeedLink obj = FeedLink.newInstance(JavaScriptObject.createObject());
    boolean readonly = true;
    obj.setReadOnly(readonly);
    assertSame("readonly", obj.getReadOnly(), readonly);
    double counthint = 600813;
    obj.setCountHint(counthint);
    assertEquals("counthint", obj.getCountHint(), counthint);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String href = "myValue";
    obj.setHref(href);
    assertEquals("href", obj.getHref(), href);
  }
}
