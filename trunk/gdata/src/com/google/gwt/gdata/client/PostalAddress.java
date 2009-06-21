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
public class PostalAddress extends JavaScriptObject {

  /**
   * Home address.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Other address.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Work address.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs a postal address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PostalAddress newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.PostalAddress(
      params
    );
  }-*/;

  /**
   * Constructs a postal address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PostalAddress newInstance() /*-{
    return new $wnd.google.gdata.PostalAddress();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.PostalAddress[name];
  }-*/;

  protected PostalAddress() { }

  /**
   * Returns the simple string value used to name this address.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary postal address.
   * 
   * @return
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the postal address type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the address string.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the simple string value used to name this address.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the simple string value used to name this address.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets whether this is the primary postal address.
   * 
   * @param primary
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets whether this is the primary postal address.
   * 
   * @param primary
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets the postal address type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the postal address type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the address string.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the address string.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
