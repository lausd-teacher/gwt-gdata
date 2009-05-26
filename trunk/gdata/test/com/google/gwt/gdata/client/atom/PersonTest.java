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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Person class.
 */
public class PersonTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Person.getConstructor());
    assertNotNull("newInstance()", Person.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    Person obj = Person.newInstance(JavaScriptObject.createObject());
    Name name = Name.newInstance(JavaScriptObject.createObject());
    obj.setName(name);
    assertSame("name", obj.getName(), name);
    String namelang = "myValue";
    obj.setNameLang(namelang);
    assertEquals("namelang", obj.getNameLang(), namelang);
    Uri uri = Uri.newInstance(JavaScriptObject.createObject());
    obj.setUri(uri);
    assertSame("uri", obj.getUri(), uri);
    Email email = Email.newInstance(JavaScriptObject.createObject());
    obj.setEmail(email);
    assertSame("email", obj.getEmail(), email);
  }
}
