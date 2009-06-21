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
    assertNotNull("newInstance()", MediaGroup.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    // Unit Test for addCategory(MediaCategory category)
    // Unit Test for addContent(MediaContent content)
    // Unit Test for addCredit(MediaCredit credit)
    // Unit Test for addRating(MediaRating rating)
    // Unit Test for addRestriction(MediaRestriction restriction)
    // Unit Test for addText(MediaText text)
    // Unit Test for addThumbnail(MediaThumbnail thumbnail)
    // Unit Test for getCategories()
    assertEquals("getCategories", obj.getCategories(), null);
    // Unit Test for getContents()
    assertEquals("getContents", obj.getContents(), null);
    // Unit Test for getCredits()
    assertEquals("getCredits", obj.getCredits(), null);
    // Unit Test for getRatings()
    assertEquals("getRatings", obj.getRatings(), null);
    // Unit Test for getRestrictions()
    assertEquals("getRestrictions", obj.getRestrictions(), null);
    // Unit Test for getTexts()
    assertEquals("getTexts", obj.getTexts(), null);
    // Unit Test for getThumbnails()
    assertEquals("getThumbnails", obj.getThumbnails(), null);
    // Unit Test for setCategories(JsArray categories)
    // Unit Test for setContents(JsArray contents)
    // Unit Test for setCredits(JsArray credits)
    // Unit Test for setRatings(JsArray ratings)
    // Unit Test for setRestrictions(JsArray restrictions)
    // Unit Test for setTexts(JsArray texts)
    // Unit Test for setThumbnails(JsArray thumbnails)
  }

  public void testProperties() {
    MediaGroup obj = MediaGroup.newInstance(JavaScriptObject.createObject());
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
    obj.setPlayer(player);
    assertSame("player", obj.getPlayer(), player);
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
  }
}
