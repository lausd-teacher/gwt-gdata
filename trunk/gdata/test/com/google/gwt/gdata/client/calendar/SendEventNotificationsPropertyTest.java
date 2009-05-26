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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the SendEventNotificationsProperty class.
 */
public class SendEventNotificationsPropertyTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", SendEventNotificationsProperty.getConstructor());
    assertNotNull("newInstance()", SendEventNotificationsProperty.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    SendEventNotificationsProperty obj = SendEventNotificationsProperty.newInstance(JavaScriptObject.createObject());
    boolean value = true;
    obj.setValue(value);
    assertSame("value", obj.getValue(), value);
  }
}
