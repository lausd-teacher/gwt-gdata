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

/**
 * Extends the base Link class with GWO extensions.
 */
public class GwoLink extends com.google.gwt.gdata.client.Link {

  /**
   * Experiment configuration URL.
   */
  public static final String REL_CONFIGURATION_URL =
      getConstant("REL_CONFIGURATION_URL");

  /**
   * Experiment goal URL.
   */
  public static final String REL_GOAL_URL = getConstant("REL_GOAL_URL");

  /**
   * A/b page variation URL.
   */
  public static final String REL_PAGE_VARIATION_URL =
      getConstant("REL_PAGE_VARIATION_URL");

  /**
   * Experiment combination preview URL.
   */
  public static final String REL_PREVIEW_URL = getConstant("REL_PREVIEW_URL");

  /**
   * Experiment report URL.
   */
  public static final String REL_REPORT_URL = getConstant("REL_REPORT_URL");

  /**
   * Experiment test URL.
   */
  public static final String REL_TEST_URL = getConstant("REL_TEST_URL");

  /**
   * Constructs a GWO Link. 
   * 
   * @return An instance of GwoLink.
   */
  public static native GwoLink newInstance() /*-{
    return new $wnd.google.gdata.analytics.GwoLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.GwoLink[name];
  }-*/;

  protected GwoLink() { }

}