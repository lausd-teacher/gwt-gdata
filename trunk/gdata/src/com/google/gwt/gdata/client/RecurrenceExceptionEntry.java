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
 * Describes an entry used by a recurrence exception entry link.
 */
public class RecurrenceExceptionEntry extends com.google.gwt.gdata.client.Entry<RecurrenceExceptionEntry> {

  /**
   * Constructs a recurrence exception entry.
   * @return A RecurrenceExceptionEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native RecurrenceExceptionEntry newInstance() /*-{
    return new $wnd.google.gdata.RecurrenceExceptionEntry();
  }-*/;

  protected RecurrenceExceptionEntry() { }

  /**
   * Adds a new time period description.
   * 
   * @param when Time period description to add.
   */
  public final native void addWhen(When when) /*-{
    this.addWhen(when);
  }-*/;

  /**
   * Adds a new place description.
   * 
   * @param where Place description to add.
   */
  public final native void addWhere(Where where) /*-{
    this.addWhere(where);
  }-*/;

  /**
   * Adds a new person description.
   * 
   * @param who Person description to add.
   */
  public final native void addWho(Who who) /*-{
    this.addWho(who);
  }-*/;

  /**
   * Returns the Comments class. This element is optional.
   * 
   * @return Comments.
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
   * Returns the original event. This element is optional.
   * 
   * @return Original event.
   */
  public final native OriginalEvent getOriginalEvent() /*-{
    return this.getOriginalEvent();
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
   * Returns the time period descriptions.
   * 
   * @return Time period descriptions.
   */
  public final native When[] getWhen() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWhen());
  }-*/;

  /**
   * Returns the place descriptions.
   * 
   * @return Place descriptions.
   */
  public final native Where[] getWhere() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWhere());
  }-*/;

  /**
   * Returns the person descriptions.
   * 
   * @return Person descriptions.
   */
  public final native Who[] getWho() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWho());
  }-*/;

  /**
   * Sets the Comments class. This element is optional.
   * 
   * @param comments Comments class.
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
   * Sets the original event. This element is optional.
   * 
   * @param originalEvent Original event.
   */
  public final native void setOriginalEvent(OriginalEvent originalEvent) /*-{
    this.setOriginalEvent(originalEvent);
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

  /**
   * Sets the time period descriptions.
   * 
   * @param when Time period descriptions, where each time period description is added using addWhen().
   */
  public final native void setWhen(When[] when) /*-{
    this.setWhen(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(when)
    );
  }-*/;

  /**
   * Sets the place descriptions.
   * 
   * @param where Place descriptions, where each place description is added using addWhere().
   */
  public final native void setWhere(Where[] where) /*-{
    this.setWhere(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(where)
    );
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param who Person descriptions, where each person description is added using addWho().
   */
  public final native void setWho(Who[] who) /*-{
    this.setWho(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(who)
    );
  }-*/;

}