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

import com.google.gwt.gdata.client.FeedLink;

/**
 * Describes a position feed link.
 */
public class PositionFeedLink extends FeedLink<PositionFeed> {

  /**
   * Constructs a position feed link.
   * @return A PositionFeedLink object.
   */
  @SuppressWarnings("unchecked")
  public static native PositionFeedLink newInstance() /*-{
    return new $wnd.google.gdata.finance.PositionFeedLink();
  }-*/;

  protected PositionFeedLink() { }

}