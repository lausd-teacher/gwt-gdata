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

import com.google.gwt.gdata.client.EventEntry;
import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;
import com.google.gwt.gdata.client.geo.GeoRssWhere;

/**
 * Describes a Calendar event entry.
 */
public class CalendarEventEntry extends EventEntry {

  /**
   * Constructs a Calendar event entry.
   * @return A CalendarEventEntry object.
   */
  public static native CalendarEventEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEventEntry();
  }-*/;

  protected CalendarEventEntry() { }

  /**
   * Adds a new calendar extended property.
   * 
   * @param extendedProperty Calendar extended property to add.
   */
  public final native void addExtendedProperty(
      CalendarExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(extendedProperty);
  }-*/;

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(CalendarEventEntryCallback callback) {
    this.delete(callback, null);
  }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteEntry(CalendarEventEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the anyone can add self property. This element is optional.
   * 
   * @return Anyone can add self property.
   */
  public final native AnyoneCanAddSelfProperty getAnyoneCanAddSelf() /*-{
    return this.getAnyoneCanAddSelf();
  }-*/;

  /**
   * Returns the batch identifier. This element is optional.
   * 
   * @return Batch identifier.
   */
  public final native com.google.gwt.gdata.client.batch.Id getBatchId() /*-{
    return this.getBatchId();
  }-*/;

  /**
   * Returns the batch interruption information. This element is optional.
   * 
   * @return Batch interruption information.
   */
  public final native Interrupted getBatchInterrupted() /*-{
    return this.getBatchInterrupted();
  }-*/;

  /**
   * Returns the batch operation. This element is optional.
   * 
   * @return Batch operation.
   */
  public final native Operation getBatchOperation() /*-{
    return this.getBatchOperation();
  }-*/;
  
  /**
   * Returns the batch response status information. This element is optional.
   * 
   * @return Batch response status information.
   */
  public final native Status getBatchStatus() /*-{
    return this.getBatchStatus();
  }-*/;

  /**
   * Returns the calendar extended properties.
   * 
   * @return Calendar extended properties.
   */
  public final native CalendarExtendedProperty[] getExtendedProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getExtendedProperties());
  }-*/;

  /**
   * Returns the geolocation as a georss:where. This element is optional.
   * 
   * @return Geolocation as a georss:where.
   */
  public final native GeoRssWhere getGeoLocation() /*-{
    return this.getGeoLocation();
  }-*/;

  /**
   * Returns the guests can invite others property. This element is optional.
   * 
   * @return Guests can invite others property.
   */
  public final native GuestsCanInviteOthersProperty
      getGuestsCanInviteOthers() /*-{
    return this.getGuestsCanInviteOthers();
  }-*/;

  /**
   * Returns the guests can modify property. This element is optional.
   * 
   * @return Guests can modify property.
   */
  public final native GuestsCanModifyProperty getGuestsCanModify() /*-{
    return this.getGuestsCanModify();
  }-*/;

  /**
   * Returns the guests can see guests property. This element is optional.
   * 
   * @return Guests can see guests property.
   */
  public final native GuestsCanSeeGuestsProperty getGuestsCanSeeGuests() /*-{
    return this.getGuestsCanSeeGuests();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native CalendarLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the private copy property. This element is optional.
   * 
   * @return Private copy property.
   */
  public final native PrivateCopyProperty getPrivateCopy() /*-{
    return this.getPrivateCopy();
  }-*/;

  /**
   * Returns the quick-add property. This element is optional.
   * 
   * @return Quick-add property.
   */
  public final native QuickAddProperty getQuickAdd() /*-{
    return this.getQuickAdd();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(
      CalendarEventEntryCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(
      CalendarEventEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Returns the send event notifications property. This element is optional.
   * 
   * @return Send event notifications property.
   */
  public final native SendEventNotificationsProperty
      getSendEventNotifications() /*-{
    return this.getSendEventNotifications();
  }-*/;

  /**
   * Returns the sequence number property. This element is optional.
   * 
   * @return Sequence number property.
   */
  public final native SequenceNumberProperty getSequence() /*-{
    return this.getSequence();
  }-*/;

  /**
   * Returns the suppress reply notifications property.
   * This element is optional.
   * 
   * @return Suppress reply notifications property.
   */
  public final native SuppressReplyNotificationsProperty
      getSuppressReplyNotifications() /*-{
    return this.getSuppressReplyNotifications();
  }-*/;

  /**
   * Returns the sync event property. This element is optional.
   * 
   * @return Sync event property.
   */
  public final native SyncEventProperty getSyncEvent() /*-{
    return this.getSyncEvent();
  }-*/;

  /**
   * Returns the ical export UID property. This element is optional.
   * 
   * @return Ical export UID property.
   */
  public final native IcalUIDProperty getUid() /*-{
    return this.getUid();
  }-*/;

  /**
   * Returns the web content.
   * 
   * @return Web content.
   */
  public final native WebContent getWebContent() /*-{
    return this.getWebContent();
  }-*/;

  /**
   * Returns the link that provides the URI of the web content.
   * 
   * @return Link that provides the URI of the web content.
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
   * 
   * @param anyoneCanAddSelf Anyone can add self property.
   */
  public final native void setAnyoneCanAddSelf(
      AnyoneCanAddSelfProperty anyoneCanAddSelf) /*-{
    this.setAnyoneCanAddSelf(anyoneCanAddSelf);
  }-*/;
  
  /**
   * Sets the batch identifier. This element is optional.
   * 
   * @param batchId Batch identifier.
   */
  public final native void setBatchId(
      com.google.gwt.gdata.client.batch.Id batchId) /*-{
    this.setBatchId(batchId);
  }-*/;

  /**
   * Sets the batch interruption information. This element is optional.
   * 
   * @param batchInterrupted Batch interruption information.
   */
  public final native void setBatchInterrupted(Interrupted batchInterrupted) /*-{
    this.setBatchInterrupted(batchInterrupted);
  }-*/;

  /**
   * Sets the batch operation. This element is optional.
   * 
   * @param batchOperation Batch operation.
   */
  public final native void setBatchOperation(Operation batchOperation) /*-{
    this.setBatchOperation(batchOperation);
  }-*/;

  /**
   * Sets the batch response status information. This element is optional.
   * 
   * @param batchStatus Batch response status information.
   */
  public final native void setBatchStatus(Status batchStatus) /*-{
    this.setBatchStatus(batchStatus);
  }-*/;
  
  /**
   * Sets the calendar extended properties.
   * 
   * @param extendedProperties Calendar extended properties, where each
   * calendar extended property is added using addExtendedProperty().
   */
  public final native void setExtendedProperties(
      CalendarExtendedProperty[] extendedProperties) /*-{
    this.setExtendedProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(extendedProperties)
    );
  }-*/;

  /**
   * Sets the geolocation as a georss:where. This element is optional.
   * 
   * @param geoLocation Geolocation as a georss:where.
   */
  public final native void setGeoLocation(GeoRssWhere geoLocation) /*-{
    this.setGeoLocation(geoLocation);
  }-*/;

  /**
   * Sets the guests can invite others property. This element is optional.
   * 
   * @param guestsCanInviteOthers Guests can invite others property.
   */
  public final native void setGuestsCanInviteOthers(
      GuestsCanInviteOthersProperty guestsCanInviteOthers) /*-{
    this.setGuestsCanInviteOthers(guestsCanInviteOthers);
  }-*/;

  /**
   * Sets the guests can modify property. This element is optional.
   * 
   * @param guestsCanModify Guests can modify property.
   */
  public final native void setGuestsCanModify(
      GuestsCanModifyProperty guestsCanModify) /*-{
    this.setGuestsCanModify(guestsCanModify);
  }-*/;

  /**
   * Sets the guests can see guests property. This element is optional.
   * 
   * @param guestsCanSeeGuests Guests can see guests property.
   */
  public final native void setGuestsCanSeeGuests(
      GuestsCanSeeGuestsProperty guestsCanSeeGuests) /*-{
    this.setGuestsCanSeeGuests(guestsCanSeeGuests);
  }-*/;

  /**
   * Sets the private copy property. This element is optional.
   * 
   * @param privateCopy Private copy property.
   */
  public final native void setPrivateCopy(PrivateCopyProperty privateCopy) /*-{
    this.setPrivateCopy(privateCopy);
  }-*/;

  /**
   * Sets the quick-add property. This element is optional.
   * 
   * @param quickAdd Quick-add property.
   */
  public final native void setQuickAdd(QuickAddProperty quickAdd) /*-{
    this.setQuickAdd(quickAdd);
  }-*/;

  /**
   * Sets the send event notifications property. This element is optional.
   * 
   * @param sendEventNotifications Send event notifications property.
   */
  public final native void setSendEventNotifications(
      SendEventNotificationsProperty sendEventNotifications) /*-{
    this.setSendEventNotifications(sendEventNotifications);
  }-*/;

  /**
   * Sets the sequence number property. This element is optional.
   * 
   * @param sequence Sequence number property.
   */
  public final native void setSequence(SequenceNumberProperty sequence) /*-{
    this.setSequence(sequence);
  }-*/;

  /**
   * Sets the suppress reply notifications property. This element is optional.
   * 
   * @param suppressReplyNotifications Suppress reply notifications property.
   */
  public final native void setSuppressReplyNotifications(
      SuppressReplyNotificationsProperty suppressReplyNotifications) /*-{
    this.setSuppressReplyNotifications(suppressReplyNotifications);
  }-*/;


  /**
   * Sets the sync event property. This element is optional.
   * 
   * @param syncEvent Sync event property.
   */
  public final native void setSyncEvent(SyncEventProperty syncEvent) /*-{
    this.setSyncEvent(syncEvent);
  }-*/;

  /**
   * Sets the ical export UID property. This element is optional.
   * 
   * @param uid Ical export UID property.
   */
  public final native void setUid(IcalUIDProperty uid) /*-{
    this.setUid(uid);
  }-*/;

  /**
   * Sets the link that provides the URI of the web content.
   * 
   * @param webContentLink Link that provides the URI of the web content.
   */
  public final native void setWebContentLink(CalendarLink webContentLink) /*-{
    this.setWebContentLink(webContentLink);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(CalendarEventEntryCallback callback) {
    this.update(callback, null);
  }

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(CalendarEventEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }
  
}