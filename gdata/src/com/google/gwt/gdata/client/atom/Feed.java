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
 * @param <E> The entry type for this feed.
 */
public class Feed<E extends Entry> extends JavaScriptObject {

  /**
   * Constructs a feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native <E extends Entry> Feed<E> newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Feed(
      params
    );
  }-*/;

  /**
   * Constructs a feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native <E extends Entry> Feed<E> newInstance() /*-{
    return new $wnd.google.gdata.atom.Feed();
  }-*/;

  protected Feed() { }

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
   * Adds a new entry.
   * 
   * @param entry
   */
  public final native void addEntry(E entry) /*-{
    this.addEntry(
      entry
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
   * Returns the base.
   * 
   * @return
   */
  public final native String getBase() /*-{
    return this.getBase();
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
   * Returns the contributors.
   * 
   * @return
   */
  public final native JsArray<Person> getContributors() /*-{
    return this.getContributors();
  }-*/;

  /**
   * Returns the entries.
   * 
   * @return
   */
  public final native JsArray<E> getEntries() /*-{
    return this.getEntries();
  }-*/;

  /**
   * Returns the generator.
   * 
   * @return
   */
  public final native Generator getGenerator() /*-{
    return this.getGenerator();
  }-*/;

  /**
   * Returns the feed identifier.
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
   * Returns the logo.
   * 
   * @return
   */
  public final native Logo getLogo() /*-{
    return this.getLogo();
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
   * Returns the subtitle.
   * 
   * @return
   */
  public final native Text getSubtitle() /*-{
    return this.getSubtitle();
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
   * Sets the base.
   * 
   * @param base
   */
  public final native void setBase(String base) /*-{
    this.setBase(
      base
    );
  }-*/;

  /**
   * Sets the base.
   * 
   * @param base
   */
  public final native void setBase() /*-{
    this.setBase();
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
   * Sets the entries.
   * 
   * @param entries
   */
  public final native void setEntries(JsArray<E> entries) /*-{
    this.setEntries(
      entries
    );
  }-*/;

  /**
   * Sets the entries.
   * 
   * @param entries
   */
  public final native void setEntries() /*-{
    this.setEntries();
  }-*/;

  /**
   * Sets the generator.
   * 
   * @param generator
   */
  public final native void setGenerator(Generator generator) /*-{
    this.setGenerator(
      generator
    );
  }-*/;

  /**
   * Sets the generator.
   * 
   * @param generator
   */
  public final native void setGenerator() /*-{
    this.setGenerator();
  }-*/;

  /**
   * Sets the feed identifier.
   * 
   * @param id
   */
  public final native void setId(Id id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets the feed identifier.
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
   * Sets the logo.
   * 
   * @param logo
   */
  public final native void setLogo(Logo logo) /*-{
    this.setLogo(
      logo
    );
  }-*/;

  /**
   * Sets the logo.
   * 
   * @param logo
   */
  public final native void setLogo() /*-{
    this.setLogo();
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
   * Sets the subtitle.
   * 
   * @param subtitle
   */
  public final native void setSubtitle(Text subtitle) /*-{
    this.setSubtitle(
      subtitle
    );
  }-*/;

  /**
   * Sets the subtitle.
   * 
   * @param subtitle
   */
  public final native void setSubtitle() /*-{
    this.setSubtitle();
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
