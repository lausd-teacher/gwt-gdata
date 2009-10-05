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
 * Contact's priority.
 */
public class Priority extends JavaScriptObject {

  /**
   * High priority.
   */
  public static final String REL_HIGH = getConstant("REL_HIGH");

  /**
   * Low priority.
   */
  public static final String REL_LOW = getConstant("REL_LOW");

  /**
   * Normal priority.
   */
  public static final String REL_NORMAL = getConstant("REL_NORMAL");

  /**
   * Constructs a priority.
   * 
   * @return A Priority object.
   */
  public static native Priority newInstance() /*-{
    return new $wnd.google.gdata.contacts.Priority();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Priority[name];
  }-*/;

  protected Priority() { }

  /**
   * Returns the priority category. This attribute is required.
   * 
   * @return Priority category.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the priority category. This attribute is required.
   * 
   * @param rel Priority category.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}