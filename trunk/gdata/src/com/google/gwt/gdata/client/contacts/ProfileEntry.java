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

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.Name;
import com.google.gwt.gdata.client.StructuredPostalAddress;
import com.google.gwt.gdata.client.Where;

/**
 * Describes a profile entry.
 */
public class ProfileEntry extends PersonEntry {

  /**
   * Constructs a profile entry.
   * 
   * @return A ProfileEntry object.
   */
  public static native ProfileEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.ProfileEntry();
  }-*/;

  protected ProfileEntry() { }
  
  /**
   * Adds a new calendar link.
   * 
   * @param calendarLink Calendar link to add.
   */
  public final native void addCalendarLink(CalendarLink calendarLink) /*-{
    this.addCalendarLink(calendarLink);
  }-*/;
  
  /**
   * Adds a new event.
   * 
   * @param event Event to add.
   */
  public final native void addEvent(Event event) /*-{
    this.addEvent(event);
  }-*/;
  
  /**
   * Adds a new external id.
   * 
   * @param externalId The external id to add.
   */
  public final native void addExternalId(ExternalId externalId) /*-{
    this.addExternalId(externalId);
  }-*/;
  
  /**
   * Adds a new hobby.
   * 
   * @param hobby The hobby to add.
   */
  public final native void addHobby(Hobby hobby) /*-{
    this.addHobby(hobby);
  }-*/;
  
  /**
   * Adds a new jot.
   * 
   * @param jot The jot to add.
   */
  public final native void addJot(Jot jot) /*-{
    this.addJot(jot);
  }-*/;
  
  /**
   * Adds a new language.
   * 
   * @param language The language to add.
   */
  public final native void addLanguage(Language language) /*-{
    this.addLanguage(language);
  }-*/;
  
  /**
   * Adds a new relation.
   * 
   * @param relation The relation to add.
   */
  public final native void addRelation(Relation relation) /*-{
    this.addRelation(relation);
  }-*/;
  
  /**
   * Adds a new structured postal address.
   * 
   * @param address The structured postal address to add.
   */
  public final native void addStructuredPostalAddress(StructuredPostalAddress address) /*-{
    this.addStructuredPostalAddress(address);
  }-*/;
  
  /**
   * Adds a new user defined field.
   * 
   * @param userDefinedField The user defined field to add.
   */
  public final native void addUserDefinedField(UserDefinedField userDefinedField) /*-{
    this.addUserDefinedField(userDefinedField);
  }-*/;
  
  /**
   * Adds a new website.
   * 
   * @param website The website to add.
   */
  public final native void addWebsite(Website website) /*-{
    this.addWebsite(website);
  }-*/;
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(ProfileEntryCallback callback) {
    this.delete(callback, null);
  }
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteEntry(ProfileEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the billing information. This element is optional.
   * 
   * @return Billing information.
   */
  public final native BillingInformation getBillingInformation() /*-{
    return this.getBillingInformation();
  }-*/;

  /**
   * Returns the birthday. This element is optional.
   * 
   * @return Birthday
   */
  public final native Birthday getBirthday() /*-{
    return this.getBirthday();
  }-*/;
  
  /**
   * Returns the calendar links. This element is optional.
   * 
   * @return Calendar links.
   */
  public final native CalendarLink[] getCalendarLinks() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCalendarLinks());
  }-*/;

  /**
   * Returns the directory servers. This element is optional.
   * 
   * @return Directory servers.
   */
  public final native DirectoryServer getDirectoryServer() /*-{
    return this.getDirectoryServer();
  }-*/;
  
  /**
   * Returns the events. This element is optional.
   * 
   * @return Events.
   */
  public final native Event[] getEvents() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getEvents());
  }-*/;
  
  /**
   * Returns the external ids. This element is optional.
   * 
   * @return External ids.
   */
  public final native ExternalId[] getExternalIds() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getExternalIds());
  }-*/;

  /**
   * Returns the gender. This element is optional.
   * 
   * @return Gender.
   */
  public final native Gender getGender() /*-{
    return this.getGender();
  }-*/;
  
  /**
   * Returns the hobbies. This element is optional.
   * 
   * @return Hobbies
   */
  public final native Hobby[] getHobbies() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getHobbies());
  }-*/;
  
  /**
   * Returns the initials. This element is optional.
   * 
   * @return Initials.
   */
  public final native Initials getInitials() /*-{
    return this.getInitials();
  }-*/;
  
  /**
   * Returns the jots. This element is optional.
   * 
   * @return Jots
   */
  public final native Jot[] getJots() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getJots());
  }-*/;
  
  /**
   * Returns the languages. This element is optional.
   * 
   * @return Languages.
   */
  public final native Language[] getLanguages() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getLanguages());
  }-*/;

  /**
   * Returns the maiden name. This element is optional.
   * 
   * @return Maiden name.
   */
  public final native MaidenName getMaidenName() /*-{
    return this.getMaidenName();
  }-*/;

  /**
   * Returns the mileage. This element is optional.
   * 
   * @return Mileage.
   */
  public final native Mileage getMileage() /*-{
    return this.getMileage();
  }-*/;

  /**
   * Returns the name. This element is optional.
   * 
   * @return Name.
   */
  public final native Name getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the nickname. This element is optional.
   * 
   * @return Nickname.
   */
  public final native Nickname getNickname() /*-{
    return this.getNickname();
  }-*/;

  /**
   * Returns the occupation. This element is optional.
   * 
   * @return Occupation.
   */
  public final native Occupation getOccupation() /*-{
    return this.getOccupation();
  }-*/;

  /**
   * Returns the priority. This element is optional.
   * 
   * @return Priority.
   */
  public final native Priority getPriority() /*-{
    return this.getPriority();
  }-*/;
  
  /**
   * Returns the relations. This element is optional.
   * 
   * @return Relations.
   */
  public final native Relation[] getRelations() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getRelations());
  }-*/;
  
  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(ProfileEntryCallback callback) {
    this.get(callback, null);
  }
  
  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(ProfileEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Returns the sensitivity. This element is optional.
   * 
   * @return Sensitivity.
   */
  public final native Sensitivity getSensitivity() /*-{
    return this.getSensitivity();
  }-*/;

  /**
   * Returns the short name. This element is optional.
   * 
   * @return Short name.
   */
  public final native ShortName getShortName() /*-{
    return this.getShortName();
  }-*/;
  
  /**
   * Returns the structured postal addresses. This element is optional.
   * 
   * @return Structured postal addresses.
   */
  public final native StructuredPostalAddress[] getStructuredPostalAddresses() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getStructuredPostalAddresses());
  }-*/;

  /**
   * Returns the subject. This element is optional.
   * 
   * @return Subject.
   */
  public final native Subject getSubject() /*-{
    return this.getSubject();
  }-*/;
  
  /**
   * Returns the user defined fields. This element is optional.
   * 
   * @return User defined fields.
   */
  public final native UserDefinedField[] getUserDefinedFields() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getUserDefinedFields());
  }-*/;
  
  /**
   * Returns the websites. This element is optional.
   * 
   * @return Websites.
   */
  public final native Website[] getWebsites() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWebsites());
  }-*/;

  /**
   * Returns the location. This element is optional.
   * 
   * @return Where.
   */
  public final native Where getWhere() /*-{
    return this.getWhere();
  }-*/;

  /**
   * Returns the billing information. This element is optional.
   * 
   * @param billingInformation Billing information.
   */
  public final native void setBillingInformation(
      BillingInformation billingInformation) /*-{
    this.setBillingInformation(billingInformation);
  }-*/;

  /**
   * Sets the birthday. This element is optional.
   * 
   * @param birthday Birthday.
   */
  public final native void setBirthday(Birthday birthday) /*-{
    this.setBirthday(birthday);
  }-*/;
  
  /**
   * Sets the calendar links. This element is optional.
   * 
   * @param calendarLinks Calendar links.
   */
  public final native void setCalendarLinks(CalendarLink[] calendarLinks) /*-{
    this.setCalendarLinks(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(calendarLinks)
    );
  }-*/;

  /**
   * Sets the directory server. This element is optional.
   * 
   * @param directoryServer Directory server.
   */
  public final native void setDirectoryServer(DirectoryServer directoryServer) /*-{
    this.setDirectoryServer(directoryServer);
  }-*/;
  
  /**
   * Sets the events. This element is optional.
   * 
   * @param events Events.
   */
  public final native void setEvents(Event[] events) /*-{
    this.setEvents(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(events)
    );
  }-*/;
  
  /**
   * Sets the external ids. This element is optional.
   * 
   * @param externalIds External ids.
   */
  public final native void setExternalIds(ExternalId[] externalIds) /*-{
    this.setExternalIds(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(externalIds)
    );
  }-*/;

  /**
   * Sets the gender. This element is optional.
   * 
   * @param gender Gender.
   */
  public final native void setGender(Gender gender) /*-{
    this.setGender(gender);
  }-*/;
  
  /**
   * Sets the hobbies. This element is optional.
   * 
   * @param hobbies Hobbies.
   */
  public final native void setHobbies(Hobby[] hobbies) /*-{
    this.setHobbies(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(hobbies)
    );
  }-*/;

  /**
   * Sets the initials. This element is optional.
   * 
   * @param initials Initials.
   */
  public final native void setInitials(Initials initials) /*-{
    this.setInitials(initials);
  }-*/;
  
  /**
   * Sets the jots. This element is optional.
   * 
   * @param jots Jots.
   */
  public final native void setJots(Jot[] jots) /*-{
    this.setJots(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(jots)
    );
  }-*/;
  
  /**
   * Sets the languages. This element is optional.
   * 
   * @param languages Languages.
   */
  public final native void setLanguages(Language[] languages) /*-{
    this.setLanguages(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(languages)
    );
  }-*/;

  /**
   * Sets the maiden name. This element is optional.
   * 
   * @param maidenName Maiden name.
   */
  public final native void setMaidenName(MaidenName maidenName) /*-{
    this.setMaidenName(maidenName);
  }-*/;

  /**
   * Sets the mileage. This element is optional.
   * 
   * @param mileage Mileage.
   */
  public final native void setMileage(Mileage mileage) /*-{
    this.setMileage(mileage);
  }-*/;

  /**
   * Sets the name. This element is optional.
   * 
   * @param name Name.
   */
  public final native void setName(Name name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the nickname. This element is optional.
   * 
   * @param nickname Nickname.
   */
  public final native void setNickname(Nickname nickname) /*-{
    this.setNickname(nickname);
  }-*/;

  /**
   * Sets the occupation. This element is optional.
   * 
   * @param occupation Occupation.
   */
  public final native void setOccupation(Occupation occupation) /*-{
    this.setOccupation(occupation);
  }-*/;

  /**
   * Sets the priority. This element is optional.
   * 
   * @param priority Priority.
   */
  public final native void setPriority(Priority priority) /*-{
    this.setPriority(priority);
  }-*/;
  
  /**
   * Sets the relations. This element is optional.
   * 
   * @param relations Relations.
   */
  public final native void setRelations(Relation[] relations) /*-{
    this.setRelations(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(relations)
    );
  }-*/;

  /**
   * Sets the sensitivity. This element is optional.
   * 
   * @param sensitivity Sensitivity.
   */
  public final native void setSensitivity(Sensitivity sensitivity) /*-{
    this.setSensitivity(sensitivity);
  }-*/;

  /**
   * Sets the short name. This element is optional.
   * 
   * @param shortName Short name.
   */
  public final native void setShortName(ShortName shortName) /*-{
    this.setShortName(shortName);
  }-*/;
  
  /**
   * Sets the structured postal addresses. This element is optional.
   * 
   * @param addresses Structured postal addresses.
   */
  public final native void setStructuredPostalAddresses(StructuredPostalAddress[] addresses) /*-{
    this.setStructuredPostalAddresses(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(addresses)
    );
  }-*/;

  /**
   * Sets the subject. This element is optional.
   * 
   * @param subject Subject.
   */
  public final native void setSubject(Subject subject) /*-{
    this.setSubject(subject);
  }-*/;
  
  /**
   * Sets the user defined fields. This element is optional.
   * 
   * @param userDefinedFields User defined fields.
   */
  public final native void setUserDefinedFields(UserDefinedField[] userDefinedFields) /*-{
    this.setUserDefinedFields(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(userDefinedFields)
    );
  }-*/;
  
  /**
   * Sets the websites. This element is optional.
   * 
   * @param websites Websites.
   */
  public final native void setWebsites(Website[] websites) /*-{
    this.setWebsites(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(websites)
    );
  }-*/;

  /**
   * Sets the location. This element is optional.
   * 
   * @param where Where.
   */
  public final native void setWhere(Where where) /*-{
    this.setWhere(where);
  }-*/;
  
  /**
   * Updates the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(ProfileEntryCallback callback) {
    this.update(callback, null);
  }
  
  /**
   * Updates the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(ProfileEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }
  
}