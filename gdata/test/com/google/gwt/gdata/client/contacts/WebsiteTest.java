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
 * Tests for the Website class.
 */
public class WebsiteTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_BLOG", Website.REL_BLOG);
    assertNotNull("REL_FTP", Website.REL_FTP);
    assertNotNull("REL_HOME", Website.REL_HOME);
    assertNotNull("REL_HOME_PAGE", Website.REL_HOME_PAGE);
    assertNotNull("REL_OTHER", Website.REL_OTHER);
    assertNotNull("REL_PROFILE", Website.REL_PROFILE);
    assertNotNull("REL_WORK", Website.REL_WORK);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Website.newInstance());
  }

  public void testProperties() {
    Website obj = Website.newInstance();
    boolean primary = true;
    obj.setPrimary(primary);
    assertSame("primary", obj.getPrimary(), primary);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
    String href = "myValue";
    obj.setHref(href);
    assertEquals("href", obj.getHref(), href);
  }
}
