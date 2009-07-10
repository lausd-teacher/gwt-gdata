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
 * Describes a phone number.
 */
public class PhoneNumber extends JavaScriptObject {

  /**
   * Fax number.
   */
  public static final String REL_FAX = getConstant("REL_FAX");

  /**
   * Home phone number.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Home fax number.
   */
  public static final String REL_HOME_FAX = getConstant("REL_HOME_FAX");

  /**
   * Cell phone number.
   */
  public static final String REL_MOBILE = getConstant("REL_MOBILE");

  /**
   * Special type of number for which no other rel value makes sense.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Pager number.
   */
  public static final String REL_PAGER = getConstant("REL_PAGER");

  /**
   * Work phone number.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Work fax number.
   */
  public static final String REL_WORK_FAX = getConstant("REL_WORK_FAX");

  /**
   * Constructs a phone number.
   * @return A PhoneNumber object.
   */
  public static native PhoneNumber newInstance() /*-{
    return new $wnd.google.gdata.PhoneNumber();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.PhoneNumber[name];
  }-*/;

  protected PhoneNumber() { }

  /**
   * Returns the simple string value used to name this phone number. This attribute is optional.
   * 
   * @return Simple string value used to name this phone number.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary phone number. This attribute is optional.
   * 
   * @return Whether this is the primary phone number.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the programmatic value that identifies the type of phone number. This attribute is optional.
   * 
   * @return Programmatic value that identifies the type of phone number.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the human-readable phone number. This attribute is required.
   * 
   * @return Human-readable phone number.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the simple string value used to name this phone number. This attribute is optional.
   * 
   * @param label Simple string value used to name this phone number.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets whether this is the primary phone number. This attribute is optional.
   * 
   * @param primary Whether this is the primary phone number.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the programmatic value that identifies the type of phone number. This attribute is optional.
   * 
   * @param rel Programmatic value that identifies the type of phone number.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the human-readable phone number. This attribute is required.
   * 
   * @param value Human-readable phone number.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}