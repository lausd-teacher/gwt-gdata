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
 * Describes a structured postal address.
 */
public class StructuredPostalAddress extends JavaScriptObject {

  /**
   * Both structured postal address.
   */
  public static final String MAILCLASS_BOTH = getConstant("MAILCLASS_BOTH");

  /**
   * Letters structured postal address.
   */
  public static final String MAILCLASS_LETTERS =
      getConstant("MAILCLASS_LETTERS");

  /**
   * Neither structured postal address.
   */
  public static final String MAILCLASS_NEITHER =
      getConstant("MAILCLASS_NEITHER");

  /**
   * Parcels structured postal address.
   */
  public static final String MAILCLASS_PARCELS =
      getConstant("MAILCLASS_PARCELS");

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
   * Constructs a structured postal address.
   * @return A StructuredPostalAddress.
   */
  public static native StructuredPostalAddress newInstance() /*-{
    return new $wnd.google.gdata.StructuredPostalAddress();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.StructuredPostalAddress[name];
  }-*/;

  protected StructuredPostalAddress() { }

  /**
   * Returns the Used in work addresses. Also for 'in care of' or 'c/o'.
   * This element is optional.
   * 
   * @return Used in work addresses. Also for 'in care of' or 'c/o'.
   */
  public final native Agent getAgent() /*-{
    return this.getAgent();
  }-*/;

  /**
   * Returns the Can be city, village, town, borough, etc.
   * This element is optional.
   * 
   * @return Can be city, village, town, borough, etc.
   */
  public final native City getCity() /*-{
    return this.getCity();
  }-*/;

  /**
   * Returns the The country name. This element is optional.
   * 
   * @return The country name.
   */
  public final native Country getCountry() /*-{
    return this.getCountry();
  }-*/;

  /**
   * Returns the The full, unstructured address. This element is optional.
   * 
   * @return The full, unstructured address.
   */
  public final native FormattedAddress getFormattedAddress() /*-{
    return this.getFormattedAddress();
  }-*/;

  /**
   * Returns the Used in places where houses or buildings have names.
   * This element is optional.
   * 
   * @return Used in places where houses or buildings have names.
   */
  public final native HouseName getHousename() /*-{
    return this.getHousename();
  }-*/;

  /**
   * Returns the Simple string value used to name this address.
   * This attribute is optional.
   * 
   * @return Simple string value used to name this address.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the The mail class. This attribute is optional.
   * 
   * @return The mail class.
   */
  public final native String getMailClass() /*-{
    return this.getMailClass();
  }-*/;

  /**
   * Returns the Neighborhood. Used to disambiguate a street.
   * This element is optional.
   * 
   * @return Neighborhood. Used to disambiguate a street.
   */
  public final native Neighborhood getNeighborhood() /*-{
    return this.getNeighborhood();
  }-*/;

  /**
   * Returns the P.O. box. This element is optional.
   * 
   * @return P.O. box.
   */
  public final native PoBox getPobox() /*-{
    return this.getPobox();
  }-*/;

  /**
   * Returns the Postal code. This element is optional.
   * 
   * @return Postal code.
   */
  public final native PostCode getPostcode() /*-{
    return this.getPostcode();
  }-*/;

  /**
   * Returns whether this is the primary postal address.
   * This attribute is optional.
   * 
   * @return Whether this is the primary postal address.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the Region is state, province, county (in Ireland), Land
   * (in Germany), departement (in France), etc. This element is optional.
   * 
   * @return Region is state, province, county (in Ireland), Land (in Germany),
   * departement (in France), etc.
   */
  public final native Region getRegion() /*-{
    return this.getRegion();
  }-*/;

  /**
   * Returns the the postal address type. This attribute is optional.
   * 
   * @return The postal address type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the Can be street, avenue, road, etc. This element also includes
   * the house number and room/apartment/flat/floor number.
   * This element is optional.
   * 
   * @return Can be street, avenue, road, etc. This element also includes the
   * house number and room/apartment/flat/floor number.
   */
  public final native Street getStreet() /*-{
    return this.getStreet();
  }-*/;

