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
 * Describes a postal address.
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
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: label, primary, rel, and value.
   */
  public static native PostalAddress newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.PostalAddress(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.PostalAddress[name];
  }-*/;

  protected PostalAddress() { }

  /**
   * Returns the simple string value used to name this address. This attribute is optional.
   * 
   * @return Simple string value used to name this address or undefined for none.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary postal address. This attribute is optional.
   * 
   * @return Whether this is the primary postal address or undefined for none.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the postal address type. This attribute is optional.
   * 
   * @return Postal address type or undefined for none.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the address string. This attribute is required.
   * 
   * @return Address string or undefined for none.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the simple string value used to name this address. This attribute is optional.
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the simple string value used to name this address. This attribute is optional.
   * 
   * @param label Simple string value used to name this address or undefined for none.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets whether this is the primary postal address. This attribute is optional.
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets whether this is the primary postal address. This attribute is optional.
   * 
   * @param primary Whether this is the primary postal address or undefined for none.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets the postal address type. This attribute is optional.
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the postal address type. This attribute is optional.
   * 
   * @param rel Postal address type or undefined for none.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the address string. This attribute is required.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the address string. This attribute is required.
   * 
   * @param value Address string or undefined for none.
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
