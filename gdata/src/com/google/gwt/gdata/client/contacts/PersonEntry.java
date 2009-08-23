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

import com.google.gwt.gdata.client.Email;
import com.google.gwt.gdata.client.ExtendedProperty;
import com.google.gwt.gdata.client.Im;
import com.google.gwt.gdata.client.Organization;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.PostalAddress;

/**
 * Describes a person entry.
 */
public class PersonEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a person entry.
   * @return A PersonEntry object.
   */
  public static native PersonEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.PersonEntry();
  }-*/;

  protected PersonEntry() { }

  /**
   * Adds a new email address.
   * 
   * @param emailAddress Email address to add.
   */
  public final native void addEmailAddress(Email emailAddress) /*-{
    this.addEmailAddress(emailAddress);
  }-*/;

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty Extended property to add.
   */
  public final native void addExtendedProperty(
      ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(extendedProperty);
  }-*/;

  /**
   * Adds a new instant messaging address.
   * 
   * @param imAddress Instant messaging address to add.
   */
  public final native void addImAddress(Im imAddress) /*-{
    this.addImAddress(imAddress);
  }-*/;

  /**
   * Adds a new organization.
   * 
   * @param organization Organization to add.
   */
  public final native void addOrganization(Organization organization) /*-{
    this.addOrganization(organization);
  }-*/;

  /**
   * Adds a new phone number.
   * 
   * @param phoneNumber Phone number to add.
   */
  public final native void addPhoneNumber(PhoneNumber phoneNumber) /*-{
    this.addPhoneNumber(phoneNumber);
  }-*/;

  /**
   * Adds a new postal address.
   * 
   * @param postalAddress Postal address to add.
   */
  public final native void addPostalAddress(PostalAddress postalAddress) /*-{
    this.addPostalAddress(postalAddress);
  }-*/;

  /**
   * Returns the link to edit contact photo.
   * 
   * @return Link to edit contact photo.
   */
  public final native ContactLink getContactEditPhotoLink() /*-{
    return this.getContactEditPhotoLink();
  }-*/;

  /**
   * Returns the link that provides the contact photo.
   * 
   * @return Link that provides the contact photo.
   */
  public final native ContactLink getContactPhotoLink() /*-{
    return this.getContactPhotoLink();
  }-*/;

  /**
   * Returns the email addresses.
   * 
   * @return Email addresses.
   */
  public final native
    com.google.gwt.gdata.client.Email[] getEmailAddresses() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getEmailAddresses());
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return Extended properties.
   */
  public final native ExtendedProperty[] getExtendedProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getExtendedProperties());
  }-*/;

  /**
   * Returns the instant messaging addresses.
   * 
   * @return Instant messaging addresses.
   */
  public final native Im[] getImAddresses() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getImAddresses());
  }-*/;

  /**
   * Returns the organizations.
   * 
   * @return Organizations.
   */
  public final native Organization[] getOrganizations() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getOrganizations());
  }-*/;

  /**
   * Returns the phone numbers.
   * 
   * @return Phone numbers.
   */
  public final native PhoneNumber[] getPhoneNumbers() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getPhoneNumbers());
  }-*/;

  /**
   * Returns the postal addresses.
   * 
   * @return Postal addresses.
   */
  public final native PostalAddress[] getPostalAddresses() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getPostalAddresses());
  }-*/;

  /**
   * Sets the email addresses.
   * 
   * @param emailAddresses Email addresses, where each email address is added
   * using addEmailAddress().
   */
  public final native void setEmailAddresses(Email[] emailAddresses) /*-{
    this.setEmailAddresses(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(emailAddresses)
    );
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties Extended properties, where each extended
   * property is added using addExtendedProperty().
   */
  public final native void setExtendedProperties(
      ExtendedProperty[] extendedProperties) /*-{
    this.setExtendedProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(extendedProperties)
    );
  }-*/;

  /**
   * Sets the instant messaging addresses.
   * 
   * @param imAddresses Instant messaging addresses, where each instant
   * messaging address is added using addImAddress().
   */
  public final native void setImAddresses(Im[] imAddresses) /*-{
    this.setImAddresses(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(imAddresses)
    );
  }-*/;


  /**
   * Sets the organizations.
   * 
   * @param organizations Organizations, where each organization is added
   * using addOrganization() function, or undefined to clear the organizations.
   */
  public final native void setOrganizations(Organization[] organizations) /*-{
    this.setOrganizations(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(organizations)
    );
  }-*/;

  /**
   * Sets the phone numbers.
   * 
   * @param phoneNumbers Phone numbers, where each phone number is added using
   * addPhoneNumber().
   */
  public final native void setPhoneNumbers(PhoneNumber[] phoneNumbers) /*-{
    this.setPhoneNumbers(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(phoneNumbers)
    );
  }-*/;

  /**
   * Sets the postal addresses.
   * 
   * @param postalAddresses Postal addresses, where each postal address is
   * added using addPostalAddress().
   */
  public final native void setPostalAddresses(
      PostalAddress[] postalAddresses) /*-{
    this.setPostalAddresses(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(postalAddresses)
    );
  }-*/;

}