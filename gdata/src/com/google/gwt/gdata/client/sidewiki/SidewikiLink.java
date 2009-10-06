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

package com.google.gwt.gdata.client.sidewiki;

/**
 * Extends the base Link class with Sidewiki extensions.
 */
public class SidewikiLink extends com.google.gwt.gdata.client.Link {

  /**
   * Http://www google com/sidewiki/original Sidewiki Link class.
   */
  public static final String REL_ORIGINAL_URL = getConstant("REL_ORIGINAL_URL");

  /**
   * Constructs a Sidewiki Link.
   * 
   * @return A SidewikiLink object.
   */
  public static native SidewikiLink newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.sidewiki.SidewikiLink[name];
  }-*/;

  protected SidewikiLink() { }

}