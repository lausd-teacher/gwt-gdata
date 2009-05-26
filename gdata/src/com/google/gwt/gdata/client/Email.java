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
 * Comment unavailable.
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
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Email;
  }-*/;

  /**
   * Constructs an email address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Email newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Email(
      params
    );
  }-*/;

  /**
   * Constructs an email address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Email newInstance() /*-{
    return new $wnd.google.gdata.Email();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Email[name];
  }-*/;

  protected Email() { }

  /**
   * Returns the email address.
   * 
   * @return
   */
  public final native String getAddress() /*-{
    return this.getAddress();
  }-*/;

  /**
   * Returns the label.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary email address.
   * 
   * @return
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the email type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the email address.
   * 
   * @param address
   */
  public final native void setAddress(String address) /*-{
    this.setAddress(
      address
    );
  }-*/;

  /**
   * Sets the email address.
   * 
   * @param address
   */
  public final native void setAddress() /*-{
    this.setAddress();
  }-*/;

  /**
   * Sets the label.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the label.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets whether this is the primary email address.
   * 
   * @param primary
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets whether this is the primary email address.
   * 
   * @param primary
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets the email type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the email type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

}
