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

  public void testOther() {
    // PersonEntry obj = PersonEntry.newInstance(JavaScriptObject.createObject());
    // obj.addEmailAddress(emailAddress);
    // obj.addExtendedProperty(extendedProperty);
    // obj.addImAddress(imAddress);
    // obj.addOrganization(organization);
    // obj.addPhoneNumber(phoneNumber);
    // obj.addPostalAddress(postalAddress);
  }

  public void testProperties() {
    PersonEntry obj = PersonEntry.newInstance(JavaScriptObject.createObject());
    JsArray<com.google.gwt.gdata.client.PostalAddress> postaladdresses = ArrayHelper.toJsArray(PostalAddress.newInstance(JavaScriptObject.createObject()));
    obj.setPostalAddresses(postaladdresses);
    assertSame("postaladdresses", obj.getPostalAddresses(), postaladdresses);
    JsArray<com.google.gwt.gdata.client.Im> imaddresses = ArrayHelper.toJsArray(Im.newInstance(JavaScriptObject.createObject()));
    obj.setImAddresses(imaddresses);
    assertSame("imaddresses", obj.getImAddresses(), imaddresses);
    JsArray<com.google.gwt.gdata.client.PhoneNumber> phonenumbers = ArrayHelper.toJsArray(PhoneNumber.newInstance(JavaScriptObject.createObject()));
    obj.setPhoneNumbers(phonenumbers);
    assertSame("phonenumbers", obj.getPhoneNumbers(), phonenumbers);
    JsArray<com.google.gwt.gdata.client.Organization> organizations = ArrayHelper.toJsArray(Organization.newInstance(JavaScriptObject.createObject()));
    obj.setOrganizations(organizations);
    assertSame("organizations", obj.getOrganizations(), organizations);
    JsArray<com.google.gwt.gdata.client.Email> emailaddresses = ArrayHelper.toJsArray(Email.newInstance(JavaScriptObject.createObject()));
    obj.setEmailAddresses(emailaddresses);
    assertSame("emailaddresses", obj.getEmailAddresses(), emailaddresses);
    JsArray<com.google.gwt.gdata.client.ExtendedProperty> extendedproperties = ArrayHelper.toJsArray(ExtendedProperty.newInstance(JavaScriptObject.createObject()));
    obj.setExtendedProperties(extendedproperties);
    assertSame("extendedproperties", obj.getExtendedProperties(), extendedproperties);
  }
}
