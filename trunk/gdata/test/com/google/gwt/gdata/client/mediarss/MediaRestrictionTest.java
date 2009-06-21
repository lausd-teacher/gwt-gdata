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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the MediaRestriction class.
 */
public class MediaRestrictionTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("RELATIONSHIP_ALLOW", MediaRestriction.RELATIONSHIP_ALLOW);
    assertNotNull("RELATIONSHIP_DENY", MediaRestriction.RELATIONSHIP_DENY);
    assertNotNull("TYPE_COUNTRY", MediaRestriction.TYPE_COUNTRY);
    assertNotNull("TYPE_URI", MediaRestriction.TYPE_URI);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MediaRestriction.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    MediaRestriction obj = MediaRestriction.newInstance(JavaScriptObject.createObject());
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
    String relationship = "myValue";
    obj.setRelationship(relationship);
    assertEquals("relationship", obj.getRelationship(), relationship);
  }
}
