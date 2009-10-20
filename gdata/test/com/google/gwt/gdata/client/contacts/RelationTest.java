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
 * Tests for the Relation class.
 */
public class RelationTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_ASSISTANT", Relation.REL_ASSISTANT);
    assertNotNull("REL_BROTHER", Relation.REL_BROTHER);
    assertNotNull("REL_CHILD", Relation.REL_CHILD);
    assertNotNull("REL_DOMESTIC_PARTNER", Relation.REL_DOMESTIC_PARTNER);
    assertNotNull("REL_FATHER", Relation.REL_FATHER);
    assertNotNull("REL_FRIEND", Relation.REL_FRIEND);
    assertNotNull("REL_MANAGER", Relation.REL_MANAGER);
    assertNotNull("REL_MOTHER", Relation.REL_MOTHER);
    assertNotNull("REL_PARENT", Relation.REL_PARENT);
    assertNotNull("REL_PARTNER", Relation.REL_PARTNER);
    assertNotNull("REL_REFERRED_BY", Relation.REL_REFERRED_BY);
    assertNotNull("REL_RELATIVE", Relation.REL_RELATIVE);
    assertNotNull("REL_SISTER", Relation.REL_SISTER);
    assertNotNull("REL_SPOUSE", Relation.REL_SPOUSE);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Relation.newInstance());
  }

  public void testProperties() {
    Relation obj = Relation.newInstance();
    String value = "myValue";
    obj.setValue(value);
    assertEquals("value", obj.getValue(), value);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
  }
}
