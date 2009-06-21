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
public class RecurrenceExceptionEntry extends com.google.gwt.gdata.client.Entry<RecurrenceExceptionEntry> {

  /**
   * Constructs a recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native RecurrenceExceptionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.RecurrenceExceptionEntry(
      params
    );
  }-*/;

  /**
   * Constructs a recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native RecurrenceExceptionEntry newInstance() /*-{
    return new $wnd.google.gdata.RecurrenceExceptionEntry();
  }-*/;

  protected RecurrenceExceptionEntry() { }

  /**
   * Adds a new time period description.
   * 
   * @param when
   */
  public final native void addWhen(When when) /*-{
    this.addWhen(
      when
    );
  }-*/;

  /**
   * Adds a new place description.
   * 
   * @param where
   */
  public final native void addWhere(Where where) /*-{
    this.addWhere(
      where
    );
  }-*/;

  /**
   * Adds a new person description.
   * 
   * @param who
   */
  public final native void addWho(Who who) /*-{
    this.addWho(
      who
    );
  }-*/;

  /**
   * Returns the Comments class.
   * 
   * @return
   */
  public final native Comments getComments() /*-{
    return this.getComments();
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
   * Returns the original event.
   * 
   * @return
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
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
   * Returns the time period descriptions.
   * 
   * @return
   */
  public final native JsArray<When> getWhen() /*-{
    return this.getWhen();
  }-*/;

  /**
   * Returns the place descriptions.
   * 
   * @return
   */
  public final native JsArray<Where> getWhere() /*-{
    return this.getWhere();
  }-*/;

  /**
   * Returns the person descriptions.
   * 
   * @return
   */
  public final native JsArray<Who> getWho() /*-{
    return this.getWho();
  }-*/;

  /**
   * Sets the Comments class.
   * 
   * @param comments
   */
  public final native void setComments(Comments comments) /*-{
    this.setComments(
      comments
    );
  }-*/;

  /**
   * Sets the Comments class.
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
   * Sets the original event.
   * 
   * @param originalEvent
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(
      originalEvent
    );
  }-*/;

  /**
   * Sets the original event.
   * 
   * @param originalEvent
   */
  public final native void setOriginalEvent() /*-{
    this.setOriginalEvent();
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

  /**
   * Sets the time period descriptions.
   * 
   * @param when
   */
  public final native void setWhen(JsArray<When> when) /*-{
    this.setWhen(
      when
    );
  }-*/;

  /**
   * Sets the time period descriptions.
   * 
   * @param when
   */
  public final native void setWhen() /*-{
    this.setWhen();
  }-*/;

  /**
   * Sets the place descriptions.
   * 
   * @param where
   */
  public final native void setWhere(JsArray<Where> where) /*-{
    this.setWhere(
      where
    );
  }-*/;

  /**
   * Sets the place descriptions.
   * 
   * @param where
   */
  public final native void setWhere() /*-{
    this.setWhere();
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param who
   */
  public final native void setWho(JsArray<Who> who) /*-{
    this.setWho(
      who
    );
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param who
   */
  public final native void setWho() /*-{
    this.setWho();
  }-*/;

}