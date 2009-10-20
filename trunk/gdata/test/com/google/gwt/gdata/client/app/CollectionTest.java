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

package com.google.gwt.gdata.client.app;

import com.google.gwt.gdata.client.atom.Text;

/**
 * Tests for the Collection class.
 */
public class CollectionTest extends AppTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Collection.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addAccept(Accept accept)
    // Unit Test for addCategories(Categories categories)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Collection obj = Collection.newInstance();
        Accept[] accepts = new Accept[]{ Accept.newInstance() };
        obj.setAccepts(accepts);
        assertEquals("accepts", obj.getAccepts().length, accepts.length);
        Text title = Text.newInstance();
        obj.setTitle(title);
        assertSame("title", obj.getTitle(), title);
        Categories[] categorieses = new Categories[]{ Categories.newInstance() };
        obj.setCategorieses(categorieses);
        assertEquals("categorieses", obj.getCategorieses().length, categorieses.length);
        String href = "myValue";
        obj.setHref(href);
        assertEquals("href", obj.getHref(), href);
        finishGDataTest();
      }
    }, 10000);
  }
}
