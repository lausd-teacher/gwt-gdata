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
 * Describes a contact entry.
 */
public class ContactEntry extends PersonEntry {

  /**
   * Constructs a contact entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, content, deleted, edited, emailAddresses, extendedProperties, groupMembershipInfos, id, imAddresses, links, organizations, phoneNumbers, postalAddresses, title, and updated.
   */
  public static native ContactEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactEntry(
      params
    );
  }-*/;

  protected ContactEntry() { }

  /**
   * Adds a new group membership info.
   * 
   * @param groupMembershipInfo Group membership info to add, or object to use as a parameter to the google.gdata.contacts.GroupMembershipInfo constructor.
   */
  public final native void addGroupMembershipInfo(GroupMembershipInfo groupMembershipInfo) /*-{
    this.addGroupMembershipInfo(
      groupMembershipInfo
    );
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries or undefined for none.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the group membership infos.
   * 
   * @return Group membership infos.
   */
  public final native JsArray<GroupMembershipInfo> getGroupMembershipInfos() /*-{
    return this.getGroupMembershipInfos();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries, or object to use as a parameter to the google.gdata.Deleted constructor, or undefined for none.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the group membership infos.
   */
  public final native void setGroupMembershipInfos() /*-{
    this.setGroupMembershipInfos();
  }-*/;

  /**
   * Sets the group membership infos.
   * 
   * @param groupMembershipInfos Group membership infos, where each group membership info is added using the addGroupMembershipInfo() function, or undefined to clear the group membership infos.
   */
  public final native void setGroupMembershipInfos(JsArray<GroupMembershipInfo> groupMembershipInfos) /*-{
    this.setGroupMembershipInfos(
      groupMembershipInfos
    );
  }-*/;

}
