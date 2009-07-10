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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The country name.
 */
public class Country extends JavaScriptObject {

  /**
   * Constructs a country object.
   * @return A country object.
   */
  public static native Country newInstance() /*-{
    return new $wnd.google.gdata.Country();
  }-*/;

  protected Country() { }

  /**
   * Returns the The 3166-1 alpha-2 country code. This attribute is optional.
   * 
   * @return The 3166-1 alpha-2 country code.
   */
  public final native String getCode() /*-{
    return this.getCode();
  }-*/;

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return The value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the The 3166-1 alpha-2 country code. This attribute is optional.
   * 
   * @param code The 3166-1 alpha-2 country code.
   */
  public final native void setCode(String code) /*-{
    this.setCode(code);
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value The value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}