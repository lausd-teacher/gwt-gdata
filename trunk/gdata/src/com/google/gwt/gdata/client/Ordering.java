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
 * Comment unavailable.
 */
public class Ordering extends JavaScriptObject {

  /**
   * ComesAfter ordering.
   */
  public static final String REL_COMESAFTER = getConstant("REL_COMESAFTER");

  /**
   * First ordering.
   */
  public static final String REL_FIRST = getConstant("REL_FIRST");

  /**
   * Last ordering.
   */
  public static final String REL_LAST = getConstant("REL_LAST");

  /**
   * Constructs an ordering using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Ordering newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Ordering(
      params
    );
  }-*/;

  /**
   * Constructs an ordering using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Ordering newInstance() /*-{
    return new $wnd.google.gdata.Ordering();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Ordering[name];
  }-*/;

  protected Ordering() { }

  /**
   * Returns the next element.
   * 
   * @return
   */
  public final native String getNext() /*-{
    return this.getNext();
  }-*/;

  /**
   * Returns the ordered feed id.
   * 
   * @return
   */
  public final native String getOrderId() /*-{
    return this.getOrderId();
  }-*/;

  /**
   * Returns the previous element.
   * 
   * @return
   */
  public final native String getPrev() /*-{
    return this.getPrev();
  }-*/;

  /**
   * Returns the other entry id.
   * 
   * @return
   */
  public final native String getRef() /*-{
    return this.getRef();
  }-*/;

  /**
   * Returns the order type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the next element.
   * 
   * @param next
   */
  public final native void setNext(String next) /*-{
    this.setNext(
      next
    );
  }-*/;

  /**
   * Sets the next element.
   * 
   * @param next
   */
  public final native void setNext() /*-{
    this.setNext();
  }-*/;

  /**
   * Sets the ordered feed id.
   * 
   * @param orderId
   */
  public final native void setOrderId(String orderId) /*-{
    this.setOrderId(
      orderId
    );
  }-*/;

  /**
   * Sets the ordered feed id.
   * 
   * @param orderId
   */
  public final native void setOrderId() /*-{
    this.setOrderId();
  }-*/;

  /**
   * Sets the previous element.
   * 
   * @param prev
   */
  public final native void setPrev(String prev) /*-{
    this.setPrev(
      prev
    );
  }-*/;

  /**
   * Sets the previous element.
   * 
   * @param prev
   */
  public final native void setPrev() /*-{
    this.setPrev();
  }-*/;

  /**
   * Sets the other entry id.
   * 
   * @param ref
   */
  public final native void setRef(String ref) /*-{
    this.setRef(
      ref
    );
  }-*/;

  /**
   * Sets the other entry id.
   * 
   * @param ref
   */
  public final native void setRef() /*-{
    this.setRef();
  }-*/;

  /**
   * Sets the order type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the order type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

}
