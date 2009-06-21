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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Kind;

/**
 * Comment unavailable.
 */
public class FeatureCategory extends Kind {

  /**
   * Feature feature category.
   */
  public static final String TERM_FEATURE = getConstant("TERM_FEATURE");

  /**
   * Constructs a feature category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeatureCategory newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.FeatureCategory(
      params
    );
  }-*/;

  /**
   * Constructs a feature category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeatureCategory newInstance() /*-{
    return new $wnd.google.gdata.maps.FeatureCategory();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.maps.FeatureCategory[name];
  }-*/;

  protected FeatureCategory() { }

}
