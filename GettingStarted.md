## Before You Start ##
Download and extract the latest version of gwt-gdata.

## Using gwt-gdata in your GWT app ##
Using gwt-gdata in your GWT app is simple. Start by adding a reference to gwt-gdata.jar to the app's build path.

Next, edit the GWT module for your app (MyAppName.gwt.xml) and add the following line:
```
<inherits name='com.google.gwt.gdata.GData' />
```

## Loading GData packages ##
Before using GData, your GWT app should make sure that the necessary GData packages are available. For example, to check that the GData Calendar package is loaded:
```
if (GData.isLoaded(GDataSystemPackage.CALENDAR)) {
   Window.alert("Package is loaded");
}
```

You can also check for multiple packages:

```
if (GData.isLoaded(GDataSystemPackage.CALENDAR, GDataSystemPackage.ANALYTICS)) {
   Window.alert("Packages are loaded");
}
```

If you call isLoaded without supplying a package to check for, it will only check for the GData core (google.gdata).

Use loadGDataApi() to load GData packages, for instance:
```
if (GData.isLoaded(GDataSystemPackage.CALENDAR)) {
   Window.alert("Package is loaded");
} else {
   GData.loadGDataApi("MyApiKey",
      new Runnable() {
        public void run() {
          Window.alert("Package has just loaded");
        }
      },
      GDataSystemPackage.CALENDAR);
}
```

If you call loadGDataApi without supplying any packages, it will load the entire GData library.

## AuthSub Authentication ##
Most of the GData services require authentication. AuthSub allows users to login with their Google account and explicitely grant or deny access to the requesting app.

AuthSub authentication, from the user's perspective, is a three step process:
  1. Click to login, causing a redirect to the authorization page.
  1. Click "Grant Access" to grant the client application the requested access.
  1. Arrive back at the client application, now with an AuthSub token.

From a developer standpoint the AuthSub process is encapsulated in a single call:
```
String scope = "http://www.google.com/calendar/feeds/";
User.login(scope);
```
Where **scope** defines the system and level of access to be requested.

You can also determine the current login status for a given scope:
```
AuthSubStatus status = User.getStatus(scope);
if (status == AuthSubStatus.LOGGED_IN) {
  Window.alert("You're logged in");
} else if (status == AuthSubStatus.LOGGED_OUT) {
  Window.alert("You're logged out");
}
```

## Requesting Feeds ##
To query for a given feed start by instantiating the appropriate service:
```
String appName = "MyApplicationName";
CalendarService service = CalendarService.newInstance(appName);
```

Where **appName** is a string value identifying your application - this can be any value.

Finally, request the desired feed using the respective method. For example, to retrieve the user's calendars:
```
String calendarsFeedUri = "http://www.google.com/calendar/feeds/default/allcalendars/full";
service.getAllCalendarsFeed(calendarsFeedUri, new CalendarFeedCallback() {
  public void onFailure(CallErrorException caught) {
    Window.alert("Oops, there was an unexpected error.");
  }
  public void onSuccess(CalendarFeed result) {
    Window.alert("You have " + result.getEntries().length + " calendars.");
  }
});
```