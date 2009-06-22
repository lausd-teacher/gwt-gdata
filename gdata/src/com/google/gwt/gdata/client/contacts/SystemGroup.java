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
 * Element that if present marks that a group is a system one.
 */
public class SystemGroup extends JavaScriptObject {

  /**
   * Constructs a system group using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: id.
   */
  public static native SystemGroup newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.SystemGroup(
      params
    );
  }-*/;

  protected SystemGroup() { }

  /**
   * Returns the identifier for distinguishing various system groups. This attribute is required.
   * 
   * @return Identifier for distinguishing various system groups or undefined for none.
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Sets the identifier for distinguishing various system groups. This attribute is required.
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets the identifier for distinguishing various system groups. This attribute is required.
   * 
   * @param id Identifier for distinguishing various system groups or undefined for none.
   */
  public final native void setId(String id) /*-{
    this.setId(
      id
    );
  }-*/;

}
