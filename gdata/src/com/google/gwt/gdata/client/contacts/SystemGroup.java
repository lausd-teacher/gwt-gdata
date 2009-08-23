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
   * Constructs a system group.
   * @return A SystemGroup object.
   */
  public static native SystemGroup newInstance() /*-{
    return new $wnd.google.gdata.contacts.SystemGroup();
  }-*/;

  protected SystemGroup() { }

  /**
   * Returns the identifier for distinguishing various system groups.
   * This attribute is required.
   * 
   * @return Identifier for distinguishing various system groups.
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Sets the identifier for distinguishing various system groups.
   * This attribute is required.
   * 
   * @param id Identifier for distinguishing various system groups.
   */
  public final native void setId(String id) /*-{
    this.setId(id);
  }-*/;

}