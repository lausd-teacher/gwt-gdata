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

/**
 * Extends the base Link class with Maps extensions.
 */
public class MapsLink extends com.google.gwt.gdata.client.Link {

  /**
   * View Maps Link class.
   */
  public static final String REL_VIEW = getConstant("REL_VIEW");

  /**
   * Constructs a Maps Link. 
   * 
   * @return An instance of MapsLink.
   */
  public static native MapsLink newInstance() /*-{
    return new $wnd.google.gdata.maps.MapsLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.maps.MapsLink[name];
  }-*/;

  protected MapsLink() { }

}