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

/**
 * Tests for the ServiceDocument class.
 */
public class ServiceDocumentTest extends AppTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    executeGDataTest(new Runnable() {
      public void run() {
        assertNotNull("newInstance()", ServiceDocument.newInstance());
        finishGDataTest();
      }
    }, 10000);
  }

  public void testOther() {
    // Unit Test for addWorkspace(Workspace workspace)
  }

  public void testProperties() {
    executeGDataTest(new Runnable() {
      public void run() {
        ServiceDocument obj = ServiceDocument.newInstance();
        Workspace[] workspaces = new Workspace[]{ Workspace.newInstance() };
        obj.setWorkspaces(workspaces);
        assertEquals("workspaces", obj.getWorkspaces().length, workspaces.length);
        finishGDataTest();
      }
    }, 10000);
  }
}
