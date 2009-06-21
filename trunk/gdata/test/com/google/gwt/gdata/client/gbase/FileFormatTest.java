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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the FileFormat class.
 */
public class FileFormatTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("FORMAT_AUTO", FileFormat.FORMAT_AUTO);
    assertNotNull("FORMAT_DSV", FileFormat.FORMAT_DSV);
    assertNotNull("FORMAT_XML", FileFormat.FORMAT_XML);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", FileFormat.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    FileFormat obj = FileFormat.newInstance(JavaScriptObject.createObject());
    Delimiter delimiter = Delimiter.newInstance(JavaScriptObject.createObject());
    obj.setDelimiter(delimiter);
    assertSame("delimiter", obj.getDelimiter(), delimiter);
    String format = "myValue";
    obj.setFormat(format);
    assertEquals("format", obj.getFormat(), format);
    Encoding encoding = Encoding.newInstance(JavaScriptObject.createObject());
    obj.setEncoding(encoding);
    assertSame("encoding", obj.getEncoding(), encoding);
    UseQuotedFields usequotedfields = UseQuotedFields.newInstance(JavaScriptObject.createObject());
    obj.setUseQuotedFields(usequotedfields);
    assertSame("usequotedfields", obj.getUseQuotedFields(), usequotedfields);
  }
}
