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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Deleted;

/**
 * Comment unavailable.
 */
public class ContactEntry extends PersonEntry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.contacts.ContactEntry;
  }-*/;

  /**
   * Constructs a contact entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactEntry(
      params
    );
  }-*/;

  /**
   * Constructs a contact entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactEntry();
  }-*/;

  protected ContactEntry() { }

  /**
   * Adds a new group membership info.
   * 
   * @param groupMembershipInfo
   */
  public final native void addGroupMembershipInfo(GroupMembershipInfo groupMembershipInfo) /*-{
    this.addGroupMembershipInfo(
      groupMembershipInfo
    );
  }-*/;

  /**
   * Returns the marker for deleted entries.
   * 
   * @return
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the group membership infos.
   * 
   * @return
   */
  public final native JsArray<GroupMembershipInfo> getGroupMembershipInfos() /*-{
    return this.getGroupMembershipInfos();
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the group membership infos.
   * 
   * @param groupMembershipInfos
   */
  public final native void setGroupMembershipInfos(JsArray<GroupMembershipInfo> groupMembershipInfos) /*-{
    this.setGroupMembershipInfos(
      groupMembershipInfos
    );
  }-*/;

  /**
   * Sets the group membership infos.
   * 
   * @param groupMembershipInfos
   */
  public final native void setGroupMembershipInfos() /*-{
    this.setGroupMembershipInfos();
  }-*/;

}
