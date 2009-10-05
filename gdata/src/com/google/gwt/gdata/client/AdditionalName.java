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
 * Person's additional (often: middle) name.
 */
public class AdditionalName extends JavaScriptObject {

  /**
   * Constructs an additional name.
   * 
   * @return An AdditionalName object.
   */
  public static native AdditionalName newInstance() /*-{
    return new $wnd.google.gdata.AdditionalName();
  }-*/;

  protected AdditionalName() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Returns the pronunciation help. This attribute is optional.
   * 
   * @return Pronunciation help.
   */
  public final native String getYomi() /*-{
    return this.getYomi();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

  /**
   * Sets the pronunciation help. This attribute is optional.
   * 
   * @param yomi Pronunciation help.
   */
  public final native void setYomi(String yomi) /*-{
    this.setYomi(yomi);
  }-*/;

}