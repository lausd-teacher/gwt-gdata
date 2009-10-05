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
import com.google.gwt.gdata.client.When;

/**
 * Contact's events.
 */
public class Event extends JavaScriptObject {

  /**
   * Anniversary event.
   */
  public static final String REL_ANNIVERSARY = getConstant("REL_ANNIVERSARY");

  /**
   * Other event.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Constructs an event.
   * 
   * #return An Event object.
   */
  public static native Event newInstance() /*-{
    return new $wnd.google.gdata.contacts.Event();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Event[name];
  }-*/;

  protected Event() { }

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the event type. This attribute is optional.
   * 
   * @return Event type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the time period description. This element is required.
   * 
   * @return Time period description.
   */
  public final native When getWhen() /*-{
    return this.getWhen();
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
   * Sets the event type. This attribute is optional.
   * 
   * @param rel Event type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the time period description. This element is required.
   * 
   * @param when Time period description.
   */
  public final native void setWhen(When when) /*-{
    this.setWhen(when);
  }-*/;

}