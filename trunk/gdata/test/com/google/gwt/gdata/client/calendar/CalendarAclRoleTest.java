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

package com.google.gwt.gdata.client.calendar;

/**
 * Tests for the CalendarAclRole class.
 */
public class CalendarAclRoleTest extends CalendarTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("VALUE_EDITOR", CalendarAclRole.VALUE_EDITOR);
        assertNotNull("VALUE_FREEBUSY", CalendarAclRole.VALUE_FREEBUSY);
        assertNotNull("VALUE_OWNER", CalendarAclRole.VALUE_OWNER);
        assertNotNull("VALUE_READ", CalendarAclRole.VALUE_READ);
        assertNotNull("VALUE_ROOT", CalendarAclRole.VALUE_ROOT);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", CalendarAclRole.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }
}
