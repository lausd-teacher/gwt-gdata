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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class GoogleService extends Service {

  /**
   * Creates a service that supports all alt formats: atom, atom-in-script, json, json-in-script, rss and rss-in-script.
   */
  public static native GoogleService newInstance(String serviceName, String applicationName) /*-{
    return new $wnd.google.gdata.client.GoogleService(
      serviceName,
      applicationName
    );
  }-*/;

  protected GoogleService() { }

  /**
   * Sets the authentication to be used when running inside a Shindig (OpenSocial) container.
   * 
   * @param authType
   * @param opt_params
   */
  public final native void setGadgetsAuthentication(String authType, JavaScriptObject params) /*-{
    this.setGadgetsAuthentication(
      authType,
      params
    );
  }-*/;

  /**
   * Sets the authentication to be used when running inside a Shindig (OpenSocial) container.
   * 
   * @param authType
   * @param opt_params
   */
  public final native void setGadgetsAuthentication(String authType) /*-{
    this.setGadgetsAuthentication(
      authType,
      undefined
    );
  }-*/;

  /**
   * Sets user credentials.
   * 
   * @param username
   * @param password
   * @param opt_accountType
   */
  public final native void setUserCredentials(String username, String password, ClientLoginAccountType accountType) /*-{
    this.setUserCredentials(
      username,
      password,
      accountType
    );
  }-*/;

  /**
   * Sets user credentials.
   * 
   * @param username
   * @param password
   * @param opt_accountType
   */
  public final native void setUserCredentials(String username, String password) /*-{
    this.setUserCredentials(
      username,
      password,
      undefined
    );
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param opt_serviceName
   * @param opt_params
   */
  public final native void useOAuth(String serviceName, JavaScriptObject params) /*-{
    this.useOAuth(
      serviceName,
      params
    );
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param opt_serviceName
   * @param opt_params
   */
  public final native void useOAuth(JavaScriptObject params) /*-{
    this.useOAuth(
      undefined,
      params
    );
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param opt_serviceName
   * @param opt_params
   */
  public final native void useOAuth(String serviceName) /*-{
    this.useOAuth(
      serviceName,
      undefined
    );
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param opt_serviceName
   * @param opt_params
   */
  public final native void useOAuth() /*-{
    this.useOAuth(
      undefined,
      undefined
    );
  }-*/;

}
