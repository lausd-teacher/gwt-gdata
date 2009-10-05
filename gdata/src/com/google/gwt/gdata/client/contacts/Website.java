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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Contact related website.
 */
public class Website extends JavaScriptObject {

  /**
   * Blog website.
   */
  public static final String REL_BLOG = getConstant("REL_BLOG");

  /**
   * Ftp website.
   */
  public static final String REL_FTP = getConstant("REL_FTP");

  /**
   * Home website.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Home-page website.
   */
  public static final String REL_HOME_PAGE = getConstant("REL_HOME_PAGE");

  /**
   * Other website.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Profile website.
   */
  public static final String REL_PROFILE = getConstant("REL_PROFILE");

  /**
   * Work website.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs a website.
   * 
   * @return A Website object.
   */
  public static native Website newInstance() /*-{
    return new $wnd.google.gdata.contacts.Website();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Website[name];
  }-*/;

  protected Website() { }

  /**
   * Returns the URI of the website. This attribute is required.
   * 
   * @return URI of the website.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the user defined website label. This attribute is optional.
   * 
   * @return User defined website label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns denotes primary website. This attribute is optional.
   * 
   * @return Denotes primary website.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the known website type. This attribute is optional.
   * 
   * @return Known website type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the URI of the website. This attribute is required.
   * 
   * @param href URI of the website.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the user defined website label. This attribute is optional.
   * 
   * @param label User defined website label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets denotes primary website. This attribute is optional.
   * 
   * @param primary Denotes primary website.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the known website type. This attribute is optional.
   * 
   * @param rel Known website type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}