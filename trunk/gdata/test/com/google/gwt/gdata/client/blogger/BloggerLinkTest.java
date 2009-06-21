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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the BloggerLink class.
 */
public class BloggerLinkTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_REPLIES", BloggerLink.REL_REPLIES);
    assertNotNull("REL_SETTINGS", BloggerLink.REL_SETTINGS);
    assertNotNull("REL_TEMPLATE", BloggerLink.REL_TEMPLATE);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", BloggerLink.newInstance(JavaScriptObject.createObject()));
  }
}
