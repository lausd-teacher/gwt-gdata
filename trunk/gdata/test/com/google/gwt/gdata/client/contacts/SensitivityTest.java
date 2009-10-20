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

package com.google.gwt.gdata.client.contacts;

/**
 * Tests for the Sensitivity class.
 */
public class SensitivityTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_CONFIDENTIAL", Sensitivity.REL_CONFIDENTIAL);
    assertNotNull("REL_NORMAL", Sensitivity.REL_NORMAL);
    assertNotNull("REL_PERSONAL", Sensitivity.REL_PERSONAL);
    assertNotNull("REL_PRIVATE", Sensitivity.REL_PRIVATE);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Sensitivity.newInstance());
  }

  public void testProperties() {
    Sensitivity obj = Sensitivity.newInstance();
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
  }
}