  /**
   * Returns the Subregion is county (US), province (in Italy), etc.
   * This element is optional.
   * 
   * @return Subregion is county (US), province (in Italy), etc.
   */
  public final native Subregion getSubregion() /*-{
    return this.getSubregion();
  }-*/;

  /**
   * Returns the The context for the address use. This attribute is optional.
   * 
   * @return The context for the address use.
   */
  public final native String getUsage() /*-{
    return this.getUsage();
  }-*/;

  /**
   * Sets the Used in work addresses. Also for 'in care of' or 'c/o'.
   * This element is optional.
   * 
   * @param agent Used in work addresses. Also for 'in care of' or 'c/o'.
   */
  public final native void setAgent(Agent agent) /*-{
    this.setAgent(agent);
  }-*/;

  /**
   * Sets the Can be city, village, town, borough, etc.
   * This element is optional.
   * 
   * @param city Can be city, village, town, borough, etc.
   */
  public final native void setCity(City city) /*-{
    this.setCity(city);
  }-*/;

  /**
   * Sets the The country name. This element is optional.
   * 
   * @param country The country name.
   */
  public final native void setCountry(Country country) /*-{
    this.setCountry(country);
  }-*/;

  /**
   * Sets the The full, unstructured address. This element is optional.
   * 
   * @param formattedAddress The full, unstructured address.
   */
  public final native void setFormattedAddress(
      FormattedAddress formattedAddress) /*-{
    this.setFormattedAddress(formattedAddress);
  }-*/;

  /**
   * Sets the Used in places where houses or buildings have names.
   * This element is optional.
   * 
   * @param housename Used in places where houses or buildings have names.
   */
  public final native void setHousename(HouseName housename) /*-{
    this.setHousename(housename);
  }-*/;

  /**
   * Sets the Simple string value used to name this address.
   * This attribute is optional.
   * 
   * @param label Simple string value used to name this address.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets the The mail class. This attribute is optional.
   * 
   * @param mailClass The mail class.
   */
  public final native void setMailClass(String mailClass) /*-{
    this.setMailClass(mailClass);
  }-*/;

  /**
   * Sets the Neighborhood. Used to disambiguate a street.
   * This element is optional.
   * 
   * @param neighborhood Neighborhood. Used to disambiguate a street.
   */
  public final native void setNeighborhood(Neighborhood neighborhood) /*-{
    this.setNeighborhood(neighborhood);
  }-*/;

  /**
   * Sets the P.O. box. This element is optional.
   * 
   * @param pobox P.O. box.
   */
  public final native void setPobox(PoBox pobox) /*-{
    this.setPobox(pobox);
  }-*/;

  /**
   * Sets the Postal code. This element is optional.
   * 
   * @param postcode Postal code.
   */
  public final native void setPostcode(PostCode postcode) /*-{
    this.setPostcode(postcode);
  }-*/;

  /**
   * Sets whether this is the primary postal address.
   * This attribute is optional.
   * 
   * @param primary Whether this is the primary postal address.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the Region is state, province, county (in Ireland), Land
   * (in Germany), departement (in France), etc.
   * This element is optional.
   * 
   * @param region Region is state, province, county (in Ireland), Land
   * (in Germany), departement (in France), etc.
   */
  public final native void setRegion(Region region) /*-{
    this.setRegion(region);
  }-*/;

  /**
   * Sets the the postal address type. This attribute is optional.
   * 
   * @param rel The postal address type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

  /**
   * Sets the Can be street, avenue, road, etc. This element also includes the
   * house number and room/apartment/flat/floor number.
   * This element is optional.
   * 
   * @param street Can be street, avenue, road, etc. This element also includes
   * the house number and room/apartment/flat/floor number.
   */
  public final native void setStreet(Street street) /*-{
    this.setStreet(street);
  }-*/;
  
  /**
   * Sets the Subregion is county (US), province (in Italy), etc. This element
   * is optional.
   * 
   * @param subregion Subregion is county (US), province (in Italy), etc.
   */
  public final native void setSubregion(Subregion subregion) /*-{
    this.setSubregion(subregion);
  }-*/;

  /**
   * Sets the The context for the address use. This attribute is optional.
   * 
   * @param usage The context for the address use.
   */
  public final native void setUsage(String usage) /*-{
    this.setUsage(usage);
  }-*/;

}