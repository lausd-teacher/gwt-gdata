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
import com.google.gwt.core.client.JsArray;

/**
 * Comment unavailable.
 */
public class Entry extends JavaScriptObject {

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
  public final native JsArray<Person> getAuthors() /*-{
    return this.getAuthors();
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return
   */
  public final native JsArray<Category> getCategories() /*-{
    return this.getCategories();
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
  public final native JsArray<Person> getContributors() /*-{
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
   * Returns the links.
   * 
   * @return
   */
  public final native JsArray<com.google.gwt.gdata.client.atom.Link> getLinks() /*-{
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
  public final native void setAuthors(JsArray<Person> authors) /*-{
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
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories(JsArray<Category> categories) /*-{
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
   * Sets the content.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors
   */
  public final native void setContributors(JsArray<Person> contributors) /*-{
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
   * Sets the entry identifier.
   * 
   * @param id
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links
   */
  public final native void setLinks(JsArray<Link> links) /*-{
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
   * Sets the creation timestamp.
   * 
   * @param published
   */
  public final native void setPublished() /*-{
    this.setPublished();
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
   * Sets the rights.
   * 
   * @param rights
   */
  public final native void setRights() /*-{
    this.setRights();
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
   * Sets the summary.
   * 
   * @param summary
   */
  public final native void setSummary() /*-{
    this.setSummary();
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
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
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

  /**
   * Sets the updated timestamp.
   * 
   * @param updated
   */
  public final native void setUpdated() /*-{
    this.setUpdated();
  }-*/;

}
