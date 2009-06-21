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
 * Comment unavailable.
 */
public class StructuredPostalAddress extends JavaScriptObject {

  /**
   * Both structured postal address.
   */
  public static final String MAILCLASS_BOTH = getConstant("MAILCLASS_BOTH");

  /**
   * Letters structured postal address.
   */
  public static final String MAILCLASS_LETTERS = getConstant("MAILCLASS_LETTERS");

  /**
   * Neither structured postal address.
   */
  public static final String MAILCLASS_NEITHER = getConstant("MAILCLASS_NEITHER");

  /**
   * Parcels structured postal address.
   */
  public static final String MAILCLASS_PARCELS = getConstant("MAILCLASS_PARCELS");

  /**
   * Home structured postal address.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Other structured postal address.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Work structured postal address.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * General structured postal address.
   */
  public static final String USAGE_GENERAL = getConstant("USAGE_GENERAL");

  /**
   * Local structured postal address.
   */
  public static final String USAGE_LOCAL = getConstant("USAGE_LOCAL");

  /**
   * Constructs a structured postal address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native StructuredPostalAddress newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.StructuredPostalAddress(
      params
    );
  }-*/;

  /**
   * Constructs a structured postal address using an object parameter whose property names match the setter method to use for each property.
   */
  public static native StructuredPostalAddress newInstance() /*-{
    return new $wnd.google.gdata.StructuredPostalAddress();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.StructuredPostalAddress[name];
  }-*/;

  protected StructuredPostalAddress() { }

  /**
   * Returns the Used in work addresses.
   * 
   * @return
   */
  public final native Agent getAgent() /*-{
    return this.getAgent();
  }-*/;

  /**
   * Returns the Can be city, village, town, borough, etc.
   * 
   * @return
   */
  public final native City getCity() /*-{
    return this.getCity();
  }-*/;

  /**
   * Returns the The country name.
   * 
   * @return
   */
  public final native Country getCountry() /*-{
    return this.getCountry();
  }-*/;

  /**
   * Returns the The full, unstructured address.
   * 
   * @return
   */
  public final native FormattedAddress getFormattedAddress() /*-{
    return this.getFormattedAddress();
  }-*/;

  /**
   * Returns the Used in places where houses or buildings have names.
   * 
   * @return
   */
  public final native HouseName getHousename() /*-{
    return this.getHousename();
  }-*/;

  /**
   * Returns the Simple string value used to name this address.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the The mail class.
   * 
   * @return
   */
  public final native String getMailClass() /*-{
    return this.getMailClass();
  }-*/;

  /**
   * Returns the Neighborhood.
   * 
   * @return
   */
  public final native Neighborhood getNeighborhood() /*-{
    return this.getNeighborhood();
  }-*/;

  /**
   * Returns the P.O.
   * 
   * @return
   */
  public final native PoBox getPobox() /*-{
    return this.getPobox();
  }-*/;

  /**
   * Returns the Postal code.
   * 
   * @return
   */
  public final native PostCode getPostcode() /*-{
    return this.getPostcode();
  }-*/;

  /**
   * Returns whether this is the primary postal address.
   * 
   * @return
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the Region is state, province, county (in Ireland), Land (in Germany), departement (in France), etc.
   * 
   * @return
   */
  public final native Region getRegion() /*-{
    return this.getRegion();
  }-*/;

  /**
   * Returns the the postal address type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the Can be street, avenue, road, etc.
   * 
   * @return
   */
  public final native Street getStreet() /*-{
    return this.getStreet();
  }-*/;

  /**
   * Returns the Subregion is county (US), province (in Italy), etc.
   * 
   * @return
   */
  public final native Subregion getSubregion() /*-{
    return this.getSubregion();
  }-*/;

  /**
   * Returns the The context for the address use.
   * 
   * @return
   */
  public final native String getUsage() /*-{
    return this.getUsage();
  }-*/;

  /**
   * Sets the Used in work addresses.
   * 
   * @param agent
   */
  public final native void setAgent(Agent agent) /*-{
    this.setAgent(
      agent
    );
  }-*/;

  /**
   * Sets the Used in work addresses.
   * 
   * @param agent
   */
  public final native void setAgent() /*-{
    this.setAgent();
  }-*/;

  /**
   * Sets the Can be city, village, town, borough, etc.
   * 
   * @param city
   */
  public final native void setCity(City city) /*-{
    this.setCity(
      city
    );
  }-*/;

  /**
   * Sets the Can be city, village, town, borough, etc.
   * 
   * @param city
   */
  public final native void setCity() /*-{
    this.setCity();
  }-*/;

