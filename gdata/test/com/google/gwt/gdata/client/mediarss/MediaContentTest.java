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

  public void testProperties() {
    MediaContent obj = MediaContent.newInstance(JavaScriptObject.createObject());
    double channels = 600813;
    obj.setChannels(channels);
    assertEquals("channels", obj.getChannels(), channels);
    double duration = 600813;
    obj.setDuration(duration);
    assertEquals("duration", obj.getDuration(), duration);
    JsArray<MediaCategory> categories = ArrayHelper.toJsArray(MediaCategory.newInstance(JavaScriptObject.createObject()));
    obj.setCategories(categories);
    assertEquals("categories", obj.getCategories().length(), categories.length());
    int lenCategories = obj.getCategories().length();
    obj.addCategory(MediaCategory.newInstance(JavaScriptObject.createObject()));
    assertEquals("categories", obj.getCategories().length(), lenCategories + 1);
    String medium = "myValue";
    obj.setMedium(medium);
    assertEquals("medium", obj.getMedium(), medium);
    double samplingrate = 600813;
    obj.setSamplingrate(samplingrate);
    assertEquals("samplingrate", obj.getSamplingrate(), samplingrate);
    JsArray<MediaRating> ratings = ArrayHelper.toJsArray(MediaRating.newInstance(JavaScriptObject.createObject()));
    obj.setRatings(ratings);
    assertEquals("ratings", obj.getRatings().length(), ratings.length());
    int lenRatings = obj.getRatings().length();
    obj.addRating(MediaRating.newInstance(JavaScriptObject.createObject()));
    assertEquals("ratings", obj.getRatings().length(), lenRatings + 1);
    MediaCopyright copyright = MediaCopyright.newInstance(JavaScriptObject.createObject());
    obj.setCopyright(copyright);
    assertSame("copyright", obj.getCopyright(), copyright);
    MediaTitle title = MediaTitle.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    JsArray<MediaText> texts = ArrayHelper.toJsArray(MediaText.newInstance(JavaScriptObject.createObject()));
    obj.setTexts(texts);
    assertEquals("texts", obj.getTexts().length(), texts.length());
    int lenTexts = obj.getTexts().length();
    obj.addText(MediaText.newInstance(JavaScriptObject.createObject()));
    assertEquals("texts", obj.getTexts().length(), lenTexts + 1);
    MediaHash hash = MediaHash.newInstance(JavaScriptObject.createObject());
    obj.setHash(hash);
    assertSame("hash", obj.getHash(), hash);
    JsArray<MediaRestriction> restrictions = ArrayHelper.toJsArray(MediaRestriction.newInstance(JavaScriptObject.createObject()));
    obj.setRestrictions(restrictions);
    assertEquals("restrictions", obj.getRestrictions().length(), restrictions.length());
    int lenRestrictions = obj.getRestrictions().length();
    obj.addRestriction(MediaRestriction.newInstance(JavaScriptObject.createObject()));
    assertEquals("restrictions", obj.getRestrictions().length(), lenRestrictions + 1);
    String type = "myValue";
    obj.setType(type);
    assertEquals("type", obj.getType(), type);
    MediaKeywords keywords = MediaKeywords.newInstance(JavaScriptObject.createObject());
    obj.setKeywords(keywords);
    assertSame("keywords", obj.getKeywords(), keywords);
    JsArray<MediaThumbnail> thumbnails = ArrayHelper.toJsArray(MediaThumbnail.newInstance(JavaScriptObject.createObject()));
    obj.setThumbnails(thumbnails);
    assertEquals("thumbnails", obj.getThumbnails().length(), thumbnails.length());
    int lenThumbnails = obj.getThumbnails().length();
    obj.addThumbnail(MediaThumbnail.newInstance(JavaScriptObject.createObject()));
    assertEquals("thumbnails", obj.getThumbnails().length(), lenThumbnails + 1);
    double height = 600813;
    obj.setHeight(height);
    assertEquals("height", obj.getHeight(), height);
    String url = "myValue";
    obj.setUrl(url);
    assertEquals("url", obj.getUrl(), url);
    double filesize = 600813;
    obj.setFileSize(filesize);
    assertEquals("filesize", obj.getFileSize(), filesize);
    MediaPlayer player = MediaPlayer.newInstance(JavaScriptObject.createObject());
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
    MediaDescription description = MediaDescription.newInstance(JavaScriptObject.createObject());
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    String expression = "myValue";
    obj.setExpression(expression);
    assertEquals("expression", obj.getExpression(), expression);
    double framerate = 600813;
    obj.setFramerate(framerate);
    assertEquals("framerate", obj.getFramerate(), framerate);
    JsArray<MediaCredit> credits = ArrayHelper.toJsArray(MediaCredit.newInstance(JavaScriptObject.createObject()));
    obj.setCredits(credits);
    assertEquals("credits", obj.getCredits().length(), credits.length());
    int lenCredits = obj.getCredits().length();
    obj.addCredit(MediaCredit.newInstance(JavaScriptObject.createObject()));
    assertEquals("credits", obj.getCredits().length(), lenCredits + 1);
  }
}
