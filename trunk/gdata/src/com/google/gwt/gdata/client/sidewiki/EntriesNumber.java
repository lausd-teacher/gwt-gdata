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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Number of Sidewiki entries written by this user.
 */
public class EntriesNumber extends JavaScriptObject {

  /**
   * Constructs an entries number.
   * 
   * @return An EntriesNumber object.
   */
  public static native EntriesNumber newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.EntriesNumber();
  }-*/;

  protected EntriesNumber() { }

  /**
   * Returns the number of written Sidewiki entries. This attribute is optional.
   * 
   * @return Number of written Sidewiki entries.
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the number of written Sidewiki entries. This attribute is optional.
   * 
   * @param value Number of written Sidewiki entries.
   */
  public final native void setValue(double value) /*-{
    this.setValue(value);
  }-*/;

}