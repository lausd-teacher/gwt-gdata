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

import com.google.gwt.gdata.client.acl.AclEntry;

/**
 * Describes an entry in a feed of a Calendar access control list (ACL).
 */
public class CalendarAclEntry extends AclEntry {

  /**
   * Constructs a Calendar ACL entry.
   * @return A CalendarAclEntry object.
   */
  public static native CalendarAclEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarAclEntry();
  }-*/;

  protected CalendarAclEntry() { }

  /**
   * Returns the send acl notifications property. This element is optional.
   * 
   * @return Send acl notifications.
   */
  public final native SendAclNotificationsProperty getSendAclNotifications() /*-{
    return this.getSendAclNotifications();
  }-*/;

  /**
   * Sets the send acl notifications property. This element is optional.
   * 
   * @param sendAclNotifications Send acl notifications property.
   */
  public final native void setSendAclNotifications(SendAclNotificationsProperty sendAclNotifications) /*-{
    this.setSendAclNotifications(sendAclNotifications);
  }-*/;

}