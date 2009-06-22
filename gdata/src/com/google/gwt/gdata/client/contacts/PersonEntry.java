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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Email;
import com.google.gwt.gdata.client.ExtendedProperty;
import com.google.gwt.gdata.client.Im;
import com.google.gwt.gdata.client.Organization;
import com.google.gwt.gdata.client.PhoneNumber;
import com.google.gwt.gdata.client.PostalAddress;

/**
 * Describes a person entry.
 */
public class PersonEntry extends com.google.gwt.gdata.client.Entry<PersonEntry> {

  /**
   * Constructs a person entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, content, edited, emailAddresses, extendedProperties, id, imAddresses, links, organizations, phoneNumbers, postalAddresses, title, and updated.
   */
  public static native PersonEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.PersonEntry(
      params
    );
  }-*/;

  protected PersonEntry() { }

  /**
   * Adds a new email address.
   * 
   * @param emailAddress Email address to add, or object to use as a parameter to the google.gdata.Email constructor.
   */
  public final native void addEmailAddress(Email emailAddress) /*-{
    this.addEmailAddress(
      emailAddress
    );
  }-*/;

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty Extended property to add, or object to use as a parameter to the google.gdata.ExtendedProperty constructor.
   */
  public final native void addExtendedProperty(ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Adds a new instant messaging address.
   * 
   * @param imAddress Instant messaging address to add, or object to use as a parameter to the google.gdata.Im constructor.
   */
  public final native void addImAddress(Im imAddress) /*-{
    this.addImAddress(
      imAddress
    );
  }-*/;

  /**
   * Adds a new organization.
   * 
   * @param organization Organization to add, or object to use as a parameter to the google.gdata.Organization constructor.
   */
  public final native void addOrganization(Organization organization) /*-{
    this.addOrganization(
      organization
    );
  }-*/;

  /**
   * Adds a new phone number.
   * 
   * @param phoneNumber Phone number to add, or object to use as a parameter to the google.gdata.PhoneNumber constructor.
   */
  public final native void addPhoneNumber(PhoneNumber phoneNumber) /*-{
    this.addPhoneNumber(
      phoneNumber
    );
  }-*/;

  /**
   * Adds a new postal address.
   * 
   * @param postalAddress Postal address to add, or object to use as a parameter to the google.gdata.PostalAddress constructor.
   */
  public final native void addPostalAddress(PostalAddress postalAddress) /*-{
    this.addPostalAddress(
      postalAddress
    );
  }-*/;

  /**
   * Returns the link to edit contact photo.
   * 
   * @return Link to edit contact photo or undefined for none.
   */
  public final native ContactLink getContactEditPhotoLink() /*-{
    return this.getContactEditPhotoLink();
  }-*/;

  /**
   * Returns the link that provides the contact photo.
   * 
   * @return Link that provides the contact photo or undefined for none.
   */
  public final native ContactLink getContactPhotoLink() /*-{
    return this.getContactPhotoLink();
  }-*/;

  /**
   * Returns the email addresses.
   * 
   * @return Email addresses.
   */
  public final native JsArray<com.google.gwt.gdata.client.Email> getEmailAddresses() /*-{
    return this.getEmailAddresses();
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return Extended properties.
   */
  public final native JsArray<ExtendedProperty> getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the instant messaging addresses.
   * 
   * @return Instant messaging addresses.
   */
  public final native JsArray<Im> getImAddresses() /*-{
    return this.getImAddresses();
  }-*/;

  /**
   * Returns the organizations.
   * 
   * @return Organizations.
   */
  public final native JsArray<Organization> getOrganizations() /*-{
    return this.getOrganizations();
  }-*/;

  /**
   * Returns the phone numbers.
   * 
   * @return Phone numbers.
   */
  public final native JsArray<PhoneNumber> getPhoneNumbers() /*-{
    return this.getPhoneNumbers();
  }-*/;

  /**
   * Returns the postal addresses.
   * 
   * @return Postal addresses.
   */
  public final native JsArray<PostalAddress> getPostalAddresses() /*-{
    return this.getPostalAddresses();
  }-*/;

  /**
   * Sets the email addresses.
   */
  public final native void setEmailAddresses() /*-{
    this.setEmailAddresses();
  }-*/;

  /**
   * Sets the email addresses.
   * 
   * @param emailAddresses Email addresses, where each email address is added using the addEmailAddress() function, or undefined to clear the email addresses.
   */
  public final native void setEmailAddresses(JsArray<Email> emailAddresses) /*-{
    this.setEmailAddresses(
      emailAddresses
    );
  }-*/;

  /**
   * Sets the extended properties.
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties Extended properties, where each extended property is added using the addExtendedProperty() function, or undefined to clear the extended properties.
   */
  public final native void setExtendedProperties(JsArray<ExtendedProperty> extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the instant messaging addresses.
   */
  public final native void setImAddresses() /*-{
    this.setImAddresses();
  }-*/;

  /**
   * Sets the instant messaging addresses.
   * 
   * @param imAddresses Instant messaging addresses, where each instant messaging address is added using the addImAddress() function, or undefined to clear the instant messaging addresses.
   */
  public final native void setImAddresses(JsArray<Im> imAddresses) /*-{
    this.setImAddresses(
      imAddresses
    );
  }-*/;

  /**
   * Sets the organizations.
   */
  public final native void setOrganizations() /*-{
    this.setOrganizations();
  }-*/;

  /**
   * Sets the organizations.
   * 
   * @param organizations Organizations, where each organization is added using the addOrganization() function, or undefined to clear the organizations.
   */
  public final native void setOrganizations(JsArray<Organization> organizations) /*-{
    this.setOrganizations(
      organizations
    );
  }-*/;

  /**
   * Sets the phone numbers.
   */
  public final native void setPhoneNumbers() /*-{
    this.setPhoneNumbers();
  }-*/;

  /**
   * Sets the phone numbers.
   * 
   * @param phoneNumbers Phone numbers, where each phone number is added using the addPhoneNumber() function, or undefined to clear the phone numbers.
   */
  public final native void setPhoneNumbers(JsArray<PhoneNumber> phoneNumbers) /*-{
    this.setPhoneNumbers(
      phoneNumbers
    );
  }-*/;

  /**
   * Sets the postal addresses.
   */
  public final native void setPostalAddresses() /*-{
    this.setPostalAddresses();
  }-*/;

  /**
   * Sets the postal addresses.
   * 
   * @param postalAddresses Postal addresses, where each postal address is added using the addPostalAddress() function, or undefined to clear the postal addresses.
   */
  public final native void setPostalAddresses(JsArray<PostalAddress> postalAddresses) /*-{
    this.setPostalAddresses(
      postalAddresses
    );
  }-*/;

}
