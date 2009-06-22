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
import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Data for the transction.
 */
public class TransactionData extends JavaScriptObject {

  /**
   * Constructs a transaction data using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: commission, date, notes, price, shares, and type.
   */
  public static native TransactionData newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.TransactionData(
      params
    );
  }-*/;

  protected TransactionData() { }

  /**
   * Returns the commission for the transaction. This element is optional.
   * 
   * @return Commission for the transaction or undefined for none.
   */
  public final native Commission getCommission() /*-{
    return this.getCommission();
  }-*/;

  /**
   * Returns the date at which the transaction occurred. This attribute is optional.
   * 
   * @return Date at which the transaction occurred or undefined for none.
   */
  public final native DateTime getDate() /*-{
    return this.getDate();
  }-*/;

  /**
   * Returns the notes. This attribute is optional.
   * 
   * @return Notes or undefined for none.
   */
  public final native String getNotes() /*-{
    return this.getNotes();
  }-*/;

  /**
   * Returns the price of the transaction. This element is optional.
   * 
   * @return Price of the transaction or undefined for none.
   */
  public final native Price getPrice() /*-{
    return this.getPrice();
  }-*/;

  /**
   * Returns the number of shares involved in the transaction. This attribute is optional.
   * 
   * @return Number of shares involved in the transaction or undefined for none.
   */
  public final native double getShares() /*-{
    return this.getShares();
  }-*/;

  /**
   * Returns the type for the transaction (can be "Buy", "Sell", "Buy to Cover" or "Sell Short"). This attribute is required.
   * 
   * @return Type for the transaction (can be "Buy", "Sell", "Buy to Cover" or "Sell Short") or undefined for none.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the commission for the transaction. This element is optional.
   */
  public final native void setCommission() /*-{
    this.setCommission();
  }-*/;

  /**
   * Sets the commission for the transaction. This element is optional.
   * 
   * @param commission Commission for the transaction, or object to use as a parameter to the google.gdata.finance.Commission constructor, or undefined for none.
   */
  public final native void setCommission(Commission commission) /*-{
    this.setCommission(
      commission
    );
  }-*/;

  /**
   * Sets the date at which the transaction occurred. This attribute is optional.
   */
  public final native void setDate() /*-{
    this.setDate();
  }-*/;

  /**
   * Sets the date at which the transaction occurred. This attribute is optional.
   * 
   * @param date Date at which the transaction occurred or undefined for none.
   */
  public final native void setDate(Date date) /*-{
    this.setDate(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(date))
    );
  }-*/;

  /**
   * Sets the date at which the transaction occurred. This attribute is optional.
   * 
   * @param date Date at which the transaction occurred or undefined for none.
   */
  public final native void setDate(DateTime date) /*-{
    this.setDate(
      date
    );
  }-*/;

  /**
   * Sets the notes. This attribute is optional.
   */
  public final native void setNotes() /*-{
    this.setNotes();
  }-*/;

  /**
   * Sets the notes. This attribute is optional.
   * 
   * @param notes Notes or undefined for none.
   */
  public final native void setNotes(String notes) /*-{
    this.setNotes(
      notes
    );
  }-*/;

  /**
   * Sets the price of the transaction. This element is optional.
   */
  public final native void setPrice() /*-{
    this.setPrice();
  }-*/;

  /**
   * Sets the price of the transaction. This element is optional.
   * 
   * @param price Price of the transaction, or object to use as a parameter to the google.gdata.finance.Price constructor, or undefined for none.
   */
  public final native void setPrice(Price price) /*-{
    this.setPrice(
      price
    );
  }-*/;

  /**
   * Sets the number of shares involved in the transaction. This attribute is optional.
   */
  public final native void setShares() /*-{
    this.setShares();
  }-*/;

  /**
   * Sets the number of shares involved in the transaction. This attribute is optional.
   * 
   * @param shares Number of shares involved in the transaction or undefined for none.
   */
  public final native void setShares(double shares) /*-{
    this.setShares(
      shares
    );
  }-*/;

  /**
   * Sets the type for the transaction (can be "Buy", "Sell", "Buy to Cover" or "Sell Short"). This attribute is required.
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the type for the transaction (can be "Buy", "Sell", "Buy to Cover" or "Sell Short"). This attribute is required.
   * 
   * @param type Type for the transaction (can be "Buy", "Sell", "Buy to Cover" or "Sell Short") or undefined for none.
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

}
