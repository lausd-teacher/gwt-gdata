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

/**
 * Describes an event feed.
 * @param <E> The Entry type.
 */
@SuppressWarnings("unchecked")
public class EventFeed<E extends EventEntry> extends com.google.gwt.gdata.client.Feed<E> {

  /**
   * Constructs an event feed.
   * @return An EventFeed object.
   */
  public static native <E extends EventEntry> EventFeed<E> newInstance() /*-{
    return new $wnd.google.gdata.EventFeed();
  }-*/;

  protected EventFeed() { }

}
