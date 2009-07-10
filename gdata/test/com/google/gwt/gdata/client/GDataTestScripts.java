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

import com.google.gwt.gdata.client.analytics.AccountEntry;
import com.google.gwt.gdata.client.analytics.AccountFeed;
import com.google.gwt.gdata.client.blogger.BlogEntry;
import com.google.gwt.gdata.client.blogger.BlogFeed;
import com.google.gwt.gdata.client.blogger.BlogPostFeed;
import com.google.gwt.gdata.client.blogger.PostEntry;
import com.google.gwt.gdata.client.calendar.CalendarEntry;
import com.google.gwt.gdata.client.calendar.CalendarFeed;
import com.google.gwt.gdata.client.contacts.ContactEntry;
import com.google.gwt.gdata.client.contacts.ContactFeed;
import com.google.gwt.gdata.client.finance.PortfolioEntry;
import com.google.gwt.gdata.client.finance.PortfolioFeed;
import com.google.gwt.gdata.client.gbase.ItemsEntry;
import com.google.gwt.gdata.client.gbase.ItemsFeed;
import com.google.gwt.gdata.client.maps.FeatureEntry;
import com.google.gwt.gdata.client.maps.FeatureFeed;
import com.google.gwt.gdata.client.maps.MapEntry;
import com.google.gwt.gdata.client.maps.MapFeed;

/**
 * Contains test "scripts" for the various GData components.
 */
