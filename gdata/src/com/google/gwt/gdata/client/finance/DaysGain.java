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
 * Today's gain for the portfolio or position.
 */
public class DaysGain extends JavaScriptObject {

  /**
   * Constructs a day's gain.
   * @return A DaysGain object.
   */
  public static native DaysGain newInstance() /*-{
    return new $wnd.google.gdata.finance.DaysGain();
  }-*/;

  protected DaysGain() { }

  /**
   * Adds a new monetary value of day's gain.
   * 
   * @param money Monetary value of day's gain to add.
   */
  public final native void addMoney(Money money) /*-{
    this.addMoney(money);
  }-*/;

  /**
   * Returns the monetary value of day's gain.
   * 
   * @return Monetary value of day's gain.
   */
  public final native Money[] getMoney() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getMoney());
  }-*/;

  /**
   * Sets the monetary value of day's gain.
   * 
   * @param money Monetary value of day's gain, where each monetary value of
   * day's gain is added using addMoney().
   */
  public final native void setMoney(Money[] money) /*-{
    this.setMoney(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(money)
    );
  }-*/;

}