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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes the base class for a GData entry.
 */
public class Entry extends JavaScriptObject {

  /**
   * Constructs an entry.
   * @return An Entry object.
   */
  public static native Entry newInstance() /*-{
    return new $wnd.google.gdata.atom.Entry();
  }-*/;

  protected Entry() { }

  /**
   * Adds a new author.
   * 
   * @param author Author to add.
   */
  public final native void addAuthor(Person author) /*-{
    this.addAuthor(author);
  }-*/;

  /**
   * Adds a new category.
   * 
   * @param category Category to add.
   */
  public final native void addCategory(Category category) /*-{
    this.addCategory(category);
  }-*/;

  /**
   * Adds a new contributor.
   * 
   * @param contributor Contributor to add.
   */
  public final native void addContributor(Person contributor) /*-{
    this.addContributor(contributor);
  }-*/;

  /**
   * Adds a new link.
   * 
   * @param link Link to add.
   */
  public final native void addLink(Link link) /*-{
    this.addLink(link);
  }-*/;

  /**
   * Returns the authors.
   * 
   * @return Authors.
   */
  public final native Person[] getAuthors() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getAuthors());
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return Categories.
   */
  public final native Category[] getCategories() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCategories());
  }-*/;

  /**
   * Returns the content. This element is optional.
   * 
   * @return Content.
   */
  public final native Text getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the contributors.
   * 
   * @return Contributors.
   */
  public final native Person[] getContributors() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getContributors());
  }-*/;

  /**
   * Returns the entry identifier. This element is required.
   * 
   * @return Entry identifier.
   */
  public final native Id getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns the links.
   * 
   * @return Links.
   */
  public final native com.google.gwt.gdata.client.atom.Link[] getLinks() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getLinks());
  }-*/;

  /**
   * Returns the creation timestamp. This element is optional.
   * 
   * @return Creation timestamp.
   */
  public final native Published getPublished() /*-{
    return this.getPublished();
  }-*/;

  /**
   * Returns the rights. This element is optional.
   * 
   * @return Rights.
   */
  public final native Text getRights() /*-{
    return this.getRights();
  }-*/;

  /**
   * Returns the summary. This element is optional.
   * 
   * @return Summary.
   */
  public final native Text getSummary() /*-{
    return this.getSummary();
  }-*/;

  /**
   * Returns the title. This element is required.
   * 
   * @return Title.
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the updated timestamp. This element is required.
   * 
   * @return Updated timestamp.
   */
  public final native Updated getUpdated() /*-{
    return this.getUpdated();
  }-*/;

  /**
   * Sets the authors.
   * 
   * @param authors Authors, where each author is added using addAuthor().
   */
  public final native void setAuthors(Person[] authors) /*-{
    this.setAuthors(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(authors)
    );
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories Categories, where each category is added using addCategory().
   */
  public final native void setCategories(Category[] categories) /*-{
    this.setCategories(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(categories)
    );
  }-*/;

  /**
   * Sets the content. This element is optional.
   * 
   * @param content Content.
   */
  public final native void setContent(Text content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors Contributors, where each contributor is added using addContributor().
   */
  public final native void setContributors(Person[] contributors) /*-{
    this.setContributors(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(contributors)
    );
  }-*/;

  /**
   * Sets the entry identifier. This element is required.
   * 
   * @param id Entry identifier.
   */
  public final native void setId(Id id) /*-{
    this.setId(id);
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links Links, where each link is added using addLink().
   */
  public final native void setLinks(Link[] links) /*-{
    this.setLinks(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(links)
    );
  }-*/;

  /**
   * Sets the creation timestamp. This element is optional.
   * 
   * @param published Creation timestamp.
   */
  public final native void setPublished(Published published) /*-{
    this.setPublished(published);
  }-*/;

  /**
   * Sets the rights. This element is optional.
   * 
   * @param rights Rights.
   */
  public final native void setRights(Text rights) /*-{
    this.setRights(rights);
  }-*/;

  /**
   * Sets the summary. This element is optional.
   * 
   * @param summary Summary.
   */
  public final native void setSummary(Text summary) /*-{
    this.setSummary(summary);
  }-*/;

  /**
   * Sets the title. This element is required.
   * 
   * @param title Title.
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(title);
  }-*/;

  /**
   * Sets the updated timestamp. This element is required.
   * 
   * @param updated Updated timestamp.
   */
  public final native void setUpdated(Updated updated) /*-{
    this.setUpdated(updated);
  }-*/;

}
