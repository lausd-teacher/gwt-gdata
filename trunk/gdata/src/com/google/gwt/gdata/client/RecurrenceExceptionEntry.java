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
 * Describes an entry used by a recurrence exception entry link.
 */
public class RecurrenceExceptionEntry extends com.google.gwt.gdata.client.Entry<RecurrenceExceptionEntry> {

  /**
   * Constructs a recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, comments, content, contributors, eventStatus, id, links, originalEvent, published, title, transparency, updated, visibility, when, where, and who.
   */
  public static native RecurrenceExceptionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.RecurrenceExceptionEntry(
      params
    );
  }-*/;

  protected RecurrenceExceptionEntry() { }

  /**
   * Adds a new time period description.
   * 
   * @param when Time period description to add, or object to use as a parameter to the google.gdata.When constructor.
   */
  public final native void addWhen(When when) /*-{
    this.addWhen(
      when
    );
  }-*/;

  /**
   * Adds a new place description.
   * 
   * @param where Place description to add, or object to use as a parameter to the google.gdata.Where constructor.
   */
  public final native void addWhere(Where where) /*-{
    this.addWhere(
      where
    );
  }-*/;

  /**
   * Adds a new person description.
   * 
   * @param who Person description to add, or object to use as a parameter to the google.gdata.Who constructor.
   */
  public final native void addWho(Who who) /*-{
    this.addWho(
      who
    );
  }-*/;

  /**
   * Returns the Comments class. This element is optional.
   * 
   * @return Comments class or undefined for none.
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
   * Returns the original event. This element is optional.
   * 
   * @return Original event or undefined for none.
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
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
   * Returns the time period descriptions.
   * 
   * @return Time period descriptions.
   */
  public final native JsArray<When> getWhen() /*-{
    return this.getWhen();
  }-*/;

  /**
   * Returns the place descriptions.
   * 
   * @return Place descriptions.
   */
  public final native JsArray<Where> getWhere() /*-{
    return this.getWhere();
  }-*/;

  /**
   * Returns the person descriptions.
   * 
   * @return Person descriptions.
   */
  public final native JsArray<Who> getWho() /*-{
    return this.getWho();
  }-*/;

  /**
   * Sets the Comments class. This element is optional.
   */
  public final native void setComments() /*-{
    this.setComments();
  }-*/;

  /**
   * Sets the Comments class. This element is optional.
   * 
   * @param comments Comments class, or object to use as a parameter to the google.gdata.Comments constructor, or undefined for none.
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
   * Sets the original event. This element is optional.
   */
  public final native void setOriginalEvent() /*-{
    this.setOriginalEvent();
  }-*/;

  /**
   * Sets the original event. This element is optional.
   * 
   * @param originalEvent Original event, or object to use as a parameter to the google.gdata.OriginalEvent constructor, or undefined for none.
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(
      originalEvent
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

  /**
   * Sets the time period descriptions.
   */
  public final native void setWhen() /*-{
    this.setWhen();
  }-*/;

  /**
   * Sets the time period descriptions.
   * 
   * @param when Time period descriptions, where each time period description is added using the addWhen() function, or undefined to clear the time period descriptions.
   */
  public final native void setWhen(JsArray<When> when) /*-{
    this.setWhen(
      when
    );
  }-*/;

  /**
   * Sets the place descriptions.
   */
  public final native void setWhere() /*-{
    this.setWhere();
  }-*/;

  /**
   * Sets the place descriptions.
   * 
   * @param where Place descriptions, where each place description is added using the addWhere() function, or undefined to clear the place descriptions.
   */
  public final native void setWhere(JsArray<Where> where) /*-{
    this.setWhere(
      where
    );
  }-*/;

  /**
   * Sets the person descriptions.
   */
  public final native void setWho() /*-{
    this.setWho();
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param who Person descriptions, where each person description is added using the addWho() function, or undefined to clear the person descriptions.
   */
  public final native void setWho(JsArray<Who> who) /*-{
    this.setWho(
      who
    );
  }-*/;

}
