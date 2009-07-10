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

import com.google.gwt.gdata.client.geo.GeoRssWhere;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the CalendarEventEntry class.
 */
public class CalendarEventEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", CalendarEventEntry.newInstance());
  }

  public void testOther() {
    CalendarEventEntry obj = CalendarEventEntry.newInstance();
    // Unit Test for addExtendedProperty(CalendarExtendedProperty extendedProperty)
    // Unit Test for getHtmlLink()
    assertEquals("getHtmlLink", obj.getHtmlLink(), null);
    // Unit Test for getWebContent()
    assertEquals("getWebContent", obj.getWebContent(), null);
    // Unit Test for removeWebContent()
  }

  public void testProperties() {
    CalendarEventEntry obj = CalendarEventEntry.newInstance();
    SequenceNumberProperty sequence = SequenceNumberProperty.newInstance();
    obj.setSequence(sequence);
    assertSame("sequence", obj.getSequence(), sequence);
    SyncEventProperty syncevent = SyncEventProperty.newInstance();
    obj.setSyncEvent(syncevent);
    assertSame("syncevent", obj.getSyncEvent(), syncevent);
    GuestsCanInviteOthersProperty guestscaninviteothers = GuestsCanInviteOthersProperty.newInstance();
    obj.setGuestsCanInviteOthers(guestscaninviteothers);
    assertSame("guestscaninviteothers", obj.getGuestsCanInviteOthers(), guestscaninviteothers);
    AnyoneCanAddSelfProperty anyonecanaddself = AnyoneCanAddSelfProperty.newInstance();
    obj.setAnyoneCanAddSelf(anyonecanaddself);
    assertSame("anyonecanaddself", obj.getAnyoneCanAddSelf(), anyonecanaddself);
    SuppressReplyNotificationsProperty suppressreplynotifications = SuppressReplyNotificationsProperty.newInstance();
    obj.setSuppressReplyNotifications(suppressreplynotifications);
    assertSame("suppressreplynotifications", obj.getSuppressReplyNotifications(), suppressreplynotifications);
    GuestsCanModifyProperty guestscanmodify = GuestsCanModifyProperty.newInstance();
    obj.setGuestsCanModify(guestscanmodify);
    assertSame("guestscanmodify", obj.getGuestsCanModify(), guestscanmodify);
    GuestsCanSeeGuestsProperty guestscanseeguests = GuestsCanSeeGuestsProperty.newInstance();
    obj.setGuestsCanSeeGuests(guestscanseeguests);
    assertSame("guestscanseeguests", obj.getGuestsCanSeeGuests(), guestscanseeguests);
    GeoRssWhere geolocation = GeoRssWhere.newInstance();
    obj.setGeoLocation(geolocation);
    assertSame("geolocation", obj.getGeoLocation(), geolocation);
    CalendarExtendedProperty[] extendedproperties = new CalendarExtendedProperty[]{ CalendarExtendedProperty.newInstance() };
    obj.setExtendedProperties(extendedproperties);
    assertEquals("extendedproperties", obj.getExtendedProperties().length, extendedproperties.length);
    IcalUIDProperty uid = IcalUIDProperty.newInstance();
    obj.setUid(uid);
    assertSame("uid", obj.getUid(), uid);
    SendEventNotificationsProperty sendeventnotifications = SendEventNotificationsProperty.newInstance();
    obj.setSendEventNotifications(sendeventnotifications);
    assertSame("sendeventnotifications", obj.getSendEventNotifications(), sendeventnotifications);
    QuickAddProperty quickadd = QuickAddProperty.newInstance();
    obj.setQuickAdd(quickadd);
    assertSame("quickadd", obj.getQuickAdd(), quickadd);
    PrivateCopyProperty privatecopy = PrivateCopyProperty.newInstance();
    obj.setPrivateCopy(privatecopy);
    assertSame("privatecopy", obj.getPrivateCopy(), privatecopy);
  }
}
