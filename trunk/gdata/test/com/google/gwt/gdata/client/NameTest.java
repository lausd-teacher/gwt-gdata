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
 * Tests for the Name class.
 */
public class NameTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Name.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Name obj = Name.newInstance();
        GivenName givenname = GivenName.newInstance();
        obj.setGivenName(givenname);
        assertSame("givenname", obj.getGivenName(), givenname);
        NamePrefix nameprefix = NamePrefix.newInstance();
        obj.setNamePrefix(nameprefix);
        assertSame("nameprefix", obj.getNamePrefix(), nameprefix);
        AdditionalName additionalname = AdditionalName.newInstance();
        obj.setAdditionalName(additionalname);
        assertSame("additionalname", obj.getAdditionalName(), additionalname);
        NameSuffix namesuffix = NameSuffix.newInstance();
        obj.setNameSuffix(namesuffix);
        assertSame("namesuffix", obj.getNameSuffix(), namesuffix);
        FamilyName familyname = FamilyName.newInstance();
        obj.setFamilyName(familyname);
        assertSame("familyname", obj.getFamilyName(), familyname);
        FullName fullname = FullName.newInstance();
        obj.setFullName(fullname);
        assertSame("fullname", obj.getFullName(), fullname);
        finishGDataTest();
      }
    }, 10000);
  }
}
