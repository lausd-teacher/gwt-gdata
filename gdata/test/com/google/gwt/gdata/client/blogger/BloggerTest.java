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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.gdata.client.GData;
import com.google.gwt.gdata.client.GDataSystemPackage;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Base class for Blogger tests.
 */
public class BloggerTest extends GWTTestCase {

  private boolean isAsync = false;
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  protected void executeGDataTest(Runnable test, int delay) {
    if (!GData.isLoaded(GDataSystemPackage.BLOGGER)) {
      isAsync = true;
      GData.loadGDataApi(null, test, GDataSystemPackage.BLOGGER);
      delayTestFinish(delay);
    } else {
      test.run();
    }
  }
  
  protected void finishGDataTest() {
    if (isAsync) {
      finishTest();
    }
  }

}
