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
 * Tests for the GoogleService class.
 */
public class GoogleServiceTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()",
            GoogleService.newInstance("myValue", "myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        GoogleService obj = GoogleService.newInstance(
            "myService", "myApplication");
        obj.setGadgetsAuthentication("OAUTH");
        obj.setGadgetsAuthentication(
            ShindigAuthenticationType.SIGNED, JavaScriptObject.createObject());
        obj.setUserCredentials("me", "mypass");
        obj.setUserCredentials("me", "mypass", ClientLoginAccountType.GOOGLE);
        obj.useOAuth();
        obj.useOAuth(JavaScriptObject.createObject());
        obj.useOAuth("myService");
        obj.useOAuth("myService", JavaScriptObject.createObject());
        obj.useXGDataAuthorization();
        finishGDataTest();
      }
    }, 10000);
  }
}