  /**
   * Sets the The country name.
   * 
   * @param country
   */
  public final native void setCountry(Country country) /*-{
    this.setCountry(
      country
    );
  }-*/;

  /**
   * Sets the The country name.
   * 
   * @param country
   */
  public final native void setCountry() /*-{
    this.setCountry();
  }-*/;

  /**
   * Sets the The full, unstructured address.
   * 
   * @param formattedAddress
   */
  public final native void setFormattedAddress(FormattedAddress formattedAddress) /*-{
    this.setFormattedAddress(
      formattedAddress
    );
  }-*/;

  /**
   * Sets the The full, unstructured address.
   * 
   * @param formattedAddress
   */
  public final native void setFormattedAddress() /*-{
    this.setFormattedAddress();
  }-*/;

  /**
   * Sets the Used in places where houses or buildings have names.
   * 
   * @param housename
   */
  public final native void setHousename(HouseName housename) /*-{
    this.setHousename(
      housename
    );
  }-*/;

  /**
   * Sets the Used in places where houses or buildings have names.
   * 
   * @param housename
   */
  public final native void setHousename() /*-{
    this.setHousename();
  }-*/;

  /**
   * Sets the Simple string value used to name this address.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the Simple string value used to name this address.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the The mail class.
   * 
   * @param mailClass
   */
  public final native void setMailClass(String mailClass) /*-{
    this.setMailClass(
      mailClass
    );
  }-*/;

  /**
   * Sets the The mail class.
   * 
   * @param mailClass
   */
  public final native void setMailClass() /*-{
    this.setMailClass();
  }-*/;

  /**
   * Sets the Neighborhood.
   * 
   * @param neighborhood
   */
  public final native void setNeighborhood(Neighborhood neighborhood) /*-{
    this.setNeighborhood(
      neighborhood
    );
  }-*/;

  /**
   * Sets the Neighborhood.
   * 
   * @param neighborhood
   */
  public final native void setNeighborhood() /*-{
    this.setNeighborhood();
  }-*/;

  /**
   * Sets the P.O.
   * 
   * @param pobox
   */
  public final native void setPobox(PoBox pobox) /*-{
    this.setPobox(
      pobox
    );
  }-*/;

  /**
   * Sets the P.O.
   * 
   * @param pobox
   */
  public final native void setPobox() /*-{
    this.setPobox();
  }-*/;

  /**
   * Sets the Postal code.
   * 
   * @param postcode
   */
  public final native void setPostcode(PostCode postcode) /*-{
    this.setPostcode(
      postcode
    );
  }-*/;

  /**
   * Sets the Postal code.
   * 
   * @param postcode
   */
  public final native void setPostcode() /*-{
    this.setPostcode();
  }-*/;

  /**
   * Sets whether this is the primary postal address.
   * 
   * @param primary
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets whether this is the primary postal address.
   * 
   * @param primary
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets the Region is state, province, county (in Ireland), Land (in Germany), departement (in France), etc.
   * 
   * @param region
   */
  public final native void setRegion(Region region) /*-{
    this.setRegion(
      region
    );
  }-*/;

  /**
   * Sets the Region is state, province, county (in Ireland), Land (in Germany), departement (in France), etc.
   * 
   * @param region
   */
  public final native void setRegion() /*-{
    this.setRegion();
  }-*/;

  /**
   * Sets the the postal address type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the the postal address type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the Can be street, avenue, road, etc.
   * 
   * @param street
   */
  public final native void setStreet(Street street) /*-{
    this.setStreet(
      street
    );
  }-*/;

  /**
   * Sets the Can be street, avenue, road, etc.
   * 
   * @param street
   */
  public final native void setStreet() /*-{
    this.setStreet();
  }-*/;

  /**
   * Sets the Subregion is county (US), province (in Italy), etc.
   * 
   * @param subregion
   */
  public final native void setSubregion(Subregion subregion) /*-{
    this.setSubregion(
      subregion
    );
  }-*/;

  /**
   * Sets the Subregion is county (US), province (in Italy), etc.
   * 
   * @param subregion
   */
  public final native void setSubregion() /*-{
    this.setSubregion();
  }-*/;

  /**
   * Sets the The context for the address use.
   * 
   * @param usage
   */
  public final native void setUsage(String usage) /*-{
    this.setUsage(
      usage
    );
  }-*/;

  /**
   * Sets the The context for the address use.
   * 
   * @param usage
   */
  public final native void setUsage() /*-{
    this.setUsage();
  }-*/;

}
