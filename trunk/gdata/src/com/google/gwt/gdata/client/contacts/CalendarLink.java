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
 * Contact related calendar link.
 */
public class CalendarLink extends JavaScriptObject {

  /**
   * Free-busy calendar link.
   */
  public static final String REL_FREE_BUSY = getConstant("REL_FREE_BUSY");

  /**
   * Home calendar link.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Work calendar link.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs a calendar link.
   * 
   * @return A CalendarLink object.
   */
  public static native CalendarLink newInstance() /*-{
    return new $wnd.google.gdata.contacts.CalendarLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.CalendarLink[name];
  }-*/;

  protected CalendarLink() { }

  /**
   * Returns the URI of the calendar. This attribute is required.
   * 
   * @return URI of the calendar.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the user defined calendar link label. This attribute is optional.
   * 
   * @return User defined calendar link label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns denotes primary calendar link. This attribute is optional.
   * 
   * @return Denotes primary calendar link.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the known calendar link type. This attribute is optional.
   * 
   * @return Known calendar link type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the URI of the calendar. This attribute is required.
   * 
   * @param href URI of the calendar.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the user defined calendar link label. This attribute is optional.
   * 
   * @param label User defined calendar link label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets denotes primary calendar link. This attribute is optional.
   * 
   * @param primary Denotes primary calendar link.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the known calendar link type. This attribute is optional.
   * 
   * @param rel Known calendar link type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}