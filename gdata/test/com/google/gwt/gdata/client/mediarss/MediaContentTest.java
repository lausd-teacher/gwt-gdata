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
 * Tests for the MediaContent class.
 */
public class MediaContentTest extends MediaRssTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("EXPRESSION_FULL", MediaContent.EXPRESSION_FULL);
        assertNotNull("EXPRESSION_NONSTOP", MediaContent.EXPRESSION_NONSTOP);
        assertNotNull("EXPRESSION_SAMPLE", MediaContent.EXPRESSION_SAMPLE);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", MediaContent.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addCategory(MediaCategory category)
    // Unit Test for addCredit(MediaCredit credit)
    // Unit Test for addRating(MediaRating rating)
    // Unit Test for addRestriction(MediaRestriction restriction)
    // Unit Test for addText(MediaText text)
    // Unit Test for addThumbnail(MediaThumbnail thumbnail)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        MediaContent obj = MediaContent.newInstance();
        double channels = 600813;
        obj.setChannels(channels);
        assertEquals("channels", obj.getChannels(), channels);
        double duration = 600813;
        obj.setDuration(duration);
        assertEquals("duration", obj.getDuration(), duration);
        MediaCategory[] categories = new MediaCategory[]{ MediaCategory.newInstance() };
        obj.setCategories(categories);
        assertEquals("categories", obj.getCategories().length, categories.length);
        String medium = "myValue";
        obj.setMedium(medium);
        assertEquals("medium", obj.getMedium(), medium);
        double samplingrate = 600813;
        obj.setSamplingrate(samplingrate);
        assertEquals("samplingrate", obj.getSamplingrate(), samplingrate);
        MediaRating[] ratings = new MediaRating[]{ MediaRating.newInstance() };
        obj.setRatings(ratings);
        assertEquals("ratings", obj.getRatings().length, ratings.length);
        MediaCopyright copyright = MediaCopyright.newInstance();
        obj.setCopyright(copyright);
        assertSame("copyright", obj.getCopyright(), copyright);
        MediaTitle title = MediaTitle.newInstance();
        obj.setTitle(title);
        assertSame("title", obj.getTitle(), title);
        MediaText[] texts = new MediaText[]{ MediaText.newInstance() };
        obj.setTexts(texts);
        assertEquals("texts", obj.getTexts().length, texts.length);
        MediaHash hash = MediaHash.newInstance();
        obj.setHash(hash);
        assertSame("hash", obj.getHash(), hash);
        MediaRestriction[] restrictions = new MediaRestriction[]{ MediaRestriction.newInstance() };
        obj.setRestrictions(restrictions);
        assertEquals("restrictions", obj.getRestrictions().length, restrictions.length);
        String type = "myValue";
        obj.setType(type);
        assertEquals("type", obj.getType(), type);
        MediaKeywords keywords = MediaKeywords.newInstance();
        obj.setKeywords(keywords);
        assertSame("keywords", obj.getKeywords(), keywords);
        MediaThumbnail[] thumbnails = new MediaThumbnail[]{ MediaThumbnail.newInstance() };
        obj.setThumbnails(thumbnails);
        assertEquals("thumbnails", obj.getThumbnails().length, thumbnails.length);
        double height = 600813;
        obj.setHeight(height);
        assertEquals("height", obj.getHeight(), height);
        String url = "myValue";
        obj.setUrl(url);
        assertEquals("url", obj.getUrl(), url);
        double filesize = 600813;
        obj.setFileSize(filesize);
        assertEquals("filesize", obj.getFileSize(), filesize);
        MediaPlayer player = MediaPlayer.newInstance();
        obj.setPlayer(player);
        assertSame("player", obj.getPlayer(), player);
        double bitrate = 600813;
        obj.setBitrate(bitrate);
        assertEquals("bitrate", obj.getBitrate(), bitrate);
        String language = "myValue";
        obj.setLanguage(language);
        assertEquals("language", obj.getLanguage(), language);
        boolean isdefault = true;
        obj.setIsDefault(isdefault);
        assertSame("isdefault", obj.getIsDefault(), isdefault);
        double width = 600813;
        obj.setWidth(width);
        assertEquals("width", obj.getWidth(), width);
        MediaDescription description = MediaDescription.newInstance();
        obj.setDescription(description);
        assertSame("description", obj.getDescription(), description);
        String expression = "myValue";
        obj.setExpression(expression);
        assertEquals("expression", obj.getExpression(), expression);
        double framerate = 600813;
        obj.setFramerate(framerate);
        assertEquals("framerate", obj.getFramerate(), framerate);
        MediaCredit[] credits = new MediaCredit[]{ MediaCredit.newInstance() };
        obj.setCredits(credits);
        assertEquals("credits", obj.getCredits().length, credits.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
