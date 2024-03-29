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

package com.google.gwt.gdata.client.maps;

/**
 * Tests for the MapQuery class.
 */
public class MapQueryTest extends MapsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", MapQuery.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        @SuppressWarnings("unused")
        MapQuery obj = MapQuery.newInstance("myValue");
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        MapQuery obj = MapQuery.newInstance("myValue");
        double startindex = 600813;
        obj.setStartIndex(startindex);
        assertEquals("startindex", obj.getStartIndex(), startindex);
        boolean showdeleted = true;
        obj.setShowDeleted(showdeleted);
        assertSame("showdeleted", obj.getShowDeleted(), showdeleted);
        double maxresults = 600813;
        obj.setMaxResults(maxresults);
        assertEquals("maxresults", obj.getMaxResults(), maxresults);
        String previd = "myValue";
        obj.setPrevId(previd);
        assertEquals("previd", obj.getPrevId(), previd);
        finishGDataTest();
      }
    }, 10000);
  }
}
