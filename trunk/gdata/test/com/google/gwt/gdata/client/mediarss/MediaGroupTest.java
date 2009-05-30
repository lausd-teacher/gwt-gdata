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

  public void testOther() {
    // MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    // obj.addCategory(category);
    // obj.addContent(content);
    // obj.addCredit(credit);
    // obj.addRating(rating);
    // obj.addRestriction(restriction);
    // obj.addText(text);
    // obj.addThumbnail(thumbnail);
  }

  public void testProperties() {
    MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    JsArray<com.google.gwt.gdata.client.mediarss.MediaText> texts = ArrayHelper.toJsArray(MediaText.newInstance(JavaScriptObject.createObject()));
    obj.setTexts(texts);
    assertEquals("texts", obj.getTexts().length(), texts.length());
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
    obj.setPlayer(player);
    assertSame("player", obj.getPlayer(), player);
    JsArray<com.google.gwt.gdata.client.mediarss.MediaThumbnail> thumbnails = ArrayHelper.toJsArray(MediaThumbnail.newInstance(JavaScriptObject.createObject()));
    obj.setThumbnails(thumbnails);
    assertEquals("thumbnails", obj.getThumbnails().length(), thumbnails.length());
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    JsArray<com.google.gwt.gdata.client.mediarss.MediaCategory> categories = ArrayHelper.toJsArray(MediaCategory.newInstance(JavaScriptObject.createObject()));
    obj.setCategories(categories);
    assertEquals("categories", obj.getCategories().length(), categories.length());
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
    JsArray<com.google.gwt.gdata.client.mediarss.MediaRestriction> restrictions = ArrayHelper.toJsArray(MediaRestriction.newInstance(JavaScriptObject.createObject()));
    obj.setRestrictions(restrictions);
    assertEquals("restrictions", obj.getRestrictions().length(), restrictions.length());
    JsArray<com.google.gwt.gdata.client.mediarss.MediaRating> ratings = ArrayHelper.toJsArray(MediaRating.newInstance(JavaScriptObject.createObject()));
    obj.setRatings(ratings);
    assertEquals("ratings", obj.getRatings().length(), ratings.length());
    JsArray<com.google.gwt.gdata.client.mediarss.MediaContent> contents = ArrayHelper.toJsArray(MediaContent.newInstance(JavaScriptObject.createObject()));
    obj.setContents(contents);
    assertEquals("contents", obj.getContents().length(), contents.length());
    JsArray<com.google.gwt.gdata.client.mediarss.MediaCredit> credits = ArrayHelper.toJsArray(MediaCredit.newInstance(JavaScriptObject.createObject()));
    obj.setCredits(credits);
    assertEquals("credits", obj.getCredits().length(), credits.length());
  }
}
