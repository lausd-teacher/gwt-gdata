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

/**
 * Denotes contact's group membership.
 */
public class GroupMembershipInfo extends JavaScriptObject {

  /**
   * Constructs a group membership info.
   * @return A GroupMembershipInfo object.
   */
  public static native GroupMembershipInfo newInstance() /*-{
    return new $wnd.google.gdata.contacts.GroupMembershipInfo();
  }-*/;

  protected GroupMembershipInfo() { }

  /**
   * Returns whether the contact was removed from the group.
   * This attribute is optional.
   * 
   * @return Whether the contact was removed from the group.
   */
  public final native boolean getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the URI of the group. This attribute is required.
   * 
   * @return URI of the group.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Sets whether the contact was removed from the group.
   * This attribute is optional.
   * 
   * @param deleted Whether the contact was removed from the group.
   */
  public final native void setDeleted(boolean deleted) /*-{
    this.setDeleted(deleted);
  }-*/;

  /**
   * Sets the URI of the group. This attribute is required.
   * 
   * @param href URI of the group.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

}