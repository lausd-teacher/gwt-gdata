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

/**
 * Tests for the PhoneNumber class.
 */
public class PhoneNumberTest extends GDataTest {
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("REL_ASSISTANT", PhoneNumber.REL_ASSISTANT);
    assertNotNull("REL_CALLBACK", PhoneNumber.REL_CALLBACK);
    assertNotNull("REL_CAR", PhoneNumber.REL_CAR);
    assertNotNull("REL_COMPANY_MAIN", PhoneNumber.REL_COMPANY_MAIN);
    assertNotNull("REL_FAX", PhoneNumber.REL_FAX);
    assertNotNull("REL_HOME", PhoneNumber.REL_HOME);
    assertNotNull("REL_HOME_FAX", PhoneNumber.REL_HOME_FAX);
    assertNotNull("REL_ISDN", PhoneNumber.REL_ISDN);
    assertNotNull("REL_MAIN", PhoneNumber.REL_MAIN);
    assertNotNull("REL_MOBILE", PhoneNumber.REL_MOBILE);
    assertNotNull("REL_OTHER", PhoneNumber.REL_OTHER);
    assertNotNull("REL_OTHER_FAX", PhoneNumber.REL_OTHER_FAX);
    assertNotNull("REL_PAGER", PhoneNumber.REL_PAGER);
    assertNotNull("REL_RADIO", PhoneNumber.REL_RADIO);
    assertNotNull("REL_TELEX", PhoneNumber.REL_TELEX);
    assertNotNull("REL_TTY_TDD", PhoneNumber.REL_TTY_TDD);
    assertNotNull("REL_WORK", PhoneNumber.REL_WORK);
    assertNotNull("REL_WORK_FAX", PhoneNumber.REL_WORK_FAX);
    assertNotNull("REL_WORK_MOBILE", PhoneNumber.REL_WORK_MOBILE);
    assertNotNull("REL_WORK_PAGER", PhoneNumber.REL_WORK_PAGER);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", PhoneNumber.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        PhoneNumber obj = PhoneNumber.newInstance();
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
        finishGDataTest();
      }
    }, 10000);
  }
}
