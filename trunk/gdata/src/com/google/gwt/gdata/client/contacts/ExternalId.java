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
 * Contact's external id field.
 */
public class ExternalId extends JavaScriptObject {

  /**
   * Account external id.
   */
  public static final String REL_ACCOUNT = getConstant("REL_ACCOUNT");

  /**
   * Customer external id.
   */
  public static final String REL_CUSTOMER = getConstant("REL_CUSTOMER");

  /**
   * Network external id.
   */
  public static final String REL_NETWORK = getConstant("REL_NETWORK");

  /**
   * Organization external id.
   */
  public static final String REL_ORGANIZATION = getConstant("REL_ORGANIZATION");

  /**
   * Constructs an external id.
   * 
   * @return An ExternalId object.
   */
  public static native ExternalId newInstance() /*-{
    return new $wnd.google.gdata.contacts.ExternalId();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.ExternalId[name];
  }-*/;

  protected ExternalId() { }

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the id type. This attribute is optional.
   * 
   * @return Id type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label Label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets the id type. This attribute is optional.
   * 
   * @param rel Id type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}