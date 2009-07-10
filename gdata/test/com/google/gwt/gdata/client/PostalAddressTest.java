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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PostalAddress class.
 */
public class PostalAddressTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_HOME", PostalAddress.REL_HOME);
    assertNotNull("REL_OTHER", PostalAddress.REL_OTHER);
    assertNotNull("REL_WORK", PostalAddress.REL_WORK);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PostalAddress.newInstance());
  }

  public void testProperties() {
    PostalAddress obj = PostalAddress.newInstance();
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
    boolean primary = true;
    obj.setPrimary(primary);
    assertSame("primary", obj.getPrimary(), primary);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
  }
}
