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
 * Describes a Calendar event entry.
 */
public class CalendarEventEntry extends EventEntry {

  /**
   * Constructs a Calendar event entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: anyoneCanAddSelf, authors, categories, comments, content, contributors, eventStatus, extendedProperties, geoLocation, guestsCanInviteOthers, guestsCanModify, guestsCanSeeGuests, id, links, locations, originalEvent, participants, privateCopy, published, quickAdd, recurrence, recurrenceException, reminders, sendEventNotifications, sequence, summary, suppressReplyNotifications, syncEvent, times, title, transparency, uid, updated, and visibility.
   */
  public static native CalendarEventEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarEventEntry(
      params
    );
  }-*/;

  protected CalendarEventEntry() { }

  /**
   * Adds a new calendar extended property.
   * 
   * @param extendedProperty Calendar extended property to add, or object to use as a parameter to the google.gdata.calendar.CalendarExtendedProperty constructor.
   */
  public final native void addExtendedProperty(CalendarExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Returns the anyone can add self property. This element is optional.
   * 
   * @return Anyone can add self property or undefined for none.
   */
  public final native AnyoneCanAddSelfProperty getAnyoneCanAddSelf() /*-{
    return this.getAnyoneCanAddSelf();
  }-*/;

  /**
   * Returns the calendar extended properties.
   * 
   * @return Calendar extended properties.
   */
  public final native JsArray<CalendarExtendedProperty> getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the geolocation as a georss:where. This element is optional.
   * 
   * @return Geolocation as a georss:where or undefined for none.
   */
  public final native GeoRssWhere getGeoLocation() /*-{
    return this.getGeoLocation();
  }-*/;

  /**
   * Returns the guests can invite others property. This element is optional.
   * 
   * @return Guests can invite others property or undefined for none.
   */
  public final native GuestsCanInviteOthersProperty getGuestsCanInviteOthers() /*-{
    return this.getGuestsCanInviteOthers();
  }-*/;

  /**
   * Returns the guests can modify property. This element is optional.
   * 
   * @return Guests can modify property or undefined for none.
   */
  public final native GuestsCanModifyProperty getGuestsCanModify() /*-{
    return this.getGuestsCanModify();
  }-*/;

  /**
   * Returns the guests can see guests property. This element is optional.
   * 
   * @return Guests can see guests property or undefined for none.
   */
  public final native GuestsCanSeeGuestsProperty getGuestsCanSeeGuests() /*-{
    return this.getGuestsCanSeeGuests();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native CalendarLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the private copy property. This element is optional.
   * 
   * @return Private copy property or undefined for none.
   */
  public final native PrivateCopyProperty getPrivateCopy() /*-{
    return this.getPrivateCopy();
  }-*/;

  /**
   * Returns the quick-add property. This element is optional.
   * 
   * @return Quick-add property or undefined for none.
   */
  public final native QuickAddProperty getQuickAdd() /*-{
    return this.getQuickAdd();
  }-*/;

  /**
   * Returns the send event notifications property. This element is optional.
   * 
   * @return Send event notifications property or undefined for none.
   */
  public final native SendEventNotificationsProperty getSendEventNotifications() /*-{
    return this.getSendEventNotifications();
  }-*/;

  /**
   * Returns the sequence number property. This element is optional.
   * 
   * @return Sequence number property or undefined for none.
   */
  public final native SequenceNumberProperty getSequence() /*-{
    return this.getSequence();
  }-*/;

  /**
   * Returns the suppress reply notifications property. This element is optional.
   * 
   * @return Suppress reply notifications property or undefined for none.
   */
  public final native SuppressReplyNotificationsProperty getSuppressReplyNotifications() /*-{
    return this.getSuppressReplyNotifications();
  }-*/;

  /**
   * Returns the sync event property. This element is optional.
   * 
   * @return Sync event property or undefined for none.
   */
  public final native SyncEventProperty getSyncEvent() /*-{
    return this.getSyncEvent();
  }-*/;

  /**
   * Returns the ical export UID property. This element is optional.
   * 
   * @return Ical export UID property or undefined for none.
   */
  public final native IcalUIDProperty getUid() /*-{
    return this.getUid();
  }-*/;

  /**
   * Returns the web content.
   * 
   * @return Web content or undefined for none.
   */
  public final native WebContent getWebContent() /*-{
    return this.getWebContent();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return Link that provides the URI of the web content or undefined for none.
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
   * Sets the anyone can add self property. This element is optional.
   */
  public final native void setAnyoneCanAddSelf() /*-{
    this.setAnyoneCanAddSelf();
  }-*/;

  /**
   * Sets the anyone can add self property. This element is optional.
   * 
   * @param anyoneCanAddSelf Anyone can add self property, or object to use as a parameter to the google.gdata.calendar.AnyoneCanAddSelfProperty constructor, or undefined for none.
   */
  public final native void setAnyoneCanAddSelf(AnyoneCanAddSelfProperty anyoneCanAddSelf) /*-{
    this.setAnyoneCanAddSelf(
      anyoneCanAddSelf
    );
  }-*/;

  /**
   * Sets the calendar extended properties.
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the calendar extended properties.
   * 
   * @param extendedProperties Calendar extended properties, where each calendar extended property is added using the addExtendedProperty() function, or undefined to clear the calendar extended properties.
   */
  public final native void setExtendedProperties(JsArray<CalendarExtendedProperty> extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the geolocation as a georss:where. This element is optional.
   */
  public final native void setGeoLocation() /*-{
    this.setGeoLocation();
  }-*/;

  /**
   * Sets the geolocation as a georss:where. This element is optional.
   * 
   * @param geoLocation Geolocation as a georss:where, or object to use as a parameter to the google.gdata.geo.GeoRssWhere constructor, or undefined for none.
   */
  public final native void setGeoLocation(GeoRssWhere geoLocation) /*-{
    this.setGeoLocation(
      geoLocation
    );
  }-*/;

  /**
   * Sets the guests can invite others property. This element is optional.
   */
  public final native void setGuestsCanInviteOthers() /*-{
    this.setGuestsCanInviteOthers();
  }-*/;

  /**
   * Sets the guests can invite others property. This element is optional.
   * 
   * @param guestsCanInviteOthers Guests can invite others property, or object to use as a parameter to the google.gdata.calendar.GuestsCanInviteOthersProperty constructor, or undefined for none.
   */
  public final native void setGuestsCanInviteOthers(GuestsCanInviteOthersProperty guestsCanInviteOthers) /*-{
    this.setGuestsCanInviteOthers(
      guestsCanInviteOthers
    );
  }-*/;

  /**
   * Sets the guests can modify property. This element is optional.
   */
  public final native void setGuestsCanModify() /*-{
    this.setGuestsCanModify();
  }-*/;

  /**
   * Sets the guests can modify property. This element is optional.
   * 
   * @param guestsCanModify Guests can modify property, or object to use as a parameter to the google.gdata.calendar.GuestsCanModifyProperty constructor, or undefined for none.
   */
  public final native void setGuestsCanModify(GuestsCanModifyProperty guestsCanModify) /*-{
    this.setGuestsCanModify(
      guestsCanModify
    );
  }-*/;

  /**
   * Sets the guests can see guests property. This element is optional.
   */
  public final native void setGuestsCanSeeGuests() /*-{
    this.setGuestsCanSeeGuests();
  }-*/;

  /**
   * Sets the guests can see guests property. This element is optional.
   * 
   * @param guestsCanSeeGuests Guests can see guests property, or object to use as a parameter to the google.gdata.calendar.GuestsCanSeeGuestsProperty constructor, or undefined for none.
   */
  public final native void setGuestsCanSeeGuests(GuestsCanSeeGuestsProperty guestsCanSeeGuests) /*-{
    this.setGuestsCanSeeGuests(
      guestsCanSeeGuests
    );
  }-*/;

  /**
   * Sets the private copy property. This element is optional.
   */
  public final native void setPrivateCopy() /*-{
    this.setPrivateCopy();
  }-*/;

  /**
   * Sets the private copy property. This element is optional.
   * 
   * @param privateCopy Private copy property, or object to use as a parameter to the google.gdata.calendar.PrivateCopyProperty constructor, or undefined for none.
   */
  public final native void setPrivateCopy(PrivateCopyProperty privateCopy) /*-{
    this.setPrivateCopy(
      privateCopy
    );
  }-*/;

  /**
   * Sets the quick-add property. This element is optional.
   */
  public final native void setQuickAdd() /*-{
    this.setQuickAdd();
  }-*/;

  /**
   * Sets the quick-add property. This element is optional.
   * 
   * @param quickAdd Quick-add property, or object to use as a parameter to the google.gdata.calendar.QuickAddProperty constructor, or undefined for none.
   */
  public final native void setQuickAdd(QuickAddProperty quickAdd) /*-{
    this.setQuickAdd(
      quickAdd
    );
  }-*/;

  /**
   * Sets the send event notifications property. This element is optional.
   */
  public final native void setSendEventNotifications() /*-{
    this.setSendEventNotifications();
  }-*/;

  /**
   * Sets the send event notifications property. This element is optional.
   * 
   * @param sendEventNotifications Send event notifications property, or object to use as a parameter to the google.gdata.calendar.SendEventNotificationsProperty constructor, or undefined for none.
   */
  public final native void setSendEventNotifications(SendEventNotificationsProperty sendEventNotifications) /*-{
    this.setSendEventNotifications(
      sendEventNotifications
    );
  }-*/;

  /**
   * Sets the sequence number property. This element is optional.
   */
  public final native void setSequence() /*-{
    this.setSequence();
  }-*/;

  /**
   * Sets the sequence number property. This element is optional.
   * 
   * @param sequence Sequence number property, or object to use as a parameter to the google.gdata.calendar.SequenceNumberProperty constructor, or undefined for none.
   */
  public final native void setSequence(SequenceNumberProperty sequence) /*-{
    this.setSequence(
      sequence
    );
  }-*/;

  /**
   * Sets the suppress reply notifications property. This element is optional.
   */
  public final native void setSuppressReplyNotifications() /*-{
    this.setSuppressReplyNotifications();
  }-*/;

  /**
   * Sets the suppress reply notifications property. This element is optional.
   * 
   * @param suppressReplyNotifications Suppress reply notifications property, or object to use as a parameter to the google.gdata.calendar.SuppressReplyNotificationsProperty constructor, or undefined for none.
   */
  public final native void setSuppressReplyNotifications(SuppressReplyNotificationsProperty suppressReplyNotifications) /*-{
    this.setSuppressReplyNotifications(
      suppressReplyNotifications
    );
  }-*/;

  /**
   * Sets the sync event property. This element is optional.
   */
  public final native void setSyncEvent() /*-{
    this.setSyncEvent();
  }-*/;

  /**
   * Sets the sync event property. This element is optional.
   * 
   * @param syncEvent Sync event property, or object to use as a parameter to the google.gdata.calendar.SyncEventProperty constructor, or undefined for none.
   */
  public final native void setSyncEvent(SyncEventProperty syncEvent) /*-{
    this.setSyncEvent(
      syncEvent
    );
  }-*/;

  /**
   * Sets the ical export UID property. This element is optional.
   */
  public final native void setUid() /*-{
    this.setUid();
  }-*/;

  /**
   * Sets the ical export UID property. This element is optional.
   * 
   * @param uid Ical export UID property, or object to use as a parameter to the google.gdata.calendar.IcalUIDProperty constructor, or undefined for none.
   */
  public final native void setUid(IcalUIDProperty uid) /*-{
    this.setUid(
      uid
    );
  }-*/;

  /**
   * Sets the link that provides the URI of the web content.
   * 
   * @param webContentLink Link that provides the URI of the web content.
   */
  public final native void setWebContentLink(CalendarLink webContentLink) /*-{
    this.setWebContentLink(
      webContentLink
    );
  }-*/;

}
