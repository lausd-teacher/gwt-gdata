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

import com.google.gwt.core.client.JavaScriptObject;
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
    assertNotNull("newInstance()", CalendarEventEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    CalendarEventEntry obj = CalendarEventEntry.newInstance(JavaScriptObject.createObject());
    // Unit Test for addExtendedProperty(CalendarExtendedProperty extendedProperty)
    // Unit Test for getExtendedProperties()
    assertEquals("getExtendedProperties", obj.getExtendedProperties(), null);
    // Unit Test for getHtmlLink()
    assertEquals("getHtmlLink", obj.getHtmlLink(), null);
    // Unit Test for getWebContent()
    assertEquals("getWebContent", obj.getWebContent(), null);
    // Unit Test for removeWebContent()
    // Unit Test for setExtendedProperties(JsArray extendedProperties)
  }

  public void testProperties() {
    CalendarEventEntry obj = CalendarEventEntry.newInstance(JavaScriptObject.createObject());
    SequenceNumberProperty sequence = SequenceNumberProperty.newInstance(JavaScriptObject.createObject());
    obj.setSequence(sequence);
    assertSame("sequence", obj.getSequence(), sequence);
    SyncEventProperty syncevent = SyncEventProperty.newInstance(JavaScriptObject.createObject());
    obj.setSyncEvent(syncevent);
    assertSame("syncevent", obj.getSyncEvent(), syncevent);
    GuestsCanInviteOthersProperty guestscaninviteothers = GuestsCanInviteOthersProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanInviteOthers(guestscaninviteothers);
    assertSame("guestscaninviteothers", obj.getGuestsCanInviteOthers(), guestscaninviteothers);
    AnyoneCanAddSelfProperty anyonecanaddself = AnyoneCanAddSelfProperty.newInstance(JavaScriptObject.createObject());
    obj.setAnyoneCanAddSelf(anyonecanaddself);
    assertSame("anyonecanaddself", obj.getAnyoneCanAddSelf(), anyonecanaddself);
    SuppressReplyNotificationsProperty suppressreplynotifications = SuppressReplyNotificationsProperty.newInstance(JavaScriptObject.createObject());
    obj.setSuppressReplyNotifications(suppressreplynotifications);
    assertSame("suppressreplynotifications", obj.getSuppressReplyNotifications(), suppressreplynotifications);
    GuestsCanModifyProperty guestscanmodify = GuestsCanModifyProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanModify(guestscanmodify);
    assertSame("guestscanmodify", obj.getGuestsCanModify(), guestscanmodify);
    GuestsCanSeeGuestsProperty guestscanseeguests = GuestsCanSeeGuestsProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanSeeGuests(guestscanseeguests);
    assertSame("guestscanseeguests", obj.getGuestsCanSeeGuests(), guestscanseeguests);
    GeoRssWhere geolocation = GeoRssWhere.newInstance(JavaScriptObject.createObject());
    obj.setGeoLocation(geolocation);
    assertSame("geolocation", obj.getGeoLocation(), geolocation);
    IcalUIDProperty uid = IcalUIDProperty.newInstance(JavaScriptObject.createObject());
    obj.setUid(uid);
    assertSame("uid", obj.getUid(), uid);
    SendEventNotificationsProperty sendeventnotifications = SendEventNotificationsProperty.newInstance(JavaScriptObject.createObject());
    obj.setSendEventNotifications(sendeventnotifications);
    assertSame("sendeventnotifications", obj.getSendEventNotifications(), sendeventnotifications);
    QuickAddProperty quickadd = QuickAddProperty.newInstance(JavaScriptObject.createObject());
    obj.setQuickAdd(quickadd);
    assertSame("quickadd", obj.getQuickAdd(), quickadd);
    CalendarLink webcontentlink = CalendarLink.newInstance(JavaScriptObject.createObject());
    obj.setWebContentLink(webcontentlink);
    assertSame("webcontentlink", obj.getWebContentLink(), webcontentlink);
    PrivateCopyProperty privatecopy = PrivateCopyProperty.newInstance(JavaScriptObject.createObject());
    obj.setPrivateCopy(privatecopy);
    assertSame("privatecopy", obj.getPrivateCopy(), privatecopy);
  }
}
