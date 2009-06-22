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
 * Describes an event entry.
 */
public class EventEntry extends com.google.gwt.gdata.client.Entry<EventEntry> {

  /**
   * Constructs an event entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, comments, content, contributors, eventStatus, id, links, locations, originalEvent, participants, published, recurrence, recurrenceException, reminders, summary, times, title, transparency, updated, and visibility.
   */
  public static native EventEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.EventEntry(
      params
    );
  }-*/;

  protected EventEntry() { }

  /**
   * Adds a new event location.
   * 
   * @param location Event location to add, or object to use as a parameter to the google.gdata.Where constructor.
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(
      location
    );
  }-*/;

  /**
   * Adds a new event participant.
   * 
   * @param participant Event participant to add, or object to use as a parameter to the google.gdata.Who constructor.
   */
  public final native void addParticipant(Who participant) /*-{
    this.addParticipant(
      participant
    );
  }-*/;

  /**
   * Adds a new recurrence exception.
   * 
   * @param recurrenceException Recurrence exception to add, or object to use as a parameter to the google.gdata.RecurrenceException constructor.
   */
  public final native void addRecurrenceException(RecurrenceException recurrenceException) /*-{
    this.addRecurrenceException(
      recurrenceException
    );
  }-*/;

  /**
   * Adds a new event reminder.
   * 
   * @param reminder Event reminder to add, or object to use as a parameter to the google.gdata.Reminder constructor.
   */
  public final native void addReminder(Reminder reminder) /*-{
    this.addReminder(
      reminder
    );
  }-*/;

  /**
   * Adds a new event time.
   * 
   * @param time Event time to add, or object to use as a parameter to the google.gdata.When constructor.
   */
  public final native void addTime(When time) /*-{
    this.addTime(
      time
    );
  }-*/;

  /**
   * Returns the nested comments feed. This element is optional.
   * 
   * @return Nested comments feed or undefined for none.
   */
  public final native Comments getComments() /*-{
    return this.getComments();
  }-*/;

  /**
   * Returns the event status. This element is optional.
   * 
   * @return Event status or undefined for none.
   */
  public final native EventStatus getEventStatus() /*-{
    return this.getEventStatus();
  }-*/;

  /**
   * Returns the event locations.
   * 
   * @return Event locations.
   */
  public final native JsArray<Where> getLocations() /*-{
    return this.getLocations();
  }-*/;

  /**
   * Returns the event original start time. This element is optional.
   * 
   * @return Event original start time or undefined for none.
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
  }-*/;

  /**
   * Returns the event participants.
   * 
   * @return Event participants.
   */
  public final native JsArray<Who> getParticipants() /*-{
    return this.getParticipants();
  }-*/;

  /**
   * Returns the event recurrence. This element is optional.
   * 
   * @return Event recurrence or undefined for none.
   */
  public final native Recurrence getRecurrence() /*-{
    return this.getRecurrence();
  }-*/;

  /**
   * Returns the recurrence exceptions.
   * 
   * @return Recurrence exceptions.
   */
  public final native JsArray<RecurrenceException> getRecurrenceException() /*-{
    return this.getRecurrenceException();
  }-*/;

  /**
   * Returns the event reminders.
   * 
   * @return Event reminders.
   */
  public final native JsArray<Reminder> getReminders() /*-{
    return this.getReminders();
  }-*/;

  /**
   * Returns the event times.
   * 
   * @return Event times.
   */
  public final native JsArray<When> getTimes() /*-{
    return this.getTimes();
  }-*/;

  /**
   * Returns the event transparency. This element is optional.
   * 
   * @return Event transparency or undefined for none.
   */
  public final native Transparency getTransparency() /*-{
    return this.getTransparency();
  }-*/;

  /**
   * Returns the event visibility. This element is optional.
   * 
   * @return Event visibility or undefined for none.
   */
  public final native Visibility getVisibility() /*-{
    return this.getVisibility();
  }-*/;

  /**
   * Sets the nested comments feed. This element is optional.
   */
  public final native void setComments() /*-{
    this.setComments();
  }-*/;

  /**
   * Sets the nested comments feed. This element is optional.
   * 
   * @param comments Nested comments feed, or object to use as a parameter to the google.gdata.Comments constructor, or undefined for none.
   */
  public final native void setComments(Comments comments) /*-{
    this.setComments(
      comments
    );
  }-*/;

  /**
   * Sets the event status. This element is optional.
   */
  public final native void setEventStatus() /*-{
    this.setEventStatus();
  }-*/;

  /**
   * Sets the event status. This element is optional.
   * 
   * @param eventStatus Event status, or object to use as a parameter to the google.gdata.EventStatus constructor, or undefined for none.
   */
  public final native void setEventStatus(EventStatus eventStatus) /*-{
    this.setEventStatus(
      eventStatus
    );
  }-*/;

  /**
   * Sets the event locations.
   */
  public final native void setLocations() /*-{
    this.setLocations();
  }-*/;

  /**
   * Sets the event locations.
   * 
   * @param locations Event locations, where each event location is added using the addLocation() function, or undefined to clear the event locations.
   */
  public final native void setLocations(JsArray<Where> locations) /*-{
    this.setLocations(
      locations
    );
  }-*/;

  /**
   * Sets the event original start time. This element is optional.
   */
  public final native void setOriginalEvent() /*-{
    this.setOriginalEvent();
  }-*/;

  /**
   * Sets the event original start time. This element is optional.
   * 
   * @param originalEvent Event original start time, or object to use as a parameter to the google.gdata.OriginalEvent constructor, or undefined for none.
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(
      originalEvent
    );
  }-*/;

  /**
   * Sets the event participants.
   */
  public final native void setParticipants() /*-{
    this.setParticipants();
  }-*/;

  /**
   * Sets the event participants.
   * 
   * @param participants Event participants, where each event participant is added using the addParticipant() function, or undefined to clear the event participants.
   */
  public final native void setParticipants(JsArray<Who> participants) /*-{
    this.setParticipants(
      participants
    );
  }-*/;

  /**
   * Sets the event recurrence. This element is optional.
   */
  public final native void setRecurrence() /*-{
    this.setRecurrence();
  }-*/;

  /**
   * Sets the event recurrence. This element is optional.
   * 
   * @param recurrence Event recurrence, or object to use as a parameter to the google.gdata.Recurrence constructor, or undefined for none.
   */
  public final native void setRecurrence(Recurrence recurrence) /*-{
    this.setRecurrence(
      recurrence
    );
  }-*/;

  /**
   * Sets the recurrence exceptions.
   */
  public final native void setRecurrenceException() /*-{
    this.setRecurrenceException();
  }-*/;

  /**
   * Sets the recurrence exceptions.
   * 
   * @param recurrenceException Recurrence exceptions, where each recurrence exception is added using the addRecurrenceException() function, or undefined to clear the recurrence exceptions.
   */
  public final native void setRecurrenceException(JsArray<RecurrenceException> recurrenceException) /*-{
    this.setRecurrenceException(
      recurrenceException
    );
  }-*/;

  /**
   * Sets the event reminders.
   */
  public final native void setReminders() /*-{
    this.setReminders();
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminders Event reminders, where each event reminder is added using the addReminder() function, or undefined to clear the event reminders.
   */
  public final native void setReminders(JsArray<Reminder> reminders) /*-{
    this.setReminders(
      reminders
    );
  }-*/;

  /**
   * Sets the event times.
   */
  public final native void setTimes() /*-{
    this.setTimes();
  }-*/;

  /**
   * Sets the event times.
   * 
   * @param times Event times, where each event time is added using the addTime() function, or undefined to clear the event times.
   */
  public final native void setTimes(JsArray<When> times) /*-{
    this.setTimes(
      times
    );
  }-*/;

  /**
   * Sets the event transparency. This element is optional.
   */
  public final native void setTransparency() /*-{
    this.setTransparency();
  }-*/;

  /**
   * Sets the event transparency. This element is optional.
   * 
   * @param transparency Event transparency, or object to use as a parameter to the google.gdata.Transparency constructor, or undefined for none.
   */
  public final native void setTransparency(Transparency transparency) /*-{
    this.setTransparency(
      transparency
    );
  }-*/;

  /**
   * Sets the event visibility. This element is optional.
   */
  public final native void setVisibility() /*-{
    this.setVisibility();
  }-*/;

  /**
   * Sets the event visibility. This element is optional.
   * 
   * @param visibility Event visibility, or object to use as a parameter to the google.gdata.Visibility constructor, or undefined for none.
   */
  public final native void setVisibility(Visibility visibility) /*-{
    this.setVisibility(
      visibility
    );
  }-*/;

}
