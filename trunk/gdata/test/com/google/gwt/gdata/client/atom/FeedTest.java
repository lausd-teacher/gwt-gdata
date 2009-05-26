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
 * Tests for the Feed class.
 */
public class FeedTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", Feed.getConstructor());
    assertNotNull("newInstance()", Feed.newInstance(JavaScriptObject.createObject()));
  }

  public void testOther() {
    // Feed obj = Feed.newInstance(JavaScriptObject.createObject());
    // obj.addAuthor(author);
    // obj.addAuthor(author);
    // obj.addCategory(category);
    // obj.addCategory(category);
    // obj.addContributor(contributor);
    // obj.addContributor(contributor);
    // obj.addEntry(entry);
    // obj.addEntry(entry);
    // obj.addLink(link);
    // obj.addLink(link);
  }

  public void testProperties() {
    Feed obj = Feed.newInstance(JavaScriptObject.createObject());
    Updated updated = Updated.newInstance(JavaScriptObject.createObject());
    obj.setUpdated(updated);
    assertSame("updated", obj.getUpdated(), updated);
    Person[] contributors = new Person[]{ Person.newInstance(JavaScriptObject.createObject()) };
    obj.setContributors(contributors);
    assertSame("contributors", obj.getContributors(), contributors);
    Entry[] entries = new Entry[]{ Entry.newInstance(JavaScriptObject.createObject()) };
    obj.setEntries(entries);
    assertSame("entries", obj.getEntries(), entries);
    Id id = Id.newInstance(JavaScriptObject.createObject());
    obj.setId(id);
    assertSame("id", obj.getId(), id);
    Category[] categories = new Category[]{ Category.newInstance(JavaScriptObject.createObject()) };
    obj.setCategories(categories);
    assertSame("categories", obj.getCategories(), categories);
    Person[] authors = new Person[]{ Person.newInstance(JavaScriptObject.createObject()) };
    obj.setAuthors(authors);
    assertSame("authors", obj.getAuthors(), authors);
    Text rights = Text.newInstance(JavaScriptObject.createObject());
    obj.setRights(rights);
    assertSame("rights", obj.getRights(), rights);
    String base = "myValue";
    obj.setBase(base);
    assertEquals("base", obj.getBase(), base);
    Text subtitle = Text.newInstance(JavaScriptObject.createObject());
    obj.setSubtitle(subtitle);
    assertSame("subtitle", obj.getSubtitle(), subtitle);
    Text title = Text.newInstance(JavaScriptObject.createObject());
    obj.setTitle(title);
    assertSame("title", obj.getTitle(), title);
    Logo logo = Logo.newInstance(JavaScriptObject.createObject());
    obj.setLogo(logo);
    assertSame("logo", obj.getLogo(), logo);
    Link[] links = new Link[]{ Link.newInstance(JavaScriptObject.createObject()) };
    obj.setLinks(links);
    assertSame("links", obj.getLinks(), links);
    Generator generator = Generator.newInstance(JavaScriptObject.createObject());
    obj.setGenerator(generator);
    assertSame("generator", obj.getGenerator(), generator);
  }
}
