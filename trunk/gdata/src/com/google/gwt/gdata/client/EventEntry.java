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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Comment unavailable.
 */
public class EventEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.EventEntry;
  }-*/;

  /**
   * Constructs an event entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native EventEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.EventEntry(
      params
    );
  }-*/;

  /**
   * Constructs an event entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native EventEntry newInstance() /*-{
    return new $wnd.google.gdata.EventEntry();
  }-*/;

  protected EventEntry() { }

  /**
   * Adds a new event location.
   * 
   * @param location
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(
      location
    );
  }-*/;

  /**
   * Adds a new event participant.
   * 
   * @param participant
   */
  public final native void addParticipant(Who participant) /*-{
    this.addParticipant(
      participant
    );
  }-*/;

  /**
   * Adds a new recurrence exception.
   * 
   * @param recurrenceException
   */
  public final native void addRecurrenceException(RecurrenceException recurrenceException) /*-{
    this.addRecurrenceException(
      recurrenceException
    );
  }-*/;

  /**
   * Adds a new event reminder.
   * 
   * @param reminder
   */
  public final native void addReminder(Reminder reminder) /*-{
    this.addReminder(
      reminder
    );
  }-*/;

  /**
   * Adds a new event time.
   * 
   * @param time
   */
  public final native void addTime(When time) /*-{
    this.addTime(
      time
    );
  }-*/;

  /**
   * Returns the nested comments feed.
   * 
   * @return
   */
  public final native Comments getComments() /*-{
    return this.getComments();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getCommentsClass() /*-{
    return this.getCommentsClass();
  }-*/;

  /**
   * Returns the event status.
   * 
   * @return
   */
  public final native EventStatus getEventStatus() /*-{
    return this.getEventStatus();
  }-*/;

  /**
   * Returns the event locations.
   * 
   * @return
   */
  public final native JsArray<Where> getLocations() /*-{
    return this.getLocations();
  }-*/;

  /**
   * Returns the event original start time.
   * 
   * @return
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
  }-*/;

  /**
   * Returns the event participants.
   * 
   * @return
   */
  public final native JsArray<Who> getParticipants() /*-{
    return this.getParticipants();
  }-*/;

  /**
   * Returns the event recurrence.
   * 
   * @return
   */
  public final native Recurrence getRecurrence() /*-{
    return this.getRecurrence();
  }-*/;

  /**
   * Returns the recurrence exceptions.
   * 
   * @return
   */
  public final native JsArray<RecurrenceException> getRecurrenceException() /*-{
    return this.getRecurrenceException();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getRecurrenceExceptionClass() /*-{
    return this.getRecurrenceExceptionClass();
  }-*/;

  /**
   * Returns the event reminders.
   * 
   * @return
   */
  public final native JsArray<Reminder> getReminders() /*-{
    return this.getReminders();
  }-*/;

  /**
   * Returns the event times.
   * 
   * @return
   */
  public final native JsArray<When> getTimes() /*-{
    return this.getTimes();
  }-*/;

  /**
   * Returns the event transparency.
   * 
   * @return
   */
  public final native Transparency getTransparency() /*-{
    return this.getTransparency();
  }-*/;

  /**
   * Returns the event visibility.
   * 
   * @return
   */
  public final native Visibility getVisibility() /*-{
    return this.getVisibility();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getWhoClass() /*-{
    return this.getWhoClass();
  }-*/;

  /**
   * Sets the nested comments feed.
   * 
   * @param comments
   */
  public final native void setComments(Comments comments) /*-{
    this.setComments(
      comments
    );
  }-*/;

  /**
   * Sets the nested comments feed.
   * 
   * @param comments
   */
  public final native void setComments() /*-{
    this.setComments();
  }-*/;

  /**
   * Sets the event status.
   * 
   * @param eventStatus
   */
  public final native void setEventStatus(EventStatus eventStatus) /*-{
    this.setEventStatus(
      eventStatus
    );
  }-*/;

  /**
   * Sets the event status.
   * 
   * @param eventStatus
   */
  public final native void setEventStatus() /*-{
    this.setEventStatus();
  }-*/;

  /**
   * Sets the event locations.
   * 
   * @param locations
   */
  public final native void setLocations(JsArray<Where> locations) /*-{
    this.setLocations(
      locations
    );
  }-*/;

  /**
   * Sets the event locations.
   * 
   * @param locations
   */
  public final native void setLocations() /*-{
    this.setLocations();
  }-*/;

  /**
   * Sets the event original start time.
   * 
   * @param originalEvent
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(
      originalEvent
    );
  }-*/;

  /**
   * Sets the event original start time.
   * 
   * @param originalEvent
   */
  public final native void setOriginalEvent() /*-{
    this.setOriginalEvent();
  }-*/;

  /**
   * Sets the event participants.
   * 
   * @param participants
   */
  public final native void setParticipants(JsArray<Who> participants) /*-{
    this.setParticipants(
      participants
    );
  }-*/;

  /**
   * Sets the event participants.
   * 
   * @param participants
   */
  public final native void setParticipants() /*-{
    this.setParticipants();
  }-*/;

  /**
   * Sets the event recurrence.
   * 
   * @param recurrence
   */
  public final native void setRecurrence(Recurrence recurrence) /*-{
    this.setRecurrence(
      recurrence
    );
  }-*/;

  /**
   * Sets the event recurrence.
   * 
   * @param recurrence
   */
  public final native void setRecurrence() /*-{
    this.setRecurrence();
  }-*/;

  /**
   * Sets the recurrence exceptions.
   * 
   * @param recurrenceException
   */
  public final native void setRecurrenceException(JsArray<RecurrenceException> recurrenceException) /*-{
    this.setRecurrenceException(
      recurrenceException
    );
  }-*/;

  /**
   * Sets the recurrence exceptions.
   * 
   * @param recurrenceException
   */
  public final native void setRecurrenceException() /*-{
    this.setRecurrenceException();
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminders
   */
  public final native void setReminders(JsArray<Reminder> reminders) /*-{
    this.setReminders(
      reminders
    );
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminders
   */
  public final native void setReminders() /*-{
    this.setReminders();
  }-*/;

  /**
   * Sets the event times.
   * 
   * @param times
   */
  public final native void setTimes(JsArray<When> times) /*-{
    this.setTimes(
      times
    );
  }-*/;

  /**
   * Sets the event times.
   * 
   * @param times
   */
  public final native void setTimes() /*-{
    this.setTimes();
  }-*/;

  /**
   * Sets the event transparency.
   * 
   * @param transparency
   */
  public final native void setTransparency(Transparency transparency) /*-{
    this.setTransparency(
      transparency
    );
  }-*/;

  /**
   * Sets the event transparency.
   * 
   * @param transparency
   */
  public final native void setTransparency() /*-{
    this.setTransparency();
  }-*/;

  /**
   * Sets the event visibility.
   * 
   * @param visibility
   */
  public final native void setVisibility(Visibility visibility) /*-{
    this.setVisibility(
      visibility
    );
  }-*/;

  /**
   * Sets the event visibility.
   * 
   * @param visibility
   */
  public final native void setVisibility() /*-{
    this.setVisibility();
  }-*/;

}
