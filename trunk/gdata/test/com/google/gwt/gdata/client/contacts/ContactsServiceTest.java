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
  
  public void test1ContactsGet() {
    UserTest.login(GDataTestScripts.Contacts.testCookie_Name, GDataTestScripts.Contacts.testCookie_Value);
    ContactsService svc = ContactsService.newInstance("test");
    ContactQuery query = ContactQuery.newInstance(GDataTestScripts.Contacts.testContacts_FeedLink);
    query.setMaxResults(50);
    svc.getContactFeed(query, new AsyncCallback<ContactFeed>() {
      public void onFailure(Throwable caught) {
        fail("Get Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactFeed result) {
        if (result.getEntries().length == 0) {
          fail("Get Failed");
        }
        System.out.println(result.getTitle().getText());
        System.out.println(result.getId().getValue());
        if (!result.getTitle().getText().equals(GDataTestScripts.Contacts.testContacts_FeedTitle) ||
          !result.getId().getValue().equals(GDataTestScripts.Contacts.testContacts_FeedId)) {
          fail("Get Failed");
        }
        GDataTestScripts.Contacts.testContacts_Feed = result;
        GDataTestScripts.Contacts.testContact_Entry_Original = result.getEntries()[0];
        finishTest();
      }
    });
    this.delayTestFinish(10000);
  }
  public void test2ContactGet() {
    assertEquals(1, GDataTestScripts.Contacts.testContact_Entry_Original.getPostalAddresses().length);
    assertEquals(GDataTestScripts.Contacts.testContact_Address_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getPostalAddresses()[0].getValue());
    assertEquals(1, GDataTestScripts.Contacts.testContact_Entry_Original.getPhoneNumbers().length);
    assertEquals(GDataTestScripts.Contacts.testContact_Phone_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getPhoneNumbers()[0].getValue());
    assertEquals(1, GDataTestScripts.Contacts.testContact_Entry_Original.getOrganizations().length);
    assertEquals(GDataTestScripts.Contacts.testContact_Company_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getOrganizations()[0].getOrgTitle().getValue());
    assertEquals(GDataTestScripts.Contacts.testContact_Title_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getTitle().getText());
    assertEquals(1, GDataTestScripts.Contacts.testContact_Entry_Original.getEmailAddresses().length);
    assertEquals(GDataTestScripts.Contacts.testContact_Email_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getEmailAddresses()[0].getAddress());
    assertEquals(true, GDataTestScripts.Contacts.testContact_Entry_Original.getEmailAddresses()[0].getPrimary());
    assertEquals(GDataTestScripts.Contacts.testContact_Title_Original, GDataTestScripts.Contacts.testContact_Entry_Original.getTitle().getText());
  }
  public void test3ContactUpdate() {
    GDataTestScripts.Contacts.testContact_Entry_Original.getTitle().setText(GDataTestScripts.Contacts.testContact_Title_Updated);
    GDataTestScripts.Contacts.testContact_Entry_Original.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Email_Updated);
    GDataTestScripts.Contacts.testContact_Entry_Original.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Company_Updated);
    GDataTestScripts.Contacts.testContact_Entry_Original.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Phone_Updated);
    GDataTestScripts.Contacts.testContact_Entry_Original.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Address_Updated);
    GDataTestScripts.Contacts.testContact_Entry_Original.updateEntry(new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Update Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Title_Updated) &&
            result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Email_Updated) &&
            result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Company_Updated) &&
            result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Phone_Updated) &&
            result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Address_Updated)) {
          result.getTitle().setText(GDataTestScripts.Contacts.testContact_Title_Original);
          result.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Email_Original);
          result.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Company_Original);
          result.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Phone_Original);
          result.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Address_Original);
          result.updateEntry(new AsyncCallback<ContactEntry>() {
            public void onFailure(Throwable caught) {
              fail("Revert Failed: " + caught.getMessage());
            }
            public void onSuccess(ContactEntry result) {
              if (result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Title_Original) &&
                  result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Email_Original) &&
                  result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Company_Original) &&
                  result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Phone_Original) &&
                  result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Address_Original)) {
                finishTest();
              } else {
                fail("Revert Failed");
              }
            }
          });
          finishTest();
        } else { 
          fail("Update Failed");
        }
      }
    });
    delayTestFinish(10000);
  }
  public void test4ContactCreate() {
    ContactsService svc = ContactsService.newInstance("test");
    ContactEntry newEntry = ContactEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Contacts.testContact_Title_Created);
    newEntry.setEmailAddresses(new Email[] { Email.newInstance() });
    newEntry.getEmailAddresses()[0].setPrimary(true);
    newEntry.getEmailAddresses()[0].setRel(Email.REL_OTHER);
    newEntry.getEmailAddresses()[0].setAddress(GDataTestScripts.Contacts.testContact_Email_Created);
    newEntry.setOrganizations(new Organization[] { Organization.newInstance() });
    newEntry.getOrganizations()[0].setRel(Organization.REL_WORK);
    newEntry.getOrganizations()[0].setPrimary(true);
    newEntry.getOrganizations()[0].setOrgTitle(OrgTitle.newInstance());
    newEntry.getOrganizations()[0].getOrgTitle().setValue(GDataTestScripts.Contacts.testContact_Company_Created);
    newEntry.setPhoneNumbers(new PhoneNumber[] { PhoneNumber.newInstance() });
    newEntry.getPhoneNumbers()[0].setPrimary(true);
    newEntry.getPhoneNumbers()[0].setRel(PhoneNumber.REL_WORK);
    newEntry.getPhoneNumbers()[0].setValue(GDataTestScripts.Contacts.testContact_Phone_Created);
    newEntry.setPostalAddresses(new PostalAddress[] { PostalAddress.newInstance() });
    newEntry.getPostalAddresses()[0].setPrimary(true);
    newEntry.getPostalAddresses()[0].setRel(PostalAddress.REL_OTHER);
    newEntry.getPostalAddresses()[0].setValue(GDataTestScripts.Contacts.testContact_Address_Created);
    svc.insertEntry(GDataTestScripts.Contacts.testContacts_FeedLink, newEntry, new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Contacts.testContact_Title_Created) &&
            result.getEmailAddresses()[0].getAddress().equals(GDataTestScripts.Contacts.testContact_Email_Created) &&
            result.getOrganizations()[0].getOrgTitle().getValue().equals(GDataTestScripts.Contacts.testContact_Company_Created) &&
            result.getPhoneNumbers()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Phone_Created) &&
            result.getPostalAddresses()[0].getValue().equals(GDataTestScripts.Contacts.testContact_Address_Created)) {
          GDataTestScripts.Contacts.testContact_Entry_Created = result;
          finishTest();
        } else { 
          fail("Create Failed");
        }
      }
    });
    delayTestFinish(10000);
  }
  public void test5ContactDelete() {
    GDataTestScripts.Contacts.testContact_Entry_Created.deleteEntry(new AsyncCallback<ContactEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(ContactEntry result) {
        ContactsService svc = ContactsService.newInstance("test");
        svc.getContactFeed(GDataTestScripts.Calendar.testCalendars_FeedLink,
          new AsyncCallback<ContactFeed>() {
            public void onFailure(Throwable caught) {
              fail("Delete Failed: " + caught.getMessage());
            }
            public void onSuccess(ContactFeed result) {
              if (result.getEntries().length != 1) {
                fail("Delete Failed");
              }
              finishTest();
            }
        });
      }
    });
    // delayTestFinish(5000);
  }
  
  public void testConstants() {
    assertNotNull("SERVICE_NAME", ContactsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ContactsService.newInstance("myValue"));
  }
}
