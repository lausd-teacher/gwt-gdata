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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Email;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PersonEntry class.
 */
public class PersonEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PersonEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    PersonEntry obj = PersonEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addExtendedProperty(ExtendedProperty extendedProperty)
    // Unit Test for addImAddress(Im imAddress)
    // Unit Test for addOrganization(Organization organization)
    // Unit Test for addPhoneNumber(PhoneNumber phoneNumber)
    // Unit Test for addPostalAddress(PostalAddress postalAddress)
    // Unit Test for getContactEditPhotoLink()
    assertEquals("getContactEditPhotoLink", obj.getContactEditPhotoLink(), null);
    // Unit Test for getContactPhotoLink()
    assertEquals("getContactPhotoLink", obj.getContactPhotoLink(), null);
    // Unit Test for getExtendedProperties()
    assertEquals("getExtendedProperties", obj.getExtendedProperties(), null);
    // Unit Test for getImAddresses()
    assertEquals("getImAddresses", obj.getImAddresses(), null);
    // Unit Test for getOrganizations()
    assertEquals("getOrganizations", obj.getOrganizations(), null);
    // Unit Test for getPhoneNumbers()
    assertEquals("getPhoneNumbers", obj.getPhoneNumbers(), null);
    // Unit Test for getPostalAddresses()
    assertEquals("getPostalAddresses", obj.getPostalAddresses(), null);
    // Unit Test for setExtendedProperties(JsArray extendedProperties)
    // Unit Test for setImAddresses(JsArray imAddresses)
    // Unit Test for setOrganizations(JsArray organizations)
    // Unit Test for setPhoneNumbers(JsArray phoneNumbers)
    // Unit Test for setPostalAddresses(JsArray postalAddresses)
  }

  public void testProperties() {
    PersonEntry obj = PersonEntry.newInstance(JavaScriptObject.createObject());
    JsArray<Email> emailaddresses = ArrayHelper.toJsArray(Email.newInstance(JavaScriptObject.createObject()));
    obj.setEmailAddresses(emailaddresses);
    assertEquals("emailaddresses", obj.getEmailAddresses().length(), emailaddresses.length());
    int lenEmailAddresses = obj.getEmailAddresses().length();
    obj.addEmailAddress(Email.newInstance(JavaScriptObject.createObject()));
    assertEquals("emailaddresses", obj.getEmailAddresses().length(), lenEmailAddresses + 1);
  }
}
