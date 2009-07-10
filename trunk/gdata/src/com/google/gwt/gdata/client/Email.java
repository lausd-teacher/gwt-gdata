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
 * Describes an email address.
 */
public class Email extends JavaScriptObject {

  /**
   * Home email address.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Other email address.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Work email address.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs an email address.
   * @return An Email object.
   */
  public static native Email newInstance() /*-{
    return new $wnd.google.gdata.Email();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Email[name];
  }-*/;

  protected Email() { }

  /**
   * Returns the email address. This attribute is required.
   * 
   * @return Email address.
   */
  public final native String getAddress() /*-{
    return this.getAddress();
  }-*/;

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return The label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary email address. This attribute is optional.
   * 
   * @return Whether this is the primary email address.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the email type. This attribute is optional.
   * 
   * @return Email type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the email address. This attribute is required.
   * 
   * @param address Email address.
   */
  public final native void setAddress(String address) /*-{
    this.setAddress(address);
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label The label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets whether this is the primary email address. This attribute is optional.
   * 
   * @param primary Whether this is the primary email address.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the email type. This attribute is optional.
   * 
   * @param rel Email type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}