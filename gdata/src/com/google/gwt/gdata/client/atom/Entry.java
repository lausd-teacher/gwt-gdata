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
 * Describes the base class for a GData entry.
 */
public class Entry extends JavaScriptObject {

  /**
   * Constructs an entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, contributors, id, links, published, rights, summary, title, and updated.
   */
  public static native Entry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Entry(
      params
    );
  }-*/;

  protected Entry() { }

  /**
   * Adds a new author.
   * 
   * @param author Author to add, or object to use as a parameter to the google.gdata.atom.Person constructor.
   */
  public final native void addAuthor(Person author) /*-{
    this.addAuthor(
      author
    );
  }-*/;

  /**
   * Adds a new category.
   * 
   * @param category Category to add, or object to use as a parameter to the google.gdata.atom.Category constructor.
   */
  public final native void addCategory(Category category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new contributor.
   * 
   * @param contributor Contributor to add, or object to use as a parameter to the google.gdata.atom.Person constructor.
   */
  public final native void addContributor(Person contributor) /*-{
    this.addContributor(
      contributor
    );
  }-*/;

  /**
   * Adds a new link.
   * 
   * @param link Link to add, or object to use as a parameter to the google.gdata.atom.Link constructor.
   */
  public final native void addLink(Link link) /*-{
    this.addLink(
      link
    );
  }-*/;

  /**
   * Returns the authors.
   * 
   * @return Authors.
   */
  public final native JsArray<Person> getAuthors() /*-{
    return this.getAuthors();
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return Categories.
   */
  public final native JsArray<Category> getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * Returns the content. This element is optional.
   * 
   * @return Content or undefined for none.
   */
  public final native Text getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the contributors.
   * 
   * @return Contributors.
   */
  public final native JsArray<Person> getContributors() /*-{
    return this.getContributors();
  }-*/;

  /**
   * Returns the entry identifier. This element is required.
   * 
   * @return Entry identifier or undefined for none.
   */
  public final native Id getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns the links.
   * 
   * @return Links.
   */
  public final native JsArray<com.google.gwt.gdata.client.atom.Link> getLinks() /*-{
    return this.getLinks();
  }-*/;

  /**
   * Returns the creation timestamp. This element is optional.
   * 
   * @return Creation timestamp or undefined for none.
   */
  public final native Published getPublished() /*-{
    return this.getPublished();
  }-*/;

  /**
   * Returns the rights. This element is optional.
   * 
   * @return Rights or undefined for none.
   */
  public final native Text getRights() /*-{
    return this.getRights();
  }-*/;

  /**
   * Returns the summary. This element is optional.
   * 
   * @return Summary or undefined for none.
   */
  public final native Text getSummary() /*-{
    return this.getSummary();
  }-*/;

  /**
   * Returns the title. This element is required.
   * 
   * @return Title or undefined for none.
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the updated timestamp. This element is required.
   * 
   * @return Updated timestamp or undefined for none.
   */
  public final native Updated getUpdated() /*-{
    return this.getUpdated();
  }-*/;

  /**
   * Sets the authors.
   */
  public final native void setAuthors() /*-{
    this.setAuthors();
  }-*/;

  /**
   * Sets the authors.
   * 
   * @param authors Authors, where each author is added using the addAuthor() function, or undefined to clear the authors.
   */
  public final native void setAuthors(JsArray<Person> authors) /*-{
    this.setAuthors(
      authors
    );
  }-*/;

  /**
   * Sets the categories.
   */
  public final native void setCategories() /*-{
    this.setCategories();
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories Categories, where each category is added using the addCategory() function, or undefined to clear the categories.
   */
  public final native void setCategories(JsArray<Category> categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the content. This element is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the content. This element is optional.
   * 
   * @param content Content, or object to use as a parameter to the google.gdata.atom.Text constructor, or undefined for none.
   */
  public final native void setContent(Text content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the contributors.
   */
  public final native void setContributors() /*-{
    this.setContributors();
  }-*/;

  /**
   * Sets the contributors.
   * 
   * @param contributors Contributors, where each contributor is added using the addContributor() function, or undefined to clear the contributors.
   */
  public final native void setContributors(JsArray<Person> contributors) /*-{
    this.setContributors(
      contributors
    );
  }-*/;

  /**
   * Sets the entry identifier. This element is required.
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets the entry identifier. This element is required.
   * 
   * @param id Entry identifier, or object to use as a parameter to the google.gdata.atom.Id constructor, or undefined for none.
   */
  public final native void setId(Id id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets the links.
   */
  public final native void setLinks() /*-{
    this.setLinks();
  }-*/;

  /**
   * Sets the links.
   * 
   * @param links Links, where each link is added using the addLink() function, or undefined to clear the links.
   */
  public final native void setLinks(JsArray<Link> links) /*-{
    this.setLinks(
      links
    );
  }-*/;

  /**
   * Sets the creation timestamp. This element is optional.
   */
  public final native void setPublished() /*-{
    this.setPublished();
  }-*/;

  /**
   * Sets the creation timestamp. This element is optional.
   * 
   * @param published Creation timestamp, or object to use as a parameter to the google.gdata.atom.Published constructor, or undefined for none.
   */
  public final native void setPublished(Published published) /*-{
    this.setPublished(
      published
    );
  }-*/;

  /**
   * Sets the rights. This element is optional.
   */
  public final native void setRights() /*-{
    this.setRights();
  }-*/;

  /**
   * Sets the rights. This element is optional.
   * 
   * @param rights Rights, or object to use as a parameter to the google.gdata.atom.Text constructor, or undefined for none.
   */
  public final native void setRights(Text rights) /*-{
    this.setRights(
      rights
    );
  }-*/;

  /**
   * Sets the summary. This element is optional.
   */
  public final native void setSummary() /*-{
    this.setSummary();
  }-*/;

  /**
   * Sets the summary. This element is optional.
   * 
   * @param summary Summary, or object to use as a parameter to the google.gdata.atom.Text constructor, or undefined for none.
   */
  public final native void setSummary(Text summary) /*-{
    this.setSummary(
      summary
    );
  }-*/;

  /**
   * Sets the title. This element is required.
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the title. This element is required.
   * 
   * @param title Title, or object to use as a parameter to the google.gdata.atom.Text constructor, or undefined for none.
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the updated timestamp. This element is required.
   */
  public final native void setUpdated() /*-{
    this.setUpdated();
  }-*/;

  /**
   * Sets the updated timestamp. This element is required.
   * 
   * @param updated Updated timestamp, or object to use as a parameter to the google.gdata.atom.Updated constructor, or undefined for none.
   */
  public final native void setUpdated(Updated updated) /*-{
    this.setUpdated(
      updated
    );
  }-*/;

}
