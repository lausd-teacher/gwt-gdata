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
  
  public void test1MapsGet() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getMapFeed(GDataTestScripts.Maps.testMaps_FeedLink,
        new AsyncCallback<MapFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(MapFeed result) {
            System.out.println("-->" + result.getEntries().length);
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testMaps_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Maps.testMaps_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.Maps.testMaps_Feed = result;
            GDataTestScripts.Maps.testMap_Entry_Original = GDataTestScripts.Maps.testMaps_Feed.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void test2MapGet() {
    assertEquals(GDataTestScripts.Maps.testMap_Title_Original, GDataTestScripts.Maps.testMap_Entry_Original.getTitle().getText());
  }
  public void test3MapUpdate() {
    GDataTestScripts.Maps.testMap_Entry_Original.getTitle().setText(GDataTestScripts.Maps.testMap_Title_Updated);
    GDataTestScripts.Maps.testMap_Entry_Original.updateEntry(new AsyncCallback<MapEntry>() {
      public void onFailure(Throwable caught) {
        fail("Update Failed: " + caught.getMessage());
      }
      public void onSuccess(MapEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Title_Updated)) {
          GDataTestScripts.Maps.testMap_Entry_Original.getTitle().setText(GDataTestScripts.Maps.testMap_Title_Original);
          GDataTestScripts.Maps.testMap_Entry_Original.updateEntry(new AsyncCallback<MapEntry>() {
            public void onFailure(Throwable caught) {
              fail("Revert Failed: " + caught.getMessage());
            }
            public void onSuccess(MapEntry result) {
              if (result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Title_Original)) {
                finishTest();
              } else { 
                fail("Revert Failed");
              }
            }
          });
          finishTest();
        } else { 
          fail("Update Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test4MapCreate() {
    MapsService svc = MapsService.newInstance("test");
    MapEntry newEntry = MapEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.Maps.testMap_Title_Created);
    svc.insertEntry(GDataTestScripts.Maps.testMaps_FeedLink, newEntry, new AsyncCallback<MapEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(MapEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.Maps.testMap_Title_Created)) {
          GDataTestScripts.Maps.testMap_Entry_Created = result;
          finishTest();
        } else { 
          fail("Create Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test5MapDelete() {
    GDataTestScripts.Maps.testMap_Entry_Created.deleteEntry(new AsyncCallback<MapEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(MapEntry result) {
        MapsService svc = MapsService.newInstance("test");
        svc.getMapFeed(GDataTestScripts.Maps.testMaps_FeedLink,
          new AsyncCallback<MapFeed>() {
            public void onFailure(Throwable caught) {
              fail("Delete Failed: " + caught.getMessage());
            }
            public void onSuccess(MapFeed result) {
              if (result.getEntries().length != 1) {
                fail("Delete Failed");
              }
              finishTest();
            }
        });
      }
    });
    // delayTestFinish(5000);
  }
  public void test6FeaturesGet() {
    UserTest.login(GDataTestScripts.Maps.testCookie_Name, GDataTestScripts.Maps.testCookie_Value);
    MapsService svc = MapsService.newInstance("test");
    svc.getFeatureFeed(GDataTestScripts.Maps.testFeatures_FeedLink,
        new AsyncCallback<FeatureFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(FeatureFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.Maps.testFeatures_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.Maps.testFeatures_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.Maps.testFeatures_Feed = result;
            GDataTestScripts.Maps.testFeature_Entry_Original = result.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void test7FeatureGet() {
    assertEquals(GDataTestScripts.Maps.testFeature_Title_Original, GDataTestScripts.Maps.testFeature_Entry_Original.getTitle().getText());
    assertEquals(GDataTestScripts.Maps.testFeature_Content_Original, GDataTestScripts.Maps.testFeature_Entry_Original.getContent().getText());
  }
  public void testConstants() {
    assertNotNull("SERVICE_NAME", MapsService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapsService.newInstance("myValue"));
  }
}
