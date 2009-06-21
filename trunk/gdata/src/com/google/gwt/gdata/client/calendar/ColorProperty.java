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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class ColorProperty extends JavaScriptObject {

  /**
   * RGB value 0D7813.
   */
  public static final String VALUE_RGB_0D7813 = getConstant("VALUE_RGB_0D7813");

  /**
   * RGB value 1B887A.
   */
  public static final String VALUE_RGB_1B887A = getConstant("VALUE_RGB_1B887A");

  /**
   * RGB value 28754E.
   */
  public static final String VALUE_RGB_28754E = getConstant("VALUE_RGB_28754E");

  /**
   * RGB value 29527A.
   */
  public static final String VALUE_RGB_29527A = getConstant("VALUE_RGB_29527A");

  /**
   * RGB value 2952A3.
   */
  public static final String VALUE_RGB_2952A3 = getConstant("VALUE_RGB_2952A3");

  /**
   * RGB value 4A716C.
   */
  public static final String VALUE_RGB_4A716C = getConstant("VALUE_RGB_4A716C");

  /**
   * RGB value 4E5D6C.
   */
  public static final String VALUE_RGB_4E5D6C = getConstant("VALUE_RGB_4E5D6C");

  /**
   * RGB value 5229A3.
   */
  public static final String VALUE_RGB_5229A3 = getConstant("VALUE_RGB_5229A3");

  /**
   * RGB value 528800.
   */
  public static final String VALUE_RGB_528800 = getConstant("VALUE_RGB_528800");

  /**
   * RGB value 5A6986.
   */
  public static final String VALUE_RGB_5A6986 = getConstant("VALUE_RGB_5A6986");

  /**
   * RGB value 6E6E41.
   */
  public static final String VALUE_RGB_6E6E41 = getConstant("VALUE_RGB_6E6E41");

  /**
   * RGB value 705770.
   */
  public static final String VALUE_RGB_705770 = getConstant("VALUE_RGB_705770");

  /**
   * RGB value 7A367A.
   */
  public static final String VALUE_RGB_7A367A = getConstant("VALUE_RGB_7A367A");

  /**
   * RGB value 865A5A.
   */
  public static final String VALUE_RGB_865A5A = getConstant("VALUE_RGB_865A5A");

  /**
   * RGB value 88880E.
   */
  public static final String VALUE_RGB_88880E = getConstant("VALUE_RGB_88880E");

  /**
   * RGB value 8D6F47.
   */
  public static final String VALUE_RGB_8D6F47 = getConstant("VALUE_RGB_8D6F47");

  /**
   * RGB value A32929.
   */
  public static final String VALUE_RGB_A32929 = getConstant("VALUE_RGB_A32929");

  /**
   * RGB value AB8B00.
   */
  public static final String VALUE_RGB_AB8B00 = getConstant("VALUE_RGB_AB8B00");

  /**
   * RGB value B1365F.
   */
  public static final String VALUE_RGB_B1365F = getConstant("VALUE_RGB_B1365F");

  /**
   * RGB value B1440E.
   */
  public static final String VALUE_RGB_B1440E = getConstant("VALUE_RGB_B1440E");

  /**
   * RGB value BE6D00.
   */
  public static final String VALUE_RGB_BE6D00 = getConstant("VALUE_RGB_BE6D00");

  /**
   * Constructs a color property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ColorProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.ColorProperty(
      params
    );
  }-*/;

  /**
   * Constructs a color property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ColorProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.ColorProperty();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.ColorProperty[name];
  }-*/;

  protected ColorProperty() { }

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
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

}
