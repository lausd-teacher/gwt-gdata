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
import com.google.gwt.core.client.JsArray;

/**
 * Comment unavailable.
 */
public class MediaGroup extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.mediarss.MediaGroup;
  }-*/;

  /**
   * Constructs a media group using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaGroup newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaGroup(
      params
    );
  }-*/;

  /**
   * Constructs a media group using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaGroup newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaGroup();
  }-*/;

  protected MediaGroup() { }

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
   * Adds a new media content.
   * 
   * @param content
   */
  public final native void addContent(MediaContent content) /*-{
    this.addContent(
      content
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
  public final native void addThumbnail(MediaThumbnail thumbnail) /*-{
    this.addThumbnail(
      thumbnail
    );
  }-*/;

  /**
   * Returns the media categories.
   * 
   * @return
   */
  public final native JsArray<MediaCategory> getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * Returns the media contents.
   * 
   * @return
   */
  public final native JsArray<MediaContent> getContents() /*-{
    return this.getContents();
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
  public final native JsArray<MediaCredit> getCredits() /*-{
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
   * Returns the media hash.
   * 
   * @return
   */
  public final native MediaHash getHash() /*-{
    return this.getHash();
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
  public final native JsArray<MediaRating> getRatings() /*-{
    return this.getRatings();
  }-*/;

  /**
   * Returns the media restrictions.
   * 
   * @return
   */
  public final native JsArray<MediaRestriction> getRestrictions() /*-{
    return this.getRestrictions();
  }-*/;

  /**
   * Returns the media texts.
   * 
   * @return
   */
  public final native JsArray<MediaText> getTexts() /*-{
    return this.getTexts();
  }-*/;

  /**
   * Returns the media thumbnails.
   * 
   * @return
   */
  public final native JsArray<MediaThumbnail> getThumbnails() /*-{
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
   * Sets the media categories.
   * 
   * @param categories
   */
  public final native void setCategories(JsArray<MediaCategory> categories) /*-{
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
   * Sets the media contents.
   * 
   * @param contents
   */
  public final native void setContents(JsArray<MediaContent> contents) /*-{
    this.setContents(
      contents
    );
  }-*/;

  /**
   * Sets the media contents.
   * 
   * @param contents
   */
  public final native void setContents() /*-{
    this.setContents();
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
   * Sets the media copyright.
   * 
   * @param copyright
   */
  public final native void setCopyright() /*-{
    this.setCopyright();
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits
   */
  public final native void setCredits(JsArray<MediaCredit> credits) /*-{
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
   * Sets the media description.
   * 
   * @param description
   */
  public final native void setDescription() /*-{
    this.setDescription();
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
   * Sets the media hash.
   * 
   * @param hash
   */
  public final native void setHash() /*-{
    this.setHash();
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
   * Sets the media keywords.
   * 
   * @param keywords
   */
  public final native void setKeywords() /*-{
    this.setKeywords();
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
   * Sets the media player.
   * 
   * @param player
   */
  public final native void setPlayer() /*-{
    this.setPlayer();
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings
   */
  public final native void setRatings(JsArray<MediaRating> ratings) /*-{
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
   * Sets the media restrictions.
   * 
   * @param restrictions
   */
  public final native void setRestrictions(JsArray<MediaRestriction> restrictions) /*-{
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
   * Sets the media texts.
   * 
   * @param texts
   */
  public final native void setTexts(JsArray<MediaText> texts) /*-{
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
   * Sets the media thumbnails.
   * 
   * @param thumbnails
   */
  public final native void setThumbnails(JsArray<MediaThumbnail> thumbnails) /*-{
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
   * Sets the media title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

}
