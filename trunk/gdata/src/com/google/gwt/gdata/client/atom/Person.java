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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class Person extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.atom.Person;
  }-*/;

  /**
   * Constructs a person construct using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Person newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Person(
      params
    );
  }-*/;

  /**
   * Constructs a person construct using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Person newInstance() /*-{
    return new $wnd.google.gdata.atom.Person();
  }-*/;

  protected Person() { }

  /**
   * Returns the authors email address.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Email getEmail() /*-{
    return this.getEmail();
  }-*/;

  /**
   * Returns the authors name.
   * 
   * @return
   */
  public final native Name getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the language of name.
   * 
   * @return
   */
  public final native String getNameLang() /*-{
    return this.getNameLang();
  }-*/;

  /**
   * Returns the authors URI.
   * 
   * @return
   */
  public final native Uri getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets the authors email address.
   * 
   * @param email
   */
  public final native void setEmail(Email email) /*-{
    this.setEmail(
      email
    );
  }-*/;

  /**
   * Sets the authors email address.
   * 
   * @param email
   */
  public final native void setEmail() /*-{
    this.setEmail();
  }-*/;

  /**
   * Sets the authors name.
   * 
   * @param name
   */
  public final native void setName(Name name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the authors name.
   * 
   * @param name
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the language of name.
   * 
   * @param nameLang
   */
  public final native void setNameLang(String nameLang) /*-{
    this.setNameLang(
      nameLang
    );
  }-*/;

  /**
   * Sets the language of name.
   * 
   * @param nameLang
   */
  public final native void setNameLang() /*-{
    this.setNameLang();
  }-*/;

  /**
   * Sets the authors URI.
   * 
   * @param uri
   */
  public final native void setUri(Uri uri) /*-{
    this.setUri(
      uri
    );
  }-*/;

  /**
   * Sets the authors URI.
   * 
   * @param uri
   */
  public final native void setUri() /*-{
    this.setUri();
  }-*/;

}
