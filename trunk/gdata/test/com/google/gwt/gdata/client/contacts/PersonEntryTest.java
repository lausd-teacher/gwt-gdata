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
import com.google.gwt.gdata.client.ExtendedProperty;
import com.google.gwt.gdata.client.Im;
import com.google.gwt.gdata.client.Organization;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.PostalAddress;
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
    assertNotNull("getConstructor()", PersonEntry.getConstructor());
    assertNotNull("newInstance()", PersonEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    PersonEntry obj = PersonEntry.newInstance(JavaScriptObject.createObject());
    JsArray<PostalAddress> postaladdresses = ArrayHelper.toJsArray(PostalAddress.newInstance(JavaScriptObject.createObject()));
    obj.setPostalAddresses(postaladdresses);
    assertEquals("postaladdresses", obj.getPostalAddresses().length(), postaladdresses.length());
    int lenPostalAddresses = obj.getPostalAddresses().length();
    obj.addPostalAddress(PostalAddress.newInstance(JavaScriptObject.createObject()));
    assertEquals("postaladdresses", obj.getPostalAddresses().length(), lenPostalAddresses + 1);
    JsArray<Im> imaddresses = ArrayHelper.toJsArray(Im.newInstance(JavaScriptObject.createObject()));
    obj.setImAddresses(imaddresses);
    assertEquals("imaddresses", obj.getImAddresses().length(), imaddresses.length());
    int lenImAddresses = obj.getImAddresses().length();
    obj.addImAddress(Im.newInstance(JavaScriptObject.createObject()));
    assertEquals("imaddresses", obj.getImAddresses().length(), lenImAddresses + 1);
    JsArray<PhoneNumber> phonenumbers = ArrayHelper.toJsArray(PhoneNumber.newInstance(JavaScriptObject.createObject()));
    obj.setPhoneNumbers(phonenumbers);
    assertEquals("phonenumbers", obj.getPhoneNumbers().length(), phonenumbers.length());
    int lenPhoneNumbers = obj.getPhoneNumbers().length();
    obj.addPhoneNumber(PhoneNumber.newInstance(JavaScriptObject.createObject()));
    assertEquals("phonenumbers", obj.getPhoneNumbers().length(), lenPhoneNumbers + 1);
    JsArray<Organization> organizations = ArrayHelper.toJsArray(Organization.newInstance(JavaScriptObject.createObject()));
    obj.setOrganizations(organizations);
    assertEquals("organizations", obj.getOrganizations().length(), organizations.length());
    int lenOrganizations = obj.getOrganizations().length();
    obj.addOrganization(Organization.newInstance(JavaScriptObject.createObject()));
    assertEquals("organizations", obj.getOrganizations().length(), lenOrganizations + 1);
    JsArray<Email> emailaddresses = ArrayHelper.toJsArray(Email.newInstance(JavaScriptObject.createObject()));
    obj.setEmailAddresses(emailaddresses);
    assertEquals("emailaddresses", obj.getEmailAddresses().length(), emailaddresses.length());
    int lenEmailAddresses = obj.getEmailAddresses().length();
    obj.addEmailAddress(Email.newInstance(JavaScriptObject.createObject()));
    assertEquals("emailaddresses", obj.getEmailAddresses().length(), lenEmailAddresses + 1);
    JsArray<ExtendedProperty> extendedproperties = ArrayHelper.toJsArray(ExtendedProperty.newInstance(JavaScriptObject.createObject()));
    obj.setExtendedProperties(extendedproperties);
    assertEquals("extendedproperties", obj.getExtendedProperties().length(), extendedproperties.length());
    int lenExtendedProperties = obj.getExtendedProperties().length();
    obj.addExtendedProperty(ExtendedProperty.newInstance(JavaScriptObject.createObject()));
    assertEquals("extendedproperties", obj.getExtendedProperties().length(), lenExtendedProperties + 1);
  }
}
