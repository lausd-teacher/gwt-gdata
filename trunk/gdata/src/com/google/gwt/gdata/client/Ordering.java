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
 * Control ordering for a set of atom entries.
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
   * Constructs an ordering
   * @return An Ordering object.
   */
  public static native Ordering newInstance() /*-{
    return new $wnd.google.gdata.Ordering();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Ordering[name];
  }-*/;

  protected Ordering() { }

  /**
   * Returns the next element. This attribute is optional.
   * 
   * @return Next element or undefined for none.
   */
  public final native String getNext() /*-{
    return this.getNext();
  }-*/;

  /**
   * Returns the ordered feed id. This attribute is optional.
   * 
   * @return Ordered feed id.
   */
  public final native String getOrderId() /*-{
    return this.getOrderId();
  }-*/;

  /**
   * Returns the previous element. This attribute is optional.
   * 
   * @return Previous element.
   */
  public final native String getPrev() /*-{
    return this.getPrev();
  }-*/;

  /**
   * Returns the other entry id. This attribute is optional.
   * 
   * @return Other entry id.
   */
  public final native String getRef() /*-{
    return this.getRef();
  }-*/;

  /**
   * Returns the order type. This attribute is optional.
   * 
   * @return Order type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the next element. This attribute is optional.
   * 
   * @param next Next element.
   */
  public final native void setNext(String next) /*-{
    this.setNext(next);
  }-*/;

  /**
   * Sets the ordered feed id. This attribute is optional.
   * 
   * @param orderId Ordered feed id.
   */
  public final native void setOrderId(String orderId) /*-{
    this.setOrderId(orderId);
  }-*/;

  /**
   * Sets the previous element. This attribute is optional.
   * 
   * @param prev Previous element.
   */
  public final native void setPrev(String prev) /*-{
    this.setPrev(prev);
  }-*/;

  /**
   * Sets the other entry id. This attribute is optional.
   * 
   * @param ref Other entry id.
   */
  public final native void setRef(String ref) /*-{
    this.setRef(ref);
  }-*/;

  /**
   * Sets the order type. This attribute is optional.
   * 
   * @param rel Order type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}