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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the AttendeeStatus class.
 */
public class UserTest extends GWTTestCase {
  public static final String TEST_SCOPE = "http://www.google.com/calendar/feeds/";
  public static final String AUTH_COOKIE_NAME = "g314-scope-0";
  public static final String AUTH_COOKIE_VALUE = "scope=http://www.google.com/calendar/feeds/&token=2/POEfcUwqkbSIiyj4CaiQ6A";
  
  /**
   * Bypasses authentication by directly setting the GData session cookie.
   * This allows us to test cases where the user has logged in.
   * To obtain the cookie value, from any GData JavaScript application
   * call google.accounts.user.login(scope) with the correct scope and
   * use document.cookie to capture the cookie. Paste the cookie name\
   * and value in the function below.
   */
  public static void login() {
    login(AUTH_COOKIE_NAME, AUTH_COOKIE_VALUE);
  }
  
  public static native void login(String authCookieName, String authCookieValue) /*-{
    document.cookie = authCookieName + "=" + authCookieValue;
    var img = top.document.createElement('img');
    img.src = 'stamp.png';
    img.style.display = 'none';
    top.document.body.appendChild(img);
  }-*/;
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.accounts.GoogleAccountsTest";
  }
  
  public void testAuthentication() {
    login(AUTH_COOKIE_NAME, AUTH_COOKIE_VALUE);
    assertEquals("getStatus", User.getStatus(), AuthSubStatus.LOGGED_IN);
    assertFalse("checkLogin", User.checkLogin(TEST_SCOPE).equals(""));
    assertEquals("getScopes", User.getScopes().get(0), TEST_SCOPE);
    assertTrue("getInfo", User.getInfo(new Runnable() {
      public void run() {
        finishTest();
      }
    }));
    delayTestFinish(2000);
    User.logout(new Runnable() {
      public void run() {
        finishTest();
      }
    }, TEST_SCOPE);
    delayTestFinish(2000);
    assertEquals("getStatus", User.getStatus(), AuthSubStatus.LOGGED_OUT);
  }
  
  public void testUnauthenticated() {
    assertEquals("getStatus", User.getStatus(), AuthSubStatus.LOGGED_OUT);
    assertEquals("checkLogin", User.checkLogin(TEST_SCOPE), "");
    assertFalse("getInfo", User.getInfo(new Runnable() {
      public void run() { }
    }));
    assertEquals("getScopes", User.getScopes().length(), 0);
  }
}
