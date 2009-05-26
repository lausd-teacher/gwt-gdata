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

import com.google.gwt.core.client.JavaScriptObject;
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
    // obj.addCategory(category);
    // obj.addContent(content);
    // obj.addContent(content);
    // obj.addCredit(credit);
    // obj.addCredit(credit);
    // obj.addRating(rating);
    // obj.addRating(rating);
    // obj.addRestriction(restriction);
    // obj.addRestriction(restriction);
    // obj.addText(text);
    // obj.addText(text);
    // obj.addThumbnail(thumbnail);
    // obj.addThumbnail(thumbnail);
  }

  public void testProperties() {
    MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    MediaText[] texts = new MediaText[]{ MediaText.newInstance(JavaScriptObject.createObject()) };
    obj.setTexts(texts);
    assertSame("texts", obj.getTexts(), texts);
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
    obj.setPlayer(player);
    assertSame("player", obj.getPlayer(), player);
    MediaThumbnail[] thumbnails = new MediaThumbnail[]{ MediaThumbnail.newInstance(JavaScriptObject.createObject()) };
    obj.setThumbnails(thumbnails);
    assertSame("thumbnails", obj.getThumbnails(), thumbnails);
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    MediaCategory[] categories = new MediaCategory[]{ MediaCategory.newInstance(JavaScriptObject.createObject()) };
    obj.setCategories(categories);
    assertSame("categories", obj.getCategories(), categories);
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
    MediaRestriction[] restrictions = new MediaRestriction[]{ MediaRestriction.newInstance(JavaScriptObject.createObject()) };
    obj.setRestrictions(restrictions);
    assertSame("restrictions", obj.getRestrictions(), restrictions);
    MediaRating[] ratings = new MediaRating[]{ MediaRating.newInstance(JavaScriptObject.createObject()) };
    obj.setRatings(ratings);
    assertSame("ratings", obj.getRatings(), ratings);
    MediaContent[] contents = new MediaContent[]{ MediaContent.newInstance(JavaScriptObject.createObject()) };
    obj.setContents(contents);
    assertSame("contents", obj.getContents(), contents);
    MediaCredit[] credits = new MediaCredit[]{ MediaCredit.newInstance(JavaScriptObject.createObject()) };
    obj.setCredits(credits);
    assertSame("credits", obj.getCredits(), credits);
  }
}
