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

/**
 * Tests for the ProfileQuery class.
 */
public class ProfileQueryTest extends ContactsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ProfileQuery.newInstance("myValue"));
  }

  public void testOther() {
    // Unit Test for setMaxResults(String maxResults)
  }

  public void testProperties() {
    ProfileQuery obj = ProfileQuery.newInstance("myValue");
    String domainname = "myValue";
    obj.setDomainName(domainname);
    assertEquals("domainname", obj.getDomainName(), domainname);
    double maxresults = 600813;
    obj.setMaxResults(maxresults);
    assertEquals("maxresults", obj.getMaxResults(), maxresults);
    String username = "myValue";
    obj.setUserName(username);
    assertEquals("username", obj.getUserName(), username);
    String startkey = "myValue";
    obj.setStartKey(startkey);
    assertEquals("startkey", obj.getStartKey(), startkey);
  }
}
