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

/**
 * Contains test "scripts" for the various GData components.
 */
public class GDataTestScripts {
  /**
   * Contains data used in the GData Analytics service test cases.
   */
  public static class Analytics {
    public static final String testCookie_Name = "g314-scope-0";
    public static final String testCookie_Value = "scope=https://www.google.com/analytics/feeds/&token=2/B_op_3NxwEJZN9AxIA-uHoPiAJ-trg6WyvhPNYlGy_A";
    public static String testAccounts_Feed_Link = "https://www.google.com/analytics/feeds/accounts/default?max-results=50";
    public static String testAccounts_Feed_Title = "Profile list for gwt.gdata@gmail.com";
  }
  
  /**
   * Contains data used in the GData Base service test cases.
   */
  public static class GoogleBase {
    public static final String testCookie_Name = "g314-scope-1";
    public static final String testCookie_Value = "scope=http://www.google.com/base/feeds/&token=2/XWghVkJr-Y5oOGA2jrEjsQ";
    public static String testItems_Feed_Link = "http://www.google.com/base/feeds/items";
    public static String testItems_Feed_Title = "Items matching query: [customer id(int):5752122]";
    public static String testItem_Entry_Link = "http://www.google.com/base/feeds/items/7112179810031829902";
    public static String testItem_Entry_Author = "Gwt-Gdata";
    public static String testItem_Entry_Author_Created = "Gwt-Gdata";
    public static String testItem_Entry_Published = "Mon Oct 19 21:51:55 EDT 2009";
    public static String testItem_Entry_Title = "GWT GData is great";
    public static String testItem_Entry_Title_Updated = "GWT GData is great - Updated";
    public static String testItem_Entry_Title_Created = "GWT GData is great - Created";
    public static String testItem_Entry_Content = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p>";
    public static String testItem_Entry_Content_Updated = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p> - Updated";
    public static String testItem_Entry_Content_Created = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p> - Created";
    public static String testItem_Entry_TargetCountry = "US";
    public static String testItem_Entry_TargetCountry_Updated = "PT";
    public static String testItem_Entry_TargetCountry_Created = "PT";
    public static String testItem_Entry_ReviewType = "Product Review";
    public static String testItem_Entry_ReviewType_Created = "Product Review";
    public static String testItem_Entry_NameOfItem = "gwt-gdata";
    public static String testItem_Entry_NameOfItem_Created = "gwt-gdata";
    public static String testItem_Entry_ExpirationDate = "2038-01-19T03:14:07Z";
    public static String testItem_Entry_ExpirationDate_Created = "2038-01-19T03:14:07Z";
    public static String testItem_Entry_Rating = "5-Excellent";
    public static String testItem_Entry_Rating_Created = "5-Excellent";
    public static String testItem_Entry_CustomerId = "5752122";
    public static String testItem_Entry_CustomerId_Created = "5752122";
    public static String testItem_Entry_ItemType = "Reviews";
    public static String testItem_Entry_ItemType_Created = "Reviews";
    public static String testItem_Entry_ItemLanguage = "en";
    public static String testItem_Entry_ItemLanguage_Created = "en";
  }
  
  /**
   * Contains data used in the GData Blogger service test cases.
   */
  public static class Blogger {
    public static final String testCookie_Name = "g314-scope-2";
    public static final String testCookie_Value = "scope=http://www.blogger.com/feeds/&token=2/sJeuj7zf0afxn1w17m42XIPiAJ-trg6WyvhPNYlGy_A";
    public static String testBlogs_Feed_Link = "http://www.blogger.com/feeds/default/blogs";
    public static String testBlogs_Feed_Title = "GWT GData's Blogs";
    public static String testBlog_Entry_Link = "http://www.blogger.com/feeds/11123467028509174303/blogs/5689061262293823704";
    public static String testBlog_Entry_Title = "GWT GData";
    public static String testPosts_Feed_Link = "http://www.blogger.com/feeds/5689061262293823704/posts/default";
    public static String testPosts_Feed_Title = "GWT GData";
    public static String testPost_Entry_Link = "http://www.blogger.com/feeds/5689061262293823704/posts/default/2730022467742302306";
    public static String testPost_Entry_Title = "GWT-GData Test Post";
    public static String testPost_Entry_Title_Updated = "GWT-GData Test Post - Updated";
    public static String testPost_Entry_Title_Created = "GWT-GData Test Post - Created";
    public static String testPost_Entry_Contents = "This is a test of the GWT-GData API.";
    public static String testPost_Entry_Contents_Updated = "This is a test of the GWT-GData API - Updated.";
    public static String testPost_Entry_Contents_Created = "This is a test of the GWT-GData API - Created.";
    public static String testPost_Entry_CategoryScheme_Created = "http://www.blogger.com/atom/ns#";
    public static String testPost_Entry_CategoryLabel_Created = "Test Category";
    public static String testPost_Entry_CategoryTerm_Created = "Test";
    public static String testPost_Entry_Url = "http://gwt-gdata.blogspot.com/2009/06/gwt-gdata-test-post.html";
  }
  
