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

/**
 * Class representing state of an authenticated user session.
 */
public class User {
  /**
   * Checks whether a cookie containing a token for the specified scope exists.
   * Also, sets the current scope to the specified scope, so that subsequent calls to logout() and getInfo() use the new current scope.
   * The returned token is not guaranteed to be valid, so the application must be able to handle an authorization exception when the token is used.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * 
   * @param scope URL identifying the service to be accessed.
   * @return A token, if one exists. If no token exists for the specified scope, this method returns an empty string.
   */
  public static final native String checkLogin(String scope) /*-{
    return $wnd.google.accounts.user.checkLogin(scope);
  }-*/;
  /**
   * Gets detailed information related to the current token, including target (the domain that originally requested the token) and scope.
   * This method is primarily intended for debugging purposes, because this information is not needed to verify authentication.
   * Unlike other AuthSub for JavaScript methods, this method uses a callback function to asynchronously receive the requested data.
   * If your client application uses multiple scopes, then it should call checkLogin() to set the appropriate scope before calling getInfo().
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param callback Callback function to return information. The callback parameter should accept a single data parameter, whose currentTarget.responseText parameter is a JSON string.
   * This JSON string can be turned into a JavaScript object with the following three parameters: 
   * Target (string) A URL value identifying the domain of the web page that made the original request. 
   * Scope (Array) An array of scopes for the token. 
   * Secure (boolean) a Boolean value indicating whether the token is valid only for signed requests from SSL certificates registered with Google.
   * Currently, this returned value is always false for tokens acquired using AuthSub for JavaScript. 
   * @param scope A scope argument; if specified, the info for only that scope will be retrieved. If no scope is specified, the info for the first scope will be retrieved.
   * @return Returns true if the method succeeds, false otherwise. In addition, the input callback function is called once the token info is received.
   */
  public static final native boolean getInfo(Runnable callback, String scope) /*-{
    return $wnd.google.accounts.user.getInfo(
      function() { @com.google.gwt.ajaxloader.client.ExceptionHelper::runProtected(Ljava/lang/Runnable;)(callback); },
      scope);
    }-*/;
  /**
   * Gets detailed information related to the current token, including target (the domain that originally requested the token) and scope.
   * This method is primarily intended for debugging purposes, because this information is not needed to verify authentication.
   * Unlike other AuthSub for JavaScript methods, this method uses a callback function to asynchronously receive the requested data.
   * If your client application uses multiple scopes, then it should call checkLogin() to set the appropriate scope before calling getInfo().
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param callback Callback function to return information. The callback parameter should accept a single data parameter, whose currentTarget.responseText parameter is a JSON string.
   * This JSON string can be turned into a JavaScript object with the following three parameters: 
   * Target (string) A URL value identifying the domain of the web page that made the original request. 
   * Scope (Array) An array of scopes for the token. 
   * Secure (boolean) a Boolean value indicating whether the token is valid only for signed requests from SSL certificates registered with Google.
   * Currently, this returned value is always false for tokens acquired using AuthSub for JavaScript. 
   * @return Returns true if the method succeeds, false otherwise. In addition, the input callback function is called once the token info is received.
   */
  public static final native boolean getInfo(Runnable callback) /*-{
    return $wnd.google.accounts.user.getInfo(
      function() { @com.google.gwt.ajaxloader.client.ExceptionHelper::runProtected(Ljava/lang/Runnable;)(callback);
    });
  }-*/;
  /**
   * Returns an array of the scopes the user is currently logged into.
   * @return The scopes the user is currently logged into. 
   */
  public static final native String[] getScopes() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)($wnd.google.accounts.user.getScopes());
  }-*/;
  /**
   * Returns the current status of the AuthSubJS process.
   * If a scope is passed in, the method will return the status for that scope only.
   * @param scope Scope argument. If specified the method will return the status for that scope only.
   * @return The status of the AuthSubJS process.
   */
  public static final native AuthSubStatus getStatus(String scope) /*-{
    return @com.google.gwt.accounts.client.AuthSubStatus::valueOf(I)($wnd.google.accounts.user.getStatus(scope));
  }-*/;
  /**
   * Returns the current status of the AuthSubJS process.
   * @return The status of the AuthSubJS process.
   */
  public static final native AuthSubStatus getStatus() /*-{
    return @com.google.gwt.accounts.client.AuthSubStatus::valueOf(I)($wnd.google.accounts.user.getStatus());
  }-*/;
  /**
   * Retrieves a valid authentication token.
   * This method first checks whether or not a cookie for the specified scope is already stored in the browser.
   * If one is found, the token value is returned. If no cookie is found, a request is sent to the authentication service, which shows the user a Google Accounts Request Access page.
   * If the user successfully logs in and grants access, then cookies containing the scope and token are stored in the client browser, and checkToken can retrieve the value of the token.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param scope URL identifying the service to be accessed.
   * @param hd String value identifying a particular hosted domain account to be accessed.
   * @return Returns a token, keyed to a specific combination of user, client application domain, and Google service scope, or null if the scope is empty, or the token is invalid. In addition, if no valid token exists in the client browser, then the user is redirected to a Google page and invited to log into their Google account and authorize access by the web application.
   */
  public static final native String login(String scope, String hd) /*-{
    return $wnd.google.accounts.user.login(scope, hd);
  }-*/;
  /**
   * Retrieves a valid authentication token.
   * This method first checks whether or not a cookie for the specified scope is already stored in the browser.
   * If one is found, the token value is returned. If no cookie is found, a request is sent to the authentication service, which shows the user a Google Accounts Request Access page.
   * If the user successfully logs in and grants access, then cookies containing the scope and token are stored in the client browser, and checkToken can retrieve the value of the token.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param scope URL identifying the service to be accessed.
   * @return Returns a token, keyed to a specific combination of user, client application domain, and Google service scope, or null if the scope is empty, or the token is invalid.
   * In addition, if no valid token exists in the client browser, then the user is redirected to a Google page and invited to log into their Google account and authorize access by the web application.
   */
  public static final native String login(String scope) /*-{
    return $wnd.google.accounts.user.login(scope);
  }-*/;
  /**
   * Revokes all authentication tokens for all scopes (unless a particular scope is specified as an argument or to {@link checkLogin) and deletes all authentication cookies stored by the browser.
   * The Google service refuses subsequent requests for access until your client acquires a new token.
   * If your client application uses multiple scopes, and you wish to log the user out of a single scope, you can pass that scope as a parameter to this method.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param callback A callback method to invoke after the user is logged out.
   * @param scope A scope argument; if specified, the user will be logged out of only that particular scope.
   * @return Returns false if user already logged out.
   */
  public static final native boolean logout(Runnable callback, String scope) /*-{
    return $wnd.google.accounts.user.logout(function() { @com.google.gwt.ajaxloader.client.ExceptionHelper::runProtected(Ljava/lang/Runnable;)(callback); }, scope);
  }-*/;
  /**
   * Revokes all authentication tokens for all scopes (unless a particular scope is specified as an argument or to {@link checkLogin) and deletes all authentication cookies stored by the browser.
   * The Google service refuses subsequent requests for access until your client acquires a new token.
   * If your client application uses multiple scopes, and you wish to log the user out of a single scope, you can pass that scope as a parameter to this method.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param callback A callback method to invoke after the user is logged out.
   * @return Returns false if user already logged out.
   */
  public static final native boolean logout(Runnable callback) /*-{
    return $wnd.google.accounts.user.logout(function() { @com.google.gwt.ajaxloader.client.ExceptionHelper::runProtected(Ljava/lang/Runnable;)(callback); });
  }-*/;
  /**
   * Revokes all authentication tokens for all scopes (unless a particular scope is specified as an argument or to {@link checkLogin) and deletes all authentication cookies stored by the browser.
   * The Google service refuses subsequent requests for access until your client acquires a new token.
   * If your client application uses multiple scopes, and you wish to log the user out of a single scope, you can pass that scope as a parameter to this method.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @param scope A scope argument; if specified, the user will be logged out of only that particular scope.
   * @return Returns false if user already logged out.
   */
  public static final native boolean logout(String scope) /*-{
    return $wnd.google.accounts.user.logout(undefined, scope);
  }-*/;
  /**
   * Revokes all authentication tokens for all scopes (unless a particular scope is specified as an argument or to {@link checkLogin) and deletes all authentication cookies stored by the browser.
   * The Google service refuses subsequent requests for access until your client acquires a new token.
   * If your client application uses multiple scopes, and you wish to log the user out of a single scope, you can pass that scope as a parameter to this method.
   * Visit the following documentation to learn more about authenticating with AuthSubJS: http://code.google.com/apis/gdata/client-js.html#Authenticating
   * @return Returns false if user already logged out.
   */
  public static final native boolean logout() /*-{
    return $wnd.google.accounts.user.logout();
  }-*/;
}
