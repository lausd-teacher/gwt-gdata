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
 * Name of organization. Defined in gdata.js
 */
public class OrgName extends JavaScriptObject {

  /**
   * Constructs an org name.
   * @return An OrgName object.
   */
  public static native OrgName newInstance() /*-{
    return new $wnd.google.gdata.OrgName();
  }-*/;

  protected OrgName() { }

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Returns the yomi name of organization. This attribute is optional.
   * 
   * @return Yomi name of organization.
   */
  public final native String getYomi() /*-{
    return this.getYomi();
  }-*/;
  
  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

  /**
   * Sets the yomi name of organization. This attribute is optional.
   * 
   * @param yomi Yomi name of organization.
   */
  public final native void setYomi(String yomi) /*-{
    this.setYomi(yomi);
  }-*/;

}