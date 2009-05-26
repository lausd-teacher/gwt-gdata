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
 * Tests for the MediaContent class.
 */
public class MediaContentTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("EXPRESSION_FULL", MediaContent.EXPRESSION_FULL);
    assertNotNull("EXPRESSION_NONSTOP", MediaContent.EXPRESSION_NONSTOP);
    assertNotNull("EXPRESSION_SAMPLE", MediaContent.EXPRESSION_SAMPLE);
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", MediaContent.getConstructor());
    assertNotNull("newInstance()", MediaContent.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // MediaContent obj = MediaContent.newInstance(JavaScriptObject.createObject());
    // obj.addCategory(category);
    // obj.addCategory(category);
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
    MediaContent obj = MediaContent.newInstance(JavaScriptObject.createObject());
    double channels = 600813;
    obj.setChannels(channels);
    assertSame("channels", obj.getChannels(), channels);
    double duration = 600813;
    obj.setDuration(duration);
    assertSame("duration", obj.getDuration(), duration);
    MediaCategory[] categories = new MediaCategory[]{ MediaCategory.newInstance(JavaScriptObject.createObject()) };
    obj.setCategories(categories);
    assertSame("categories", obj.getCategories(), categories);
    String medium = "myValue";
    obj.setMedium(medium);
    assertEquals("medium", obj.getMedium(), medium);
    double samplingrate = 600813;
    obj.setSamplingrate(samplingrate);
    assertSame("samplingrate", obj.getSamplingrate(), samplingrate);
    MediaRating[] ratings = new MediaRating[]{ MediaRating.newInstance(JavaScriptObject.createObject()) };
    obj.setRatings(ratings);
    assertSame("ratings", obj.getRatings(), ratings);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    MediaText[] texts = new MediaText[]{ MediaText.newInstance(JavaScriptObject.createObject()) };
    obj.setTexts(texts);
    assertSame("texts", obj.getTexts(), texts);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    MediaRestriction[] restrictions = new MediaRestriction[]{ MediaRestriction.newInstance(JavaScriptObject.createObject()) };
    obj.setRestrictions(restrictions);
    assertSame("restrictions", obj.getRestrictions(), restrictions);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    MediaThumbnail[] thumbnails = new MediaThumbnail[]{ MediaThumbnail.newInstance(JavaScriptObject.createObject()) };
    obj.setThumbnails(thumbnails);
    assertSame("thumbnails", obj.getThumbnails(), thumbnails);
    double height = 600813;
    obj.setHeight(height);
    assertSame("height", obj.getHeight(), height);
    String url = "myValue";
    obj.setUrl(url);
    assertEquals("url", obj.getUrl(), url);
    double filesize = 600813;
    obj.setFileSize(filesize);
    assertSame("filesize", obj.getFileSize(), filesize);
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
    obj.setPlayer(player);
    assertSame("player", obj.getPlayer(), player);
    double bitrate = 600813;
    obj.setBitrate(bitrate);
    assertSame("bitrate", obj.getBitrate(), bitrate);
    String language = "myValue";
    obj.setLanguage(language);
    assertEquals("language", obj.getLanguage(), language);
    boolean isdefault = true;
    obj.setIsDefault(isdefault);
    assertSame("isdefault", obj.getIsDefault(), isdefault);
    double width = 600813;
    obj.setWidth(width);
    assertSame("width", obj.getWidth(), width);
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    String expression = "myValue";
    obj.setExpression(expression);
    assertEquals("expression", obj.getExpression(), expression);
    double framerate = 600813;
    obj.setFramerate(framerate);
    assertSame("framerate", obj.getFramerate(), framerate);
    MediaCredit[] credits = new MediaCredit[]{ MediaCredit.newInstance(JavaScriptObject.createObject()) };
    obj.setCredits(credits);
    assertSame("credits", obj.getCredits(), credits);
  }
}