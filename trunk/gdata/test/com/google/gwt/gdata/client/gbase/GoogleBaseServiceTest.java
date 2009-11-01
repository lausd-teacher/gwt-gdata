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
import com.google.gwt.gdata.client.impl.CallErrorException;

/**
 * Tests for the GoogleBaseService class.
 */
public class GoogleBaseServiceTest extends GoogleBaseTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("SERVICE_NAME", GoogleBaseService.SERVICE_NAME);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", GoogleBaseService.newInstance("myValue"));
        finishGDataTest();
      }
    }, 10000);
  }
  
  public void testCreateAndDeleteItem() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.GoogleBase.testCookie_Name, GDataTestScripts.GoogleBase.testCookie_Value);
        GoogleBaseService svc = GoogleBaseService.newInstance("test");
        ItemsEntry newEntry = ItemsEntry.newInstance();
        newEntry.setTitle(Text.newInstance());
        newEntry.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Entry_Title_Created);
        newEntry.setContent(Text.newInstance());
        newEntry.getContent().setText(GDataTestScripts.GoogleBase.testItem_Entry_Content_Created);
    
        newEntry.setAttribute("target_country", Attribute.newInstance());
        newEntry.getAttributes().get("target_country")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry_Created);
        newEntry.setAttribute("review_type", Attribute.newInstance());
        newEntry.getAttributes().get("review_type")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_ReviewType_Created);
        newEntry.setAttribute("name_of_item_reviewed", Attribute.newInstance());
        newEntry.getAttributes().get("name_of_item_reviewed")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_NameOfItem_Created);
        newEntry.setAttribute("expiration_date", Attribute.newInstance());
        newEntry.getAttributes().get("expiration_date")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_ExpirationDate_Created);
        newEntry.setAttribute("rating", Attribute.newInstance());
        newEntry.getAttributes().get("rating")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_Rating_Created);
        newEntry.setAttribute("customer_id", Attribute.newInstance());
        newEntry.getAttributes().get("customer_id")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_CustomerId_Created);
        newEntry.setAttribute("item_type", Attribute.newInstance());
        newEntry.getAttributes().get("item_type")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_ItemType_Created);
        newEntry.setAttribute("item_language", Attribute.newInstance());
        newEntry.getAttributes().get("item_language")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_ItemLanguage_Created);
        
        svc.insertItemsEntry(GDataTestScripts.GoogleBase.testItems_Feed_Link, newEntry, new ItemsEntryCallback() {
          public void onFailure(CallErrorException caught) {
            fail("Create Failed: " + caught.getMessage());
          }
          public void onSuccess(ItemsEntry result) {
            MapAttribute atts = result.getAttributes();
            if (!atts.get("target_country")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry_Created) ||
                !atts.get("review_type")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_ReviewType_Created) ||
                !atts.get("name_of_item_reviewed")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_NameOfItem_Created) ||
                !atts.get("expiration_date")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_ExpirationDate_Created) ||
                !atts.get("rating")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_Rating_Created) ||
                !atts.get("customer_id")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_CustomerId_Created) ||
                !atts.get("item_type")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_ItemType_Created) ||
                !atts.get("item_language")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_ItemLanguage_Created) ||
                !result.getAuthors()[0].getName().getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_Author_Created) ||
                !result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Title_Created) ||
                !result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Content_Created)) {
              fail("Create Failed");
            }
            result.deleteEntry(new ItemsEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Create Failed: " + caught.getMessage());
              }
              public void onSuccess(ItemsEntry result) {
                finishGDataTest();
              }
            });
          }
        });
      }
    }, 10000);
  }
  
  public void testGetItem() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.GoogleBase.testCookie_Name, GDataTestScripts.GoogleBase.testCookie_Value);
        GoogleBaseService svc = GoogleBaseService.newInstance("test");
        svc.getItemsEntry(GDataTestScripts.GoogleBase.testItem_Entry_Link,
            new ItemsEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(ItemsEntry result) {
                MapAttribute atts = result.getAttributes();
                if (!GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry.equals(atts.get("target_country")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_ReviewType.equals(atts.get("review_type")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_NameOfItem.equals(atts.get("name_of_item_reviewed")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_ExpirationDate.equals(atts.get("expiration_date")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_Rating.equals(atts.get("rating")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_CustomerId.equals(atts.get("customer_id")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_ItemType.equals(atts.get("item_type")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_ItemLanguage.equals(atts.get("item_language")[0].getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_Published.equals(result.getPublished().getValue().getDate().toString()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_Author.equals(result.getAuthors()[0].getName().getValue()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_Title.equals(result.getTitle().getText()) ||
                  !GDataTestScripts.GoogleBase.testItem_Entry_Content.equals(result.getContent().getText())) {
                  fail("Get Failed");
                }
                finishGDataTest();
              }
        });
      }
    }, 10000);
  }
  
  public void testGetItems() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.GoogleBase.testCookie_Name, GDataTestScripts.GoogleBase.testCookie_Value);
        GoogleBaseService svc = GoogleBaseService.newInstance("test");
        svc.getItemsFeed(GDataTestScripts.GoogleBase.testItems_Feed_Link,
            new ItemsFeedCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(ItemsFeed result) {
                if (result.getEntries().length == 0) {
                  fail("Get Failed: " + result.getEntries().length);
                }
                if (!result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItems_Feed_Title)) {
                  fail("Get Failed: " + result.getTitle().getText());
                }
                finishGDataTest();
              }
        });
      }
    }, 10000);
  }
  
  public void testUpdateItem() {
    executeGDataTest(new Runnable() {
      public void run() {
        UserTest.login(GDataTestScripts.GoogleBase.testCookie_Name, GDataTestScripts.GoogleBase.testCookie_Value);
        GoogleBaseService svc = GoogleBaseService.newInstance("test");
        svc.getItemsEntry(GDataTestScripts.GoogleBase.testItem_Entry_Link,
            new ItemsEntryCallback() {
              public void onFailure(CallErrorException caught) {
                fail("Get Failed: " + caught.getMessage());
              }
              public void onSuccess(ItemsEntry result) {
                result.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Entry_Title_Updated);
                result.getContent().setText(GDataTestScripts.GoogleBase.testItem_Entry_Content_Updated);
                result.getAttributes().get("target_country")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry_Updated);
                result.updateEntry(new ItemsEntryCallback() {
                  public void onFailure(CallErrorException caught) {
                    fail("Update Failed: " + caught.getMessage());
                  }
                  public void onSuccess(ItemsEntry result) {
                    if (!result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Title_Updated) ||
                        !result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Content_Updated) ||
                        !result.getAttributes().get("target_country")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry_Updated)) {
                      fail("Update Failed");
                    }
                    result.getTitle().setText(GDataTestScripts.GoogleBase.testItem_Entry_Title);
                    result.getContent().setText(GDataTestScripts.GoogleBase.testItem_Entry_Content);
                    result.getAttributes().get("target_country")[0].setValue(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry);
                    result.updateEntry(new ItemsEntryCallback() {
                      public void onFailure(CallErrorException caught) {
                        fail("Revert Failed: " + caught.getMessage());
                      }
                      public void onSuccess(ItemsEntry result) {
                        if (result.getTitle().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Title) &&
                            result.getContent().getText().equals(GDataTestScripts.GoogleBase.testItem_Entry_Content) &&
                            result.getAttributes().get("target_country")[0].getValue().equals(GDataTestScripts.GoogleBase.testItem_Entry_TargetCountry)) {
                          finishGDataTest();
                        } else { 
                          fail("Revert Failed");
                        }
                      }
                    });
                  }
                });
              }
        });
      }
    }, 10000);
  }
}
