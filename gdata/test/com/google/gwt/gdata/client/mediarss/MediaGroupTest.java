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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the MediaGroup class.
 */
public class MediaGroupTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", MediaGroup.getConstructor());
    assertNotNull("newInstance()", MediaGroup.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    JsArray<MediaText> texts = ArrayHelper.toJsArray(MediaText.newInstance(JavaScriptObject.createObject()));
    obj.setTexts(texts);
    assertEquals("texts", obj.getTexts().length(), texts.length());
    int lenTexts = obj.getTexts().length();
    obj.addText(MediaText.newInstance(JavaScriptObject.createObject()));
    assertEquals("texts", obj.getTexts().length(), lenTexts + 1);
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
    obj.setPlayer(player);
    assertSame("player", obj.getPlayer(), player);
    JsArray<MediaThumbnail> thumbnails = ArrayHelper.toJsArray(MediaThumbnail.newInstance(JavaScriptObject.createObject()));
    obj.setThumbnails(thumbnails);
    assertEquals("thumbnails", obj.getThumbnails().length(), thumbnails.length());
    int lenThumbnails = obj.getThumbnails().length();
    obj.addThumbnail(MediaThumbnail.newInstance(JavaScriptObject.createObject()));
    assertEquals("thumbnails", obj.getThumbnails().length(), lenThumbnails + 1);
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    JsArray<MediaCategory> categories = ArrayHelper.toJsArray(MediaCategory.newInstance(JavaScriptObject.createObject()));
    obj.setCategories(categories);
    assertEquals("categories", obj.getCategories().length(), categories.length());
    int lenCategories = obj.getCategories().length();
    obj.addCategory(MediaCategory.newInstance(JavaScriptObject.createObject()));
    assertEquals("categories", obj.getCategories().length(), lenCategories + 1);
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
    JsArray<MediaRestriction> restrictions = ArrayHelper.toJsArray(MediaRestriction.newInstance(JavaScriptObject.createObject()));
    obj.setRestrictions(restrictions);
    assertEquals("restrictions", obj.getRestrictions().length(), restrictions.length());
    int lenRestrictions = obj.getRestrictions().length();
    obj.addRestriction(MediaRestriction.newInstance(JavaScriptObject.createObject()));
    assertEquals("restrictions", obj.getRestrictions().length(), lenRestrictions + 1);
    JsArray<MediaRating> ratings = ArrayHelper.toJsArray(MediaRating.newInstance(JavaScriptObject.createObject()));
    obj.setRatings(ratings);
    assertEquals("ratings", obj.getRatings().length(), ratings.length());
    int lenRatings = obj.getRatings().length();
    obj.addRating(MediaRating.newInstance(JavaScriptObject.createObject()));
    assertEquals("ratings", obj.getRatings().length(), lenRatings + 1);
    JsArray<MediaContent> contents = ArrayHelper.toJsArray(MediaContent.newInstance(JavaScriptObject.createObject()));
    obj.setContents(contents);
    assertEquals("contents", obj.getContents().length(), contents.length());
    int lenContents = obj.getContents().length();
    obj.addContent(MediaContent.newInstance(JavaScriptObject.createObject()));
    assertEquals("contents", obj.getContents().length(), lenContents + 1);
    JsArray<MediaCredit> credits = ArrayHelper.toJsArray(MediaCredit.newInstance(JavaScriptObject.createObject()));
    obj.setCredits(credits);
    assertEquals("credits", obj.getCredits().length(), credits.length());
    int lenCredits = obj.getCredits().length();
    obj.addCredit(MediaCredit.newInstance(JavaScriptObject.createObject()));
    assertEquals("credits", obj.getCredits().length(), lenCredits + 1);
  }
}
