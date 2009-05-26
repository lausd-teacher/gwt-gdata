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

/**
 * Comment unavailable.
 */
public class Who extends JavaScriptObject {

  /**
   * A general meeting/event attendee.
   */
  public static final String REL_EVENT_ATTENDEE = getConstant("REL_EVENT_ATTENDEE");

  /**
   * Event organizer (an organizer is not necessarily an attendee).
   */
  public static final String REL_EVENT_ORGANIZER = getConstant("REL_EVENT_ORGANIZER");

  /**
   * Performer (similar to speaker, but with more emphasis on art than speech delivery).
   */
  public static final String REL_EVENT_PERFORMER = getConstant("REL_EVENT_PERFORMER");

  /**
   * Speaker.
   */
  public static final String REL_EVENT_SPEAKER = getConstant("REL_EVENT_SPEAKER");

  /**
   * Message BCC recipient.
   */
  public static final String REL_MESSAGE_BCC = getConstant("REL_MESSAGE_BCC");

  /**
   * Message CC recipient.
   */
  public static final String REL_MESSAGE_CC = getConstant("REL_MESSAGE_CC");

  /**
   * Message primary recipient.
   */
  public static final String REL_MESSAGE_FROM = getConstant("REL_MESSAGE_FROM");

  /**
   * Intended recipient of a reply message.
   */
  public static final String REL_MESSAGE_REPLY_TO = getConstant("REL_MESSAGE_REPLY_TO");

  /**
   * Message (email or IM) sender.
   */
  public static final String REL_MESSAGE_TO = getConstant("REL_MESSAGE_TO");

  /**
   * Person to whom task is assigned.
   */
  public static final String REL_TASK_ASSIGNED_TO = getConstant("REL_TASK_ASSIGNED_TO");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Who;
  }-*/;

  /**
   * Constructs a person description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Who newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Who(
      params
    );
  }-*/;

  /**
   * Constructs a person description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Who newInstance() /*-{
    return new $wnd.google.gdata.Who();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Who[name];
  }-*/;

  protected Who() { }

  /**
   * Returns the event attendee status.
   * 
   * @return
   */
  public final native AttendeeStatus getAttendeeStatus() /*-{
    return this.getAttendeeStatus();
  }-*/;

  /**
   * Returns the event attendee type.
   * 
   * @return
   */
  public final native AttendeeType getAttendeeType() /*-{
    return this.getAttendeeType();
  }-*/;

  /**
   * Returns the email address.
   * 
   * @return
   */
  public final native String getEmail() /*-{
    return this.getEmail();
  }-*/;

  /**
   * Returns the nested person entry.
   * 
   * @return
   */
  public final native EntryLink getEntryLink() /*-{
    return this.getEntryLink();
  }-*/;

  /**
   * Returns the relationship between the containing entity and the contained person.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the simple string value that can be used as a representation of this person.
   * 
   * @return
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the event attendee status.
   * 
   * @param attendeeStatus
   */
  public final native void setAttendeeStatus(JavaScriptObject attendeeStatus) /*-{
    this.setAttendeeStatus(
      attendeeStatus
    );
  }-*/;

  /**
   * Sets the event attendee status.
   * 
   * @param attendeeStatus
   */
  public final native void setAttendeeStatus() /*-{
    this.setAttendeeStatus();
  }-*/;

  /**
   * Sets the event attendee status.
   * 
   * @param attendeeStatus
   */
  public final native void setAttendeeStatus(AttendeeStatus attendeeStatus) /*-{
    this.setAttendeeStatus(
      attendeeStatus
    );
  }-*/;

  /**
   * Sets the event attendee type.
   * 
   * @param attendeeType
   */
  public final native void setAttendeeType(JavaScriptObject attendeeType) /*-{
    this.setAttendeeType(
      attendeeType
    );
  }-*/;

  /**
   * Sets the event attendee type.
   * 
   * @param attendeeType
   */
  public final native void setAttendeeType() /*-{
    this.setAttendeeType();
  }-*/;

  /**
   * Sets the event attendee type.
   * 
   * @param attendeeType
   */
  public final native void setAttendeeType(AttendeeType attendeeType) /*-{
    this.setAttendeeType(
      attendeeType
    );
  }-*/;

  /**
   * Sets the email address.
   * 
   * @param email
   */
  public final native void setEmail(String email) /*-{
    this.setEmail(
      email
    );
  }-*/;

  /**
   * Sets the email address.
   * 
   * @param email
   */
  public final native void setEmail() /*-{
    this.setEmail();
  }-*/;

  /**
   * Sets the nested person entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink(JavaScriptObject entryLink) /*-{
    this.setEntryLink(
      entryLink
    );
  }-*/;

  /**
   * Sets the nested person entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink() /*-{
    this.setEntryLink();
  }-*/;

  /**
   * Sets the nested person entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink(EntryLink entryLink) /*-{
    this.setEntryLink(
      entryLink
    );
  }-*/;

  /**
   * Sets the relationship between the containing entity and the contained person.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the relationship between the containing entity and the contained person.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the simple string value that can be used as a representation of this person.
   * 
   * @param valueString
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(
      valueString
    );
  }-*/;

  /**
   * Sets the simple string value that can be used as a representation of this person.
   * 
   * @param valueString
   */
  public final native void setValueString() /*-{
    this.setValueString();
  }-*/;

}
