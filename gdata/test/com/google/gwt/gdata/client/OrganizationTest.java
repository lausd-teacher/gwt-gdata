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
 * Tests for the Organization class.
 */
public class OrganizationTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_OTHER", Organization.REL_OTHER);
    assertNotNull("REL_WORK", Organization.REL_WORK);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Organization.getConstructor());
    assertNotNull("newInstance()", Organization.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    Organization obj = Organization.newInstance(JavaScriptObject.createObject());
    boolean primary = true;
    obj.setPrimary(primary);
    assertSame("primary", obj.getPrimary(), primary);
    OrgName orgname = OrgName.newInstance(JavaScriptObject.createObject());
    obj.setOrgName(orgname);
    assertSame("orgname", obj.getOrgName(), orgname);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    OrgTitle orgtitle = OrgTitle.newInstance(JavaScriptObject.createObject());
    obj.setOrgTitle(orgtitle);
    assertSame("orgtitle", obj.getOrgTitle(), orgtitle);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
  }
}
