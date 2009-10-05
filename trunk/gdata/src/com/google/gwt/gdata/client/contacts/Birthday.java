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
 * Contact's birth date.
 */
public class Birthday extends JavaScriptObject {

  /**
   * Constructs a birthday.
   * 
   * @return A Birthday object.
   */
  public static native Birthday newInstance() /*-{
    return new $wnd.google.gdata.contacts.Birthday();
  }-*/;

  protected Birthday() { }

  /**
   * Returns the birth date. This attribute is required.
   * 
   * @return Birth date.
   */
  public final native String getWhen() /*-{
    return this.getWhen();
  }-*/;

  /**
   * Sets the birth date. This attribute is required.
   * 
   * @param when Birth date.
   */
  public final native void setWhen(String when) /*-{
    this.setWhen(when);
  }-*/;

}