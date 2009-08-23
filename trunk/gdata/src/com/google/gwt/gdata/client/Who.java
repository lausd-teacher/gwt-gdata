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
 * Describes a person associated with the containing entity.
 */
public class Who extends JavaScriptObject {

  /**
   * A general meeting/event attendee.
   */
  public static final String REL_EVENT_ATTENDEE =
      getConstant("REL_EVENT_ATTENDEE");

  /**
   * Event organizer (an organizer is not necessarily an attendee).
   */
  public static final String REL_EVENT_ORGANIZER =
      getConstant("REL_EVENT_ORGANIZER");

  /**
   * Performer (similar to speaker, but with more emphasis on art than speech
   * delivery).
   */
  public static final String REL_EVENT_PERFORMER =
      getConstant("REL_EVENT_PERFORMER");

  /**
   * Speaker.
   */
  public static final String REL_EVENT_SPEAKER =
      getConstant("REL_EVENT_SPEAKER");

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
  public static final String REL_MESSAGE_FROM =
      getConstant("REL_MESSAGE_FROM");

  /**
   * Intended recipient of a reply message.
   */
  public static final String REL_MESSAGE_REPLY_TO =
      getConstant("REL_MESSAGE_REPLY_TO");

  /**
   * Message (email or IM) sender.
   */
  public static final String REL_MESSAGE_TO = getConstant("REL_MESSAGE_TO");

  /**
   * Person to whom task is assigned.
   */
  public static final String REL_TASK_ASSIGNED_TO =
      getConstant("REL_TASK_ASSIGNED_TO");

  /**
   * Constructs a person description.
   * @return A Who object.
   */
  public static native Who newInstance() /*-{
    return new $wnd.google.gdata.Who();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Who[name];
  }-*/;

  protected Who() { }

  /**
   * Returns the event attendee status. This element is optional.
   * 
   * @return Event attendee status.
   */
  public final native AttendeeStatus getAttendeeStatus() /*-{
    return this.getAttendeeStatus();
  }-*/;

  /**
   * Returns the event attendee type. This element is optional.
   * 
   * @return Event attendee type.
   */
  public final native AttendeeType getAttendeeType() /*-{
    return this.getAttendeeType();
  }-*/;

  /**
   * Returns the email address. This attribute is optional.
   * 
   * @return Email address.
   */
  public final native String getEmail() /*-{
    return this.getEmail();
  }-*/;

  /**
   * Returns the nested person entry. This element is optional.
   * 
   * @return Nested person entry.
   */
  @SuppressWarnings("unchecked")
  public final native EntryLink getEntryLink() /*-{
    return this.getEntryLink();
  }-*/;

  /**
   * Returns the relationship between the containing entity and the contained 
   * erson. This attribute is optional.
   * 
   * @return Relationship between the containing entity and the contained
   * person.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the simple string value that can be used as a representation of
   * this person. This attribute is optional.
   * 
   * @return Simple string value that can be used as a representation of this
   * person.
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the event attendee status. This element is optional.
   * 
   * @param attendeeStatus Event attendee status.
   */
  public final native void setAttendeeStatus(
      AttendeeStatus attendeeStatus) /*-{
    this.setAttendeeStatus(attendeeStatus);
  }-*/;

  /**
   * Sets the event attendee type. This element is optional.
   */
  public final native void setAttendeeType() /*-{
    this.setAttendeeType();
  }-*/;

  /**
   * Sets the event attendee type. This element is optional.
   * 
   * @param attendeeType Event attendee type.
   */
  public final native void setAttendeeType(AttendeeType attendeeType) /*-{
    this.setAttendeeType(attendeeType);
  }-*/;
  
  /**
   * Sets the email address. This attribute is optional.
   * 
   * @param email Email address.
   */
  public final native void setEmail(String email) /*-{
    this.setEmail(email);
  }-*/;

  /**
   * Sets the nested person entry. This element is optional.
   * 
   * @param entryLink Nested person entry.
   */
  @SuppressWarnings("unchecked")
  public final native void setEntryLink(EntryLink entryLink) /*-{
    this.setEntryLink(entryLink);
  }-*/;

  /**
   * Sets the relationship between the containing entity and the contained
   * person. This attribute is optional.
   * 
   * @param rel Relationship between the containing entity and the contained
   * person.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the simple string value that can be used as a representation of this
   * person. This attribute is optional.
   * 
   * @param valueString Simple string value that can be used as a
   * representation of this person.
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(valueString);
  }-*/;

}