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
 * Contact's relation.
 */
public class Relation extends JavaScriptObject {

  /**
   * Assistant relation.
   */
  public static final String REL_ASSISTANT = getConstant("REL_ASSISTANT");

  /**
   * Brother relation.
   */
  public static final String REL_BROTHER = getConstant("REL_BROTHER");

  /**
   * Child relation.
   */
  public static final String REL_CHILD = getConstant("REL_CHILD");

  /**
   * Domestic-partner relation.
   */
  public static final String REL_DOMESTIC_PARTNER =
    getConstant("REL_DOMESTIC_PARTNER");

  /**
   * Father relation.
   */
  public static final String REL_FATHER = getConstant("REL_FATHER");

  /**
   * Friend relation.
   */
  public static final String REL_FRIEND = getConstant("REL_FRIEND");

  /**
   * Manager relation.
   */
  public static final String REL_MANAGER = getConstant("REL_MANAGER");

  /**
   * Mother relation.
   */
  public static final String REL_MOTHER = getConstant("REL_MOTHER");

  /**
   * Parent relation.
   */
  public static final String REL_PARENT = getConstant("REL_PARENT");

  /**
   * Partner relation.
   */
  public static final String REL_PARTNER = getConstant("REL_PARTNER");

  /**
   * Referred-by relation.
   */
  public static final String REL_REFERRED_BY = getConstant("REL_REFERRED_BY");

  /**
   * Relative relation.
   */
  public static final String REL_RELATIVE = getConstant("REL_RELATIVE");

  /**
   * Sister relation.
   */
  public static final String REL_SISTER = getConstant("REL_SISTER");

  /**
   * Spouse relation.
   */
  public static final String REL_SPOUSE = getConstant("REL_SPOUSE");

  /**
   * Constructs a relation.
   * 
   * @return A Relation object.
   */
  public static native Relation newInstance() /*-{
    return new $wnd.google.gdata.contacts.Relation();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Relation[name];
  }-*/;

  protected Relation() { }

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the relation type. This attribute is optional.
   * 
   * @return Relation type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label Label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets the relation type. This attribute is optional.
   * 
   * @param rel Relation type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}