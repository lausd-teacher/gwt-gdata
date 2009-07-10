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

import com.google.gwt.gdata.client.Deleted;

/**
 * Describes a contact entry.
 */
public class ContactEntry extends PersonEntry<ContactEntry> {

  /**
   * Constructs a contact entry.
   * @return A ContactEntry object.
   */
  public static native ContactEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactEntry();
  }-*/;

  protected ContactEntry() { }

  /**
   * Adds a new group membership info.
   * 
   * @param groupMembershipInfo Group membership info to add.
   */
  public final native void addGroupMembershipInfo(GroupMembershipInfo groupMembershipInfo) /*-{
    this.addGroupMembershipInfo(groupMembershipInfo);
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the group membership infos.
   * 
   * @return Group membership infos.
   */
  public final native GroupMembershipInfo[] getGroupMembershipInfos() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getGroupMembershipInfos());
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(deleted);
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
   * @param groupMembershipInfos Group membership infos, where each group membership info is added using addGroupMembershipInfo().
   */
  public final native void setGroupMembershipInfos(GroupMembershipInfo[] groupMembershipInfos) /*-{
    this.setGroupMembershipInfos(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(groupMembershipInfos)
    );
  }-*/;

}