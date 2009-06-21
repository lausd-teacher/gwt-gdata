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
public class MediaCredit extends JavaScriptObject {

  /**
   * Constructs a media credit using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaCredit newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaCredit(
      params
    );
  }-*/;

  /**
   * Constructs a media credit using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaCredit newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaCredit();
  }-*/;

  protected MediaCredit() { }

  /**
   * Returns the name of the entity.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the role the entity played.
   * 
   * @return
   */
  public final native String getRole() /*-{
    return this.getRole();
  }-*/;

  /**
   * Returns the URI that identifies the role scheme.
   * 
   * @return
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the name of the entity.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the name of the entity.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the role the entity played.
   * 
   * @param role
   */
  public final native void setRole(String role) /*-{
    this.setRole(
      role
    );
  }-*/;

  /**
   * Sets the role the entity played.
   * 
   * @param role
   */
  public final native void setRole() /*-{
    this.setRole();
  }-*/;

  /**
   * Sets the URI that identifies the role scheme.
   * 
   * @param scheme
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the URI that identifies the role scheme.
   * 
   * @param scheme
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

}
