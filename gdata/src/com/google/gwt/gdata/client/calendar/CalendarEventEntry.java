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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.EventEntry;
import com.google.gwt.gdata.client.geo.GeoRssWhere;

/**
 * Comment unavailable.
 */
public class CalendarEventEntry extends EventEntry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarEventEntry;
  }-*/;

  /**
   * Constructs a Calendar event entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEventEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarEventEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar event entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEventEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEventEntry();
  }-*/;

  protected CalendarEventEntry() { }

  /**
   * Adds a new calendar extended property.
   * 
   * @param extendedProperty
   */
  public final native void addExtendedProperty(CalendarExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Returns the anyone can add self property.
   * 
   * @return
   */
  public final native AnyoneCanAddSelfProperty getAnyoneCanAddSelf() /*-{
    return this.getAnyoneCanAddSelf();
  }-*/;

  /**
   * Returns the calendar extended properties.
   * 
   * @return
   */
  public final native JsArray<CalendarExtendedProperty> getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the geolocation as a georss:where.
   * 
   * @return
   */
  public final native GeoRssWhere getGeoLocation() /*-{
    return this.getGeoLocation();
  }-*/;

  /**
   * Returns the guests can invite others property.
   * 
   * @return
   */
  public final native GuestsCanInviteOthersProperty getGuestsCanInviteOthers() /*-{
    return this.getGuestsCanInviteOthers();
  }-*/;

  /**
   * Returns the guests can modify property.
   * 
   * @return
   */
  public final native GuestsCanModifyProperty getGuestsCanModify() /*-{
    return this.getGuestsCanModify();
  }-*/;

  /**
   * Returns the guests can see guests property.
   * 
   * @return
   */
  public final native GuestsCanSeeGuestsProperty getGuestsCanSeeGuests() /*-{
    return this.getGuestsCanSeeGuests();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native CalendarLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the private copy property.
   * 
   * @return
   */
  public final native PrivateCopyProperty getPrivateCopy() /*-{
    return this.getPrivateCopy();
  }-*/;

  /**
   * Returns the quick-add property.
   * 
   * @return
   */
  public final native QuickAddProperty getQuickAdd() /*-{
    return this.getQuickAdd();
  }-*/;

  /**
   * Returns the send event notifications property.
   * 
   * @return
   */
  public final native SendEventNotificationsProperty getSendEventNotifications() /*-{
    return this.getSendEventNotifications();
  }-*/;

  /**
   * Returns the sequence number property.
   * 
   * @return
   */
  public final native SequenceNumberProperty getSequence() /*-{
    return this.getSequence();
  }-*/;

  /**
   * Returns the sync event property.
   * 
   * @return
   */
  public final native SyncEventProperty getSyncEvent() /*-{
    return this.getSyncEvent();
  }-*/;

  /**
   * Returns the ical export UID property.
   * 
   * @return
   */
  public final native IcalUIDProperty getUid() /*-{
    return this.getUid();
  }-*/;

  /**
   * Returns the web content.
   * 
   * @return
   */
  public final native WebContent getWebContent() /*-{
    return this.getWebContent();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return
   */
  public final native CalendarLink getWebContentLink() /*-{
    return this.getWebContentLink();
  }-*/;

  /**
   * Removes any existing web content.
   */
  public final native void removeWebContent() /*-{
    this.removeWebContent();
  }-*/;

  /**
   * Sets the anyone can add self property.
   * 
   * @param anyoneCanAddSelf
   */
  public final native void setAnyoneCanAddSelf(AnyoneCanAddSelfProperty anyoneCanAddSelf) /*-{
    this.setAnyoneCanAddSelf(
      anyoneCanAddSelf
    );
  }-*/;

  /**
   * Sets the anyone can add self property.
   * 
   * @param anyoneCanAddSelf
   */
  public final native void setAnyoneCanAddSelf() /*-{
    this.setAnyoneCanAddSelf();
  }-*/;

  /**
   * Sets the calendar extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties(JsArray<CalendarExtendedProperty> extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the calendar extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the geolocation as a georss:where.
   * 
   * @param geoLocation
   */
  public final native void setGeoLocation(GeoRssWhere geoLocation) /*-{
    this.setGeoLocation(
      geoLocation
    );
  }-*/;

  /**
   * Sets the geolocation as a georss:where.
   * 
   * @param geoLocation
   */
  public final native void setGeoLocation() /*-{
    this.setGeoLocation();
  }-*/;

  /**
   * Sets the guests can invite others property.
   * 
   * @param guestsCanInviteOthers
   */
  public final native void setGuestsCanInviteOthers(GuestsCanInviteOthersProperty guestsCanInviteOthers) /*-{
    this.setGuestsCanInviteOthers(
      guestsCanInviteOthers
    );
  }-*/;

  /**
   * Sets the guests can invite others property.
   * 
   * @param guestsCanInviteOthers
   */
  public final native void setGuestsCanInviteOthers() /*-{
    this.setGuestsCanInviteOthers();
  }-*/;

  /**
   * Sets the guests can modify property.
   * 
   * @param guestsCanModify
   */
  public final native void setGuestsCanModify(GuestsCanModifyProperty guestsCanModify) /*-{
    this.setGuestsCanModify(
      guestsCanModify
    );
  }-*/;

  /**
   * Sets the guests can modify property.
   * 
   * @param guestsCanModify
   */
  public final native void setGuestsCanModify() /*-{
    this.setGuestsCanModify();
  }-*/;

  /**
   * Sets the guests can see guests property.
   * 
   * @param guestsCanSeeGuests
   */
  public final native void setGuestsCanSeeGuests(GuestsCanSeeGuestsProperty guestsCanSeeGuests) /*-{
    this.setGuestsCanSeeGuests(
      guestsCanSeeGuests
    );
  }-*/;

  /**
   * Sets the guests can see guests property.
   * 
   * @param guestsCanSeeGuests
   */
  public final native void setGuestsCanSeeGuests() /*-{
    this.setGuestsCanSeeGuests();
  }-*/;

  /**
   * Sets the private copy property.
   * 
   * @param privateCopy
   */
  public final native void setPrivateCopy(PrivateCopyProperty privateCopy) /*-{
    this.setPrivateCopy(
      privateCopy
    );
  }-*/;

  /**
   * Sets the private copy property.
   * 
   * @param privateCopy
   */
  public final native void setPrivateCopy() /*-{
    this.setPrivateCopy();
  }-*/;

  /**
   * Sets the quick-add property.
   * 
   * @param quickAdd
   */
  public final native void setQuickAdd(QuickAddProperty quickAdd) /*-{
    this.setQuickAdd(
      quickAdd
    );
  }-*/;

  /**
   * Sets the quick-add property.
   * 
   * @param quickAdd
   */
  public final native void setQuickAdd() /*-{
    this.setQuickAdd();
  }-*/;

  /**
   * Sets the send event notifications property.
   * 
   * @param sendEventNotifications
   */
  public final native void setSendEventNotifications(SendEventNotificationsProperty sendEventNotifications) /*-{
    this.setSendEventNotifications(
      sendEventNotifications
    );
  }-*/;

  /**
   * Sets the send event notifications property.
   * 
   * @param sendEventNotifications
   */
  public final native void setSendEventNotifications() /*-{
    this.setSendEventNotifications();
  }-*/;

  /**
   * Sets the sequence number property.
   * 
   * @param sequence
   */
  public final native void setSequence(SequenceNumberProperty sequence) /*-{
    this.setSequence(
      sequence
    );
  }-*/;

  /**
   * Sets the sequence number property.
   * 
   * @param sequence
   */
  public final native void setSequence() /*-{
    this.setSequence();
  }-*/;

  /**
   * Sets the sync event property.
   * 
   * @param syncEvent
   */
  public final native void setSyncEvent(SyncEventProperty syncEvent) /*-{
    this.setSyncEvent(
      syncEvent
    );
  }-*/;

  /**
   * Sets the sync event property.
   * 
   * @param syncEvent
   */
  public final native void setSyncEvent() /*-{
    this.setSyncEvent();
  }-*/;

  /**
   * Sets the ical export UID property.
   * 
   * @param uid
   */
  public final native void setUid(IcalUIDProperty uid) /*-{
    this.setUid(
      uid
    );
  }-*/;

  /**
   * Sets the ical export UID property.
   * 
   * @param uid
   */
  public final native void setUid() /*-{
    this.setUid();
  }-*/;

  /**
   * Sets the link that provides the URI of the web content.
   * 
   * @param webContentLink
   */
  public final native void setWebContentLink(CalendarLink webContentLink) /*-{
    this.setWebContentLink(
      webContentLink
    );
  }-*/;

}
