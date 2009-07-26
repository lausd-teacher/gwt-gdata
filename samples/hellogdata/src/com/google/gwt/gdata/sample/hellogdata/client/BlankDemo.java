/*
 * Copyright 2008 Google Inc.
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

package com.google.gwt.gdata.sample.hellogdata.client;

import com.google.gwt.user.client.ui.FlexTable;

/**
 * The default demo item.
 */
public class BlankDemo extends GDataDemo {

  public static GDataDemoInfo init() {
    return new GDataDemoInfo() {

      @Override
      public GDataDemo createInstance() {
        return new BlankDemo();
      }

      @Override
      public String getDescription() {
        return "<p>Please select a GData demo to run.</p>\n";
      }

      @Override
      public String getName() {
        return "";
      }
    };
  }

  private FlexTable mainPanel;

  public BlankDemo() {
    mainPanel = new FlexTable();
    initWidget(mainPanel);
  }
}