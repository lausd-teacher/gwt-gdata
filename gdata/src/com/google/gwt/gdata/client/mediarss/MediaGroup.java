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
 * Describes a media group.
 */
public class MediaGroup extends JavaScriptObject {

  /**
   * Constructs a media group using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, contents, copyright, credits, description, hash, keywords, player, ratings, restrictions, texts, thumbnails, and title.
   */
  public static native MediaGroup newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaGroup(
      params
    );
  }-*/;

  protected MediaGroup() { }

  /**
   * Adds a new media category.
   * 
   * @param category Media category to add, or object to use as a parameter to the google.gdata.mediarss.MediaCategory constructor.
   */
  public final native void addCategory(MediaCategory category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new media content.
   * 
   * @param content Media content to add, or object to use as a parameter to the google.gdata.mediarss.MediaContent constructor.
   */
  public final native void addContent(MediaContent content) /*-{
    this.addContent(
      content
    );
  }-*/;

  /**
   * Adds a new media credit.
   * 
   * @param credit Media credit to add, or object to use as a parameter to the google.gdata.mediarss.MediaCredit constructor.
   */
  public final native void addCredit(MediaCredit credit) /*-{
    this.addCredit(
      credit
    );
  }-*/;

  /**
   * Adds a new media rating.
   * 
   * @param rating Media rating to add, or object to use as a parameter to the google.gdata.mediarss.MediaRating constructor.
   */
  public final native void addRating(MediaRating rating) /*-{
    this.addRating(
      rating
    );
  }-*/;

  /**
   * Adds a new media restriction.
   * 
   * @param restriction Media restriction to add, or object to use as a parameter to the google.gdata.mediarss.MediaRestriction constructor.
   */
  public final native void addRestriction(MediaRestriction restriction) /*-{
    this.addRestriction(
      restriction
    );
  }-*/;

  /**
   * Adds a new media text.
   * 
   * @param text Media text to add, or object to use as a parameter to the google.gdata.mediarss.MediaText constructor.
   */
  public final native void addText(MediaText text) /*-{
    this.addText(
      text
    );
  }-*/;

  /**
   * Adds a new media thumbnail.
   * 
   * @param thumbnail Media thumbnail to add, or object to use as a parameter to the google.gdata.mediarss.MediaThumbnail constructor.
   */
  public final native void addThumbnail(MediaThumbnail thumbnail) /*-{
    this.addThumbnail(
      thumbnail
    );
  }-*/;

  /**
   * Returns the media categories.
   * 
   * @return Media categories.
   */
  public final native JsArray<MediaCategory> getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * Returns the media contents.
   * 
   * @return Media contents.
   */
  public final native JsArray<MediaContent> getContents() /*-{
    return this.getContents();
  }-*/;

  /**
   * Returns the media copyright. This element is optional.
   * 
   * @return Media copyright or undefined for none.
   */
  public final native MediaCopyright getCopyright() /*-{
    return this.getCopyright();
  }-*/;

  /**
   * Returns the media credits.
   * 
   * @return Media credits.
   */
  public final native JsArray<MediaCredit> getCredits() /*-{
    return this.getCredits();
  }-*/;

  /**
   * Returns the media description. This element is optional.
   * 
   * @return Media description or undefined for none.
   */
  public final native MediaDescription getDescription() /*-{
    return this.getDescription();
  }-*/;

  /**
   * Returns the media hash. This element is optional.
   * 
   * @return Media hash or undefined for none.
   */
  public final native MediaHash getHash() /*-{
    return this.getHash();
  }-*/;

  /**
   * Returns the media keywords. This element is optional.
   * 
   * @return Media keywords or undefined for none.
   */
  public final native MediaKeywords getKeywords() /*-{
    return this.getKeywords();
  }-*/;

  /**
   * Returns the media player. This element is optional.
   * 
   * @return Media player or undefined for none.
   */
  public final native MediaPlayer getPlayer() /*-{
    return this.getPlayer();
  }-*/;

  /**
   * Returns the media ratings.
   * 
   * @return Media ratings.
   */
  public final native JsArray<MediaRating> getRatings() /*-{
    return this.getRatings();
  }-*/;

  /**
   * Returns the media restrictions.
   * 
   * @return Media restrictions.
   */
  public final native JsArray<MediaRestriction> getRestrictions() /*-{
    return this.getRestrictions();
  }-*/;

  /**
   * Returns the media texts.
   * 
   * @return Media texts.
   */
  public final native JsArray<MediaText> getTexts() /*-{
    return this.getTexts();
  }-*/;

  /**
   * Returns the media thumbnails.
   * 
   * @return Media thumbnails.
   */
  public final native JsArray<MediaThumbnail> getThumbnails() /*-{
    return this.getThumbnails();
  }-*/;

  /**
   * Returns the media title. This element is optional.
   * 
   * @return Media title or undefined for none.
   */
  public final native MediaTitle getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Sets the media categories.
   */
  public final native void setCategories() /*-{
    this.setCategories();
  }-*/;

  /**
   * Sets the media categories.
   * 
   * @param categories Media categories, where each media category is added using the addCategory() function, or undefined to clear the media categories.
   */
  public final native void setCategories(JsArray<MediaCategory> categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the media contents.
   */
  public final native void setContents() /*-{
    this.setContents();
  }-*/;

  /**
   * Sets the media contents.
   * 
   * @param contents Media contents, where each media content is added using the addContent() function, or undefined to clear the media contents.
   */
  public final native void setContents(JsArray<MediaContent> contents) /*-{
    this.setContents(
      contents
    );
  }-*/;

  /**
   * Sets the media copyright. This element is optional.
   */
  public final native void setCopyright() /*-{
    this.setCopyright();
  }-*/;

  /**
   * Sets the media copyright. This element is optional.
   * 
   * @param copyright Media copyright, or object to use as a parameter to the google.gdata.mediarss.MediaCopyright constructor, or undefined for none.
   */
  public final native void setCopyright(MediaCopyright copyright) /*-{
    this.setCopyright(
      copyright
    );
  }-*/;

  /**
   * Sets the media credits.
   */
  public final native void setCredits() /*-{
    this.setCredits();
  }-*/;

  /**
   * Sets the media credits.
   * 
   * @param credits Media credits, where each media credit is added using the addCredit() function, or undefined to clear the media credits.
   */
  public final native void setCredits(JsArray<MediaCredit> credits) /*-{
    this.setCredits(
      credits
    );
  }-*/;

  /**
   * Sets the media description. This element is optional.
   */
  public final native void setDescription() /*-{
    this.setDescription();
  }-*/;

  /**
   * Sets the media description. This element is optional.
   * 
   * @param description Media description, or object to use as a parameter to the google.gdata.mediarss.MediaDescription constructor, or undefined for none.
   */
  public final native void setDescription(MediaDescription description) /*-{
    this.setDescription(
      description
    );
  }-*/;

  /**
   * Sets the media hash. This element is optional.
   */
  public final native void setHash() /*-{
    this.setHash();
  }-*/;

  /**
   * Sets the media hash. This element is optional.
   * 
   * @param hash Media hash, or object to use as a parameter to the google.gdata.mediarss.MediaHash constructor, or undefined for none.
   */
  public final native void setHash(MediaHash hash) /*-{
    this.setHash(
      hash
    );
  }-*/;

  /**
   * Sets the media keywords. This element is optional.
   */
  public final native void setKeywords() /*-{
    this.setKeywords();
  }-*/;

  /**
   * Sets the media keywords. This element is optional.
   * 
   * @param keywords Media keywords, or object to use as a parameter to the google.gdata.mediarss.MediaKeywords constructor, or undefined for none.
   */
  public final native void setKeywords(MediaKeywords keywords) /*-{
    this.setKeywords(
      keywords
    );
  }-*/;

  /**
   * Sets the media player. This element is optional.
   */
  public final native void setPlayer() /*-{
    this.setPlayer();
  }-*/;

  /**
   * Sets the media player. This element is optional.
   * 
   * @param player Media player, or object to use as a parameter to the google.gdata.mediarss.MediaPlayer constructor, or undefined for none.
   */
  public final native void setPlayer(MediaPlayer player) /*-{
    this.setPlayer(
      player
    );
  }-*/;

  /**
   * Sets the media ratings.
   */
  public final native void setRatings() /*-{
    this.setRatings();
  }-*/;

  /**
   * Sets the media ratings.
   * 
   * @param ratings Media ratings, where each media rating is added using the addRating() function, or undefined to clear the media ratings.
   */
  public final native void setRatings(JsArray<MediaRating> ratings) /*-{
    this.setRatings(
      ratings
    );
  }-*/;

  /**
   * Sets the media restrictions.
   */
  public final native void setRestrictions() /*-{
    this.setRestrictions();
  }-*/;

  /**
   * Sets the media restrictions.
   * 
   * @param restrictions Media restrictions, where each media restriction is added using the addRestriction() function, or undefined to clear the media restrictions.
   */
  public final native void setRestrictions(JsArray<MediaRestriction> restrictions) /*-{
    this.setRestrictions(
      restrictions
    );
  }-*/;

  /**
   * Sets the media texts.
   */
  public final native void setTexts() /*-{
    this.setTexts();
  }-*/;

  /**
   * Sets the media texts.
   * 
   * @param texts Media texts, where each media text is added using the addText() function, or undefined to clear the media texts.
   */
  public final native void setTexts(JsArray<MediaText> texts) /*-{
    this.setTexts(
      texts
    );
  }-*/;

  /**
   * Sets the media thumbnails.
   */
  public final native void setThumbnails() /*-{
    this.setThumbnails();
  }-*/;

  /**
   * Sets the media thumbnails.
   * 
   * @param thumbnails Media thumbnails, where each media thumbnail is added using the addThumbnail() function, or undefined to clear the media thumbnails.
   */
  public final native void setThumbnails(JsArray<MediaThumbnail> thumbnails) /*-{
    this.setThumbnails(
      thumbnails
    );
  }-*/;

  /**
   * Sets the media title. This element is optional.
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the media title. This element is optional.
   * 
   * @param title Media title, or object to use as a parameter to the google.gdata.mediarss.MediaTitle constructor, or undefined for none.
   */
  public final native void setTitle(MediaTitle title) /*-{
    this.setTitle(
      title
    );
  }-*/;

}
