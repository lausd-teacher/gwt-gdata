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
 * Contact's jot.
 */
public class Jot extends JavaScriptObject {

  /**
   * Home jot.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Keywords jot.
   */
  public static final String REL_KEYWORDS = getConstant("REL_KEYWORDS");

  /**
   * Other jot.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * User jot.
   */
  public static final String REL_USER = getConstant("REL_USER");

  /**
   * Work jot.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs a jot.
   * 
   * @return A Jot object.
   */
  public static native Jot newInstance() /*-{
    return new $wnd.google.gdata.contacts.Jot();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Jot[name];
  }-*/;

  protected Jot() { }

  /**
   * Returns the jot type. This attribute is required.
   * 
   * @return Jot type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the jot type. This attribute is required.
   * 
   * @param rel Jot type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}