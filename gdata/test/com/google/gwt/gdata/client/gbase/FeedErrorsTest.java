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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the FeedErrors class.
 */
public class FeedErrorsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", FeedErrors.getConstructor());
    assertNotNull("newInstance()", FeedErrors.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    FeedErrors obj = FeedErrors.newInstance(JavaScriptObject.createObject());
    JsArray<FeedError> feederror = ArrayHelper.toJsArray(FeedError.newInstance(JavaScriptObject.createObject()));
    obj.setFeedError(feederror);
    assertEquals("feederror", obj.getFeedError().length(), feederror.length());
    int lenFeedError = obj.getFeedError().length();
    obj.addFeedError(FeedError.newInstance(JavaScriptObject.createObject()));
    assertEquals("feederror", obj.getFeedError().length(), lenFeedError + 1);
  }
}
