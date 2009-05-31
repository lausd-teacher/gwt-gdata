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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the Entry class.
 */
public class EntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Entry.getConstructor());
    assertNotNull("newInstance()", Entry.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    Entry obj = Entry.newInstance(JavaScriptObject.createObject());
    Text summary = Text.newInstance(JavaScriptObject.createObject());
    obj.setSummary(summary);
    assertSame("summary", obj.getSummary(), summary);
    Updated updated = Updated.newInstance(JavaScriptObject.createObject());
    obj.setUpdated(updated);
    assertSame("updated", obj.getUpdated(), updated);
    JsArray<Person> contributors = ArrayHelper.toJsArray(Person.newInstance(JavaScriptObject.createObject()));
    obj.setContributors(contributors);
    assertEquals("contributors", obj.getContributors().length(), contributors.length());
    int lenContributors = obj.getContributors().length();
    obj.addContributor(Person.newInstance(JavaScriptObject.createObject()));
    assertEquals("contributors", obj.getContributors().length(), lenContributors + 1);
    Id id = Id.newInstance(JavaScriptObject.createObject());
    obj.setId(id);
    assertSame("id", obj.getId(), id);
    Text content = Text.newInstance(JavaScriptObject.createObject());
    obj.setContent(content);
    assertSame("content", obj.getContent(), content);
    JsArray<Category> categories = ArrayHelper.toJsArray(Category.newInstance(JavaScriptObject.createObject()));
    obj.setCategories(categories);
    assertEquals("categories", obj.getCategories().length(), categories.length());
    int lenCategories = obj.getCategories().length();
    obj.addCategory(Category.newInstance(JavaScriptObject.createObject()));
    assertEquals("categories", obj.getCategories().length(), lenCategories + 1);
    JsArray<Person> authors = ArrayHelper.toJsArray(Person.newInstance(JavaScriptObject.createObject()));
    obj.setAuthors(authors);
    assertEquals("authors", obj.getAuthors().length(), authors.length());
    int lenAuthors = obj.getAuthors().length();
    obj.addAuthor(Person.newInstance(JavaScriptObject.createObject()));
    assertEquals("authors", obj.getAuthors().length(), lenAuthors + 1);
    Text rights = Text.newInstance(JavaScriptObject.createObject());
    obj.setRights(rights);
    assertSame("rights", obj.getRights(), rights);
    Text title = Text.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    JsArray<Link> links = ArrayHelper.toJsArray(Link.newInstance(JavaScriptObject.createObject()));
    obj.setLinks(links);
    assertEquals("links", obj.getLinks().length(), links.length());
    int lenLinks = obj.getLinks().length();
    obj.addLink(Link.newInstance(JavaScriptObject.createObject()));
    assertEquals("links", obj.getLinks().length(), lenLinks + 1);
    Published published = Published.newInstance(JavaScriptObject.createObject());
    obj.setPublished(published);
    assertSame("published", obj.getPublished(), published);
  }
}
