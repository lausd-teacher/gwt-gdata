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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.accounts.client.UserTest;
import com.google.gwt.gdata.client.GDataTestScripts;
import com.google.gwt.gdata.client.atom.Text;
import com.google.gwt.gdata.client.impl.Map;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Tests for the GoogleBaseService class.
 */
public class GoogleBaseServiceTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  public void test1ItemsGet() {
    UserTest.login(GDataTestScripts.GoogleBase.testCookie_Name, GDataTestScripts.GoogleBase.testCookie_Value);
    GoogleBaseService svc = GoogleBaseService.newInstance("test");
    svc.getItemsFeed(GDataTestScripts.GoogleBase.testItems_FeedLink,
        new AsyncCallback<ItemsFeed>() {
          public void onFailure(Throwable caught) {
            fail("Get Failed: " + caught.getMessage());
          }
          public void onSuccess(ItemsFeed result) {
            if (result.getEntries().length == 0) {
              fail("Get Failed");
            }
            if (!result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItems_FeedTitle) ||
              !result.getId().getValue().equals(GDataTestScripts.GoogleBase.testItems_FeedId)) {
              fail("Get Failed");
            }
            GDataTestScripts.GoogleBase.testItems_Feed = result;
            GDataTestScripts.GoogleBase.testItem_Entry_Original = result.getEntries()[0];
            finishTest();
          }
    });
    this.delayTestFinish(10000);
  }
  public void test2ItemGet() {
    Map<Attribute> atts = GDataTestScripts.GoogleBase.testItem_Entry_Original.getAttributes();
    assertEquals(GDataTestScripts.GoogleBase.testItem_TargetCountry_Original, atts.get("target_country").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_ReviewType_Original, atts.get("review_type").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_NameOfItem_Original, atts.get("name_of_item_reviewed").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_ExpirationDate_Original, atts.get("expiration_date").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_Rating_Original, atts.get("rating").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_CustomerId_Original, atts.get("customer_id").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_ItemType_Original, atts.get("item_type").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_ItemLanguage_Original, atts.get("item_language").getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_Published_Original, GDataTestScripts.GoogleBase.testItem_Entry_Original.getPublished().getValue().getDate().toString());
    assertEquals(GDataTestScripts.GoogleBase.testItem_Author_Original, GDataTestScripts.GoogleBase.testItem_Entry_Original.getAuthors()[0].getName().getValue());
    assertEquals(GDataTestScripts.GoogleBase.testItem_Title_Original, GDataTestScripts.GoogleBase.testItem_Entry_Original.getTitle().getText());
    assertEquals(GDataTestScripts.GoogleBase.testItem_Content_Original, GDataTestScripts.GoogleBase.testItem_Entry_Original.getContent().getText());
  }
  public void test3ItemUpdate() {
    GDataTestScripts.GoogleBase.testItem_Entry_Original.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Title_Updated);
    GDataTestScripts.GoogleBase.testItem_Entry_Original.getContent().setText(GDataTestScripts.GoogleBase.testItem_Content_Updated);
    GDataTestScripts.GoogleBase.testItem_Entry_Original.getAttributes().get("target_country").setValue(GDataTestScripts.GoogleBase.testItem_TargetCountry_Updated);
    GDataTestScripts.GoogleBase.testItem_Entry_Original.updateEntry(new AsyncCallback<ItemsEntry>() {
      public void onFailure(Throwable caught) {
        fail("Update Failed: " + caught.getMessage());
      }
      public void onSuccess(ItemsEntry result) {
        if (result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Title_Updated) &&
            result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Content_Updated) &&
            result.getAttributes().get("target_country").getValue().equals(GDataTestScripts.GoogleBase.testItem_TargetCountry_Updated)) {
          GDataTestScripts.GoogleBase.testItem_Entry_Original.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Title_Original);
          GDataTestScripts.GoogleBase.testItem_Entry_Original.getContent().setText(GDataTestScripts.GoogleBase.testItem_Content_Original);
          GDataTestScripts.GoogleBase.testItem_Entry_Original.getAttributes().get("target_country").setValue(GDataTestScripts.GoogleBase.testItem_TargetCountry_Original);
          GDataTestScripts.GoogleBase.testItem_Entry_Original.updateEntry(new AsyncCallback<ItemsEntry>() {
            public void onFailure(Throwable caught) {
              fail("Revert Failed: " + caught.getMessage());
            }
            public void onSuccess(ItemsEntry result) {
              if (result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Title_Original) &&
                  result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Content_Original) &&
                  result.getAttributes().get("target_country").getValue().equals(GDataTestScripts.GoogleBase.testItem_TargetCountry_Original)) {
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
  public void test4ItemCreate() {
    GoogleBaseService svc = GoogleBaseService.newInstance("test");
    ItemsEntry newEntry = ItemsEntry.newInstance();
    newEntry.setTitle(Text.newInstance());
    newEntry.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Title_Created);
    newEntry.setContent(Text.newInstance());
    newEntry.getContent().setText(GDataTestScripts.GoogleBase.testItem_Content_Created);

    newEntry.setAttribute("target_country", Attribute.newInstance());
    newEntry.getAttributes().get("target_country").setValue(GDataTestScripts.GoogleBase.testItem_TargetCountry_Created);
    newEntry.setAttribute("review_type", Attribute.newInstance());
    newEntry.getAttributes().get("review_type").setValue(GDataTestScripts.GoogleBase.testItem_ReviewType_Created);
    newEntry.setAttribute("name_of_item_reviewed", Attribute.newInstance());
    newEntry.getAttributes().get("name_of_item_reviewed").setValue(GDataTestScripts.GoogleBase.testItem_NameOfItem_Created);
    newEntry.setAttribute("expiration_date", Attribute.newInstance());
    newEntry.getAttributes().get("expiration_date").setValue(GDataTestScripts.GoogleBase.testItem_ExpirationDate_Created);
    newEntry.setAttribute("rating", Attribute.newInstance());
    newEntry.getAttributes().get("rating").setValue(GDataTestScripts.GoogleBase.testItem_Rating_Created);
    newEntry.setAttribute("customer_id", Attribute.newInstance());
    newEntry.getAttributes().get("customer_id").setValue(GDataTestScripts.GoogleBase.testItem_CustomerId_Created);
    newEntry.setAttribute("item_type", Attribute.newInstance());
    newEntry.getAttributes().get("item_type").setValue(GDataTestScripts.GoogleBase.testItem_ItemType_Created);
    newEntry.setAttribute("item_language", Attribute.newInstance());
    newEntry.getAttributes().get("item_language").setValue(GDataTestScripts.GoogleBase.testItem_ItemLanguage_Created);
    
    svc.insertEntry(GDataTestScripts.GoogleBase.testItems_FeedLink, newEntry, new AsyncCallback<ItemsEntry>() {
      public void onFailure(Throwable caught) {
        fail("Create Failed: " + caught.getMessage());
      }
      public void onSuccess(ItemsEntry result) {
        Map<Attribute> atts = result.getAttributes();
        if (atts.get("target_country").getValue().equals(GDataTestScripts.GoogleBase.testItem_TargetCountry_Created) &&
            atts.get("review_type").getValue().equals(GDataTestScripts.GoogleBase.testItem_ReviewType_Created) &&
            atts.get("name_of_item_reviewed").getValue().equals(GDataTestScripts.GoogleBase.testItem_NameOfItem_Created) &&
            atts.get("expiration_date").getValue().equals(GDataTestScripts.GoogleBase.testItem_ExpirationDate_Created) &&
            atts.get("rating").getValue().equals(GDataTestScripts.GoogleBase.testItem_Rating_Created) &&
            atts.get("customer_id").getValue().equals(GDataTestScripts.GoogleBase.testItem_CustomerId_Created) &&
            atts.get("item_type").getValue().equals(GDataTestScripts.GoogleBase.testItem_ItemType_Created) &&
            atts.get("item_language").getValue().equals(GDataTestScripts.GoogleBase.testItem_ItemLanguage_Created) &&
            result.getAuthors()[0].getName().getValue().equals(GDataTestScripts.GoogleBase.testItem_Author_Created) &&
            result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Title_Created) &&
            result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Content_Created)) {
          GDataTestScripts.GoogleBase.testItem_Entry_Created = result;
          finishTest();
        } else { 
          fail("Create Failed");
        }
      }
    });
    delayTestFinish(4000);
  }
  public void test5ItemDelete() {
    GDataTestScripts.GoogleBase.testItem_Entry_Created.deleteEntry(new AsyncCallback<ItemsEntry>() {
      public void onFailure(Throwable caught) {
        fail("Delete Failed: " + caught.getMessage());
      }
      public void onSuccess(ItemsEntry result) {
        GoogleBaseService svc = GoogleBaseService.newInstance("test");
        svc.getItemsFeed(GDataTestScripts.GoogleBase.testItems_FeedLink,
          new AsyncCallback<ItemsFeed>() {
            public void onFailure(Throwable caught) {
              fail("Delete Failed: " + caught.getMessage());
            }
            public void onSuccess(ItemsFeed result) {
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
  public void testConstants() {
    assertNotNull("SERVICE_NAME", GoogleBaseService.SERVICE_NAME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", GoogleBaseService.newInstance("myValue"));
  }
}
