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
 * Comment unavailable.
 */
public class Entry extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.atom.Entry;
  }-*/;

  /**
   * Constructs an entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Entry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Entry(
      params
    );
  }-*/;

  /**
   * Constructs an entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Entry newInstance() /*-{
    return new $wnd.google.gdata.atom.Entry();
  }-*/;

  protected Entry() { }

  /**
   * Adds a new author.
   * 
   * @param author
   */
  public final native void addAuthor(JavaScriptObject author) /*-{
    this.addAuthor(
      author
    );
  }-*/;

  /**
   * Adds a new author.
   * 
   * @param author
   */
  public final native void addAuthor(Person author) /*-{
    this.addAuthor(
      author
    );
  }-*/;

  /**
   * Adds a new category.
   * 
   * @param category
   */
  public final native void addCategory(JavaScriptObject category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new category.
   * 
   * @param category
   */
  public final native void addCategory(Category category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new contributor.
   * 
   * @param contributor
   */
  public final native void addContributor(JavaScriptObject contributor) /*-{
    this.addContributor(
      contributor
    );
  }-*/;

  /**
   * Adds a new contributor.
   * 
   * @param contributor
   */
  public final native void addContributor(Person contributor) /*-{
    this.addContributor(
      contributor
    );
  }-*/;

  /**
   * Adds a new link.
   * 
   * @param link
   */
  public final native void addLink(JavaScriptObject link) /*-{
    this.addLink(
      link
    );
  }-*/;

  /**
   * Adds a new link.
   * 
   * @param link
   */
  public final native void addLink(Link link) /*-{
    this.addLink(
      link
    );
  }-*/;

  /**
   * Returns the authors.
   * 
   * @return
   */
  public final native Person[] getAuthors() /*-{
    return this.getAuthors();
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return
   */
  public final native Category[] getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getCategoryClass() /*-{
    return this.getCategoryClass();
  }-*/;

  /**
   * Returns the content.
   * 
   * @return
   */
  public final native Text getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the contributors.
   * 
   * @return
   */
  public final native Person[] getContributors() /*-{
    return this.getContributors();
  }-*/;

  /**
   * Returns the entry identifier.
   * 
   * @return
   */
  public final native Id getId() /*-{
    return this.getId();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getLinkClass() /*-{
    return this.getLinkClass();
  }-*/;

  /**
   * Returns the links.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link[] getLinks() /*-{
    return this.getLinks();
  }-*/;

  /**
   * Returns the creation timestamp.
   * 
   * @return
   */
  public final native Published getPublished() /*-{
    return this.getPublished();
  }-*/;

  /**
   * Returns the rights.
   * 
   * @return
   */
  public final native Text getRights() /*-{
    return this.getRights();
  }-*/;

  /**
   * Returns the summary.
   * 
   * @return
   */
  public final native Text getSummary() /*-{
    return this.getSummary();
  }-*/;

  /**
   * Returns the title.
   * 
   * @return
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the updated timestamp.
   * 
   * @return
   */
  public final native Updated getUpdated() /*-{
    return this.getUpdated();
  }-*/;

  /**
   * Sets the authors.
   * 
   * @param authors
   */
  public final native void setAuthors(JavaScriptObject[] authors) /*-{
    this.setAuthors(
      authors
    );
  }-*/;

  /**
   * Sets the authors.
   * 
   * @param authors
   */
  public final native void setAuthors() /*-{
    this.setAuthors();
  }-*/;

  /**
   * Sets the authors.
   * 
   * @param authors
   */
  public final native void setAuthors(Person[] authors) /*-{
    this.setAuthors(
      authors
    );
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories(JavaScriptObject[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories() /*-{
    this.setCategories();
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories(Category[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the content.
   * 
   * @param content
   */
  public final native void setContent(JavaScriptObject content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the content.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the content.
   * 
   * @param content
   */
  public final native void setContent(Text content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors
   */
  public final native void setContributors(JavaScriptObject[] contributors) /*-{
    this.setContributors(
      contributors
    );
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors
   */
  public final native void setContributors() /*-{
    this.setContributors();
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors
   */
  public final native void setContributors(Person[] contributors) /*-{
    this.setContributors(
      contributors
    );
  }-*/;

  /**
   * Sets the entry identifier.
   * 
   * @param id
   */
  public final native void setId(JavaScriptObject id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets the entry identifier.
   * 
   * @param id
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets the entry identifier.
   * 
   * @param id
   */
  public final native void setId(Id id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links
   */
  public final native void setLinks(JavaScriptObject[] links) /*-{
    this.setLinks(
      links
    );
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links
   */
  public final native void setLinks() /*-{
    this.setLinks();
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links
   */
  public final native void setLinks(com.google.gwt.gdata.client.atom.Link[] links) /*-{
    this.setLinks(
      links
    );
  }-*/;

  /**
   * Sets the creation timestamp.
   * 
   * @param published
   */
  public final native void setPublished(JavaScriptObject published) /*-{
    this.setPublished(
      published
    );
  }-*/;

  /**
   * Sets the creation timestamp.
   * 
   * @param published
   */
  public final native void setPublished() /*-{
    this.setPublished();
  }-*/;

  /**
   * Sets the creation timestamp.
   * 
   * @param published
   */
  public final native void setPublished(Published published) /*-{
    this.setPublished(
      published
    );
  }-*/;

  /**
   * Sets the rights.
   * 
   * @param rights
   */
  public final native void setRights(JavaScriptObject rights) /*-{
    this.setRights(
      rights
    );
  }-*/;

  /**
   * Sets the rights.
   * 
   * @param rights
   */
  public final native void setRights() /*-{
    this.setRights();
  }-*/;

  /**
   * Sets the rights.
   * 
   * @param rights
   */
  public final native void setRights(Text rights) /*-{
    this.setRights(
      rights
    );
  }-*/;

  /**
   * Sets the summary.
   * 
   * @param summary
   */
  public final native void setSummary(JavaScriptObject summary) /*-{
    this.setSummary(
      summary
    );
  }-*/;

  /**
   * Sets the summary.
   * 
   * @param summary
   */
  public final native void setSummary() /*-{
    this.setSummary();
  }-*/;

  /**
   * Sets the summary.
   * 
   * @param summary
   */
  public final native void setSummary(Text summary) /*-{
    this.setSummary(
      summary
    );
  }-*/;

  /**
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle(JavaScriptObject title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the updated timestamp.
   * 
   * @param updated
   */
  public final native void setUpdated(JavaScriptObject updated) /*-{
    this.setUpdated(
      updated
    );
  }-*/;

  /**
   * Sets the updated timestamp.
   * 
   * @param updated
   */
  public final native void setUpdated() /*-{
    this.setUpdated();
  }-*/;

  /**
   * Sets the updated timestamp.
   * 
   * @param updated
   */
  public final native void setUpdated(Updated updated) /*-{
    this.setUpdated(
      updated
    );
  }-*/;

}
