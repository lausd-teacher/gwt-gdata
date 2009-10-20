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

package com.google.gwt.accounts.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Specifies AuthSub parameters.
 */
public class AuthSubSettings extends JavaScriptObject {

  /**
   * Constructs an AuthSubSettings object.
   * 
   * @return An AuthSubSettings object.
   */
  public static AuthSubSettings newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  protected AuthSubSettings() { }
  
  /**
   * Gets a value indicating the mobile version of the approval page.
   * The only accepted value is "mobile". Optional.
   * 
   * @return The mobile version.
   */
  public final native String getBtmpl() /*-{
    return this.btmpl;
  }-*/;
  
  /**
   * Gets the value identifying a particular hosted domain account to
   * be accessed (for example, 'mycollege.edu'). Use "default" to specify a
   * regular Google account ('username@gmail.com'). Optional.
   * 
   * @return Hosted domain account.
   */
  public final native String getHd() /*-{
    return this.hd;
  }-*/;
  
  /**
   * Gets the ISO 639 country code identifying what language the approval page
   * should be translated in (for example, 'hl=en' for English).
   * The default is the user's selected language. Optional.
   * 
   * @return The ISO 639 country.
   */
  public final native String getHl() /*-{
    return this.hl;
  }-*/;
  
  /**
   * Gets a boolean flag indicating whether the authorization transaction
   * should issue a secure token (1) or a non-secure token (0).
   * Secure tokens are available to registered applications only. Optional.
   * 
   * @return Whether to use secure tokens.
   */
  public final native boolean getSecure() /*-{
    return this.secure;
  }-*/;
  
  /**
   * Sets a value indicating the mobile version of the approval page.
   * The only accepted value is "mobile". Optional.
   * 
   * @param btmpl The mobile version.
   */
  public final native void setBtmpl(String btmpl) /*-{
    this.btmpl = btmpl;
  }-*/;
  
  /**
   * Sets the value identifying a particular hosted domain account to
   * be accessed (for example, 'mycollege.edu'). Use "default" to specify a
   * regular Google account ('username@gmail.com'). Optional.
   * 
   * @param hd Hosted domain account.
   */
  public final native void setHd(String hd) /*-{
    this.hd = hd;
  }-*/;

  /**
   * Sets the ISO 639 country code identifying what language the approval page
   * should be translated in (for example, 'hl=en' for English).
   * The default is the user's selected language. Optional.
   * 
   * @param hl The ISO 639 country.
   */
  public final native void setHl(String hl) /*-{
    this.hl = hl;
  }-*/;

  /**
   * Sets a boolean flag indicating whether the authorization transaction
   * should issue a secure token (1) or a non-secure token (0).
   * Secure tokens are available to registered applications only. Optional.
   * 
   * @param secure Whether to use secure tokens.
   */
  public final native void setSecure(boolean secure) /*-{
    this.secure = secure;
  }-*/;
  
}
