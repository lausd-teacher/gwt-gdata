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

import java.util.Date;

/**
 * Tests for the LastViewed class.
 */
public class LastViewedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", LastViewed.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    LastViewed obj = LastViewed.newInstance(JavaScriptObject.createObject());
    // Unit Test for setValue(Date value)
    Date value = new Date();
    obj.setValue(value);
    assertEquals("value", obj.getValue().getDate(), value);
  }

  public void testProperties() {
    LastViewed obj = LastViewed.newInstance(JavaScriptObject.createObject());
    DateTime value = DateTime.newInstance(new Date(), false);
    obj.setValue(value);
    assertEquals("value", obj.getValue().getDate(), value.getDate());
  }
}
