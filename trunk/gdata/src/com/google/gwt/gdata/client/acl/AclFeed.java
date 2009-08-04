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

package com.google.gwt.gdata.client.acl;

/**
 * Describes a feed of an access control list (ACL).
 * @param <E> The Entry type.
 */
public class AclFeed<E extends AclEntry> extends com.google.gwt.gdata.client.Feed<E> {
  
  /**
   * Constructs an ACL feed.
   * @return An AclFeed object.
   */
  public static native <E extends AclEntry> AclFeed<E> newInstance() /*-{
    return new $wnd.google.gdata.acl.AclFeed();
  }-*/;

  protected AclFeed() { }
}