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

package com.google.gwt.gdata.client.app;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Value of the app:draft tag.
 */
public class Draft extends JavaScriptObject {

  /**
   * Is not a draft.
   */
  public static final String VALUE_NO = getConstant("VALUE_NO");

  /**
   * Is a draft.
   */
  public static final String VALUE_YES = getConstant("VALUE_YES");

  /**
   * Constructs a draft tag.
   * @return A Draft object.
   */
  public static native Draft newInstance() /*-{
    return new $wnd.google.gdata.app.Draft();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.app.Draft[name];
  }-*/;

  protected Draft() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}