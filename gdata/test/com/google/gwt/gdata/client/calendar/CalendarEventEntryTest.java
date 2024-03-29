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

import com.google.gwt.gdata.client.batch.Id;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;
import com.google.gwt.gdata.client.geo.GeoRssWhere;

/**
 * Tests for the CalendarEventEntry class.
 */
public class CalendarEventEntryTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CalendarEventEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        CalendarEventEntry obj = CalendarEventEntry.newInstance();
        obj.addExtendedProperty(CalendarExtendedProperty.newInstance());
        assertEquals("addExtendedProperty", 1,
            obj.getExtendedProperties().length);
        assertNull("getHtmlLink", obj.getHtmlLink());
        assertNull("getWebContent", obj.getWebContent());
        obj.removeWebContent();
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
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
        Id batchid = Id.newInstance();
        obj.setBatchId(batchid);
        assertSame("batchid", obj.getBatchId(), batchid);
        Interrupted batchinterrupted = Interrupted.newInstance();
        obj.setBatchInterrupted(batchinterrupted);
        assertSame("batchinterrupted", obj.getBatchInterrupted(), batchinterrupted);
        Operation batchoperation = Operation.newInstance();
        obj.setBatchOperation(batchoperation);
        assertSame("batchoperation", obj.getBatchOperation(), batchoperation);
        Status batchstatus = Status.newInstance();
        obj.setBatchStatus(batchstatus);
        assertSame("batchstatus", obj.getBatchStatus(), batchstatus);
        finishGDataTest();
      }
    }, 10000);
  }
}
