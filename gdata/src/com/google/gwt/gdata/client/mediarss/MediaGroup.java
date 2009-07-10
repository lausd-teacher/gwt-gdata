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
 * Describes a media group.
 * @return A MediaGroup object.
 */
public class MediaGroup extends JavaScriptObject {

  /**
   * Constructs a media group.
   */
  public static native MediaGroup newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaGroup();
  }-*/;

  protected MediaGroup() { }

  /**
   * Adds a new media category.
   * 
   * @param category Media category to add.
   */
  public final native void addCategory(MediaCategory category) /*-{
    this.addCategory(category);
  }-*/;

  /**
   * Adds a new media content.
   * 
   * @param content Media content to add.
   */
  public final native void addContent(MediaContent content) /*-{
    this.addContent(content);
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
   * Returns the media categories.
   * 
   * @return Media categories.
   */
  public final native MediaCategory[] getCategories() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCategories());
  }-*/;

  /**
   * Returns the media contents.
   * 
   * @return Media contents.
   */
  public final native MediaContent[] getContents() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getContents());
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
   * Returns the media hash. This element is optional.
   * 
   * @return Media hash.
   */
  public final native MediaHash getHash() /*-{
    return this.getHash();
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
   * Sets the media categories.
   * 
   * @param categories Media categories.
   */
  public final native void setCategories(MediaCategory[] categories) /*-{
    this.setCategories(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(categories)
    );
  }-*/;

  /**
   * Sets the media contents.
   * 
   * @param contents Media contents, where each media content is added using addContent().
   */
  public final native void setContents(MediaContent[] contents) /*-{
    this.setContents(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(contents)
    );
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
   * Sets the media hash. This element is optional.
   * 
   * @param hash Media hash.
   */
  public final native void setHash(MediaHash hash) /*-{
    this.setHash(hash);
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

}