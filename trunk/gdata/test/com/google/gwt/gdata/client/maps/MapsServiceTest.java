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

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the MapsService class.
 */
public class MapsServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void testConstants() {
    assertNotNull("SERVICE_NAME", MapsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapsService.newInstance("myValue"));
  }
  
  public void testCreateAndDeleteMap() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    MapEntry newEntry = MapEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Maps.testMap_Entry_Title_Created);
    svc.insertEntry(GDataTestScripts.Maps.testMaps_Feed_Link, newEntry, new AsyncCallback<MapEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(MapEntry result) {
        if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Entry_Title_Created)) {
          fail("Create Failed");
        }
        result.deleteEntry(new AsyncCallback<MapEntry>() {
          public void onFailure(Throwable caught) {
            fail("Delete Failed: " + caught.getMessage());
          }
          public void onSuccess(MapEntry result) {
          }
        });
        finishTest();
      }
    });
    delayTestFinish(10000);
  }
  
  public void testGetFeature() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getFeatureEntry(GDataTestScripts.Maps.testFeature_Entry_Link,
        new AsyncCallback<FeatureEntry>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(FeatureEntry result) {
            if (!GDataTestScripts.Maps.testFeature_Entry_Title.equals(result.getTitle().getText()) ||
              !GDataTestScripts.Maps.testFeature_Entry_Content.equals(result.getContent().getText())) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }

  public void testGetFeatures() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getFeatureFeed(GDataTestScripts.Maps.testFeatures_Feed_Link,
        new AsyncCallback<FeatureFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(FeatureFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testFeatures_Feed_Title)) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void testGetMap() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getMapEntry(GDataTestScripts.Maps.testMap_Entry_Link,
        new AsyncCallback<MapEntry>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(MapEntry result) {
            if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Entry_Title)) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  
  public void testGetMaps() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getMapFeed(GDataTestScripts.Maps.testMaps_Feed_Link,
        new AsyncCallback<MapFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(MapFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMaps_Feed_Title)) {
              fail("Get Failed");
            }
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void testUpdateMap() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getMapEntry(GDataTestScripts.Maps.testMap_Entry_Link,
      new AsyncCallback<MapEntry>() {
        public void onFailure(Throwable caught) {
          fail("Get Failed: " + caught.getMessage());
        }
        public void onSuccess(MapEntry result) {
          result.getTitle().setText(GDataTestScripts.Maps.testMap_Entry_Title_Updated);
          result.updateEntry(new AsyncCallback<MapEntry>() {
            public void onFailure(Throwable caught) {
              fail("Update Failed: " + caught.getMessage());
            }
            public void onSuccess(MapEntry result) {
              if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Entry_Title_Updated)) {
                fail("Update Failed");
              }
              result.getTitle().setText(GDataTestScripts.Maps.testMap_Entry_Title);
              result.updateEntry(new AsyncCallback<MapEntry>() {
                public void onFailure(Throwable caught) {
                  fail("Revert Failed: " + caught.getMessage());
                }
                public void onSuccess(MapEntry result) {
                  if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Entry_Title)) {
                    fail("Revert Failed");
                  }
                  finishTest();
                }
              });
            }
          });
        }
    });
    this.delayTestFinish(10000);
  }
}
