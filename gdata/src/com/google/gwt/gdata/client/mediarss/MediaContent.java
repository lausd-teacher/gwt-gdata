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

/**
 * Describes a media content.
 */
public class MediaContent extends JavaScriptObject {

  /**
   * The media object is the full version.
   */
  public static final String EXPRESSION_FULL = getConstant("EXPRESSION_FULL");

  /**
   * The media object is a continuous stream.
   */
  public static final String EXPRESSION_NONSTOP = getConstant("EXPRESSION_NONSTOP");

  /**
   * The media object is a sample.
   */
  public static final String EXPRESSION_SAMPLE = getConstant("EXPRESSION_SAMPLE");

  /**
   * Constructs a media content.
   * @return A MediaContent object.
   */
  public static native MediaContent newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaContent();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaContent[name];
  }-*/;

  protected MediaContent() { }

  /**
   * Adds a new media category.
   * 
   * @param category Media category to add.
   */
  public final native void addCategory(MediaCategory category) /*-{
    this.addCategory(category);
  }-*/;

  /**
   * Adds a new media credit.
   * 
   * @param credit Media credit to add.
   */
  public final native void addCredit(MediaCredit credit) /*-{
    this.addCredit(credit);
  }-*/;

  /**
   * Adds a new media rating.
   * 
   * @param rating Media rating to add.
   */
  public final native void addRating(MediaRating rating) /*-{
    this.addRating(rating);
  }-*/;

  /**
   * Adds a new media restriction.
   * 
   * @param restriction Media restriction to add.
   */
  public final native void addRestriction(MediaRestriction restriction) /*-{
    this.addRestriction(restriction);
  }-*/;

  /**
   * Adds a new media text.
   * 
   * @param text Media text to add.
   */
  public final native void addText(MediaText text) /*-{
    this.addText(text);
  }-*/;

  /**
   * Adds a new media thumbnail.
   * 
   * @param thumbnail Media thumbnail to add.
   */
  public final native void addThumbnail(MediaThumbnail thumbnail) /*-{
    this.addThumbnail(thumbnail);
  }-*/;

  /**
   * Returns the kilobits per second of media. This attribute is optional.
   * 
   * @return Kilobits per second of media.
   */
  public final native double getBitrate() /*-{
    return this.getBitrate();
  }-*/;

  /**
   * Returns the media categories.
   * 
   * @return Media categories.
   */
  public final native MediaCategory[] getCategories() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCategories());
  }-*/;

  /**
   * Returns the number of audio channels. This attribute is optional.
   * 
   * @return Number of audio channels.
   */
  public final native double getChannels() /*-{
    return this.getChannels();
  }-*/;

  /**
   * Returns the media copyright. This element is optional.
   * 
   * @return Media copyright.
   */
  public final native MediaCopyright getCopyright() /*-{
    return this.getCopyright();
  }-*/;

  /**
   * Returns the media credits.
   * 
   * @return Media credits.
   */
  public final native MediaCredit[] getCredits() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCredits());
  }-*/;

  /**
   * Returns the media description. This element is optional.
   * 
   * @return Media description.
   */
  public final native MediaDescription getDescription() /*-{
    return this.getDescription();
  }-*/;

  /**
   * Returns the number of seconds of media. This attribute is optional.
   * 
   * @return Number of seconds of media.
   */
  public final native double getDuration() /*-{
    return this.getDuration();
  }-*/;

  /**
   * Returns the specifies if object is a sample or full version. This attribute is optional.
   * 
   * @return Specifies if object is a sample or full version.
   */
  public final native String getExpression() /*-{
    return this.getExpression();
  }-*/;

  /**
   * Returns the size of media file in bytes. This attribute is optional.
   * 
   * @return Size of media file in bytes.
   */
  public final native double getFileSize() /*-{
    return this.getFileSize();
  }-*/;

  /**
   * Returns the number of frames per second of media. This attribute is optional.
   * 
   * @return Number of frames per second of media .
   */
  public final native double getFramerate() /*-{
    return this.getFramerate();
  }-*/;

  /**
   * Returns the media hash. This element is optional.
   * 
   * @return Media hash.
   */
  public final native MediaHash getHash() /*-{
    return this.getHash();
  }-*/;

  /**
   * Returns the height of the media object. This attribute is optional.
   * 
   * @return Height of the media object.
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns is this default object for the group. This attribute is optional.
   * 
   * @return Is this default object for the group.
   */
  public final native boolean getIsDefault() /*-{
    return this.getIsDefault();
  }-*/;

  /**
   * Returns the media keywords. This element is optional.
   * 
   * @return Media keywords.
   */
  public final native MediaKeywords getKeywords() /*-{
    return this.getKeywords();
  }-*/;

  /**
   * Returns the primary language encapsulated in the media. This attribute is optional.
   * 
   * @return Primary language encapsulated in the media.
   */
  public final native String getLanguage() /*-{
    return this.getLanguage();
  }-*/;

  /**
   * Returns the simple type of object. This attribute is optional.
   * 
   * @return Simple type of object.
   */
  public final native String getMedium() /*-{
    return this.getMedium();
  }-*/;

  /**
   * Returns the media player. This element is optional.
   * 
   * @return Media player.
   */
  public final native MediaPlayer getPlayer() /*-{
    return this.getPlayer();
  }-*/;

  /**
   * Returns the media ratings.
   * 
   * @return Media ratings.
   */
  public final native MediaRating[] getRatings() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getRatings());
  }-*/;

  /**
   * Returns the media restrictions.
   * 
   * @return Media restrictions.
   */
  public final native MediaRestriction[] getRestrictions() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getRestrictions());
  }-*/;

  /**
   * Returns the nubmer of samples per second of media. This attribute is optional.
   * 
   * @return Nubmer of samples per second of media.
   */
  public final native double getSamplingrate() /*-{
    return this.getSamplingrate();
  }-*/;

  /**
   * Returns the media texts.
   * 
   * @return Media texts.
   */
  public final native MediaText[] getTexts() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getTexts());
  }-*/;

  /**
   * Returns the media thumbnails.
   * 
   * @return Media thumbnails.
   */
  public final native MediaThumbnail[] getThumbnails() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getThumbnails());
  }-*/;

  /**
   * Returns the media title. This element is optional.
   * 
   * @return Media title.
   */
  public final native MediaTitle getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the standard mime type. This attribute is optional.
   * 
   * @return Standard mime type.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the direct url to the media object. This attribute is optional.
   * 
   * @return Direct url to the media object.
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width of the media object. This attribute is optional.
   * 
   * @return Width of the media object.
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;
  
  /**
   * Sets the kilobits per second of media. This attribute is optional.
   * 
   * @param bitrate Kilobits per second of media.
   */
  public final native void setBitrate(double bitrate) /*-{
    this.setBitrate(bitrate);
  }-*/;


  /**
   * Sets the media categories.
   * 
   * @param categories Media categories, where each media category is added using addCategory().
   */
  public final native void setCategories(MediaCategory[] categories) /*-{
    this.setCategories(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(categories)
    );
  }-*/;

  /**
   * Sets the number of audio channels. This attribute is optional.
   * 
   * @param channels Number of audio channels.
   */
  public final native void setChannels(double channels) /*-{
    this.setChannels(channels);
  }-*/;

  /**
   * Sets the media copyright. This element is optional.
   * 
   * @param copyright Media copyright.
   */
  public final native void setCopyright(MediaCopyright copyright) /*-{
    this.setCopyright(copyright);
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits Media credits, where each media credit is added using addCredit().
   */
  public final native void setCredits(MediaCredit[] credits) /*-{
    this.setCredits(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(credits)
    );
  }-*/;

  /**
   * Sets the media description. This element is optional.
   * 
   * @param description Media description.
   */
  public final native void setDescription(MediaDescription description) /*-{
    this.setDescription(description);
  }-*/;

  /**
   * Sets the number of seconds of media. This attribute is optional.
   * 
   * @param duration Number of seconds of media.
   */
  public final native void setDuration(double duration) /*-{
    this.setDuration(duration);
  }-*/;

  /**
   * Sets the specifies if object is a sample or full version. This attribute is optional.
   * 
   * @param expression Specifies if object is a sample or full version.
   */
  public final native void setExpression(String expression) /*-{
    this.setExpression(expression);
  }-*/;

  /**
   * Sets the size of media file in bytes. This attribute is optional.
   * 
   * @param fileSize Size of media file in bytes.
   */
  public final native void setFileSize(double fileSize) /*-{
    this.setFileSize(fileSize);
  }-*/;

  /**
   * Sets the number of frames per second of media. This attribute is optional.
   * 
   * @param framerate Number of frames per second of media.
   */
  public final native void setFramerate(double framerate) /*-{
    this.setFramerate(framerate);
  }-*/;

  /**
   * Sets the media hash. This element is optional.
   * 
   * @param hash Media hash.
   */
  public final native void setHash(MediaHash hash) /*-{
    this.setHash(hash);
  }-*/;

  /**
   * Sets the height of the media object. This attribute is optional.
   * 
   * @param height Height of the media object.
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(height);
  }-*/;

  /**
   * Sets is this default object for the group. This attribute is optional.
   * 
   * @param isDefault Is this default object for the group.
   */
  public final native void setIsDefault(boolean isDefault) /*-{
    this.setIsDefault(isDefault);
  }-*/;

  /**
   * Sets the media keywords. This element is optional.
   * 
   * @param keywords Media keywords.
   */
  public final native void setKeywords(MediaKeywords keywords) /*-{
    this.setKeywords(keywords);
  }-*/;

  /**
   * Sets the primary language encapsulated in the media. This attribute is optional.
   * 
   * @param language Primary language encapsulated in the media.
   */
  public final native void setLanguage(String language) /*-{
    this.setLanguage(language);
  }-*/;

  /**
   * Sets the simple type of object. This attribute is optional.
   * 
   * @param medium Simple type of object.
   */
  public final native void setMedium(String medium) /*-{
    this.setMedium(medium);
  }-*/;

  /**
   * Sets the media player. This element is optional.
   * 
   * @param player Media player.
   */
  public final native void setPlayer(MediaPlayer player) /*-{
    this.setPlayer(player);
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings Media ratings, where each media rating is added using addRating().
   */
  public final native void setRatings(MediaRating[] ratings) /*-{
    this.setRatings(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(ratings)
    );
  }-*/;

  /**
   * Sets the media restrictions.
   * 
   * @param restrictions Media restrictions, where each media restriction is added using addRestriction().
   */
  public final native void setRestrictions(MediaRestriction[] restrictions) /*-{
    this.setRestrictions(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(restrictions)
    );
  }-*/;

  /**
   * Sets the nubmer of samples per second of media. This attribute is optional.
   * 
   * @param samplingrate Nubmer of samples per second of media.
   */
  public final native void setSamplingrate(double samplingrate) /*-{
    this.setSamplingrate(samplingrate);
  }-*/;

  /**
   * Sets the media texts.
   * 
   * @param texts Media texts, where each media text is added using addText().
   */
  public final native void setTexts(MediaText[] texts) /*-{
    this.setTexts(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(texts)
    );
  }-*/;

  /**
   * Sets the media thumbnails.
   * 
   * @param thumbnails Media thumbnails, where each media thumbnail is added using addThumbnail().
   */
  public final native void setThumbnails(MediaThumbnail[] thumbnails) /*-{
    this.setThumbnails(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(thumbnails)
    );
  }-*/;

  /**
   * Sets the media title. This element is optional.
   * 
   * @param title Media title.
   */
  public final native void setTitle(MediaTitle title) /*-{
    this.setTitle(title);
  }-*/;

  /**
   * Sets the standard mime type. This attribute is optional.
   * 
   * @param type Standard mime type.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

  /**
   * Sets the direct url to the media object. This attribute is optional.
   * 
   * @param url Direct url to the media object.
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(url);
  }-*/;

  /**
   * Sets the width of the media object. This attribute is optional.
   * 
   * @param width Width of the media object.
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(width);
  }-*/;

}