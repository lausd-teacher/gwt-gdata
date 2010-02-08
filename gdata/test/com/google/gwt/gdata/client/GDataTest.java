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

package com.google.gwt.gdata.client;

import com.google.gwt.junit.client.GWTTestCase;

import java.util.ArrayList;

/**
 * Base class for GData test.
 */
public class GDataTest extends GWTTestCase {

  protected boolean isAsync = false;
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }
  
  protected void executeGDataTest(Runnable test, int delay) {
    if (!GData.isLoaded()) {
      isAsync = true;
      GData.loadGDataApi(null, test);
      delayTestFinish(delay);
    } else {
      delayTestFinish(delay);
      test.run();
    }
  }
  
  protected void executeGDataTest(Runnable test, int delay,
      GDataPackage... requiredPackages) {
    if (!GData.isLoaded(requiredPackages)) {
      isAsync = true;
      ArrayList<GDataPackage> packages = new ArrayList<GDataPackage>();
      for (GDataPackage pack : requiredPackages) {
        if (!pack.getValue().equals(GDataAuxiliaryPackage.BATCH.getValue()) &&
            !pack.getValue().equals(GDataAuxiliaryPackage.MEDIARSS.getValue()))
        {
          packages.add(pack);
        }
      }
      packages.add(GDataAuxiliaryPackage.BATCH);
      packages.add(GDataAuxiliaryPackage.MEDIARSS);
      GData.loadGDataApi(null, test);
      delayTestFinish(delay);
    } else {
      delayTestFinish(delay);
      test.run();
    }
  }
  
  protected void finishGDataTest() {
    if (isAsync) {
      finishTest();
      isAsync = false;
    } else {
      finishTest();
    }
  }
  
}
