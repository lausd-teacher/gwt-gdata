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

/**
 * Tests for the MediaGroup class.
 */
public class MediaGroupTest extends MediaRssTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", MediaGroup.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        MediaGroup obj = MediaGroup.newInstance();
        obj.addCategory(MediaCategory.newInstance());
        assertEquals("addCategory", 1, obj.getCategories().length);
        obj.addContent(MediaContent.newInstance());
        assertEquals("addContent", 1, obj.getContents().length);
        obj.addCredit(MediaCredit.newInstance());
        assertEquals("addCredit", 1, obj.getCredits().length);
        obj.addRating(MediaRating.newInstance());
        assertEquals("addRating", 1, obj.getRatings().length);
        obj.addRestriction(MediaRestriction.newInstance());
        assertEquals("addRestriction", 1, obj.getRestrictions().length);
        obj.addText(MediaText.newInstance());
        assertEquals("addText", 1, obj.getTexts().length);
        obj.addThumbnail(MediaThumbnail.newInstance());
        assertEquals("addThumbnail", 1, obj.getThumbnails().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        MediaGroup obj = MediaGroup.newInstance();
        MediaDescription description = MediaDescription.newInstance();
        obj.setDescription(description);
        assertSame("description", obj.getDescription(), description);
        MediaText[] texts = new MediaText[]{ MediaText.newInstance() };
        obj.setTexts(texts);
        assertEquals("texts", obj.getTexts().length, texts.length);
        MediaPlayer player = MediaPlayer.newInstance();
        obj.setPlayer(player);
        assertSame("player", obj.getPlayer(), player);
        MediaThumbnail[] thumbnails = new MediaThumbnail[]{ MediaThumbnail.newInstance() };
        obj.setThumbnails(thumbnails);
        assertEquals("thumbnails", obj.getThumbnails().length, thumbnails.length);
        MediaKeywords keywords = MediaKeywords.newInstance();
        obj.setKeywords(keywords);
        assertSame("keywords", obj.getKeywords(), keywords);
        MediaCategory[] categories = new MediaCategory[]{ MediaCategory.newInstance() };
        obj.setCategories(categories);
        assertEquals("categories", obj.getCategories().length, categories.length);
        MediaTitle title = MediaTitle.newInstance();
        obj.setTitle(title);
        assertSame("title", obj.getTitle(), title);
        MediaHash hash = MediaHash.newInstance();
        obj.setHash(hash);
        assertSame("hash", obj.getHash(), hash);
        MediaCopyright copyright = MediaCopyright.newInstance();
        obj.setCopyright(copyright);
        assertSame("copyright", obj.getCopyright(), copyright);
        MediaRestriction[] restrictions = new MediaRestriction[]{ MediaRestriction.newInstance() };
        obj.setRestrictions(restrictions);
        assertEquals("restrictions", obj.getRestrictions().length, restrictions.length);
        MediaRating[] ratings = new MediaRating[]{ MediaRating.newInstance() };
        obj.setRatings(ratings);
        assertEquals("ratings", obj.getRatings().length, ratings.length);
        MediaContent[] contents = new MediaContent[]{ MediaContent.newInstance() };
        obj.setContents(contents);
        assertEquals("contents", obj.getContents().length, contents.length);
        MediaCredit[] credits = new MediaCredit[]{ MediaCredit.newInstance() };
        obj.setCredits(credits);
        assertEquals("credits", obj.getCredits().length, credits.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
