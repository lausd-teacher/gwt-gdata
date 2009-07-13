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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes whether to send ACL notifications to grantees.
 */
public class SendAclNotificationsProperty extends JavaScriptObject {

  /**
   * Constructs a send acl notifications property.
   * @return A SendAclNotificationsProperty object.
   */
  public static native SendAclNotificationsProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.SendAclNotificationsProperty();
  }-*/;

  protected SendAclNotificationsProperty() { }

  /**
   * Returns whether to send ACL notifications to grantees. This attribute is optional.
   * 
   * @return Whether to send ACL notifications to grantees.
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets whether to send ACL notifications to grantees. This attribute is optional.
   * 
   * @param value Whether to send ACL notifications to grantees.
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(value);
  }-*/;

}