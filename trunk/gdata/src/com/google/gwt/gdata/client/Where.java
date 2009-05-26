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
public class Where extends JavaScriptObject {

  /**
   * Place where the enclosing event occurs.
   */
  public static final String REL_EVENT = getConstant("REL_EVENT");

  /**
   * Secondary location.
   */
  public static final String REL_EVENT_ALTERNATE = getConstant("REL_EVENT_ALTERNATE");

  /**
   * Nearby parking lot.
   */
  public static final String REL_EVENT_PARKING = getConstant("REL_EVENT_PARKING");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Where;
  }-*/;

  /**
   * Constructs a place description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Where newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Where(
      params
    );
  }-*/;

  /**
   * Constructs a place description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Where newInstance() /*-{
    return new $wnd.google.gdata.Where();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Where[name];
  }-*/;

  protected Where() { }

  /**
   * Returns the nested person or venue (Contact) entry.
   * 
   * @return
   */
  public final native EntryLink getEntryLink() /*-{
    return this.getEntryLink();
  }-*/;

  /**
   * Returns the user-readable label that identifies this location in case multiple locations may be present.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the meaning of this location.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the text description of the place.
   * 
   * @return
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the nested person or venue (Contact) entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink(JavaScriptObject entryLink) /*-{
    this.setEntryLink(
      entryLink
    );
  }-*/;

  /**
   * Sets the nested person or venue (Contact) entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink() /*-{
    this.setEntryLink();
  }-*/;

  /**
   * Sets the nested person or venue (Contact) entry.
   * 
   * @param entryLink
   */
  public final native void setEntryLink(EntryLink entryLink) /*-{
    this.setEntryLink(
      entryLink
    );
  }-*/;

  /**
   * Sets the user-readable label that identifies this location in case multiple locations may be present.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the user-readable label that identifies this location in case multiple locations may be present.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the meaning of this location.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the meaning of this location.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the text description of the place.
   * 
   * @param valueString
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(
      valueString
    );
  }-*/;

  /**
   * Sets the text description of the place.
   * 
   * @param valueString
   */
  public final native void setValueString() /*-{
    this.setValueString();
  }-*/;

}
