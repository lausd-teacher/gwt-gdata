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
 * Comment unavailable.
 */
public class TransactionData extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.finance.TransactionData;
  }-*/;

  /**
   * Constructs a transaction data using an object parameter whose property names match the setter method to use for each property.
   */
  public static native TransactionData newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.TransactionData(
      params
    );
  }-*/;

  /**
   * Constructs a transaction data using an object parameter whose property names match the setter method to use for each property.
   */
  public static native TransactionData newInstance() /*-{
    return new $wnd.google.gdata.finance.TransactionData();
  }-*/;

  protected TransactionData() { }

  /**
   * Returns the commission for the transaction.
   * 
   * @return
   */
  public final native Commission getCommission() /*-{
    return this.getCommission();
  }-*/;

  /**
   * Returns the date at which the transaction occurred.
   * 
   * @return
   */
  public final native DateTime getDate() /*-{
    return this.getDate();
  }-*/;

  /**
   * Returns the notes.
   * 
   * @return
   */
  public final native String getNotes() /*-{
    return this.getNotes();
  }-*/;

  /**
   * Returns the price of the transaction.
   * 
   * @return
   */
  public final native Price getPrice() /*-{
    return this.getPrice();
  }-*/;

  /**
   * Returns the number of shares involved in the transaction.
   * 
   * @return
   */
  public final native double getShares() /*-{
    return this.getShares();
  }-*/;

  /**
   * Returns the type for the transaction (can be Buy, Sell, Buy to Cover or Sell Short).
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the commission for the transaction.
   * 
   * @param commission
   */
  public final native void setCommission(JavaScriptObject commission) /*-{
    this.setCommission(
      commission
    );
  }-*/;

  /**
   * Sets the commission for the transaction.
   * 
   * @param commission
   */
  public final native void setCommission() /*-{
    this.setCommission();
  }-*/;

  /**
   * Sets the commission for the transaction.
   * 
   * @param commission
   */
  public final native void setCommission(Commission commission) /*-{
    this.setCommission(
      commission
    );
  }-*/;

  /**
   * Sets the date at which the transaction occurred.
   * 
   * @param date
   */
  public final native void setDate(Date date) /*-{
    this.setDate(
      date
    );
  }-*/;

  /**
   * Sets the date at which the transaction occurred.
   * 
   * @param date
   */
  public final native void setDate() /*-{
    this.setDate();
  }-*/;

  /**
   * Sets the date at which the transaction occurred.
   * 
   * @param date
   */
  public final native void setDate(DateTime date) /*-{
    this.setDate(
      date
    );
  }-*/;

  /**
   * Sets the notes.
   * 
   * @param notes
   */
  public final native void setNotes(String notes) /*-{
    this.setNotes(
      notes
    );
  }-*/;

  /**
   * Sets the notes.
   * 
   * @param notes
   */
  public final native void setNotes() /*-{
    this.setNotes();
  }-*/;

  /**
   * Sets the price of the transaction.
   * 
   * @param price
   */
  public final native void setPrice(JavaScriptObject price) /*-{
    this.setPrice(
      price
    );
  }-*/;

  /**
   * Sets the price of the transaction.
   * 
   * @param price
   */
  public final native void setPrice() /*-{
    this.setPrice();
  }-*/;

  /**
   * Sets the price of the transaction.
   * 
   * @param price
   */
  public final native void setPrice(Price price) /*-{
    this.setPrice(
      price
    );
  }-*/;

  /**
   * Sets the number of shares involved in the transaction.
   * 
   * @param shares
   */
  public final native void setShares(double shares) /*-{
    this.setShares(
      shares
    );
  }-*/;

  /**
   * Sets the number of shares involved in the transaction.
   * 
   * @param shares
   */
  public final native void setShares() /*-{
    this.setShares();
  }-*/;

  /**
   * Sets the type for the transaction (can be Buy, Sell, Buy to Cover or Sell Short).
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type for the transaction (can be Buy, Sell, Buy to Cover or Sell Short).
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
