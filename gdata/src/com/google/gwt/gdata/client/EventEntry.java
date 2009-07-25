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

package com.google.gwt.gdata.client;

/**
 * Describes an event entry.
 * @param <E> The Event type.
 */
@SuppressWarnings("unchecked")
public class EventEntry<E extends EventEntry> extends com.google.gwt.gdata.client.Entry<E> {

  /**
   * Constructs an event entry.
   * @return An EventEntry object.
   */

  protected EventEntry() { }

  /**
   * Adds a new event location.
   * 
   * @param location Event location to add.
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(location);
  }-*/;

  /**
   * Adds a new event participant.
   * 
   * @param participant Event participant to add.
   */
  public final native void addParticipant(Who participant) /*-{
    this.addParticipant(participant);
  }-*/;

  /**
   * Adds a new recurrence exception.
   * 
   * @param recurrenceException Recurrence exception to add.
   */
  public final native void addRecurrenceException(RecurrenceException recurrenceException) /*-{
    this.addRecurrenceException(recurrenceException);
  }-*/;

  /**
   * Adds a new event reminder.
   * 
   * @param reminder Event reminder to add.
   */
  public final native void addReminder(Reminder reminder) /*-{
    this.addReminder(reminder);
  }-*/;

  /**
   * Adds a new event time.
   * 
   * @param time Event time to add.
   */
  public final native void addTime(When time) /*-{
    this.addTime(time);
  }-*/;

  /**
   * Returns the nested comments feed. This element is optional.
   * 
   * @return Nested comments feed.
   */
  public final native Comments getComments() /*-{
    return this.getComments();
  }-*/;

  /**
   * Returns the event status. This element is optional.
   * 
   * @return Event status.
   */
  public final native EventStatus getEventStatus() /*-{
    return this.getEventStatus();
  }-*/;

  /**
   * Returns the event locations.
   * 
   * @return Event locations.
   */
  public final native Where[] getLocations() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getLocations());
  }-*/;

  /**
   * Returns the event original start time. This element is optional.
   * 
   * @return Event original start time.
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
  }-*/;

  /**
   * Returns the event participants.
   * 
   * @return Event participants.
   */
  public final native Who[] getParticipants() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getParticipants());
  }-*/;

  /**
   * Returns the event recurrence. This element is optional.
   * 
   * @return Event recurrence.
   */
  public final native Recurrence getRecurrence() /*-{
    return this.getRecurrence();
  }-*/;

  /**
   * Returns the recurrence exceptions.
   * 
   * @return Recurrence exceptions.
   */
  public final native RecurrenceException[] getRecurrenceException() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getRecurrenceException());
  }-*/;

  /**
   * Returns the event reminders.
   * 
   * @return Event reminders.
   */
  public final native Reminder[] getReminders() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getReminders());
  }-*/;

  /**
   * Returns the event times.
   * 
   * @return Event times.
   */
  public final native When[] getTimes() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getTimes());
  }-*/;

  /**
   * Returns the event transparency. This element is optional.
   * 
   * @return Event transparency.
   */
  public final native Transparency getTransparency() /*-{
    return this.getTransparency();
  }-*/;

  /**
   * Returns the event visibility. This element is optional.
   * 
   * @return Event visibility.
   */
  public final native Visibility getVisibility() /*-{
    return this.getVisibility();
  }-*/;

  /**
   * Sets the nested comments feed. This element is optional.
   * 
   * @param comments Nested comments feed.
   */
  public final native void setComments(Comments comments) /*-{
    this.setComments(comments);
  }-*/;

  /**
   * Sets the event status. This element is optional.
   * 
   * @param eventStatus Event status.
   */
  public final native void setEventStatus(EventStatus eventStatus) /*-{
    this.setEventStatus(eventStatus);
  }-*/;

  /**
   * Sets the event locations.
   * 
   * @param locations Event locations.
   */
  public final native void setLocations(Where[] locations) /*-{
    this.setLocations(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(locations)
    );
  }-*/;

  /**
   * Sets the event original start time. This element is optional.
   * 
   * @param originalEvent Event original start time.
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(originalEvent);
  }-*/;

  /**
   * Sets the event participants.
   * 
   * @param participants Event participants, where each event participant is added using addParticipant().
   */
  public final native void setParticipants(Who[] participants) /*-{
    this.setParticipants(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(participants)
    );
  }-*/;

  /**
   * Sets the event recurrence. This element is optional.
   * 
   * @param recurrence Event recurrence.
   */
  public final native void setRecurrence(Recurrence recurrence) /*-{
    this.setRecurrence(recurrence);
  }-*/;

  /**
   * Sets the recurrence exceptions.
   * 
   * @param recurrenceException Recurrence exceptions, where each recurrence exception is added using addRecurrenceException().
   */
  public final native void setRecurrenceException(RecurrenceException[] recurrenceException) /*-{
    this.setRecurrenceException(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(recurrenceException)
    );
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminders Event reminders, where each event reminder is added using addReminder().
   */
  public final native void setReminders(Reminder[] reminders) /*-{
    this.setReminders(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(reminders)
    );
  }-*/;

  /**
   * Sets the event times.
   * 
   * @param times Event times, where each event time is added using addTime().
   */
  public final native void setTimes(When[] times) /*-{
    this.setTimes(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(times)
    );
  }-*/;

  /**
   * Sets the event transparency. This element is optional.
   * 
   * @param transparency Event transparency.
   */
  public final native void setTransparency(Transparency transparency) /*-{
    this.setTransparency(transparency);
  }-*/;

  /**
   * Sets the event visibility. This element is optional.
   * 
   * @param visibility Event visibility.
   */
  public final native void setVisibility(Visibility visibility) /*-{
    this.setVisibility(visibility);
  }-*/;

}