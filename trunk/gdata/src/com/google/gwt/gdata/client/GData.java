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

package com.google.gwt.gdata.client;

import com.google.gwt.ajaxloader.client.AjaxLoader;
import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;

/**
 * A collection of static methods and API wide constants.
 */
public class GData {

  /**
   * Check for the availability of the gdata API. If it is not loaded, throws a
   * RuntimeException.
   */
  public static void assertLoaded() {
    if (!isLoaded()) {
      throw new RuntimeException("The GData API has not been loaded.\n"
          + "Is a <script> tag missing from your host HTML or module file?"
          + "  Is the GData key missing or invalid?");
    }
  }

  /**
   * Check for the availability of the GData API. This means that the  API
   * script is loaded and has successfully initialized.
   * 
   * @return <code>true</code> if the GData API is loaded.
   */
  public static native boolean isLoaded() /*-{
    return $wnd.google.gdata !== undefined;
  }-*/;

  /**
   * Initializes the GData API using the AjaxLoader. This is in lieu of
   * specifying the &lt;script&gt; tag for .google.com in your hosted HTML
   * page or project's GWT module specification.
   * 
   * @see "http://code.google.com/apis/gdata/documentation/#AJAX_Loader"
   * 
   * @param key GData API key. See http://code.google.com/apis/gdata/signup.html
   * @param version The version of the gdata API to load. For example, "2.x"
   * @param usingSensor Use of the Google GData API now requires that you
   *          indicate whether your application is using a sensor (such as a GPS
   *          locator) to determine the user's location. This is especially
   *          important for mobile devices.
   * @param settings other AjaxLoader settings for the GData API. This parameter
   *          must not be <code>null</code>.
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, String version,
      boolean usingSensor, AjaxLoaderOptions settings, Runnable onLoad) {
    assert settings != null;
    AjaxLoader.init(key);
    if (usingSensor) {
      settings.setOtherParms("sensor=true");
    }
    AjaxLoader.loadApi("gdata", version, onLoad, settings);
  }

  /**
   * Initializes the GData API using the AjaxLoader. This is in lieu of
   * specifying the &lt;script&gt; tag for gdata.google.com in your hosted HTML
   * page or project's GWT module specification.
   * 
   * @see "http://code.google.com/apis/gdata/documentation/#AJAX_Loader"
   * 
   * @param key GData API key. See http://code.google.com/apis/gdata/signup.html
   * @param version The version of the gdata API to load. For example, "2.x"
   * @param usingSensor Use of the Google GData API now requires that you
   *          indicate whether your application is using a sensor (such as a GPS
   *          locator) to determine the user's location. This is especially
   *          important for mobile devices.
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, String version,
      boolean usingSensor, Runnable onLoad) {
    loadGDataApi(key, version, usingSensor, AjaxLoaderOptions.newInstance(),
        onLoad);
  }

  /**
   * Use private constructor so this class can't be instantiated.
   */
  private GData() {
  }
}