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
 * Describes a creation timestamp.
 */
public class Published extends JavaScriptObject {

  /**
   * Constructs a creation timestamp.
   * @return A Published object.
   */
  public static native Published newInstance() /*-{
    return new $wnd.google.gdata.atom.Published();
  }-*/;

  protected Published() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native DateTime getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(Date value) /*-{
    this.setValue(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(value))
    );
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(DateTime value) /*-{
    this.setValue(value);
  }-*/;

}