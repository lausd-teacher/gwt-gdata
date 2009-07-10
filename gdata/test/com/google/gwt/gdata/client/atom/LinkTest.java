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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Link class.
 */
public class LinkTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_ALTERNATE", Link.REL_ALTERNATE);
    assertNotNull("REL_ENCLOSURE", Link.REL_ENCLOSURE);
    assertNotNull("REL_ENTRY_EDIT", Link.REL_ENTRY_EDIT);
    assertNotNull("REL_MEDIA_EDIT", Link.REL_MEDIA_EDIT);
    assertNotNull("REL_NEXT", Link.REL_NEXT);
    assertNotNull("REL_PREVIOUS", Link.REL_PREVIOUS);
    assertNotNull("REL_RELATED", Link.REL_RELATED);
    assertNotNull("REL_SELF", Link.REL_SELF);
    assertNotNull("REL_VIA", Link.REL_VIA);
    assertNotNull("TYPE_ATOM", Link.TYPE_ATOM);
    assertNotNull("TYPE_HTML", Link.TYPE_HTML);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Link.newInstance());
  }

  public void testProperties() {
    Link obj = Link.newInstance();
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    String title = "myValue";
    obj.setTitle(title);
    assertEquals("title", obj.getTitle(), title);
    double length = 600813;
    obj.setLength(length);
    assertEquals("length", obj.getLength(), length);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String titlelang = "myValue";
    obj.setTitleLang(titlelang);
    assertEquals("titlelang", obj.getTitleLang(), titlelang);
    String hreflang = "myValue";
    obj.setHrefLang(hreflang);
    assertEquals("hreflang", obj.getHrefLang(), hreflang);
    String href = "myValue";
    obj.setHref(href);
    assertEquals("href", obj.getHref(), href);
  }
}
