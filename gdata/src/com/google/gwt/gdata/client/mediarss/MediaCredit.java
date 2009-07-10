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
 * Describes a media credit.
 */
public class MediaCredit extends JavaScriptObject {

  /**
   * Constructs a media credit.
   * @return A MediaCredit object.
   */
  public static native MediaCredit newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaCredit();
  }-*/;

  protected MediaCredit() { }

  /**
   * Returns the name of the entity. This attribute is optional.
   * 
   * @return Name of the entity.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the role the entity played. This attribute is optional.
   * 
   * @return Role the entity played.
   */
  public final native String getRole() /*-{
    return this.getRole();
  }-*/;

  /**
   * Returns the URI that identifies the role scheme. This attribute is optional.
   * 
   * @return URI that identifies the role scheme.
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the name of the entity. This attribute is optional.
   * 
   * @param content Name of the entity.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the role the entity played. This attribute is optional.
   * 
   * @param role Role the entity played.
   */
  public final native void setRole(String role) /*-{
    this.setRole(role);
  }-*/;

  /**
   * Sets the URI that identifies the role scheme. This attribute is optional.
   * 
   * @param scheme URI that identifies the role scheme.
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(scheme);
  }-*/;

}