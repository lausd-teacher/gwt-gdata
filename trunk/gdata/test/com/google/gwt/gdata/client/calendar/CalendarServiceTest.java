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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.analytics.AnalyticsService;
import com.google.gwt.gdata.client.atom.Category;
import com.google.gwt.gdata.client.atom.Person;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the CalendarService class.
 */
public class CalendarServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void test1CalendarsGet() {
    UserTest.login(GDataTestScripts.Calendar.testCookie_Name, GDataTestScripts.Calendar.testCookie_Value);
    CalendarService svc = CalendarService.newInstance("test");
    svc.getOwnCalendarsFeed(GDataTestScripts.Calendar.testCalendars_FeedLink,
        new AsyncCallback<CalendarFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(CalendarFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendars_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Calendar.testCalendars_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.Calendar.testCalendars_Feed = result;
            GDataTestScripts.Calendar.testCalendar_Entry_Original = GDataTestScripts.Calendar.testCalendars_Feed.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void test2CalendarGet() {
    assertEquals(GDataTestScripts.Calendar.testCalendar_Title_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getTitle().getText());
    assertEquals(GDataTestScripts.Calendar.testCalendar_Summary_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getSummary().getText());
    assertEquals(GDataTestScripts.Calendar.testCalendar_AccessControlListLink_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getAccessControlListLink().getHref());
    assertEquals(GDataTestScripts.Calendar.testCalendar_AtomAlternateLink_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getAtomAlternateLink().getHref());
    assertEquals(GDataTestScripts.Calendar.testCalendar_AccessLevel_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getAccessLevel().getValue());
    assertEquals(GDataTestScripts.Calendar.testCalendar_Color_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getColor().getValue());
    Person[] authors = GDataTestScripts.Calendar.testCalendar_Entry_Original.getAuthors();
    assertTrue(authors.length > 0);
    Person author = authors[0];
    assertEquals(GDataTestScripts.Calendar.testCalendar_AuthorEmail_Original, author.getEmail().getValue());
    assertEquals(GDataTestScripts.Calendar.testCalendar_AuthorName_Original, author.getName().getValue());
    Category[] cats = GDataTestScripts.Calendar.testCalendar_Entry_Original.getCategories();
    assertTrue(cats.length > 0);
    Category cat = cats[0];
    assertEquals(GDataTestScripts.Calendar.testCalendar_CategoryTerm_Original, cat.getTerm());
    assertEquals(GDataTestScripts.Calendar.testCalendar_EditLink_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getEditLink().getHref());
    assertEquals(GDataTestScripts.Calendar.testCalendar_EventFeedLink_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getEventFeedLink().getHref());
    assertFalse(GDataTestScripts.Calendar.testCalendar_Entry_Original.getHidden().getValue());
    assertEquals(GDataTestScripts.Calendar.testCalendar_Id_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getId().getValue());
    assertTrue(GDataTestScripts.Calendar.testCalendar_Entry_Original.getSelected().getValue());
    assertEquals(GDataTestScripts.Calendar.testCalendar_Link_Original, GDataTestScripts.Calendar.testCalendar_Entry_Original.getSelfLink().getHref());
    assertEquals(0.0, GDataTestScripts.Calendar.testCalendar_Entry_Original.getTimesCleaned().getValue());
  }
  public void test3CalendarUpdate() {
    GDataTestScripts.Calendar.testCalendar_Entry_Original.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Title_Updated);
    GDataTestScripts.Calendar.testCalendar_Entry_Original.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Summary_Updated);
    GDataTestScripts.Calendar.testCalendar_Entry_Original.updateEntry(new AsyncCallback<CalendarEntry>() {
      public void onFailure(Throwable caught) {
        fail("Update Failed: " + caught.getMessage());
      }
      public void onSuccess(CalendarEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Title_Updated) &&
            result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Summary_Updated)) {
          GDataTestScripts.Calendar.testCalendar_Entry_Original.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Title_Original);
          GDataTestScripts.Calendar.testCalendar_Entry_Original.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Summary_Original);
          GDataTestScripts.Calendar.testCalendar_Entry_Original.updateEntry(new AsyncCallback<CalendarEntry>() {
            public void onFailure(Throwable caught) {
              fail("Revert Failed: " + caught.getMessage());
            }
            public void onSuccess(CalendarEntry result) {
              if (result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Title_Original) &&
                  result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Summary_Original)) {
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
    delayTestFinish(4000);
  }
  public void test4CalendarCreate() {
    CalendarService svc = CalendarService.newInstance("test");
    CalendarEntry newEntry = CalendarEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Title_Created);
    newEntry.setSummary(Text.newInstance());
    newEntry.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Summary_Created);
    newEntry.setTimeZone(TimeZoneProperty.newInstance());
    newEntry.getTimeZone().setValue(GDataTestScripts.Calendar.testCalendar_TimeZone_Created);
    newEntry.setHidden(HiddenProperty.newInstance());
    newEntry.getHidden().setValue(false);
    newEntry.setColor(ColorProperty.newInstance());
    newEntry.getColor().setValue(ColorProperty.VALUE_RGB_4E5D6C);
    svc.insertEntry(GDataTestScripts.Calendar.testCalendars_InsertLink, newEntry, new AsyncCallback<CalendarEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(CalendarEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Title_Created) &&
            result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Summary_Created) &&
            result.getTimeZone().getValue().equals(GDataTestScripts.Calendar.testCalendar_TimeZone_Created) &&
            result.getColor().getValue().equals(ColorProperty.VALUE_RGB_4E5D6C) &&
            result.getHidden().getValue() == false) {
          GDataTestScripts.Calendar.testCalendar_Entry_Created = result;
          finishTest();
        } else { 
          fail("Create Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test5CalendarDelete() {
    GDataTestScripts.Calendar.testCalendar_Entry_Created.deleteEntry(new AsyncCallback<CalendarEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(CalendarEntry result) {
        CalendarService svc = CalendarService.newInstance("test");
        svc.getOwnCalendarsFeed(GDataTestScripts.Calendar.testCalendars_FeedLink,
          new AsyncCallback<CalendarFeed>() {
            public void onFailure(Throwable caught) {
              fail("Delete Failed: " + caught.getMessage());
            }
            public void onSuccess(CalendarFeed result) {
              if (result.getEntries().length != 1) {
                fail("Delete Failed");
              }
              finishTest();
            }
        });
      }
    });
    delayTestFinish(5000);
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", CalendarService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", AnalyticsService.newInstance("myValue"));
  }
}
