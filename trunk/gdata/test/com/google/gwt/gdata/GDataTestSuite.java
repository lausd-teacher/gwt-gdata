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

package com.google.gwt.gdata;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite for GDataTest.
 */
public class GDataTestSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("TestSuite for the GDataTest.");
    suite.addTestSuite(com.google.gwt.gdata.client.acl.AclEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.acl.AclFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.acl.AclKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.acl.AclRoleTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.acl.AclScopeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.acl.LinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.AgentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.AccountEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.AccountFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.AccountQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.AggregatesTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.AnalyticsServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.DataEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.DataFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.DataQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.DataSourceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.DimensionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.EndDateTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.MetricTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.PropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.StartDateTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.TableIdTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.analytics.TableNameTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.AcceptTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.CategoriesTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.CollectionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.ControlTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.DraftTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.EditedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.ServiceDocumentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.app.WorkspaceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.CategoryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.EmailTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.GeneratorTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.IdTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.LinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.LogoTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.NameTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.PersonTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.PublishedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.TextTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.UpdatedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.atom.UriTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.AttendeeStatusTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.AttendeeTypeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogCommentFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogCommentQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BloggerLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BloggerServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogPostFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogPostQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.BlogQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.CommentEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.PostCommentFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.PostCommentQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.blogger.PostEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.AccessLevelPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.AnyoneCanAddSelfPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarAclEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarAclFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarAclRoleTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarCommentEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarCommentFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarCommentQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarCommentsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarCommentsFeedLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarEventEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarEventFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarEventQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarExtendedPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarMetaKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarRecurrenceExceptionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarRecurrenceExceptionEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarRecurrenceExceptionEntryLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarSettingsFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.CalendarWhoTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.ColorPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.EventFeedLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.GuestsCanInviteOthersPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.GuestsCanModifyPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.GuestsCanSeeGuestsPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.HiddenPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.IcalUIDPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.OverrideNamePropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.PrivateCopyPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.QuickAddPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.ResourcePropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SelectedPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SendAclNotificationsPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SendEventNotificationsPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SequenceNumberPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SettingsEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SettingsKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SettingsPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SuppressReplyNotificationsPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.SyncEventPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.TimesCleanedPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.TimeZonePropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.WebContentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.calendar.WebContentGadgetPrefTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.CityTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.QueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.CommentsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactGroupEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactGroupFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactGroupKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.ContactsServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.GroupMembershipInfoTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.PersonEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.contacts.SystemGroupTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.CountryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.CustomPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.DeletedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.EmailTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.EntryLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.EventKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.EventStatusTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.ExtendedPropertyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.FeedLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.CommissionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.CostBasisTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.DaysGainTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.FinanceServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.GainTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.MarketValueTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioDataTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioFeedLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PortfolioQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionDataTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionFeedLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PositionQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.PriceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.SymbolTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.TransactionDataTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.TransactionEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.TransactionFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.finance.TransactionKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.FormattedAddressTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AccountStatusTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AdultContentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AttributeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AttributesEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AttributesFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.AttributesQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.DelimiterTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.EncodingTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.FeedErrorTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.FeedErrorsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.FeedFileNameTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.FileFormatTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.GmAttributeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.GmAttributesTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.GmItemTypeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.GmValueTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.GoogleBaseServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemAppControlTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemDisapprovedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemPublishingPriorityTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemsEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemsFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemsInsertedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemsProcessedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemsQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemTypeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemTypesEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemTypesFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ItemTypesQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.LocalesEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.LocalesFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.LocalesQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.MediaEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.MediaFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.ProcessingStatusTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.SnippetsEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.SnippetsFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.SnippetsQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.TargetCountryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.gbase.UseQuotedFieldsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GeoLatTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GeoLongTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GeoRssBoxTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GeoRssPointTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GeoRssWhereTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GmlEnvelopeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GmlLowerCornerTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GmlPointTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GmlPosTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.GmlUpperCornerTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.geo.W3CPointTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.HouseNameTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.ImTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.KindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.LastViewedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.LinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.FeatureCategoryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.FeatureEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.FeatureFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.FeatureQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.KmlContentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.MapCategoryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.MapEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.MapFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.MapQueryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.MapsServiceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.VersionCategoryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.VersionEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.maps.VersionFeedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaCategoryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaContentTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaCopyrightTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaCreditTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaDescriptionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaGroupTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaHashTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaKeywordsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaPlayerTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaRatingTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaRestrictionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaTextTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaThumbnailTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.mediarss.MediaTitleTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.MessageKindTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.MoneyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.NeighborhoodTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.opensearch.ItemsPerPageTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.opensearch.StartIndexTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.opensearch.TotalResultsTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.OrderingTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.OrganizationTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.OrgNameTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.OrgTitleTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.OriginalEventTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.PhoneNumberTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.PoBoxTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.PostalAddressTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.PostCodeTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.QuotaBytesUsedTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RatingTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RecurrenceTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RecurrenceExceptionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RecurrenceExceptionEntryTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RecurrenceExceptionEntryLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.RegionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.ReminderTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.ResourceIdTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.StreetTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.StructuredPostalAddressTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.SubregionTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.threading.InReplyToTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.threading.ThreadingLinkTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.threading.TotalTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.TransparencyTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.VisibilityTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.WhenTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.WhereTest.class);
    suite.addTestSuite(com.google.gwt.gdata.client.WhoTest.class);
    return suite;
  }
}
