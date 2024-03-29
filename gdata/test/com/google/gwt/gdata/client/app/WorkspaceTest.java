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
 * Tests for the Workspace class.
 */
public class WorkspaceTest extends AppTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", Workspace.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    executeGDataTest(new Runnable() {
      public void run() {
        Workspace obj = Workspace.newInstance();
        obj.addCollection(Collection.newInstance());
        assertEquals("addCollection", 1, obj.getCollections().length);
        finishGDataTest();
      }
    }, 10000);
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        Workspace obj = Workspace.newInstance();
        Text title = Text.newInstance();
        obj.setTitle(title);
        assertSame("title", obj.getTitle(), title);
        Collection[] collections = new Collection[]{ Collection.newInstance() };
        obj.setCollections(collections);
        assertEquals("collections", obj.getCollections().length, collections.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
