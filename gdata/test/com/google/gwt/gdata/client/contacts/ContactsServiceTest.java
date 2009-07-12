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

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.Email;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.OrgTitle;
import com.google.gwt.gdata.client.Organization;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.PostalAddress;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the ContactsService class.
 */
public class ContactsServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void testConstants() {
    assertNotNull("SERVICE_NAME", ContactsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ContactsService.newInstance("myValue"));
  }
  
  public void testCreateAndDeleteContact() {
    UserTest.login(GDataTestScripts.Contacts.testCookie_Name, GDataTestScripts.Contacts.testCookie_Value);
    ContactsService svc = ContactsService.newInstance("test");
    ContactEntry newEntry = ContactEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Contacts.testContact_Entry_Title_Created);
    newEntry.setEmailAddresses(new Email[] { Email.newInstance() });
    newEntry.getEmailAddresses()[0].setPrimary(true);
    newEntry.getEmailAddresses()[0].setRel(Email.REL_OTHER);
    newEntry.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Entry_Email_Created);
    newEntry.setOrganizations(new Organization[] { Organization.newInstance() });
    newEntry.getOrganizations()[0].setRel(Organization.REL_WORK);
    newEntry.getOrganizations()[0].setPrimary(true);
    newEntry.getOrganizations()[0].setOrgTitle(OrgTitle.newInstance());
    newEntry.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Entry_Company_Created);
    newEntry.setPhoneNumbers(new PhoneNumber[] { PhoneNumber.newInstance() });
    newEntry.getPhoneNumbers()[0].setPrimary(true);
    newEntry.getPhoneNumbers()[0].setRel(PhoneNumber.REL_WORK);
    newEntry.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Phone_Created);
    newEntry.setPostalAddresses(new PostalAddress[] { PostalAddress.newInstance() });
    newEntry.getPostalAddresses()[0].setPrimary(true);
    newEntry.getPostalAddresses()[0].setRel(PostalAddress.REL_OTHER);
    newEntry.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Address_Created);
    svc.insertEntry(GDataTestScripts.Contacts.testContacts_Feed_Link, newEntry, new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        if (!result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Entry_Title_Created) ||
            !result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Entry_Email_Created) ||
            !result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Company_Created) ||
            !result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Phone_Created) ||
            !result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Address_Created)) {
          fail("Create Failed");
        }
        result.deleteEntry(new AsyncCallback<ContactEntry>() {
          public void onFailure(Throwable caught) {
            fail("Delete Failed: " + caught.getMessage());
          }
          public void onSuccess(ContactEntry result) {
          }
        });
        finishTest();
      }
    });
    delayTestFinish(10000);
  }
  
  public void testGetContact() {
    UserTest.login(GDataTestScripts.Contacts.testCookie_Name, GDataTestScripts.Contacts.testCookie_Value);
    ContactsService svc = ContactsService.newInstance("test");
    svc.getContactEntry(GDataTestScripts.Contacts.testContact_Entry_Link, new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Get Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        if (result.getPostalAddresses().length != 1 ||
            result.getPhoneNumbers().length != 1 ||
            result.getOrganizations().length != 1 ||
            result.getEmailAddresses().length != 1 ||
            !result.getEmailAddresses()[0].getPrimary() ||
            !GDataTestScripts.Contacts.testContact_Entry_Address.equals(result.getPostalAddresses()[0].getValue()) ||
            !GDataTestScripts.Contacts.testContact_Entry_Phone.equals(result.getPhoneNumbers()[0].getValue()) ||
            !GDataTestScripts.Contacts.testContact_Entry_Company.equals(result.getOrganizations()[0].getOrgTitle().getValue()) ||
            !GDataTestScripts.Contacts.testContact_Entry_Title.equals(result.getTitle().getText()) ||
            !GDataTestScripts.Contacts.testContact_Entry_Email.equals(result.getEmailAddresses()[0].getAddress())) {
          fail("Get Failed");
        }
        finishTest();
      }
    });
    this.delayTestFinish(10000);
  }
  
  public void testGetContacts() {
    UserTest.login(GDataTestScripts.Contacts.testCookie_Name, GDataTestScripts.Contacts.testCookie_Value);
    ContactsService svc = ContactsService.newInstance("test");
    ContactQuery query = ContactQuery.newInstance(GDataTestScripts.Contacts.testContacts_Feed_Link);
    query.setMaxResults(50);
    svc.getContactFeed(query, new AsyncCallback<ContactFeed>() {
      public void onFailure(Throwable caught) {
        fail("Get Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactFeed result) {
        if (result.getEntries().length == 0) {
          fail("Get Failed");
        }
        if (!result.getTitle().getText().equals(GDataTestScripts.Contacts.testContacts_Feed_Title)) {
          fail("Get Failed");
        }
        finishTest();
      }
    });
    this.delayTestFinish(10000);
  }
  
  public void testUpdateContact() {
    UserTest.login(GDataTestScripts.Contacts.testCookie_Name, GDataTestScripts.Contacts.testCookie_Value);
    ContactsService svc = ContactsService.newInstance("test");
    svc.getContactEntry(GDataTestScripts.Contacts.testContact_Entry_Link, new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Get Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        result.getTitle().setText(GDataTestScripts.Contacts.testContact_Entry_Title_Updated);
        result.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Entry_Email_Updated);
        result.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Entry_Company_Updated);
        result.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Phone_Updated);
        result.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Address_Updated);
        result.updateEntry(new AsyncCallback<ContactEntry>() {
          public void onFailure(Throwable caught) {
            fail("Update Failed: " + caught.getMessage());
          }
          public void onSuccess(ContactEntry result) {
            if (!result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Entry_Title_Updated) ||
                !result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Entry_Email_Updated) ||
                !result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Company_Updated) ||
                !result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Phone_Updated) ||
                !result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Address_Updated)) {
              fail("Update Failed");
            }
            result.getTitle().setText(GDataTestScripts.Contacts.testContact_Entry_Title);
            result.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Entry_Email);
            result.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Entry_Company);
            result.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Phone);
            result.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Entry_Address);
            result.updateEntry(new AsyncCallback<ContactEntry>() {
              public void onFailure(Throwable caught) {
                fail("Revert Failed: " + caught.getMessage());
              }
              public void onSuccess(ContactEntry result) {
                if (!result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Entry_Title) ||
                    !result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Entry_Email) ||
                    !result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Company) ||
                    !result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Phone) ||
                    !result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Entry_Address)) {
                  fail("Revert Failed");
                }
                finishTest();
              }
            });
          }
        });
      }
    });
    this.delayTestFinish(10000);
  }
}
