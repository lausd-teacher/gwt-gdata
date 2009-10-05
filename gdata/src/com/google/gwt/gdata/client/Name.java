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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Name of a person in a structured form.
 */
public class Name extends JavaScriptObject {

  /**
   * Constructs a name.
   * 
   * @return A Name object.
   */
  public static native Name newInstance() /*-{
    return new $wnd.google.gdata.Name();
  }-*/;

  protected Name() { }

  /**
   * Returns the additional name. This element is optional.
   * 
   * @return Additional name.
   */
  public final native AdditionalName getAdditionalName() /*-{
    return this.getAdditionalName();
  }-*/;

  /**
   * Returns the family name. This element is optional.
   * 
   * @return Family name.
   */
  public final native FamilyName getFamilyName() /*-{
    return this.getFamilyName();
  }-*/;

  /**
   * Returns the full name. This element is optional.
   * 
   * @return Full name.
   */
  public final native FullName getFullName() /*-{
    return this.getFullName();
  }-*/;

  /**
   * Returns the given name. This element is optional.
   * 
   * @return Given name.
   */
  public final native GivenName getGivenName() /*-{
    return this.getGivenName();
  }-*/;

  /**
   * Returns the name prefix. This element is optional.
   * 
   * @return Name prefix.
   */
  public final native NamePrefix getNamePrefix() /*-{
    return this.getNamePrefix();
  }-*/;

  /**
   * Returns the name suffix. This element is optional.
   * 
   * @return Name suffix.
   */
  public final native NameSuffix getNameSuffix() /*-{
    return this.getNameSuffix();
  }-*/;

  /**
   * Sets the additional name. This element is optional.
   * 
   * @param additionalName Additional name.
   */
  public final native void setAdditionalName(
      AdditionalName additionalName) /*-{
    this.setAdditionalName(additionalName);
  }-*/;

  /**
   * Sets the family name. This element is optional.
   * 
   * @param familyName Family name.
   */
  public final native void setFamilyName(FamilyName familyName) /*-{
    this.setFamilyName(familyName);
  }-*/;

  /**
   * Sets the full name. This element is optional.
   * 
   * @param fullName Full name.
   */
  public final native void setFullName(FullName fullName) /*-{
    this.setFullName(fullName);
  }-*/;

  /**
   * Sets the given name. This element is optional.
   * 
   * @param givenName Given name.
   */
  public final native void setGivenName(GivenName givenName) /*-{
    this.setGivenName(givenName);
  }-*/;

  /**
   * Sets the name prefix. This element is optional.
   * 
   * @param namePrefix Name prefix.
   */
  public final native void setNamePrefix(NamePrefix namePrefix) /*-{
    this.setNamePrefix(namePrefix);
  }-*/;

  /**
   * Sets the name suffix. This element is optional.
   * 
   * @param nameSuffix Name suffix.
   */
  public final native void setNameSuffix(NameSuffix nameSuffix) /*-{
    this.setNameSuffix(nameSuffix);
  }-*/;

}