public class GDataTestScripts {
  /**
   * Contains data used in the GData Analytics service test cases.
   */
  public static class Analytics {
    public static final String testCookie_Name = "g314-scope-0";
    public static final String testCookie_Value = "scope=https://www.google.com/analytics/feeds/&token=2/h8MsH9S7kyvBznY-ah-6DA";
    public static AccountFeed testAccounts_Feed = null;
    public static String testAccounts_FeedLink = "https://www.google.com/analytics/feeds/accounts/default?max-results=50";
    public static String testAccounts_FeedTitle = "Profile list for gwt.gdata@gmail.com";
    public static String testAccounts_FeedId = "http://www.google.com/analytics/feeds/accounts/gwt.gdata@gmail.com";
    public static AccountEntry testAccount_Entry_Original = null;
  }
  /**
   * Contains data used in the GData Blogger service test cases.
   */
  public static class Blogger {
    public static final String testCookie_Name = "g314-scope-1";
    public static final String testCookie_Value = "scope=http://www.blogger.com/feeds/&token=2/kHSJW6EMeuxrpRtxJnyqKoPiAJ-trg6WyvhPNYlGy_A";
    public static BlogFeed testBlogs_Feed = null;
    public static String testBlogs_FeedLink = "http://www.blogger.com/feeds/default/blogs";
    public static String testBlogs_FeedTitle = "GWT GData's Blogs";
    public static String testBlogs_FeedId = "tag:blogger.com,1999:user-342684499832.blogs";
    public static BlogEntry testBlog_Entry_Original = null;
    public static String testPost_FeedLink = "http://www.blogger.com/feeds/5689061262293823704/posts/default";
    public static BlogPostFeed testPost_Feed = null;
    public static PostEntry testPost_Entry_Original = null;
    public static PostEntry testPost_Entry_Created = null;
    public static String testPost_Title_Original = "GWT-GData Test Post";
    public static String testPost_Title_Updated = "GWT-GData Test Post - Updated";
    public static String testPost_Title_Created = "GWT-GData Test Post - Created";
    public static String testPost_Contents_Original = "This is a test of the GWT-GData API.";
    public static String testPost_Contents_Updated = "This is a test of the GWT-GData API - Updated.";
    public static String testPost_Contents_Created = "This is a test of the GWT-GData API - Created.";
    public static String testPost_CategoryScheme_Created = "http://www.blogger.com/atom/ns#";
    public static String testPost_CategoryLabel_Created = "Test Category";
    public static String testPost_CategoryTerm_Created = "Test";
    public static String testPost_Url_Original = "http://gwt-gdata.blogspot.com/2009/06/gwt-gdata-test-post.html";
  }
  /**
   * Contains data used in the GData Calendar service test cases.
   */
  public static class Calendar {
    public static final String testCookie_Name = "g314-scope-0";
    public static final String testCookie_Value = "scope=http://www.google.com/calendar/feeds/&token=2/POEfcUwqkbSIiyj4CaiQ6A";
    public static CalendarFeed testCalendars_Feed = null;
    public static String testCalendars_FeedLink = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    public static String testCalendars_FeedTitle = "GWT GData's Calendar List";
    public static String testCalendars_FeedId = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    public static String testCalendars_InsertLink = "http://www.google.com/calendar/feeds/default/owncalendars/full";
    public static CalendarEntry testCalendar_Entry_Original = null;
    public static CalendarEntry testCalendar_Entry_Created = null;
    public static String testCalendar_Title_Original = "GWT GData Test Calendar 1";
    public static String testCalendar_Title_Updated = "GWT GData Test Calendar 1 - Updated";
    public static String testCalendar_Title_Created = "GWT GData Test Calendar 2 - Created";
    public static String testCalendar_Summary_Original = "This is a GData calendar test.";
    public static String testCalendar_Summary_Updated = "This is a GData calendar test - Updated";
    public static String testCalendar_Summary_Created = "This is a GData calendar test - Created";
    public static String testCalendar_TimeZone_Created = "America/Los_Angeles";
    public static String testCalendar_AccessControlListLink_Original = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/acl/full";
    public static String testCalendar_AtomAlternateLink_Original = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/private/full";
    public static String testCalendar_AccessLevel_Original = "owner";
    public static String testCalendar_Color_Original = "#2952A3";
    public static String testCalendar_AuthorEmail_Original = "gwt.gdata@gmail.com";
    public static String testCalendar_AuthorName_Original = "GWT GData";
    public static String testCalendar_CategoryTerm_Original = "http://schemas.google.com/gCal/2005#calendarmeta";
    public static String testCalendar_EditLink_Original = "http://www.google.com/calendar/feeds/default/owncalendars/full/gwt.gdata%40gmail.com";
    public static String testCalendar_EventFeedLink_Original = "http://www.google.com/calendar/feeds/gwt.gdata%40gmail.com/private/full";
    public static String testCalendar_Id_Original = "http://www.google.com/calendar/feeds/default/owncalendars/full/gwt.gdata%40gmail.com";
    public static String testCalendar_Link_Original = "http://www.google.com/calendar/feeds/default/owncalendars/full/gwt.gdata%40gmail.com";
  }
  /**
   * Contains data used in the GData Contacts service test cases.
   */
  public static class Contacts {
    public static final String testCookie_Name = "g314-scope-2";
    public static final String testCookie_Value = "scope=http://www.google.com/m8/feeds/&token=2/cMKVUGUsBSRDOjf3oUoPS4PiAJ-trg6WyvhPNYlGy_A";
    public static String testContacts_FeedLink = "http://www.google.com/m8/feeds/contacts/default/full";
    public static String testContacts_FeedTitle = "GWT's Contacts";
    public static String testContacts_FeedId = "gwt.gdata@gmail.com";
    public static ContactFeed testContacts_Feed = null;
    public static ContactEntry testContact_Entry_Original = null;
    public static ContactEntry testContact_Entry_Created = null;
    public static String testContact_Title_Original = "GWT Test";
    public static String testContact_Title_Updated = "GWT Test - Updated";
    public static String testContact_Title_Created = "GWT Test - Created";
    public static String testContact_Email_Original = "gwt.gdata@gmail.com";
    public static String testContact_Email_Updated = "gwt.gdata2@gmail.com";
    public static String testContact_Email_Created = "gwt.gdata3@gmail.com";
    public static String testContact_Company_Original = "Test Title";
    public static String testContact_Company_Updated = "Test Title - Updated";
    public static String testContact_Company_Created = "Test Title - Created";
    public static String testContact_Phone_Original = "000-111-2222";
    public static String testContact_Phone_Updated = "000-111-2222-2";
    public static String testContact_Phone_Created = "000-111-2222-3";
    public static String testContact_Address_Original = "233 Main St.\nNY, New York, 10044, USA";
    public static String testContact_Address_Updated = "233 Main St.\nNY, New York, 10044, USA - Updated";
    public static String testContact_Address_Created = "233 Main St.\nNY, New York, 10044, USA - Created";
  }
  /**
   * Contains data used in the GData Finance service test cases.
   */
  public static class Finance {
    public static final String testCookie_Name = "g314-scope-0";
    public static final String testCookie_Value = "scope=http://finance.google.com/finance/feeds/&token=2/FwcRbMRSxsl6HmJDqcWZUA";
    public static String testPortfolios_FeedLink = "http://finance.google.com/finance/feeds/default/portfolios";
    public static String testPortfolios_FeedTitle = "Portfolio Feed";
    public static String testPortfolios_FeedId = "http://finance.google.com/finance/feeds/gwt.gdata@gmail.com/portfolios";
    public static PortfolioFeed testPortfolios_Feed = null;
    public static PortfolioEntry testPortfolio_Entry_Original = null;
    public static PortfolioEntry testPortfolio_Entry_Created = null;
    public static String testPortfolio_Title_Original = "My Portfolio";
    public static String testPortfolio_Title_Updated = "My Portfolio - Updated";
    public static String testPortfolio_Title_Created = "My Portfolio - Created";
    public static String testPortfolio_Currency_Original = "USD";
    public static String testPortfolio_Currency_Updated = "EUR";
    public static String testPortfolio_Currency_Created = "EUR";
    public static double testPortfolio_GainPercentage_Original = 0.0;
    public static double testPortfolio_ReturnOverall_Original = 0.0;
    public static double testPortfolio_ReturnYTD_Original = 0.0;
  }
  /**
   * Contains data used in the GData Base service test cases.
   */
  public static class GoogleBase {
    public static final String testCookie_Name = "g314-scope-1";
    public static final String testCookie_Value = "scope=http://www.google.com/base&token=2/9r7LTLEsc_LVlX_G9HoyJoPiAJ-trg6WyvhPNYlGy_A";
    public static String testItems_FeedLink = "http://www.google.com/base/feeds/items";
    public static String testItems_FeedTitle = "Items matching query: [customer id(int):5752122]";
    public static String testItems_FeedId = "http://www.google.com/base/feeds/items";
    public static ItemsFeed testItems_Feed = null;
    public static ItemsEntry testItem_Entry_Original = null;
    public static ItemsEntry testItem_Entry_Created = null;
    public static String testItem_Author_Original = "Gwt-Gdata";
    public static String testItem_Author_Created = "Gwt-Gdata";
    public static String testItem_Published_Original = "Fri Jun 12 00:17:26 EDT 2009";
    public static String testItem_Title_Original = "GWT GData is great";
    public static String testItem_Title_Updated = "GWT GData is great - Updated";
    public static String testItem_Title_Created = "GWT GData is great - Created";
    public static String testItem_Content_Original = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p>";
    public static String testItem_Content_Updated = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p> - Updated";
    public static String testItem_Content_Created = "<p>GWT-GData is a GData library for GWT, it wraps around the GData JavaScript API.<br></p> - Created";
    public static String testItem_TargetCountry_Original = "US";
    public static String testItem_TargetCountry_Updated = "PT";
    public static String testItem_TargetCountry_Created = "PT";
    public static String testItem_ReviewType_Original = "Product Review";
    public static String testItem_ReviewType_Created = "Product Review";
    public static String testItem_NameOfItem_Original = "gwt-gdata";
    public static String testItem_NameOfItem_Created = "gwt-gdata";
    public static String testItem_ExpirationDate_Original = "2038-01-19T03:14:07Z";
    public static String testItem_ExpirationDate_Created = "2038-01-19T03:14:07Z";
    public static String testItem_Rating_Original = "5-Excellent";
    public static String testItem_Rating_Created = "5-Excellent";
    public static String testItem_CustomerId_Original = "5752122";
    public static String testItem_CustomerId_Created = "5752122";
    public static String testItem_ItemType_Original = "Reviews";
    public static String testItem_ItemType_Created = "Reviews";
    public static String testItem_ItemLanguage_Original = "en";
    public static String testItem_ItemLanguage_Created = "en";
  }
  /**
   * Contains data used in the GData Maps service test cases.
   */
  public static class Maps {
    public static final String testCookie_Name = "g314-scope-2";
    public static final String testCookie_Value = "scope=http://maps.google.com/maps/feeds&token=2/MOTOjYIfNyMXCmugxTC-boPiAJ-trg6WyvhPNYlGy_A";
    public static String testMaps_FeedLink = "http://maps.google.com/maps/feeds/maps/default/full";
    public static String testMaps_FeedTitle = "My maps";
    public static String testMaps_FeedId = "http://maps.google.com/maps/feeds/maps/215436100924106759545";
    public static MapFeed testMaps_Feed = null;
    public static MapEntry testMap_Entry_Original = null;
    public static MapEntry testMap_Entry_Created = null;
    public static String testMap_Title_Original = "Test Map";
    public static String testMap_Title_Updated = "Test Map - Updated";
    public static String testMap_Title_Created = "Test Map - Created";
    public static String testMap_Content_Original = "This is a GWT-GData test map.";
    public static String testMap_Content_Updated = "This is a GWT-GData test map - Updated.";
    public static String testMap_Content_Created = "This is a GWT-GData test map - Created.";
    public static FeatureFeed testFeatures_Feed = null;
    public static FeatureEntry testFeature_Entry_Original = null;
    public static FeatureEntry testFeature_Entry_Created = null;
    public static String testFeatures_FeedLink = "http://maps.google.com/maps/feeds/features/default/00046ddb0ea00aec32bb3/full";
    public static String testFeatures_FeedTitle = "Test Map";
    public static String testFeatures_FeedId = "http://maps.google.com/maps/feeds/features/215436100924106759545/00046ddb0ea00aec32bb3";
    public static String testFeature_Id_Original = "http://maps.google.com/maps/feeds/maps/215436100924106759545/00046ddb0ea00aec32bb3";
    public static String testFeature_Title_Original = "Test Marker";
    public static String testFeature_Content_Original = "<kml:Placemark><kml:name>Test Marker</kml:name><kml:description><![CDATA[<div dir=\"ltr\">This is a GWT-GData test marker.</div>]]></kml:description><kml:Style><kml:IconStyle><kml:Icon><kml:href>http://maps.gstatic.com/intl/en_us/mapfiles/ms/micons/blue-dot.png</kml:href></kml:Icon></kml:IconStyle></kml:Style><kml:Point><kml:coordinates>-74.061584,40.702765,0.0</kml:coordinates></kml:Point></kml:Placemark>";
  }
}
