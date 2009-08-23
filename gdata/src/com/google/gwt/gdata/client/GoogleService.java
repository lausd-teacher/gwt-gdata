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
 * GData Service.
 */
public class GoogleService extends Service {

  /**
   * Creates a service that supports all alt formats: atom, atom-in-script,
   * json, json-in-script, rss and rss-in-script.
   * 
   * @param serviceName Name of GData service.
   * @param applicationName Name of application.
   * @return A GoogleService object.
   */
  public static native GoogleService newInstance(String serviceName,
      String applicationName) /*-{
    return new $wnd.google.gdata.client.GoogleService(serviceName, applicationName);
  }-*/;

  protected GoogleService() { }

  /**
   * Gets user credentials.
   * 
   * @return The user credentials.
   */
  public final native GoogleServiceUserCredentials getUserCredentials() /*-{
    return this.getUserCredentials();
  }-*/;
  
  /**
   * Sets the authentication to be used when running inside a Shindig
   * (OpenSocial) container.
   * 
   * @param authType one of the three valid Shindig authentication types.
   * @param params other parameters to pass through the request.
   */
  public final native void setGadgetsAuthentication(
      ShindigAuthenticationType authType, JavaScriptObject params) /*-{
    this.setGadgetsAuthentication(authType.@com.google.gwt.gdata.client.ShindigAuthenticationType::name()(), params);
  }-*/;

  /**
   * Sets the authentication to be used when running inside a Shindig
   * (OpenSocial) container.
   * 
   * @param authType one of the three valid Shindig authentication types.
   */
  public final native void setGadgetsAuthentication(String authType) /*-{
    this.setGadgetsAuthentication(authType.@com.google.gwt.gdata.client.ShindigAuthenticationType::name()());
  }-*/;

  /**
   * Sets user credentials.
   * 
   * @param username User name.
   * @param password Password.
   * @param accountType The account type.
   */
  public final native void setUserCredentials(String username, String password,
      ClientLoginAccountType accountType) /*-{
    this.setUserCredentials(
      username,
      password,
      accountType.@com.google.gwt.gdata.client.ClientLoginAccountType::name()()
    );
  }-*/;

  /**
   * Sets user credentials.
   * 
   * @param username User name.
   * @param password Password.
   */
  public final native void setUserCredentials(String username,
      String password) /*-{
    this.setUserCredentials(username, password);
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param serviceName The service whose credentials to use.
   * @param params Optional OAuth related parameters.
   */
  public final native void useOAuth(String serviceName,
      JavaScriptObject params) /*-{
    this.useOAuth(serviceName, params);
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param params Optional OAuth related parameters.
   */
  public final native void useOAuth(JavaScriptObject params) /*-{
    this.useOAuth(undefined, params);
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   * 
   * @param serviceName The service whose credentials to use.
   */
  public final native void useOAuth(String serviceName) /*-{
    this.useOAuth(serviceName);
  }-*/;

  /**
   * Sets the authentication type to the OAuth Proxy.
   */
  public final native void useOAuth() /*-{
    this.useOAuth();
  }-*/;

}
