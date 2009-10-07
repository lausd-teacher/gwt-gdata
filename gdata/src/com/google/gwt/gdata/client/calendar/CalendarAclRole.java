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

import com.google.gwt.gdata.client.acl.AclRole;

/**
 * Describes the Calendar roles of an entry in the Calendar access control
 * list.
 */
public class CalendarAclRole extends AclRole {
  
  /**
   * The specified users have full edit access to the calendar, except that
   * they can't change the calendar's access control settings.
   */
  public static final String VALUE_EDITOR = getConstant("VALUE_EDITOR");

  /**
   * The specified users can see only the free/busy information on the
   * calendar, not the details of events.
   */
  public static final String VALUE_FREEBUSY = getConstant("VALUE_FREEBUSY");

  /**
   * The specified users may override events.
   */
  public static final String VALUE_OVERRIDE = getConstant("VALUE_OVERRIDE");
  
  /**
   * The specified users have full owner access to the calendar.
   */
  public static final String VALUE_OWNER = getConstant("VALUE_OWNER");

  /**
   * The specified users have read-only access to the calendar.
   */
  public static final String VALUE_READ = getConstant("VALUE_READ");

  /**
   * The specified users can read and respond to events.
   */
  public static final String VALUE_RESPOND = getConstant("VALUE_RESPOND");

  /**
   * The specified users have administrator access to the calendar server.
   */
  public static final String VALUE_ROOT = getConstant("VALUE_ROOT");
  
  /**
   * Constructs a Calendar role.
   * @return A CalendarAclRole object.
   */
  public static native CalendarAclRole newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarAclRole();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarAclRole[name];
  }-*/;

  protected CalendarAclRole() { }

}