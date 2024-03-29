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

import com.google.gwt.gdata.client.Email;
import com.google.gwt.gdata.client.ExtendedProperty;
import com.google.gwt.gdata.client.Im;
import com.google.gwt.gdata.client.Organization;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.PostalAddress;

/**
 * Tests for the PersonEntry class.
 */
public class PersonEntryTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", PersonEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        PersonEntry obj = PersonEntry.newInstance();
        obj.addEmailAddress(Email.newInstance());
        assertEquals("addEmailAddress", 1, obj.getEmailAddresses().length);
        obj.addExtendedProperty(ExtendedProperty.newInstance());
        assertEquals("addExtendedProperty", 1, obj.getExtendedProperties().length);
        obj.addImAddress(Im.newInstance());
        assertEquals("addImAddress", 1, obj.getImAddresses().length);
        obj.addOrganization(Organization.newInstance());
        assertEquals("addOrganization", 1, obj.getOrganizations().length);
        obj.addPhoneNumber(PhoneNumber.newInstance());
        assertEquals("addPhoneNumber", 1, obj.getPhoneNumbers().length);
        obj.addPostalAddress(PostalAddress.newInstance());
        assertEquals("addPostalAddress", 1, obj.getPostalAddresses().length);
        assertNull("getContactEditPhotoLink", obj.getContactEditPhotoLink());
        assertNull("getContactPhotoLink", obj.getContactPhotoLink());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        PersonEntry obj = PersonEntry.newInstance();
        PostalAddress[] postaladdresses = new PostalAddress[]{ PostalAddress.newInstance() };
        obj.setPostalAddresses(postaladdresses);
        assertEquals("postaladdresses", obj.getPostalAddresses().length, postaladdresses.length);
        Im[] imaddresses = new Im[]{ Im.newInstance() };
        obj.setImAddresses(imaddresses);
        assertEquals("imaddresses", obj.getImAddresses().length, imaddresses.length);
        PhoneNumber[] phonenumbers = new PhoneNumber[]{ PhoneNumber.newInstance() };
        obj.setPhoneNumbers(phonenumbers);
        assertEquals("phonenumbers", obj.getPhoneNumbers().length, phonenumbers.length);
        Organization[] organizations = new Organization[]{ Organization.newInstance() };
        obj.setOrganizations(organizations);
        assertEquals("organizations", obj.getOrganizations().length, organizations.length);
        Email[] emailaddresses = new Email[]{ Email.newInstance() };
        obj.setEmailAddresses(emailaddresses);
        assertEquals("emailaddresses", obj.getEmailAddresses().length, emailaddresses.length);
        ExtendedProperty[] extendedproperties = new ExtendedProperty[]{ ExtendedProperty.newInstance() };
        obj.setExtendedProperties(extendedproperties);
        assertEquals("extendedproperties", obj.getExtendedProperties().length, extendedproperties.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
