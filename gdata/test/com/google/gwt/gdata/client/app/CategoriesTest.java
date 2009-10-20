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

import com.google.gwt.gdata.client.atom.Category;

/**
 * Tests for the Categories class.
 */
public class CategoriesTest extends AppTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("FIXED_NO", Categories.FIXED_NO);
        assertNotNull("FIXED_YES", Categories.FIXED_YES);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Categories.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addCategory(Category category)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Categories obj = Categories.newInstance();
        String scheme = "myValue";
        obj.setScheme(scheme);
        assertEquals("scheme", obj.getScheme(), scheme);
        String fixed = "myValue";
        obj.setFixed(fixed);
        assertEquals("fixed", obj.getFixed(), fixed);
        Category[] categories = new Category[]{ Category.newInstance() };
        obj.setCategories(categories);
        assertEquals("categories", obj.getCategories().length, categories.length);
        String href = "myValue";
        obj.setHref(href);
        assertEquals("href", obj.getHref(), href);
        finishGDataTest();
      }
    }, 10000);
  }
}