  /**
   * Contains data used in the GData Calendar service test cases.
   */
  public static class Calendar {
    public static final String testCookie_Name = "g314-scope-3";
    public static final String testCookie_Value = "scope=http://www.google.com/calendar/feeds/&token=2/XKg6l__fFtHZkoHxg816g4PiAJ-trg6WyvhPNYlGy_A";
    public static String testCalendars_Feed_Link = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    public static String testCalendars_Feed_Title = "gwt.gdata@gmail.com's Calendar List";
    public static String testCalendars_Feed_InsertLink = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    public static String testCalendar_Entry_Link = "http://www.google.com/calendar/feeds/default/owncalendars/full/gwt.gdata%40gmail.com";
    public static String testCalendar_Entry_Title = "GWT GData Test Calendar 1";
    public static String testCalendar_Entry_Title_Updated = "GWT GData Test Calendar 1 - Updated";
    public static String testCalendar_Entry_Title_Created = "GWT GData Test Calendar 2 - Created";
    public static String testCalendar_Entry_Summary = "This is a GData calendar test.";
    public static String testCalendar_Entry_Summary_Updated = "This is a GData calendar test - Updated";
    public static String testCalendar_Entry_Summary_Created = "This is a GData calendar test - Created";
    public static String testCalendar_Entry_TimeZone_Created = "America/Los_Angeles";
    public static String testCalendar_Entry_AccessControlListLink = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/acl/full";
    public static String testCalendar_Entry_AtomAlternateLink = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/private/full";
    public static String testCalendar_Entry_AccessLevel = "owner";
    public static String testCalendar_Entry_Color = "#2952A3";
    public static String testCalendar_Entry_AuthorEmail = "gwt.gdata@gmail.com";
    public static String testCalendar_Entry_AuthorName = "gwt.gdata@gmail.com";
    public static String testCalendar_Entry_CategoryTerm = "http://schemas.google.com/gCal/2005#calendarmeta";
    public static String testCalendar_Entry_EditLink = "http://www.google.com/calendar/feeds/default/owncalendars/full/gwt.gdata%40gmail.com";
    public static String testCalendar_Entry_EventFeedLink = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/private/full";
  }
  
  /**
   * Contains data used in the GData Contacts service test cases.
   */
  public static class Contacts {
    public static final String testCookie_Name = "g314-scope-4";
    public static final String testCookie_Value = "scope=http://www.google.com/m8/feeds/&token=2/pmxHO6siS_UhUui-4nkuhA";
    public static String testContacts_Feed_Link = "http://www.google.com/m8/feeds/contacts/default/full";
    public static String testContacts_Feed_Title = "GWT's Contacts";
    public static String testContact_Entry_Link = "http://www.google.com/m8/feeds/contacts/gwt.gdata%40gmail.com/full/3552c9c10a0e7385";
    public static String testContact_Entry_Title = "GWT Test";
    public static String testContact_Entry_Title_Updated = "GWT Test - Updated";
    public static String testContact_Entry_Title_Created = "GWT Test - Created";
    public static String testContact_Entry_Email = "gwt.gdata@gmail.com";
    public static String testContact_Entry_Email_Updated = "gwt.gdata2@gmail.com";
    public static String testContact_Entry_Email_Created = "gwt.gdata3@gmail.com";
    public static String testContact_Entry_Company = "Test Title";
    public static String testContact_Entry_Company_Updated = "Test Title - Updated";
    public static String testContact_Entry_Company_Created = "Test Title - Created";
    public static String testContact_Entry_Phone = "000-111-2222";
    public static String testContact_Entry_Phone_Updated = "000-111-2222-2";
    public static String testContact_Entry_Phone_Created = "000-111-2222-3";
    public static String testContact_Entry_Address = "233 Main St.\nNY, New York, 10044, USA";
    public static String testContact_Entry_Address_Updated = "233 Main St.\nNY, New York, 10044, USA - Updated";
    public static String testContact_Entry_Address_Created = "233 Main St.\nNY, New York, 10044, USA - Created";
  }
  
