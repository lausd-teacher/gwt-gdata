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

  public void testOther() {
    // Entry obj = Entry.newInstance(JavaScriptObject.createObject());
    // obj.addAuthor(author);
    // obj.addAuthor(author);
    // obj.addCategory(category);
    // obj.addCategory(category);
    // obj.addContributor(contributor);
    // obj.addContributor(contributor);
    // obj.addLink(link);
    // obj.addLink(link);
  }

  public void testProperties() {
    Entry obj = Entry.newInstance(JavaScriptObject.createObject());
    Text summary = Text.newInstance(JavaScriptObject.createObject());
    obj.setSummary(summary);
    assertSame("summary", obj.getSummary(), summary);
    Updated updated = Updated.newInstance(JavaScriptObject.createObject());
    obj.setUpdated(updated);
    assertSame("updated", obj.getUpdated(), updated);
    Person[] contributors = new Person[]{ Person.newInstance(JavaScriptObject.createObject()) };
    obj.setContributors(contributors);
    assertSame("contributors", obj.getContributors(), contributors);
    Id id = Id.newInstance(JavaScriptObject.createObject());
    obj.setId(id);
    assertSame("id", obj.getId(), id);
    Text content = Text.newInstance(JavaScriptObject.createObject());
    obj.setContent(content);
    assertSame("content", obj.getContent(), content);
    Category[] categories = new Category[]{ Category.newInstance(JavaScriptObject.createObject()) };
    obj.setCategories(categories);
    assertSame("categories", obj.getCategories(), categories);
    Person[] authors = new Person[]{ Person.newInstance(JavaScriptObject.createObject()) };
    obj.setAuthors(authors);
    assertSame("authors", obj.getAuthors(), authors);
    Text rights = Text.newInstance(JavaScriptObject.createObject());
    obj.setRights(rights);
    assertSame("rights", obj.getRights(), rights);
    Text title = Text.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    Link[] links = new Link[]{ Link.newInstance(JavaScriptObject.createObject()) };
    obj.setLinks(links);
    assertSame("links", obj.getLinks(), links);
    Published published = Published.newInstance(JavaScriptObject.createObject());
    obj.setPublished(published);
    assertSame("published", obj.getPublished(), published);
  }
}
