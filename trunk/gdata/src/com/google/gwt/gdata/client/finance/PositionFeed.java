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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a Finance position feed.
 */
public class PositionFeed extends com.google.gwt.gdata.client.Feed<PositionEntry> {

  /**
   * Overview  File   Class  Tree  Index  Help  GData JavaScript Client 1.10  
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, entries, id, itemsPerPage, links, startIndex, title, totalResults, and updated.
   */
  public static native PositionFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.PositionFeed(
      params
    );
  }-*/;

  protected PositionFeed() { }

}
