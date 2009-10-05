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
 * Contact's sensitivity.
 */
public class Sensitivity extends JavaScriptObject {

  /**
   * Confidential sensitivity.
   */
  public static final String REL_CONFIDENTIAL =
    getConstant("REL_CONFIDENTIAL");

  /**
   * Normal sensitivity.
   */
  public static final String REL_NORMAL = getConstant("REL_NORMAL");

  /**
   * Personal sensitivity.
   */
  public static final String REL_PERSONAL = getConstant("REL_PERSONAL");

  /**
   * Private sensitivity.
   */
  public static final String REL_PRIVATE = getConstant("REL_PRIVATE");

  /**
   * Constructs a sensitivity.
   * 
   * @return A Sensitivity object.
   */
  public static native Sensitivity newInstance() /*-{
    return new $wnd.google.gdata.contacts.Sensitivity();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Sensitivity[name];
  }-*/;

  protected Sensitivity() { }

  /**
   * Returns the sensitivity type. This attribute is required.
   * 
   * @return Sensitivity type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the sensitivity type. This attribute is required.
   * 
   * @param rel Sensitivity type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}