  /**
   * Contains data used in the GData Finance service test cases.
   */
  public static class Finance {
    public static final String testCookie_Name = "g314-scope-5";
    public static final String testCookie_Value = "scope=http://finance.google.com/finance/feeds/&token=2/TsWf4t-kz-n89dAG_xtM5Q";
    public static String testPortfolios_Feed_Link = "http://finance.google.com/finance/feeds/default/portfolios";
    public static String testPortfolios_Feed_Title = "Portfolio Feed";
    public static String testPortfolio_Entry_Link = "http://finance.google.com/finance/feeds/default/portfolios/1";
    public static String testPortfolio_Entry_Title = "My Portfolio";
    public static String testPortfolio_Entry_Title_Updated = "My Portfolio - Updated";
    public static String testPortfolio_Entry_Title_Created = "My Portfolio - Created";
    public static String testPortfolio_Entry_Currency = "USD";
    public static String testPortfolio_Entry_Currency_Updated = "EUR";
    public static String testPortfolio_Entry_Currency_Created = "EUR";
    public static double testPortfolio_Entry_GainPercentage = 0.0;
    public static double testPortfolio_Entry_ReturnOverall = 0.0;
    public static double testPortfolio_Entry_ReturnYTD = 0.0;
  }
  
  /**
   * Contains data used in the GData Maps service test cases.
   */
  public static class Maps {
    public static final String testCookie_Name = "g314-scope-6";
    public static final String testCookie_Value = "scope=http://maps.google.com/maps/feeds/&token=2/DoHDpenyO3J6P8rrvQBxLg";
    public static String testMaps_Feed_Link = "http://maps.google.com/maps/feeds/maps/default/full";
    public static String testMaps_Feed_Title = "My maps";
    public static String testMap_Entry_Link = "http://maps.google.com/maps/feeds/maps/215436100924106759545/full/00046ddb0ea00aec32bb3?alt=json";
    public static String testMap_Entry_Title = "Test Map";
    public static String testMap_Entry_Title_Updated = "Test Map - Updated";
    public static String testMap_Entry_Title_Created = "Test Map - Created";
    public static String testMap_Entry_Content = "This is a GWT-GData test map.";
    public static String testMap_Entry_Content_Updated = "This is a GWT-GData test map - Updated.";
    public static String testMap_Entry_Content_Created = "This is a GWT-GData test map - Created.";
    public static String testFeatures_Feed_Link = "http://maps.google.com/maps/feeds/features/default/00046ddb0ea00aec32bb3/full";
    public static String testFeatures_Feed_Title = "Test Map";
    public static String testFeature_Entry_Link = "http://maps.google.com/maps/feeds/features/215436100924106759545/00046ddb0ea00aec32bb3/full/00046ddb692999cdaac49?alt=json";
    public static String testFeature_Entry_Title = "Test Marker";
    public static String testFeature_Entry_Content = "<kml:Placemark><kml:name>Test Marker</kml:name><kml:description><![CDATA[<div dir=\"ltr\">This is a GWT-GData test marker.</div>]]></kml:description><kml:Style><kml:IconStyle><kml:Icon><kml:href>http://maps.gstatic.com/intl/en_us/mapfiles/ms/micons/blue-dot.png</kml:href></kml:Icon></kml:IconStyle></kml:Style><kml:Point><kml:coordinates>-74.061584,40.702765,0.0</kml:coordinates></kml:Point></kml:Placemark>";
  }
  
  /**
   * Contains data used in the GData Maps service test cases.
   */
  public static class Sidewiki {
    public static final String testCookie_Name = "g314-scope-7";
    public static final String testCookie_Value = "scope=http://www.google.com/sidewiki/feeds/&token=2/tA8uBfPmrjP5sxNZCXdFPIPiAJ-trg6WyvhPNYlGy_A";
    public static String testEntries_Feed_Link = "http://www.google.com/sidewiki/feeds/entries/webpage/http%3A%2F%2Fwww.google.com%2F/full";
    public static String testEntries_Feed_Title = "\"Google\" - recent Sidewiki entries";
  }
}
