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
 * Describes a place (not necessarily a specific geographical location).
 */
public class Where extends JavaScriptObject {

  /**
   * Place where the enclosing event occurs.
   */
  public static final String REL_EVENT = getConstant("REL_EVENT");

  /**
   * Secondary location.
   */
  public static final String REL_EVENT_ALTERNATE =
      getConstant("REL_EVENT_ALTERNATE");

  /**
   * Nearby parking lot.
   */
  public static final String REL_EVENT_PARKING =
      getConstant("REL_EVENT_PARKING");

  /**
   * Constructs a place description.
   * @return A Where object.
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
   * This element is optional.
   * 
   * @return Nested person or venue (Contact) entry.
   */
  @SuppressWarnings("unchecked")
  public final native EntryLink getEntryLink() /*-{
    return this.getEntryLink();
  }-*/;

  /**
   * Returns the user-readable label that identifies this location in case
   * multiple locations may be present. This attribute is optional.
   * 
   * @return User-readable label that identifies this location in case multiple
   * locations may be present.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the meaning of this location. This attribute is optional.
   * 
   * @return Meaning of this location.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the text description of the place.
   * This attribute is optional.
   * 
   * @return Text description of the place.
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the nested person or venue (Contact) entry.
   * This element is optional.
   * 
   * @param entryLink Nested person or venue (Contact) entry.
   */
  @SuppressWarnings("unchecked")
  public final native void setEntryLink(EntryLink entryLink) /*-{
    this.setEntryLink(entryLink);
  }-*/;

  /**
   * Sets the user-readable label that identifies this location in case
   * multiple locations may be present. This attribute is optional.
   * 
   * @param label User-readable label that identifies this location in case
   * multiple locations may be present.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets the meaning of this location. This attribute is optional.
   * 
   * @param rel Meaning of this location.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the text description of the place. This attribute is optional.
   * 
   * @param valueString Text description of the place.
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(valueString);
  }-*/;

}