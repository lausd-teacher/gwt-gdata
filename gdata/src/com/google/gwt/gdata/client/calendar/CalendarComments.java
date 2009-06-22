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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Comments;

/**
 * Describes a container of a feed link for Calendar comment entries.
 */
public class CalendarComments extends Comments {

  /**
   * Constructs a Calendar comments class using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: feedLink.
   */
  public static native CalendarComments newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarComments(
      params
    );
  }-*/;

  protected CalendarComments() { }

}
