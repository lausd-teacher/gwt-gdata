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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Extends the base Link class with contact extensions.
 */
public class ContactLink extends com.google.gwt.gdata.client.Link {

  /**
   * Link that provides the contact photo.
   */
  public static final String REL_CONTACT_PHOTO = getConstant("REL_CONTACT_PHOTO");

  /**
   * Link to edit contact photo.
   */
  public static final String REL_EDIT_CONTACT_PHOTO = getConstant("REL_EDIT_CONTACT_PHOTO");

  /**
   * Image/ Contact Link class.
   */
  public static final String TYPE_IMAGE = getConstant("TYPE_IMAGE");

  /**
   * Overview  File   Class  Tree  Index  Help  GData JavaScript Client 1.10  
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: href, length, rel, title, and type.
   */
  public static native ContactLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactLink(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.ContactLink[name];
  }-*/;

  protected ContactLink() { }

}
