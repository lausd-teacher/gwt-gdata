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
 * Comment unavailable.
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
   */
  public static native MediaHash newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaHash(
      params
    );
  }-*/;

  /**
   * Constructs a media hash using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaHash newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaHash();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaHash[name];
  }-*/;

  protected MediaHash() { }

  /**
   * Returns the algorithm used to create the hash.
   * 
   * @return
   */
  public final native String getAlgo() /*-{
    return this.getAlgo();
  }-*/;

  /**
   * Returns the hash of the binary media file.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Sets the algorithm used to create the hash.
   * 
   * @param algo
   */
  public final native void setAlgo(String algo) /*-{
    this.setAlgo(
      algo
    );
  }-*/;

  /**
   * Sets the algorithm used to create the hash.
   * 
   * @param algo
   */
  public final native void setAlgo() /*-{
    this.setAlgo();
  }-*/;

  /**
   * Sets the hash of the binary media file.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the hash of the binary media file.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

}
