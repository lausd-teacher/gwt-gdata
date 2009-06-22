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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a media hash.
 */
public class MediaHash extends JavaScriptObject {

  /**
   * Md5 hash algorithm.
   */
  public static final String ALGO_MD5 = getConstant("ALGO_MD5");

  /**
   * Sha-1 hash algorithm.
   */
  public static final String ALGO_SHA_1 = getConstant("ALGO_SHA_1");

  /**
   * Constructs a media hash using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: algo and content.
   */
  public static native MediaHash newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaHash(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaHash[name];
  }-*/;

  protected MediaHash() { }

  /**
   * Returns the algorithm used to create the hash. This attribute is optional.
   * 
   * @return Algorithm used to create the hash or undefined for none.
   */
  public final native String getAlgo() /*-{
    return this.getAlgo();
  }-*/;

  /**
   * Returns the hash of the binary media file. This attribute is optional.
   * 
   * @return Hash of the binary media file or undefined for none.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Sets the algorithm used to create the hash. This attribute is optional.
   */
  public final native void setAlgo() /*-{
    this.setAlgo();
  }-*/;

  /**
   * Sets the algorithm used to create the hash. This attribute is optional.
   * 
   * @param algo Algorithm used to create the hash or undefined for none.
   */
  public final native void setAlgo(String algo) /*-{
    this.setAlgo(
      algo
    );
  }-*/;

  /**
   * Sets the hash of the binary media file. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the hash of the binary media file. This attribute is optional.
   * 
   * @param content Hash of the binary media file or undefined for none.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

}
