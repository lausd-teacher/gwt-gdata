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

import com.google.gwt.gdata.client.Name;
import com.google.gwt.gdata.client.StructuredPostalAddress;
import com.google.gwt.gdata.client.Where;

/**
 * Tests for the ProfileEntry class.
 */
public class ProfileEntryTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ProfileEntry.newInstance());
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        ProfileEntry obj = ProfileEntry.newInstance();
        obj.addCalendarLink(CalendarLink.newInstance());
        assertEquals("addCalendarLink", 1, obj.getCalendarLinks());
        obj.addEvent(Event.newInstance());
        assertEquals("addEvent", 1, obj.getEvents());
        obj.addExternalId(ExternalId.newInstance());
        assertEquals("addExternalId", 1, obj.getExternalIds());
        obj.addHobby(Hobby.newInstance());
        assertEquals("addHobby", 1, obj.getHobbies());
        obj.addJot(Jot.newInstance());
        assertEquals("", 1, obj.getCalendarLinks());
        obj.addLanguage(Language.newInstance());
        assertEquals("addLanguage", 1, obj.getLanguages());
        obj.addRelation(Relation.newInstance());
        assertEquals("addRelation", 1, obj.getRelations());
        obj.addStructuredPostalAddress(StructuredPostalAddress.newInstance());
        assertEquals("addStructuredPostalAddress", 1,
            obj.getStructuredPostalAddresses());
        obj.addUserDefinedField(UserDefinedField.newInstance());
        assertEquals("addUserDefinedField", 1, obj.getUserDefinedFields());
        obj.addWebsite(Website.newInstance());
        assertEquals("addWebsite", 1, obj.getWebsites());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    ProfileEntry obj = ProfileEntry.newInstance();
    BillingInformation billinginformation = BillingInformation.newInstance();
    obj.setBillingInformation(billinginformation);
    assertSame("billinginformation", obj.getBillingInformation(),
        billinginformation);
    Birthday birthday = Birthday.newInstance();
    obj.setBirthday(birthday);
    assertSame("birthday", obj.getBirthday(), birthday);
    CalendarLink[] calendarlinks = new CalendarLink[] {
        CalendarLink.newInstance() };
    obj.setCalendarLinks(calendarlinks);
    assertSame("calendarlinks", obj.getCalendarLinks().length,
        calendarlinks.length);
    DirectoryServer directoryserver = DirectoryServer.newInstance();
    obj.setDirectoryServer(directoryserver);
    assertSame("directoryserver", obj.getDirectoryServer(), directoryserver);
    Event[] events = new Event[] { Event.newInstance() };
    obj.setEvents(events);
    assertSame("events", obj.getEvents().length, events.length);
    ExternalId[] externalids = new ExternalId[] { ExternalId.newInstance() };
    obj.setExternalIds(externalids);
    assertSame("externalids", obj.getExternalIds().length, externalids.length);
    Gender gender = Gender.newInstance();
    obj.setGender(gender);
    assertSame("gender", obj.getGender(), gender);
    Initials initials = Initials.newInstance();
    obj.setInitials(initials);
    assertSame("initials", obj.getInitials(), initials);
    Jot[] jots = new Jot[] { Jot.newInstance() };
    obj.setJots(jots);
    assertSame("jots", obj.getJots().length, jots.length);
    Language[] languages = new Language[] { Language.newInstance() };
    obj.setLanguages(languages);
    assertSame("languages", obj.getLanguages().length, languages.length);
    MaidenName maidenname = MaidenName.newInstance();
    obj.setMaidenName(maidenname);
    assertSame("maidenname", obj.getMaidenName(), maidenname);
    Mileage mileage = Mileage.newInstance();
    obj.setMileage(mileage);
    assertSame("mileage", obj.getMileage(), mileage);
    Name name = Name.newInstance();
    obj.setName(name);
    assertSame("name", obj.getName(), name);
    Nickname nickname = Nickname.newInstance();
    obj.setNickname(nickname);
    assertSame("nickname", obj.getNickname(), nickname);
    Occupation occupation = Occupation.newInstance();
    obj.setOccupation(occupation);
    assertSame("occupation", obj.getOccupation(), occupation);
    Priority priority = Priority.newInstance();
    obj.setPriority(priority);
    assertSame("priority", obj.getPriority(), priority);
    Relation[] relations = new Relation[] { Relation.newInstance() };
    obj.setRelations(relations);
    assertSame("relations", obj.getRelations().length, relations.length);
    Sensitivity sensitivity = Sensitivity.newInstance();
    obj.setSensitivity(sensitivity);
    assertSame("sensitivity", obj.getSensitivity(), sensitivity);
    ShortName shortname = ShortName.newInstance();
    obj.setShortName(shortname);
    assertSame("shortname", obj.getShortName(), shortname);
    StructuredPostalAddress[] structuredpostaladdresses =
      new StructuredPostalAddress[] { StructuredPostalAddress.newInstance() };
    obj.setStructuredPostalAddresses(structuredpostaladdresses);
    assertSame("structuredpostaladdresses",
        obj.getStructuredPostalAddresses().length,
        structuredpostaladdresses.length);
    Subject subject = Subject.newInstance();
    obj.setSubject(subject);
    assertSame("subject", obj.getSubject(), subject);
    UserDefinedField[] userdefinedfields = new UserDefinedField[] {
        UserDefinedField.newInstance() };
    obj.setUserDefinedFields(userdefinedfields);
    assertSame("userdefinedfields", obj.getUserDefinedFields().length,
        userdefinedfields.length);
    Website[] website = new Website[] { Website.newInstance() };
    obj.setWebsites(website);
    assertSame("website", obj.getWebsites().length, website.length);
    Where where = Where.newInstance();
    obj.setWhere(where);
    assertSame("where", obj.getWhere(), where);
  }
}
