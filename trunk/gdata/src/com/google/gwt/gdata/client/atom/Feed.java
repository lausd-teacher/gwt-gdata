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
public class Feed extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.atom.Feed;
  }-*/;

  /**
   * Constructs a feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Feed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Feed(
      params
    );
  }-*/;

  /**
   * Constructs a feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Feed newInstance() /*-{
    return new $wnd.google.gdata.atom.Feed();
  }-*/;

  protected Feed() { }

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
   * Adds a new entry.
   * 
   * @param entry
   */
  public final native void addEntry(JavaScriptObject entry) /*-{
    this.addEntry(
      entry
    );
  }-*/;

  /**
   * Adds a new entry.
   * 
   * @param entry
   */
  public final native void addEntry(Entry entry) /*-{
    this.addEntry(
      entry
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
   * Returns the contributors.
   * 
   * @return
   */
  public final native Person[] getContributors() /*-{
    return this.getContributors();
  }-*/;

  /**
   * Returns the entries.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Entry[] getEntries() /*-{
    return this.getEntries();
  }-*/;

  /**
   * @return
   */
  public final native JavaScriptObject getEntryClass() /*-{
    return this.getEntryClass();
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
   * Maps deprecated getSubTitle to getSubtitle.
   * 
   * @return
   */
  public final native JavaScriptObject getSubTitle() /*-{
    return this.getSubTitle();
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
   * Sets the entries.
   * 
   * @param entries
   */
  public final native void setEntries(JavaScriptObject[] entries) /*-{
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
   * Sets the entries.
   * 
   * @param entries
   */
  public final native void setEntries(com.google.gwt.gdata.client.atom.Entry[] entries) /*-{
    this.setEntries(
      entries
    );
  }-*/;

  /**
   * Sets the generator.
   * 
   * @param generator
   */
  public final native void setGenerator(JavaScriptObject generator) /*-{
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
   * Sets the feed identifier.
   * 
   * @param id
   */
  public final native void setId(JavaScriptObject id) /*-{
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
   * Sets the logo.
   * 
   * @param logo
   */
  public final native void setLogo(JavaScriptObject logo) /*-{
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
   * Maps deprecated setSubTitle to setSubtitle.
   * 
   * @return
   */
  public final native JavaScriptObject setSubTitle() /*-{
    return this.setSubTitle();
  }-*/;

  /**
   * Sets the subtitle.
   * 
   * @param subtitle
   */
  public final native void setSubtitle(JavaScriptObject subtitle) /*-{
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
