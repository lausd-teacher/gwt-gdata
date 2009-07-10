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
 * Price of the transaction.
 */
public class Price extends JavaScriptObject {

  /**
   * Constructs a price.
   */
  public static native Price newInstance() /*-{
    return new $wnd.google.gdata.finance.Price();
  }-*/;

  protected Price() { }

  /**
   * Adds a new monetary value of the transaction price.
   * 
   * @param money Monetary value of the transaction price to add.
   */
  public final native void addMoney(Money money) /*-{
    this.addMoney(money);
  }-*/;

  /**
   * Returns the monetary value of the transaction price.
   * 
   * @return Monetary value of the transaction price.
   */
  public final native Money[] getMoney() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getMoney());
  }-*/;

  /**
   * Sets the monetary value of the transaction price.
   * 
   * @param money Monetary value of the transaction price, where each monetary value of the transaction price is added using addMoney().
   */
  public final native void setMoney(Money[] money) /*-{
    this.setMoney(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(money)
    );
  }-*/;

}