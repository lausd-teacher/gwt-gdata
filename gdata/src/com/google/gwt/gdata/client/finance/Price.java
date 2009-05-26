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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Money;

/**
 * Comment unavailable.
 */
public class Price extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.finance.Price;
  }-*/;

  /**
   * Constructs a price using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Price newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.Price(
      params
    );
  }-*/;

  /**
   * Constructs a price using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Price newInstance() /*-{
    return new $wnd.google.gdata.finance.Price();
  }-*/;

  protected Price() { }

  /**
   * Adds a new monetary value of the transaction price.
   * 
   * @param money
   */
  public final native void addMoney(JavaScriptObject money) /*-{
    this.addMoney(
      money
    );
  }-*/;

  /**
   * Adds a new monetary value of the transaction price.
   * 
   * @param money
   */
  public final native void addMoney(Money money) /*-{
    this.addMoney(
      money
    );
  }-*/;

  /**
   * Returns the monetary value of the transaction price.
   * 
   * @return
   */
  public final native Money[] getMoney() /*-{
    return this.getMoney();
  }-*/;

  /**
   * Sets the monetary value of the transaction price.
   * 
   * @param money
   */
  public final native void setMoney(JavaScriptObject[] money) /*-{
    this.setMoney(
      money
    );
  }-*/;

  /**
   * Sets the monetary value of the transaction price.
   * 
   * @param money
   */
  public final native void setMoney() /*-{
    this.setMoney();
  }-*/;

  /**
   * Sets the monetary value of the transaction price.
   * 
   * @param money
   */
  public final native void setMoney(Money[] money) /*-{
    this.setMoney(
      money
    );
  }-*/;

}