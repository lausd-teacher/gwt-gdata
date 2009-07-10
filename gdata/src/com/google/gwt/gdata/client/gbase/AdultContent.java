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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Whether this account provides adult-only content.
 */
public class AdultContent extends JavaScriptObject {

  /**
   * The customer associated with this account declares that he does not provide any adult-only content.
   */
  public static final String VALUE_NO = getConstant("VALUE_NO");

  /**
   * The customer associated with this account declares he provides (some) adult-only content.
   */
  public static final String VALUE_YES = getConstant("VALUE_YES");

  /**
   * Constructs an Adult Content.
   * @return An AdultContent object.
   */
  public static native AdultContent newInstance() /*-{
    return new $wnd.google.gdata.gbase.AdultContent();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.AdultContent[name];
  }-*/;

  protected AdultContent() { }

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