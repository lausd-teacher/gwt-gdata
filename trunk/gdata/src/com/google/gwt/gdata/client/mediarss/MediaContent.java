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
 * Comment unavailable.
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
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.mediarss.MediaContent;
  }-*/;

  /**
   * Constructs a media content using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaContent newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaContent(
      params
    );
  }-*/;

  /**
   * Constructs a media content using an object parameter whose property names match the setter method to use for each property.
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
   * @param category
   */
  public final native void addCategory(JavaScriptObject category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new media category.
   * 
   * @param category
   */
  public final native void addCategory(MediaCategory category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new media credit.
   * 
   * @param credit
   */
  public final native void addCredit(JavaScriptObject credit) /*-{
    this.addCredit(
      credit
    );
  }-*/;

  /**
   * Adds a new media credit.
   * 
   * @param credit
   */
  public final native void addCredit(MediaCredit credit) /*-{
    this.addCredit(
      credit
    );
  }-*/;

  /**
   * Adds a new media rating.
   * 
   * @param rating
   */
  public final native void addRating(JavaScriptObject rating) /*-{
    this.addRating(
      rating
    );
  }-*/;

  /**
   * Adds a new media rating.
   * 
   * @param rating
   */
  public final native void addRating(MediaRating rating) /*-{
    this.addRating(
      rating
    );
  }-*/;

  /**
   * Adds a new media restriction.
   * 
   * @param restriction
   */
  public final native void addRestriction(JavaScriptObject restriction) /*-{
    this.addRestriction(
      restriction
    );
  }-*/;

  /**
   * Adds a new media restriction.
   * 
   * @param restriction
   */
  public final native void addRestriction(MediaRestriction restriction) /*-{
    this.addRestriction(
      restriction
    );
  }-*/;

  /**
   * Adds a new media text.
   * 
   * @param text
   */
  public final native void addText(JavaScriptObject text) /*-{
    this.addText(
      text
    );
  }-*/;

  /**
   * Adds a new media text.
   * 
   * @param text
   */
  public final native void addText(MediaText text) /*-{
    this.addText(
      text
    );
  }-*/;

  /**
   * Adds a new media thumbnail.
   * 
   * @param thumbnail
   */
  public final native void addThumbnail(JavaScriptObject thumbnail) /*-{
    this.addThumbnail(
      thumbnail
    );
  }-*/;

  /**
   * Adds a new media thumbnail.
   * 
   * @param thumbnail
   */
  public final native void addThumbnail(MediaThumbnail thumbnail) /*-{
    this.addThumbnail(
      thumbnail
    );
  }-*/;

  /**
   * Returns the kilobits per second of media.
   * 
   * @return
   */
  public final native double getBitrate() /*-{
    return this.getBitrate();
  }-*/;

  /**
   * Returns the media categories.
   * 
   * @return
   */
  public final native MediaCategory[] getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * Returns the number of audio channels.
   * 
   * @return
   */
  public final native double getChannels() /*-{
    return this.getChannels();
  }-*/;

  /**
   * Returns the media copyright.
   * 
   * @return
   */
  public final native MediaCopyright getCopyright() /*-{
    return this.getCopyright();
  }-*/;

  /**
   * Returns the media credits.
   * 
   * @return
   */
  public final native MediaCredit[] getCredits() /*-{
    return this.getCredits();
  }-*/;

  /**
   * Returns the media description.
   * 
   * @return
   */
  public final native MediaDescription getDescription() /*-{
    return this.getDescription();
  }-*/;

  /**
   * Returns the number of seconds of media.
   * 
   * @return
   */
  public final native double getDuration() /*-{
    return this.getDuration();
  }-*/;

  /**
   * Returns the specifies if object is a sample or full version.
   * 
   * @return
   */
  public final native String getExpression() /*-{
    return this.getExpression();
  }-*/;

  /**
   * Returns the size of media file in bytes.
   * 
   * @return
   */
  public final native double getFileSize() /*-{
    return this.getFileSize();
  }-*/;

  /**
   * Returns the number of frames per second of media.
   * 
   * @return
   */
  public final native double getFramerate() /*-{
    return this.getFramerate();
  }-*/;

  /**
   * Returns the media hash.
   * 
   * @return
   */
  public final native MediaHash getHash() /*-{
    return this.getHash();
  }-*/;

  /**
   * Returns the height of the media object.
   * 
   * @return
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns is this default object for the group.
   * 
   * @return
   */
  public final native boolean getIsDefault() /*-{
    return this.getIsDefault();
  }-*/;

  /**
   * Returns the media keywords.
   * 
   * @return
   */
  public final native MediaKeywords getKeywords() /*-{
    return this.getKeywords();
  }-*/;

  /**
   * Returns the primary language encapsulated in the media.
   * 
   * @return
   */
  public final native String getLanguage() /*-{
    return this.getLanguage();
  }-*/;

  /**
   * Returns the simple type of object.
   * 
   * @return
   */
  public final native String getMedium() /*-{
    return this.getMedium();
  }-*/;

  /**
   * Returns the media player.
   * 
   * @return
   */
  public final native MediaPlayer getPlayer() /*-{
    return this.getPlayer();
  }-*/;

  /**
   * Returns the media ratings.
   * 
   * @return
   */
  public final native MediaRating[] getRatings() /*-{
    return this.getRatings();
  }-*/;

  /**
   * Returns the media restrictions.
   * 
   * @return
   */
  public final native MediaRestriction[] getRestrictions() /*-{
    return this.getRestrictions();
  }-*/;

  /**
   * Returns the nubmer of samples per second of media.
   * 
   * @return
   */
  public final native double getSamplingrate() /*-{
    return this.getSamplingrate();
  }-*/;

  /**
   * Returns the media texts.
   * 
   * @return
   */
  public final native MediaText[] getTexts() /*-{
    return this.getTexts();
  }-*/;

  /**
   * Returns the media thumbnails.
   * 
   * @return
   */
  public final native MediaThumbnail[] getThumbnails() /*-{
    return this.getThumbnails();
  }-*/;

  /**
   * Returns the media title.
   * 
   * @return
   */
  public final native MediaTitle getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the standard mime type.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the direct url to the media object.
   * 
   * @return
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width of the media object.
   * 
   * @return
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the kilobits per second of media.
   * 
   * @param bitrate
   */
  public final native void setBitrate(double bitrate) /*-{
    this.setBitrate(
      bitrate
    );
  }-*/;

  /**
   * Sets the kilobits per second of media.
   * 
   * @param bitrate
   */
  public final native void setBitrate() /*-{
    this.setBitrate();
  }-*/;

  /**
   * Sets the media categories.
   * 
   * @param categories
   */
  public final native void setCategories(JavaScriptObject[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the media categories.
   * 
   * @param categories
   */
  public final native void setCategories() /*-{
    this.setCategories();
  }-*/;

  /**
   * Sets the media categories.
   * 
   * @param categories
   */
  public final native void setCategories(MediaCategory[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the number of audio channels.
   * 
   * @param channels
   */
  public final native void setChannels(double channels) /*-{
    this.setChannels(
      channels
    );
  }-*/;

  /**
   * Sets the number of audio channels.
   * 
   * @param channels
   */
  public final native void setChannels() /*-{
    this.setChannels();
  }-*/;

  /**
   * Sets the media copyright.
   * 
   * @param copyright
   */
  public final native void setCopyright(JavaScriptObject copyright) /*-{
    this.setCopyright(
      copyright
    );
  }-*/;

  /**
   * Sets the media copyright.
   * 
   * @param copyright
   */
  public final native void setCopyright() /*-{
    this.setCopyright();
  }-*/;

  /**
   * Sets the media copyright.
   * 
   * @param copyright
   */
  public final native void setCopyright(MediaCopyright copyright) /*-{
    this.setCopyright(
      copyright
    );
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits
   */
  public final native void setCredits(JavaScriptObject[] credits) /*-{
    this.setCredits(
      credits
    );
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits
   */
  public final native void setCredits() /*-{
    this.setCredits();
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits
   */
  public final native void setCredits(MediaCredit[] credits) /*-{
    this.setCredits(
      credits
    );
  }-*/;

  /**
   * Sets the media description.
   * 
   * @param description
   */
  public final native void setDescription(JavaScriptObject description) /*-{
    this.setDescription(
      description
    );
  }-*/;

  /**
   * Sets the media description.
   * 
   * @param description
   */
  public final native void setDescription() /*-{
    this.setDescription();
  }-*/;

  /**
   * Sets the media description.
   * 
   * @param description
   */
  public final native void setDescription(MediaDescription description) /*-{
    this.setDescription(
      description
    );
  }-*/;

  /**
   * Sets the number of seconds of media.
   * 
   * @param duration
   */
  public final native void setDuration(double duration) /*-{
    this.setDuration(
      duration
    );
  }-*/;

  /**
   * Sets the number of seconds of media.
   * 
   * @param duration
   */
  public final native void setDuration() /*-{
    this.setDuration();
  }-*/;

  /**
   * Sets the specifies if object is a sample or full version.
   * 
   * @param expression
   */
  public final native void setExpression(String expression) /*-{
    this.setExpression(
      expression
    );
  }-*/;

  /**
   * Sets the specifies if object is a sample or full version.
   * 
   * @param expression
   */
  public final native void setExpression() /*-{
    this.setExpression();
  }-*/;

  /**
   * Sets the size of media file in bytes.
   * 
   * @param fileSize
   */
  public final native void setFileSize(double fileSize) /*-{
    this.setFileSize(
      fileSize
    );
  }-*/;

  /**
   * Sets the size of media file in bytes.
   * 
   * @param fileSize
   */
  public final native void setFileSize() /*-{
    this.setFileSize();
  }-*/;

  /**
   * Sets the number of frames per second of media.
   * 
   * @param framerate
   */
  public final native void setFramerate(double framerate) /*-{
    this.setFramerate(
      framerate
    );
  }-*/;

  /**
   * Sets the number of frames per second of media.
   * 
   * @param framerate
   */
  public final native void setFramerate() /*-{
    this.setFramerate();
  }-*/;

  /**
   * Sets the media hash.
   * 
   * @param hash
   */
  public final native void setHash(JavaScriptObject hash) /*-{
    this.setHash(
      hash
    );
  }-*/;

  /**
   * Sets the media hash.
   * 
   * @param hash
   */
  public final native void setHash() /*-{
    this.setHash();
  }-*/;

  /**
   * Sets the media hash.
   * 
   * @param hash
   */
  public final native void setHash(MediaHash hash) /*-{
    this.setHash(
      hash
    );
  }-*/;

  /**
   * Sets the height of the media object.
   * 
   * @param height
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(
      height
    );
  }-*/;

  /**
   * Sets the height of the media object.
   * 
   * @param height
   */
  public final native void setHeight() /*-{
    this.setHeight();
  }-*/;

  /**
   * Sets is this default object for the group.
   * 
   * @param isDefault
   */
  public final native void setIsDefault(boolean isDefault) /*-{
    this.setIsDefault(
      isDefault
    );
  }-*/;

  /**
   * Sets is this default object for the group.
   * 
   * @param isDefault
   */
  public final native void setIsDefault() /*-{
    this.setIsDefault();
  }-*/;

  /**
   * Sets the media keywords.
   * 
   * @param keywords
   */
  public final native void setKeywords(JavaScriptObject keywords) /*-{
    this.setKeywords(
      keywords
    );
  }-*/;

  /**
   * Sets the media keywords.
   * 
   * @param keywords
   */
  public final native void setKeywords() /*-{
    this.setKeywords();
  }-*/;

  /**
   * Sets the media keywords.
   * 
   * @param keywords
   */
  public final native void setKeywords(MediaKeywords keywords) /*-{
    this.setKeywords(
      keywords
    );
  }-*/;

  /**
   * Sets the primary language encapsulated in the media.
   * 
   * @param language
   */
  public final native void setLanguage(String language) /*-{
    this.setLanguage(
      language
    );
  }-*/;

  /**
   * Sets the primary language encapsulated in the media.
   * 
   * @param language
   */
  public final native void setLanguage() /*-{
    this.setLanguage();
  }-*/;

  /**
   * Sets the simple type of object.
   * 
   * @param medium
   */
  public final native void setMedium(String medium) /*-{
    this.setMedium(
      medium
    );
  }-*/;

  /**
   * Sets the simple type of object.
   * 
   * @param medium
   */
  public final native void setMedium() /*-{
    this.setMedium();
  }-*/;

  /**
   * Sets the media player.
   * 
   * @param player
   */
  public final native void setPlayer(JavaScriptObject player) /*-{
    this.setPlayer(
      player
    );
  }-*/;

  /**
   * Sets the media player.
   * 
   * @param player
   */
  public final native void setPlayer() /*-{
    this.setPlayer();
  }-*/;

  /**
   * Sets the media player.
   * 
   * @param player
   */
  public final native void setPlayer(MediaPlayer player) /*-{
    this.setPlayer(
      player
    );
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings
   */
  public final native void setRatings(JavaScriptObject[] ratings) /*-{
    this.setRatings(
      ratings
    );
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings
   */
  public final native void setRatings() /*-{
    this.setRatings();
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings
   */
  public final native void setRatings(MediaRating[] ratings) /*-{
    this.setRatings(
      ratings
    );
  }-*/;

  /**
   * Sets the media restrictions.
   * 
   * @param restrictions
   */
  public final native void setRestrictions(JavaScriptObject[] restrictions) /*-{
    this.setRestrictions(
      restrictions
    );
  }-*/;

  /**
   * Sets the media restrictions.
   * 
   * @param restrictions
   */
  public final native void setRestrictions() /*-{
    this.setRestrictions();
  }-*/;

  /**
   * Sets the media restrictions.
   * 
   * @param restrictions
   */
  public final native void setRestrictions(MediaRestriction[] restrictions) /*-{
    this.setRestrictions(
      restrictions
    );
  }-*/;

  /**
   * Sets the nubmer of samples per second of media.
   * 
   * @param samplingrate
   */
  public final native void setSamplingrate(double samplingrate) /*-{
    this.setSamplingrate(
      samplingrate
    );
  }-*/;

  /**
   * Sets the nubmer of samples per second of media.
   * 
   * @param samplingrate
   */
  public final native void setSamplingrate() /*-{
    this.setSamplingrate();
  }-*/;

  /**
   * Sets the media texts.
   * 
   * @param texts
   */
  public final native void setTexts(JavaScriptObject[] texts) /*-{
    this.setTexts(
      texts
    );
  }-*/;

  /**
   * Sets the media texts.
   * 
   * @param texts
   */
  public final native void setTexts() /*-{
    this.setTexts();
  }-*/;

  /**
   * Sets the media texts.
   * 
   * @param texts
   */
  public final native void setTexts(MediaText[] texts) /*-{
    this.setTexts(
      texts
    );
  }-*/;

  /**
   * Sets the media thumbnails.
   * 
   * @param thumbnails
   */
  public final native void setThumbnails(JavaScriptObject[] thumbnails) /*-{
    this.setThumbnails(
      thumbnails
    );
  }-*/;

  /**
   * Sets the media thumbnails.
   * 
   * @param thumbnails
   */
  public final native void setThumbnails() /*-{
    this.setThumbnails();
  }-*/;

  /**
   * Sets the media thumbnails.
   * 
   * @param thumbnails
   */
  public final native void setThumbnails(MediaThumbnail[] thumbnails) /*-{
    this.setThumbnails(
      thumbnails
    );
  }-*/;

  /**
   * Sets the media title.
   * 
   * @param title
   */
  public final native void setTitle(JavaScriptObject title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the media title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the media title.
   * 
   * @param title
   */
  public final native void setTitle(MediaTitle title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the standard mime type.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the standard mime type.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the direct url to the media object.
   * 
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(
      url
    );
  }-*/;

  /**
   * Sets the direct url to the media object.
   * 
   * @param url
   */
  public final native void setUrl() /*-{
    this.setUrl();
  }-*/;

  /**
   * Sets the width of the media object.
   * 
   * @param width
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(
      width
    );
  }-*/;

  /**
   * Sets the width of the media object.
   * 
   * @param width
   */
  public final native void setWidth() /*-{
    this.setWidth();
  }-*/;

}
