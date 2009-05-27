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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
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
    assertNotNull("getConstructor()", CalendarEventEntry.getConstructor());
    assertNotNull("newInstance()", CalendarEventEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // CalendarEventEntry obj = CalendarEventEntry.newInstance(JavaScriptObject.createObject());
    // obj.addExtendedProperty(extendedProperty);
    // obj.removeWebContent();
  }

  public void testProperties() {
    CalendarEventEntry obj = CalendarEventEntry.newInstance(JavaScriptObject.createObject());
    QuickAddProperty quickadd = QuickAddProperty.newInstance(JavaScriptObject.createObject());
    obj.setQuickAdd(quickadd);
    assertSame("quickadd", obj.getQuickAdd(), quickadd);
    SyncEventProperty syncevent = SyncEventProperty.newInstance(JavaScriptObject.createObject());
    obj.setSyncEvent(syncevent);
    assertSame("syncevent", obj.getSyncEvent(), syncevent);
    PrivateCopyProperty privatecopy = PrivateCopyProperty.newInstance(JavaScriptObject.createObject());
    obj.setPrivateCopy(privatecopy);
    assertSame("privatecopy", obj.getPrivateCopy(), privatecopy);
    AnyoneCanAddSelfProperty anyonecanaddself = AnyoneCanAddSelfProperty.newInstance(JavaScriptObject.createObject());
    obj.setAnyoneCanAddSelf(anyonecanaddself);
    assertSame("anyonecanaddself", obj.getAnyoneCanAddSelf(), anyonecanaddself);
    SequenceNumberProperty sequence = SequenceNumberProperty.newInstance(JavaScriptObject.createObject());
    obj.setSequence(sequence);
    assertSame("sequence", obj.getSequence(), sequence);
    JsArray<com.google.gwt.gdata.client.calendar.CalendarExtendedProperty> extendedproperties = ArrayHelper.toJsArray(CalendarExtendedProperty.newInstance(JavaScriptObject.createObject()));
    obj.setExtendedProperties(extendedproperties);
    assertSame("extendedproperties", obj.getExtendedProperties(), extendedproperties);
    CalendarLink webcontentlink = CalendarLink.newInstance(JavaScriptObject.createObject());
    obj.setWebContentLink(webcontentlink);
    assertSame("webcontentlink", obj.getWebContentLink(), webcontentlink);
    GuestsCanSeeGuestsProperty guestscanseeguests = GuestsCanSeeGuestsProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanSeeGuests(guestscanseeguests);
    assertSame("guestscanseeguests", obj.getGuestsCanSeeGuests(), guestscanseeguests);
    GuestsCanInviteOthersProperty guestscaninviteothers = GuestsCanInviteOthersProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanInviteOthers(guestscaninviteothers);
    assertSame("guestscaninviteothers", obj.getGuestsCanInviteOthers(), guestscaninviteothers);
    IcalUIDProperty uid = IcalUIDProperty.newInstance(JavaScriptObject.createObject());
    obj.setUid(uid);
    assertSame("uid", obj.getUid(), uid);
    GeoRssWhere geolocation = GeoRssWhere.newInstance(JavaScriptObject.createObject());
    obj.setGeoLocation(geolocation);
    assertSame("geolocation", obj.getGeoLocation(), geolocation);
    GuestsCanModifyProperty guestscanmodify = GuestsCanModifyProperty.newInstance(JavaScriptObject.createObject());
    obj.setGuestsCanModify(guestscanmodify);
    assertSame("guestscanmodify", obj.getGuestsCanModify(), guestscanmodify);
    SendEventNotificationsProperty sendeventnotifications = SendEventNotificationsProperty.newInstance(JavaScriptObject.createObject());
    obj.setSendEventNotifications(sendeventnotifications);
    assertSame("sendeventnotifications", obj.getSendEventNotifications(), sendeventnotifications);
  }
}
