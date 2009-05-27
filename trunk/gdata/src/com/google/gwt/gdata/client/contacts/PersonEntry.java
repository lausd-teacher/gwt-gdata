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
 * Comment unavailable.
 */
public class PersonEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.contacts.PersonEntry;
  }-*/;

  /**
   * Constructs a person entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PersonEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.PersonEntry(
      params
    );
  }-*/;

  /**
   * Constructs a person entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PersonEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.PersonEntry();
  }-*/;

  protected PersonEntry() { }

  /**
   * Adds a new email address.
   * 
   * @param emailAddress
   */
  public final native void addEmailAddress(Email emailAddress) /*-{
    this.addEmailAddress(
      emailAddress
    );
  }-*/;

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty
   */
  public final native void addExtendedProperty(ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Adds a new instant messaging address.
   * 
   * @param imAddress
   */
  public final native void addImAddress(Im imAddress) /*-{
    this.addImAddress(
      imAddress
    );
  }-*/;

  /**
   * Adds a new organization.
   * 
   * @param organization
   */
  public final native void addOrganization(Organization organization) /*-{
    this.addOrganization(
      organization
    );
  }-*/;

  /**
   * Adds a new phone number.
   * 
   * @param phoneNumber
   */
  public final native void addPhoneNumber(PhoneNumber phoneNumber) /*-{
    this.addPhoneNumber(
      phoneNumber
    );
  }-*/;

  /**
   * Adds a new postal address.
   * 
   * @param postalAddress
   */
  public final native void addPostalAddress(PostalAddress postalAddress) /*-{
    this.addPostalAddress(
      postalAddress
    );
  }-*/;

  /**
   * Returns the link to edit contact photo.
   * 
   * @return
   */
  public final native ContactLink getContactEditPhotoLink() /*-{
    return this.getContactEditPhotoLink();
  }-*/;

  /**
   * Returns the link that provides the contact photo.
   * 
   * @return
   */
  public final native ContactLink getContactPhotoLink() /*-{
    return this.getContactPhotoLink();
  }-*/;

  /**
   * Returns the email addresses.
   * 
   * @return
   */
  public final native JsArray<com.google.gwt.gdata.client.Email> getEmailAddresses() /*-{
    return this.getEmailAddresses();
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return
   */
  public final native JsArray<ExtendedProperty> getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the instant messaging addresses.
   * 
   * @return
   */
  public final native JsArray<Im> getImAddresses() /*-{
    return this.getImAddresses();
  }-*/;

  /**
   * Returns the organizations.
   * 
   * @return
   */
  public final native JsArray<Organization> getOrganizations() /*-{
    return this.getOrganizations();
  }-*/;

  /**
   * Returns the phone numbers.
   * 
   * @return
   */
  public final native JsArray<PhoneNumber> getPhoneNumbers() /*-{
    return this.getPhoneNumbers();
  }-*/;

  /**
   * Returns the postal addresses.
   * 
   * @return
   */
  public final native JsArray<PostalAddress> getPostalAddresses() /*-{
    return this.getPostalAddresses();
  }-*/;

  /**
   * Sets the email addresses.
   * 
   * @param emailAddresses
   */
  public final native void setEmailAddresses(JsArray<Email> emailAddresses) /*-{
    this.setEmailAddresses(
      emailAddresses
    );
  }-*/;

  /**
   * Sets the email addresses.
   * 
   * @param emailAddresses
   */
  public final native void setEmailAddresses() /*-{
    this.setEmailAddresses();
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties(JsArray<ExtendedProperty> extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the instant messaging addresses.
   * 
   * @param imAddresses
   */
  public final native void setImAddresses(JsArray<Im> imAddresses) /*-{
    this.setImAddresses(
      imAddresses
    );
  }-*/;

  /**
   * Sets the instant messaging addresses.
   * 
   * @param imAddresses
   */
  public final native void setImAddresses() /*-{
    this.setImAddresses();
  }-*/;

  /**
   * Sets the organizations.
   * 
   * @param organizations
   */
  public final native void setOrganizations(JsArray<Organization> organizations) /*-{
    this.setOrganizations(
      organizations
    );
  }-*/;

  /**
   * Sets the organizations.
   * 
   * @param organizations
   */
  public final native void setOrganizations() /*-{
    this.setOrganizations();
  }-*/;

  /**
   * Sets the phone numbers.
   * 
   * @param phoneNumbers
   */
  public final native void setPhoneNumbers(JsArray<PhoneNumber> phoneNumbers) /*-{
    this.setPhoneNumbers(
      phoneNumbers
    );
  }-*/;

  /**
   * Sets the phone numbers.
   * 
   * @param phoneNumbers
   */
  public final native void setPhoneNumbers() /*-{
    this.setPhoneNumbers();
  }-*/;

  /**
   * Sets the postal addresses.
   * 
   * @param postalAddresses
   */
  public final native void setPostalAddresses(JsArray<PostalAddress> postalAddresses) /*-{
    this.setPostalAddresses(
      postalAddresses
    );
  }-*/;

  /**
   * Sets the postal addresses.
   * 
   * @param postalAddresses
   */
  public final native void setPostalAddresses() /*-{
    this.setPostalAddresses();
  }-*/;

}
