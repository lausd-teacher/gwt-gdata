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
 * Contact's language field.
 */
public class Language extends JavaScriptObject {

  /**
   * Constructs a language.
   * 
   * @return A Language object.
   */
  public static native Language newInstance() /*-{
    return new $wnd.google.gdata.contacts.Language();
  }-*/;

  protected Language() { }

  /**
   * Returns the code. This attribute is optional.
   * 
   * @return Code.
   */
  public final native String getCode() /*-{
    return this.getCode();
  }-*/;

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Sets the code. This attribute is optional.
   * 
   * @param code Code.
   */
  public final native void setCode(String code) /*-{
    this.setCode(code);
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label Label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

}