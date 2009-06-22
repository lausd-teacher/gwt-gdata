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
import com.google.gwt.gdata.client.atom.Text;

/**
 * KML feature data.
 */
public class KmlContent extends Text {

  /**
   * Application/vnd google-earth kml+xml kml content.
   */
  public static final String TYPE_APPLICATION_VND_GOOGLE_EARTH_KML_XML = getConstant("TYPE_APPLICATION_VND_GOOGLE_EARTH_KML_XML");

  /**
   * Overview  File   Class  Tree  Index  Help  GData JavaScript Client 1.10  
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: type.
   */
  public static native KmlContent newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.KmlContent(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.maps.KmlContent[name];
  }-*/;

  protected KmlContent() { }

}
