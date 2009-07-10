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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the StructuredPostalAddress class.
 */
public class StructuredPostalAddressTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("MAILCLASS_BOTH", StructuredPostalAddress.MAILCLASS_BOTH);
    assertNotNull("MAILCLASS_LETTERS", StructuredPostalAddress.MAILCLASS_LETTERS);
    assertNotNull("MAILCLASS_NEITHER", StructuredPostalAddress.MAILCLASS_NEITHER);
    assertNotNull("MAILCLASS_PARCELS", StructuredPostalAddress.MAILCLASS_PARCELS);
    assertNotNull("REL_HOME", StructuredPostalAddress.REL_HOME);
    assertNotNull("REL_OTHER", StructuredPostalAddress.REL_OTHER);
    assertNotNull("REL_WORK", StructuredPostalAddress.REL_WORK);
    assertNotNull("USAGE_GENERAL", StructuredPostalAddress.USAGE_GENERAL);
    assertNotNull("USAGE_LOCAL", StructuredPostalAddress.USAGE_LOCAL);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", StructuredPostalAddress.newInstance());
  }

  public void testProperties() {
    StructuredPostalAddress obj = StructuredPostalAddress.newInstance();
    Neighborhood neighborhood = Neighborhood.newInstance();
    obj.setNeighborhood(neighborhood);
    assertSame("neighborhood", obj.getNeighborhood(), neighborhood);
    Agent agent = Agent.newInstance();
    obj.setAgent(agent);
    assertSame("agent", obj.getAgent(), agent);
    PostCode postcode = PostCode.newInstance();
    obj.setPostcode(postcode);
    assertSame("postcode", obj.getPostcode(), postcode);
    HouseName housename = HouseName.newInstance();
    obj.setHousename(housename);
    assertSame("housename", obj.getHousename(), housename);
    FormattedAddress formattedaddress = FormattedAddress.newInstance();
    obj.setFormattedAddress(formattedaddress);
    assertSame("formattedaddress", obj.getFormattedAddress(), formattedaddress);
    String usage = "myValue";
    obj.setUsage(usage);
    assertEquals("usage", obj.getUsage(), usage);
    Street street = Street.newInstance();
    obj.setStreet(street);
    assertSame("street", obj.getStreet(), street);
    PoBox pobox = PoBox.newInstance();
    obj.setPobox(pobox);
    assertSame("pobox", obj.getPobox(), pobox);
    String label = "myValue";
    obj.setLabel(label);
    assertEquals("label", obj.getLabel(), label);
    City city = City.newInstance();
    obj.setCity(city);
    assertSame("city", obj.getCity(), city);
    Subregion subregion = Subregion.newInstance();
    obj.setSubregion(subregion);
    assertSame("subregion", obj.getSubregion(), subregion);
    Country country = Country.newInstance();
    obj.setCountry(country);
    assertSame("country", obj.getCountry(), country);
    boolean primary = true;
    obj.setPrimary(primary);
    assertSame("primary", obj.getPrimary(), primary);
    String rel = "myValue";
    obj.setRel(rel);
    assertEquals("rel", obj.getRel(), rel);
    Region region = Region.newInstance();
    obj.setRegion(region);
    assertSame("region", obj.getRegion(), region);
    String mailclass = "myValue";
    obj.setMailClass(mailclass);
    assertEquals("mailclass", obj.getMailClass(), mailclass);
  }
}
