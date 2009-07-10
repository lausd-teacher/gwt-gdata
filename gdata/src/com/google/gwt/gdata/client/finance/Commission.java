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
 * Commission for the transaction.
 * @return A Commission object.
 */
public class Commission extends JavaScriptObject {

  /**
   * Constructs a commission.
   */
  public static native Commission newInstance() /*-{
    return new $wnd.google.gdata.finance.Commission();
  }-*/;

  protected Commission() { }

  /**
   * Adds a new monetary value of the commission.
   * 
   * @param money Monetary value of the commission to add.
   */
  public final native void addMoney(Money money) /*-{
    this.addMoney(money);
  }-*/;

  /**
   * Returns the monetary value of the commission.
   * 
   * @return Monetary value of the commission.
   */
  public final native Money[] getMoney() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getMoney());
  }-*/;

  /**
   * Sets the monetary value of the commission.
   * 
   * @param money Monetary value of the commission, where each monetary value of the commission is added using addMoney().
   */
  public final native void setMoney(Money[] money) /*-{
    this.setMoney(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(money)
    );
  }-*/;

}