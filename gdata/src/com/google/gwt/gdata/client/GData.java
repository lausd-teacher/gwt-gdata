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
  
  static String targetGDataJsApiVersion = "1.10";
  
  /**
   * Check for the availability of the GData API. This means that the API
   * script is loaded and has successfully initialized.
   * 
   * @return <code>true</code> if the GData API is loaded.
   */
  public static native boolean isLoaded() /*-{
    if($wnd.google === undefined) return false;
    if($wnd.google.gdata === undefined) return false;
    return true;
  }-*/;

  /**
   * Check for the availability of the specified GData packages. This means that the API
   * script for the specified packages is loaded and has successfully initialized.
   * 
   * @param packages the GData packages to check for.
   * @return <code>true</code> if the GData packages are loaded.
   */
  public static boolean isLoaded(String[] packages) {
    if (!isLoaded()) {
      return false;
    }
    for (String p : packages) {
      if (!isLoaded(p.toLowerCase())) {
        return false;
      }
    }
    return true;
  }

  /**
   * Initializes the GData API using the AjaxLoader. This is in lieu of
   * specifying the &lt;script&gt; tag for .google.com in your hosted HTML
   * page or project's GWT module specification.
   * 
   * @see "http://code.google.com/apis/gdata/documentation/#AJAX_Loader"
   * 
   * @param key GData API key. See http://code.google.com/apis/gdata/signup.html
   * @param version The version of the gdata API to load. For example, "2.x"
   *        Note that not all GData versions may be compatible with a given version
   *        of the GWT-GData API.
   * @param settings other AjaxLoader settings for the GData API. This parameter
   *          must not be <code>null</code>.
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, String version, AjaxLoaderOptions settings, Runnable onLoad) {
    assert settings != null;
    AjaxLoader.init(key);
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
   * @param version The version of the gdata API to load. For example, "2.x".
   *        Note that not all GData versions may be compatible with a given version
   *        of the GWT-GData API.
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, String version, Runnable onLoad) {
    loadGDataApi(key, version, AjaxLoaderOptions.newInstance(), onLoad);
  }
  
  /**
   * Initializes the target version of the GData API using the AjaxLoader. This is in lieu of
   * specifying the &lt;script&gt; tag for gdata.google.com in your hosted HTML
   * page or project's GWT module specification.
   * 
   * @see "http://code.google.com/apis/gdata/documentation/#AJAX_Loader"
   * 
   * @param key GData API key. See http://code.google.com/apis/gdata/signup.html
   * @param packages the GData packages that should be loaded (e.g. Calendar, Blogger, etc.)
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, String[] packages, Runnable onLoad) {
    AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
    options.setPackages(packages);
    loadGDataApi(key, targetGDataJsApiVersion, options, onLoad);
  }
  
  /**
   * Initializes the target version of the GData API using the AjaxLoader. This is in lieu of
   * specifying the &lt;script&gt; tag for gdata.google.com in your hosted HTML
   * page or project's GWT module specification.
   * 
   * @see "http://code.google.com/apis/gdata/documentation/#AJAX_Loader"
   * 
   * @param key GData API key. See http://code.google.com/apis/gdata/signup.html
   * @param onLoad callback to be invoked when the library is loaded.
   */
  public static void loadGDataApi(String key, Runnable onLoad) {
    loadGDataApi(key, targetGDataJsApiVersion, AjaxLoaderOptions.newInstance(), onLoad);
  }
  
  /**
   * Check for the availability of the specified GData package. This means that the API
   * script for the specified packages is loaded and has successfully initialized.
   * 
   * @param packageName the GData package to check for.
   * @return <code>true</code> if the GData package is loaded.
   */
  private static native boolean isLoaded(String packageName) /*-{
    return $wnd.google.gdata[packageName] !== undefined;
  }-*/; 
  
  /**
   * Use private constructor so this class can't be instantiated.
   */
  private GData() {
  }
}