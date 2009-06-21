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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Comment unavailable.
 */
public class Updated extends JavaScriptObject {

  /**
   * Constructs an updated timestamp using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Updated newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Updated(
      params
    );
  }-*/;

  /**
   * Constructs an updated timestamp using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Updated newInstance() /*-{
    return new $wnd.google.gdata.atom.Updated();
  }-*/;

  protected Updated() { }

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native DateTime getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(Date value) /*-{
    this.setValue(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(value))
    );
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(DateTime value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
