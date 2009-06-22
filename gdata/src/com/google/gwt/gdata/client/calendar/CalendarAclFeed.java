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
import com.google.gwt.gdata.client.acl.AclFeed;

/**
 * Describes a Calendar access contorl list (ACL) feed.
 */
public class CalendarAclFeed extends AclFeed {

  /**
   * Constructs a Calendar ACL feed using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, contributors, entries, generator, id, links, startIndex, title, totalResults, and updated.
   */
  public static native CalendarAclFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarAclFeed(
      params
    );
  }-*/;

  protected CalendarAclFeed() { }

  /**
   * Returns the link that provides the URI of the entry that is controlled by the access control list feed.
   * 
   * @return Link that provides the URI of the entry that is controlled by the access control list feed or undefined for none.
   */
  public final native CalendarLink getControlledObjectLink() /*-{
    return this.getControlledObjectLink();
  }-*/;

}
