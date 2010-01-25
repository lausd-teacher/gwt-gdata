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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Single step in a multistep goal.
 */
public class Step extends JavaScriptObject {

  /**
   * Constructs a step.
   * 
   * @return An instance of Step.
   */
  public static native Step newInstance() /*-{
    return new $wnd.google.gdata.analytics.Step();
  }-*/;

  protected Step() { }

  /**
   * Returns the step's name. This attribute is required.
   * 
   * @return Step's name.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the step's number in sequence.
   * This attribute is required.
   * 
   * @return Step's number in sequence.
   */
  public final native double getNumber() /*-{
    return this.getNumber();
  }-*/;

  /**
   * Returns the step's path. This attribute is required.
   * 
   * @return Step's path.
   */
  public final native String getPath() /*-{
    return this.getPath();
  }-*/;

  /**
   * Sets the step's name. This attribute is required.
   * 
   * @param name Step's name.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the step's number in sequence. This attribute is required.
   * 
   * @param number Step's number in sequence.
   */
  public final native void setNumber(double number) /*-{
    this.setNumber(number);
  }-*/;

  /**
   * Sets the step's path. This attribute is required.
   * 
   * @param path Step's path.
   */
  public final native void setPath(String path) /*-{
    this.setPath(path);
  }-*/;

}