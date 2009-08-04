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

/**
 * Tests for the CalendarService class.
 */
public class CalendarServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SERVICE_NAME", CalendarService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", AnalyticsService.newInstance("myValue"));
  }
  
  public void testCreateAndDeleteCalendar() {
    UserTest.login(GDataTestScripts.Calendar.testCookie_Name, GDataTestScripts.Calendar.testCookie_Value);
    CalendarService svc = CalendarService.newInstance("test");
    CalendarEntry newEntry = CalendarEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Entry_Title_Created);
    newEntry.setSummary(Text.newInstance());
    newEntry.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Entry_Summary_Created);
    newEntry.setTimeZone(TimeZoneProperty.newInstance());
    newEntry.getTimeZone().setValue(GDataTestScripts.Calendar.testCalendar_Entry_TimeZone_Created);
    newEntry.setHidden(HiddenProperty.newInstance());
    newEntry.getHidden().setValue(false);
    newEntry.setColor(ColorProperty.newInstance());
    newEntry.getColor().setValue(ColorProperty.VALUE_RGB_4E5D6C);
    svc.insertCalendarEntry(GDataTestScripts.Calendar.testCalendars_Feed_InsertLink, newEntry, new CalendarEntryCallback() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(CalendarEntry result) {
        if (!result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Title_Created) ||
            !result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Summary_Created) ||
            !result.getTimeZone().getValue().equals(GDataTestScripts.Calendar.testCalendar_Entry_TimeZone_Created) ||
            !result.getColor().getValue().equals(ColorProperty.VALUE_RGB_4E5D6C) ||
            result.getHidden().getValue() == true) {
          fail("Create Failed");
        }
        result.deleteEntry(new CalendarEntryCallback() {
          public void onFailure(Throwable caught) {
            fail("Delete Failed: " + caught.getMessage());
          }
          public void onSuccess(CalendarEntry result) {
            finishTest();
          }
        });
      }
    });
    delayTestFinish(10000);
  }
  
  public void testGetCalendar() {
    UserTest.login(GDataTestScripts.Calendar.testCookie_Name, GDataTestScripts.Calendar.testCookie_Value);
    CalendarService svc = CalendarService.newInstance("test");
    svc.getCalendarEntry(GDataTestScripts.Calendar.testCalendar_Entry_Link,
        new CalendarEntryCallback() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(CalendarEntry result) {
            Person[] authors = result.getAuthors();
            Category[] cats = result.getCategories();
            if (authors.length == 0 || cats.length == 0) {
              fail("Get Failed");
            }
            Person author = authors[0];
            Category cat = cats[0];
            if (!GDataTestScripts.Calendar.testCalendar_Entry_Title.equals(result.getTitle().getText()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_Summary.equals(result.getSummary().getText()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_AccessControlListLink.equals(result.getAccessControlListLink().getHref()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_AtomAlternateLink.equals(result.getAtomAlternateLink().getHref()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_AccessLevel.equals(result.getAccessLevel().getValue()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_Color.equals(result.getColor().getValue()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_AuthorEmail.equals(author.getEmail().getValue()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_AuthorName.equals(author.getName().getValue()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_CategoryTerm.equals(cat.getTerm()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_EditLink.equals(result.getEditLink().getHref()) ||
                !GDataTestScripts.Calendar.testCalendar_Entry_EventFeedLink.equals(result.getEventFeedLink().getHref()) ||
                result.getHidden().getValue() ||
                !result.getSelected().getValue() ||
                result.getTimesCleaned().getValue() != 0.0) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  
  public void testGetCalendars() {
    UserTest.login(GDataTestScripts.Calendar.testCookie_Name, GDataTestScripts.Calendar.testCookie_Value);
    CalendarService svc = CalendarService.newInstance("test");
    svc.getOwnCalendarsFeed(GDataTestScripts.Calendar.testCalendars_Feed_Link,
        new CalendarFeedCallback() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(CalendarFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendars_Feed_Title)) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  
  public void testUpdateCalendar() {
    UserTest.login(GDataTestScripts.Calendar.testCookie_Name, GDataTestScripts.Calendar.testCookie_Value);
    CalendarService svc = CalendarService.newInstance("test");
    svc.getCalendarEntry(GDataTestScripts.Calendar.testCalendar_Entry_Link,
        new CalendarEntryCallback() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(CalendarEntry result) {
            result.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Entry_Title_Updated);
            result.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Entry_Summary_Updated);
            result.updateEntry(new CalendarEntryCallback() {
              public void onFailure(Throwable caught) {
                fail("Update Failed: " + caught.getMessage());
              }
              public void onSuccess(CalendarEntry result) {
                if (result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Title_Updated) &&
                    result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Summary_Updated)) {
                  result.getTitle().setText(GDataTestScripts.Calendar.testCalendar_Entry_Title);
                  result.getSummary().setText(GDataTestScripts.Calendar.testCalendar_Entry_Summary);
                  result.updateEntry(new CalendarEntryCallback() {
                    public void onFailure(Throwable caught) {
                      fail("Revert Failed: " + caught.getMessage());
                    }
                    public void onSuccess(CalendarEntry result) {
                      if (result.getTitle().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Title) &&
                          result.getSummary().getText().equals(GDataTestScripts.Calendar.testCalendar_Entry_Summary)) {
                        finishTest();
                      } else { 
                        fail("Revert Failed");
                      }
                    }
                  });
                } else { 
                  fail("Update Failed");
                }
              }
            });
          }
    });
    delayTestFinish(10000);
  }
}
