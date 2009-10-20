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

/**
 * Tests for the MessageEntry class.
 */
public class MessageEntryTest extends GDataTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", MessageEntry.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addWhoList(Who whoList)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        MessageEntry obj = MessageEntry.newInstance();
        Who[] wholist = new Who[]{ Who.newInstance() };
        obj.setWhoList(wholist);
        assertEquals("wholist", obj.getWhoList().length, wholist.length);
        Rating rating = Rating.newInstance();
        obj.setRating(rating);
        assertSame("rating", obj.getRating(), rating);
        When time = When.newInstance();
        obj.setTime(time);
        assertSame("time", obj.getTime(), time);
        GeoPt geopt = GeoPt.newInstance();
        obj.setGeoPt(geopt);
        assertSame("geopt", obj.getGeoPt(), geopt);
        finishGDataTest();
      }
    }, 10000);
  }
}
