#  CHANGELOG

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## How do I make a good changelog?
### Guiding Principles

* Changelogs are for humans, not machines.
* There should be an entry for every single version.
* The same types of changes should be grouped.
* Versions and sections should be linkable.
* The latest version comes first.
* The release date of each version is displayed.
* Mention whether you follow Semantic Versioning.


### Types of changes

* `Added` for new features.
* `Changed` for changes in existing functionality.
* `Deprecated` for soon-to-be removed features.
* `Removed` for now removed features.
* `Fixed` for any bug fixes.
* `Security` in case of vulnerabilities.
* `Internal` for any internal changes including CI or library change.


### Formatting

Please consider formatting: a single whiteline between records and two whitelines before next header. 

## [Unreleased]

### Added

- [Chat] show online, offline or typing status, show read messages status

- [Contact] Added Call History

- [Chat] added basic sending and receiving messages via chat

- [Chat] added ChatManager

- [Intro] added Intro API requests

- [Application] feature toggles

- [Chat] added chat API requests

- [Profile] implemented profile observer

- [Notifications] connected notifications API to UI

- [API] added `device_id` to call invite web request

- [Tech] added ProfileStorage to cache users profiles

- [Notifications] show user profile while clicking on an image; show arrange meeting while clicking on a sent calendar event

- [Swiper] implemented showing notifications only for develop target

- [Appointments] added plus button to select "Add timeslot" or "Add a meeting"

- [Profile] adding tags were limited with "." symbol and minimum symbol count now is 2

- [Notification] added processing of `share` push type

- [Appointments] added past meetings request

- [Appointments] implemented sharing calendar functionality

- [Mutuals] added parsing of `schedule_shared` bool param

- [Appointments] added past meetings request

- [Notifications] added `get`, `read`, `delete` notifications API requests

- [Video] added new `addVideo` request

- [HomePage] added badges on bottom tabs

- [Swiper] added a notification bell to navigation

- [Profile] send `/forgetDevice` call on signOut

- [Registration] disabled phone type checks for DEBUG builds

- [Arrange appointments] created datasource for time table

- [Profile] added functionality for opening user profile from 'backed by' list

- [Arrange Appointments] added logic to get matching slots

- [Swiper] added autoClose Backdby page when sending request to last member and live update swiper notification cell

- [Profile] added prompt when hiding profile 

- [Swiper] added link to a profile

- [Swiper] open pending requests on notifications cell click

- [Profile] added BackedBy functionality to new own profile screen

- [Swiper] added autoReloading when user match to anyone  

- [UI] addes Swiper notification cell

- [UI] added custom font to project

- [Profile] show investors and added ability to add investors

- [Profile] added ability to remove investors

- [UI] added `EmptyStateView` and `EmptyStateCell` with several styles

- [Swiper] added `func showUpcomingMeetings()` to `SwiperViewController`

- [Contacts]  added recommendations in contacts received tab

- [Network] implemented `Invest` API

- [Recommendations] added search contacts for recommendations

- [ContactProfile] implemented removing of contact

- [VideoCall] handled call_finish notification

- [VideoPlayer] added checkmark to selected speed cell 

- [App] added app for new features

- [VideoPlayer] added ability to detect seen videos

- [Recommendations] added extra key for intruduction view

- [NotificationManager] handled click on push notifications

- [VideoPlayer] added error view for short videos

- [MyProfile] added multichoice view for adding role

- [Appointments] added a toast in past meetings when deleting profile

- [ContactDeck] added no document label

- [Appointments] added modal when accessing user profile

- [NotificationAlertViewController] added alert view for matched slots

- [Appointments] added view for empty state

- [Swiper] added update swipe after role switch

- [AppointmentCell] added button fot entering to meeting

- [ErrorAlertView] added cancel button

- [BasicProfileInfo] added chat field

- [MUXClient] added configuration for QA environment

- [VideoCalls] added device_id to request body 

- [ContactProfile] added animation to switching between contact profile tabs

- [Introductions] added ability to remove and ignore recommendations

- [AppointmentsView] added prompt before canceling meeting

- [ContactProfileAction] added toast view after copying link profile

- [ContactProfile] added view for stranger user

- [ContactProfile] added role info to main profile info

- [NetworkManager] removed deprecated requests from project

- [Swiper] added notification view screen and its cells

- [VideoCall] added countdown view

- [Appointments] added dynamic height modal for meetings

- [Myprofile] added ability to share the link of owni profile

- [AppointmentsList] added label to show that no past appointments and have free slots

- [ProfileSettings] added version to all targets

- [Utility] added display number on app icon

- [Appointments] added toast view after successfully changing slots

- [NotificationInteractor] changed read notifications request and added badge nuumber

- [Chat] added cells for sent and received messages

- [ContactProfileAction] added alert for canceling meetings with mutual that is going to be deleted

- [Swiper] implemented read state for cell

- [Chat] added UI for empty screen chat view

- [ContactPofile] open chat view when clicking on chat button

- [Chat] added keyboard avoidance and text field for chat

- [Profile] added badges to profile model

- [Contacts] added bagde of new messages in contacts

- [Chat] implemented action menu UI for message cell 


### Changed

- [Appointments] Empty view: increased space between text and button, localized button title

- [Video call] leave room after receiving notification that other user has left the call

- [Appointments] updated meetings UI

- [Video] disabled `rename` context menu for not ready video

- [Registration] removed alert on wrong code enter

- [Apppointments] removed call /user after update schedule

- [Contacts] Changed Avatar corner radius and paddings for segment indicator

- [Profile] ConnectPanelView changed stack view distribution to `fill proportionally`

- [Network] now after onboarding `linkedIn_ID` is sent as a param in `/afterSignup` request 

- [Network] removed GET api/userdata request

- [Contacts] disabled extra calls GET api/user on every -viewWillAppear

- [Video] removed `VSVideo.id` property

- [Video] changed video upload process

- [Network] changed 500 error handling, when you get 500 error, will automatically resend request and if 3 times get same 500 error, just do nothing without showing about error, as we discussed during weekly call

- [Appointments] time slots refactoring to reduce number of 400 error

- [App] increased app startup speed by removing waiting on profile image download

- [Swiper] fixed showing about while opening user profile from swipe screen

- [Profile] hid About section if user hasn't filled it

- [Lokilize] changed fetching mechanism 

- [Network] extended timeout network error

- [Onboarding] corrected fonts, colors and icons on onboarding screens

- [Investments] do not show user in BackedBy dialogue if request to him was already sent

- [Swiper] Changed prompt when hiding profile 

- [MyProfile] added role switch and show/hide functionality

- [MyProfile] fixed crash when tapped on my video

- [Swiper] open recommendations screen on notifications cell click

- [Calls] send end call request only when call is instant

- [Apppointments] change swipe behavior between lists

- [MyProfile] changed swipe behavior between segments

- [Appointments] changed color segment control

- [ProfileCard] changed constaints

- [Swiper] added pending requests view controller

- [Swiper] added notification section detail view controller

- [Videos] changed background color on SwipeScreen

- [Contacts] removed received segment from the top

- [UI] replaced fonts in most screens of the app with new Vela Sans font as designed in Figma

- [Videos] disabled showing other people's video errors

- [VideoCall] don't send `finishCall`  request when leaving video room

- [Appointments] allow to start meeting 15 min before start time and before meeting end time

- [Contacts] show empty state cells on contacts screen

- [Swiper] changed recommendations screen

- [Swiper] changed recommendation data in notification

- [VideoPlayer] removed watermark from videoPlayer view

- [Authentication] shortened app launch time

- [NotificationCell] added placeholder image to avatar view

- [Appointments] remove confirmation

- [StoriesCollection] changed action sheet for selecting video title

- [Profile]  removed emojis from Profile tuning

- [Profile]  updated according to new design

- [VideoCall] changed button and label style

- [ProfileSettings] changed settings sheet according to new design

- [ContactAction] removed block button

- [ProfileSettings] removed incoming calls toggle

- [ArrangeAppointments] changed the title of done button

- [ArrangeAppointments] disabled busy or anailable slots

- [VideoAnalytics] changed video id to video playbackId

- [AppointmentsList] changed no appointments view

- [SwichRoleView] removed role image

- [NoAppointmentsView] changed view

- [VideoPlayer] changed speed values

- [SwiperInteractor] changed showing order of matches and notifications for decreasing launch time

- [EditProfileFields] changed limitation of tag field 

- [MyProfile] changed switch role view

- [VideoCall] changed view according to design

- [Locale] removed all unused strings from localizations

- [HideProfileSheet] changed view

- [DocumentPreview] removed `Edit` button in pdf viewer

- [AppConfigurations] changed config folder name

- [ProfileView] dismiss view when connect request sent

- [Profile] started to use title of job as bio


### Fixed

- [Profile] fixed possible missing of Plus button

- [Recommendation] fixed Checkbox button

- [Swiper] fixed bug of swipe list

- [Appointments] fixed bug propose time in time slot

- [ContactProfile] fixed bug in mutuals

- [Swiper] fixed bug of processing intro and invite from on the same person

- [Localization] fixed localization issues

- [Appointments] disabled display of past hours in time slots calendar; corrected time slots calendar items size

- [Onboarding] fixed user couldn't be deleted after its creation

- [Appointments] fixed adding time slots with custom recurrence

- [Profile] fixed bug of  `Add more investments`

- [Contacts] fixed sorting

- [Video] it was not possible to play other videos during upload

- [Profile] update stages and interests

- [VideoPlayer] fixed video players bug when changing play time

- [APpointments] Crash when dont have appointments in iOS 15

- [PROFIle] fixed Loader appearance

- [Appointments] fixed collectionView content insets on Arrange Appointments screen

- [PendingRequests] fixed the bug of messages in pending requests screen

- [Onboarding] skipping profile creation if it already exists

- [Profile] update docs and video sections after changing role

- [Swiper] if user has videos - show video icons at once

- [Swiper] prevent multiple get `/videos` requests on Swiper screen while scrolling

- [App] retain cycle fixed

- [Profile] disabled "Rename video" menu item if video is not ready

- [Settings] fixed Profile settings UI on iOS 15

- [Appointments] added possibility to hide days without available time slots

- [Appointments] display superBusy alert if there are no available slots

- [Swiper] fixed the bug of swiper screen when changing its view

- [Appointments] prevent starting unconfirmed meetings. Show error alert.
 
- [Introduce] it wasn't possible to select last cell on Introduce screen

- [MatchesCoordinator] fixed the bug in notification sheet UI

- [Swiper] fixed loading view bug on swipe

- [Contacts] fixed contact couldn't be opened from contacts list screen

- [Contacts] fixed getting profile while opening from BackedBy

- [TimeSlots] when deleting recurrent time slot it's now possible to delete this and next similar

- [App Flow] wrong screen was shown on the app start  

- [Profile] show `+ Add` tag if user's keywords are empty

- [Appointments] fixed problem with adding multiple time slots

- [UI] fixed contact cell buttons style as in Figma

- [Profile] fixed updating of job info 

- [Profile] fixed parsing of job info 

- [Onboarding] fixed authorization error after deleting a user on a device

- [Appointments] fixed: wrong timestamp was sent for chosen slot

- [Editing] fixed keyboard covering text field

- [Multichoice] fixed scroll bar

- [RESTServices] fixed the bug of stopping progress bar when deleting video

- [Profile] fixed getting of user's job info

- [Registration] resend sms text was cropped

- [Swiper] fixed bug when refreshing swiper view

- [RecommendationMessage] added title

- [ContactSelection] showing search bar

- [Contacts] removed cell flickering when switching between tabs

- [VideoCall] fixed crash when switching cameras

- [AppointmentsList] fixed showing upcoming meetings

- [MyProfile] fixed incompatibility with new design

- [Profile] fixed getting of user profile

- [MyProfile] fixed bug of showing StoriesCollection

- [AppointmentsList] added loading hud while getting appointments

- [Appointments] refreshed appointemts list when it's need

- [Contacts] fixed flickering of profiles

- [RecommendationMessage] set limit to textView

- [ProfileData] fixed bug of different usernames

- [RecommendationMessage] fixed text overflow

- [ContactsTable] fixed bug when changes dataSource

- [MyProfile] fixed seting of job info

- [ContactInfo] fixed showing of bio section

- [NotificationSectionDetail] updated data source when user accepts or ignores connect request  

- [ContactsInteractor] updated notification section when contact request accepts or ignores

- [BottomSheet] fixed getting of sheet height

- [ContactsSelection] fixed bottom sheet of removing investors

- [QA] fixed issues 

- [RecommendationCell] fixed crash when open cells from notification section

- [MyRecommendation] fixed decoding

- [ArrangeAppointments] added condition to another user's free slots filtering

- [SwiperViewController] updated data source

- [FloatingPanel] fixed dismiss behaviour

- [NotificationSectionDetail] fixed dismiss behaviour

- [NotificationSectionDetail] fixed ignore of investors

- [ArrangeAppointments] prevent arranging meeting on past timeslots

- [StoriesCollection] prevent dismissing of progress view before video uploads completely

- [RecommendationForMe] fixed decoding of recommendation id

- [ContactProfile] fixed wrong layout

- [ContactsViewController] disabled double click on view

- [StoriesCollection] prevent showing multiple huds 

- [AppointmentsDatePicker] fixed wrong month name issue

- [MyProfile] trimmed characters before saving my bio

- [ContactsInteractor] fixed updating of my network

- [MyProfile] fixed location of toast view 

- [MyProfile] fixed location of plus button

- [StoriesCollection] fixed bug when uploading new video

- [VSVideo] fixed infinite loop of fetching videos and creating VSVideo objects

- [ContactsViewController] fixed font size after searching

- [ContactProfile] changed actions

- [VideoCall] fixed mirroring

- [TagListCell] fixed selected text color

- [TimeSlotsList] added separators between rows

- [NotificationManager] fixed first view opening when clicked on notification

- [NotificationSectionDetail] fixed sending connect request and ignoring of recommendations

- [App] fixed mismatches with design

- [ContactProfile] changed order of menu items 

- [SwiperCard] fixed my videos on swiper card

- [ContactProfile] fixed the bug of pressing `Schedule` on Videos and Deck tabs 

- [AppointmentsViewController] fixed plus button position on small screens

- [NotificationItem] fixed parsing error

- [SwiperWorker] fixed getting of user videos

- [NotificationSectionDetail] fixed the bug multiple button hits on backed by

- [ArrangeAppointments] fixed different titles of propose time view

- [NotificationManager] fixed crash after receiving voip push

- [ContactProfile] fixed bottom panel

- [NotificationView] fixed cells with no image

- [ChatView] fixed crash on chat view

- [SwiperView] hide profile card from swiper after sending connect request


## [1.0.60] - 2021-04-30


### Added

- [UI] added horizontal avatars stack

- [UI] added countable view

- [UI] added extension methods to make group avatar

- [MutualContacts] Added a button to add time slots

- [VideoPlayer] added wathermark

- [VideoCall ] added wathermark

- [Onboarding] added `Sign Out` button on onboarding screens  for dev builds

- [ContactProfile] Added success toast after recommending a contact

- [MutualContacts] Added arrange call and instant call functionality

- [ProfileScene] added contact list and message in recommendations screen

- [Localization] localized some strings used on onboarding screens

- [Profile] refresh profile info using pull-to-refresh

- [Contacts] added  message screen with recommendations for contacts

- [Contacts] added profile actions sheet

- [Network] added Recommendations API

- [Network] added `name` parameter to deviceInfo requests

- [Contacts] added new contact profile screen

- [Localization] localized video errors

- [ProfileSettings] added toggle for local notification

- [VideoAnalytics] added new view for video analytics

- [Contact profile] added new deck screen for a contact

- [ProfileSettings] added toggle for enabling new design

- [ProfileScene] added recommended contacts screen

- [ProfileScene] added bio cell

- [VideoCalls] implemented calls on lock screen

- [ContactProfileAction] added prompt before deleting contact

### Changed

- [Contact Video] chenge video size  

- [Contacts] fix search logic

- [VideoPlayer] change play/pause button size

- [Stories] centering Video view 

- [TagList] fix Ui clipping 

- [Contacts] refresh matches after cancelling contact request

- [VideStory] refactoring video uploading to use `PHPickerViewController` from ios 14

- [Stories] centering Video view 

- [TagList] fix Ui clipping 

- [Recommendations] corrected recommendations parsing according to new API changes

- [Appointments] hide floating panel after successful schedule of a meeting

- [Video Story] pause video playback after selecting a title during upload scenario

- [Appointments] added different localized key for status message for expired not confirmed appointments

- [Pods] updated pod 'LokaliseLiveEdit' to the latest version

- [NavigationBar] changed back button color

- [Video Call] instant calls are now audio by default

- [Profile] open `https://linkedin.com/m/logout` page after profile deletion

- [Video Call] display own avatar when video is off

- [Appointments] changed Day format in appointments from `21 May, Fri` to `Fri, 21 May`

- [Registration] creation of user profile is done after successful verification of LinkedIn profile

- [Contacts] do not start Instant Call if mutual disabled it in settings

- [Registration] added Terms and Conditions and Privacy Policy url's to Localise

- [Video Player] lowered progress bar in landscape

- [Time Slots] custom repeat - change number of weeks to 999

- [PhoneEnter] made the agreement checkmark highlighted

- [Pods] removed `LokaliseLiveEdit` pod

- [ContactDeck] redesigned contact deck view

- [ProfileSettings] removed new design toggle from profile settings on release build

- [Profile] changed profile view


### Fixed

- [Code Quality] warnings fix

- [VideoUploading]  toast possition when tap on uploading video 

- [Video Story] when uploading a new video `Back` and `Next` buttons were covered by video in player

- [Onboarding] if user entered wrong code Continue button moved to the bottom of the screen.

- [UI] VSButton could lose its title if `-showLoader()` calls were not balanced with `-hideLoader()` calls

- [Appointments] changed status of suggested slots to `.waiting`

- [Contacts] fixed crash when approving or deleting incoming request

- [Contacts] wrong API call was used for "Ignore" (like) button

- [Profile] ProfileViewViewController was scrolling after viewDidAppear

- [Profile] it was seen how the placeholder avatar was replaced with a real photo

- [Coordinator] onboarding flow fixed: prevent going back after LinkedIn verification

- [Onboarding] fixed problem with the timer when app is minimized

- [Onboarding] fixed continue button was disabled in some circumstances

- [Appointments] fixed "User" wants to arrange call with you - the message is repeated twice

- [Appointments] arrange appointments panel could be shown twice on screen

- [App] got rid of retain cycles in the app 

- [Video Call] fixed instant calls

- [Oboarding] fixed 500 error on onboarding

- [Appointments] fixed crash in Appointments

- [Appointments] title of the modal timeslots window was changing when it was opened

- [Appointments] now we don't show user time slots for suggestion, which are not free at his mutual

- [LinkedIn] label on verify linkedIn screen was truncated

- [TimeSlots] time label was truncated on small screens

- [VideoPlayer] fixed jerking video slider

- [Profile] fixed displaying documents while uploading

- [ProfileSettings] fixed updating profile settings

- [Profile] fixed profile info according to design

- [VentureSwipe] resolved warnings in app 

- [ContactsTable] fixed bug when removing mutual


## [1.0.56] - 2021-04-30

### Added


- [Contacts] added searchbar, " reccomended by " label

- [VideoUploading] added preview after selecting video 

- [Stories] added error on tap on uplosding video

- [VideoUplaoding] added video uploading progress under navigation bars

- [Appointments] added possibility to delete either a single time slot of a recurrence or the whole recurrence

- [Appointments] added screen to select custom recurrence

- [UI] in app notifications

- [UI] added a color to the AppColors.swift file and took an instance from there 

- [NotificationAlert] added alert when want to cancel a meeting

- [Appointments] added repeatable timeslot menu; made possible to add repeated timeslots for a day or a week; display repeated timeslots in time table

- [Profile] added "Preview my swipe card" screen

- [PhoneEnter] add license checkbox

- [NotificationAlert] added alert view in the end of the video 

- [Appointments] added selection of the whole row with long tap on row header

- [Network] added `- prelogout` request

- [Network] added `- afterSignup` and `- afterLogin` requests 

- [Profile] implemented own profile deletion

- [Profile] added new alert view to show after video upload is started

- [Testing] added support for login by email while app is running in Waldo environment

- [ProfileSettings] added ProfileSettingVersionCell to the last row of the Profile Settings Table

- [ProfileSettings] Restricted showing Version cell to only DEV build

- [VideoPlayer] added action sheet for changing video speed

- [ContactInfo] added new info screen for contact

- [Description Template] Table View for Screenshots

### Changed

- [Contacts] changed contacts view, navigation of  top tabs

- [Authentication] changed loader style

- [Contact] changed booking confirmation dialog

- [Splash] changed splash screen  TestCase: REMOVE THE APP, Restart Your Phone , Install Again 

- [Appointments] change name of the month during dates scrolling on the time slots screen

- [Appointments] changed calendar icon on appointments screen

- [Localization] refactored localization to get rid of `.rawValue.localizedValue` when using localization keys

- [PhoneEnter] changed paragraph's align 

- [Profile] changed unavailable deck rendering

- [Localization] changed some localization depending on user type

- [Profile] changed buttons in tags

- [Utility] added Local notification manager folder and class which is responsible for setting and removing local reminders

- [NotificationManager] When user gets a push notification about somone setting an appointment or canceling an appointment they local remainder is set as well

- [VideoPlayer] implemented new video player according to design

- [Profile] immediately go back to profile view when tapped 'done' button

- [Appointments] when user sets/accepts/cancels an meeting local remiders are set as well

- [Profile] when user logs out all local reminders are cleaned

- [TimeSlotsList] acumulating selected time slots and saving all when user quits the screen or changes the dates

- [StoriesCollection] changed stories collection for other profile

- [Profile] removed pop-up when uploading new video


### Fixed

- [Registration] screen for entering code was not shown

- [VideoStory] fixed some videos were disappearing

- [VideoStory] do not allow uploading videos less than 5 sec long

- [Network] fixed farsing profile settings

- [Profile] Error on tap uploading video 

- [Profile] Video sound play when phone is on mute

- [Navigation] Fix floating panel pull to close behavior 

- [UI] appointment card now renders shadow correctly

- [Title] Fixed translation of titles on stage and industry screens

- [Profile] "Connect to view" panel was floating

- [Auth] fixed `-afterLogin` response handling if no user profile exists

- [UI] hide tabbar when push a viewController

- [Contacts] now when searching for a contact, it doesn't take into account leading spaces

- [Contacts] open contacts from search screen without closing it

- [Contacts] show keyboard on opening search controller

- [Contacts] dismiss keyboard on drag and on tap in free space

- [UI] Instead of two different error messages, now using one alert

- [Profile] update access to documents immediately after contact confirmation

- [UI] Instead of two different error messages, now using one alert

- [Registration] code enter view was shown when user cancels phone verification


## [1.0.55] - 2021-02-12

### Added

- [PhoneEnter] added error message under TextField

- [CodeEnter] added error message under TextField

- [UI] added VSButton which replaced FluentUI's Button

- [UI] custom tab bar

- [Profile] added `linkedIn_ID` flag to profile

- [Profile] added parsing of call statistics to Profile

- [Authentication] added phone number onto VerificationCode screen


### Changed

- [Profile] changed My Settings floating menu

- [Pod] removed FluentUI

- [Colors] replaced all usages of FluentUI colors with AppColors

- [Verification] verification data was changed to new format

- [Contacts] localized "Add to mutuals" button

- [VideoPlayer] hide progress bar after video has played to the end

- [Onboarding] move user to LinkedIn verification if `linkedIn_ID` flag is absent in Profile

- [Appontments] refactored; updated for new layout

- [Onboarding] showing error or message if can't deserialize profile data 

- [Multichoice] Adjust multi select screens to Figma styles

- [Profile] updated nav bar according to Figma


### Fixed

- [VideoPlayer] video player was closed if user tried to rewind 

- [VideoPlayer] fixed video progress slider didn't start from the very beginning and didn't reach to the end

- [Video player] video player showed wrong duration

- [Profile] fixed displayed buttons on profile screen during active call

- [VideoStory] fixed video player modal transition style

- [Contacts] fixed bug with reset selection of segment control on ContactsVC

- [Like] corrected processing of Like push notifications; fixed connection panel buttons; fixed messages shown when sending or approving a connection request

- [Profile] fixed a bug related to openning a document from profile

- [Floating panel] corrected behavior; prevented scrolling in ProfileAddVideoSheetViewController and ProfileSettingsSheetViewController

- [TabBar] fixed according to Figma



## [1.0.53] - 2021-02-12

### Added

- [Contacts] implemented search in Contacts

- [VideoStories] added 'swipe back' gesture to video player screen

- [Appointments] new time slots screen and appointments navigation

- [UI] new floating panel

### Changed

- [VideoStories] video uploads are now running in the background session


### Fixed

- [Contacts] prevent double click on "Add to mutuals" button


### Internal

- [Localization] All display strings are moved to Lokalise and refactored into key-accessible format


## [1.0.52] - 2021-01-28

### Added

- [Profile] implemented video renaming


### Changed

- [Appointments] changed ArrangeAppointments view to match Figma style

- [Analytics] updated analytics

- [Onboarding] changed "Choose your role" screen to match Figma style

- [VideoPlayer] changed background for VideoPlayerViewController

- [Analytics] updated analytics; 


### Fixed

- [Pushes] fixed recieving pushes after logout

- [VideoCall] fixed video call decline

- [Profile] Changed the height of the constraints if there are no video stories

- [VideoStory] fixed duplicated videos after deleting a video and then uploading a new on with the same name

- [VideoCall] prevented phone from sleep during video call

- [Stories] fixed wrong image for "Add video" button

- [Profile] fixed video story icons display on iPhone SE 1gen

- [VideoStory] fixed clipped hud while renaming or deleting a video   

- [VideoStory] fixed problem with videos order after renaming a video

- [Videos] deleted gradient from "add video" button

- [Avatar] deleted gradient around avatar image

- [Video player] aligned Back and Play buttons, centered title label

- [Video player] added back gesture 


## [1.0.51] - 2020-12-25

### Added

- [Error] added new error handling HUD

### Changed


### Fixed

- [Profile] Fixed constraint for video label from the right edge.

- [Profile] couldn't enter new name for document

- [Profile] document wasn't updated with new name on UI after renaming

- [Navigation] fixed black screen after logout

- [Profile] Fixed counter while editing doc name


## [1.0.49] - 2020-12-18

### Added

- [Profile] added symbols counter for edit fields view

- [Errors] added new error codes

- [Video] show video thumbnails


### Changed

- [Video] check if video exists before playing it; delete video if it doesn't exist

- [Profile] profile is now scrollable


### Fixed

- [Profile] fixed issue with displaying hud while downloading a pdf

### Internal

- [Strings] string extracted to use with localazy



## [1.0.47] - 2020-12-09

### Added

- [Appointments] show proposed calls in appointment; added context options "Accept", "Decline" for proposed calls

- [Profile] added Instant call setting in Profile

- [Calls] show lobby screen after inviting user to an instant call

- [Calls] send finishCall request after leaving room

- [Calls] propose my slots if user doesn't have any

- [Video] completely replaced vipeo player controller, now featuring autorotate for horizontal videos and buffer display

- [Push] show "You've got new contact" alert

- [Push] show user's profile when receive Like push notification

- [VideoCall] send finishCall request when tapped 

### Changed

- [Profile] don't show 'Call now' button if user doesn't allow instant calls

- [Appointments] updated date picker on the top

- [Profile] changed profile empty state

- [Onboarding] refactored onboarding multichoice screens into CleanSwift

### Fixed

- [Registration] fixed sms code verification

- [Calls] added new api for instant calls

- [Calls] added support for "now" time slot

- [Calls] added call_invite, mutual like push types support

- [Calls] implemented accept and decline calls

- [Calls] fixed displaying profile image when received like push

- [Video] fixed race condition preventing video from uploading



## [1.0.45] - 2020-11-19

### Added

- [User Profile] added edit indicator in my profile

- [Video Call] show profile when tapping photo in incoming call alert

- [Video Call] implemented instant call between mutuals


### Changed

- [Profile] deck is shown only to mutuals

- [Swipe, User Profile] 'Connect' button has been moved inside profile to match Figma layouts


### Fixed

- [Appointments] segment control width fixed and now occupies all available screen width


## [1.0.44] - 2020-11-12

### Added

- [Network] added `getEvents` web request

- [Network] added different error handling for PROD and DEV versions; support for `errorCode` in network responses


### Changed

- [Onboarding] show stages or industries onboarding screen depending on where user left onboarding process


### Fixed

- [Profile] fixed ui of add video story button

- [Onboarding] prevent double clicking on [Continue] during Onboarding; transition to the next screens is now faster

- [Appointments] fixt segment control width

- [Swipe] fixed tagline wasn't shown on 4" screen; decreased video stories height on 4" screen


## [1.0.43] - 2020-11-05

### Added

- [Segment control] swipe gesture added

- [Network] added `renameDocument` and `renameVideo` web requests

- [Profile] document renaming


### Changed

- [Onboarding] user should always select at least one 'investment stage' and 'space'

- [SignIn] linkedIn new screen as a part of onboarding flow

- [Network] added `renameDocument` and `renameVideo` web requests


## [1.0.42] - 2020-10-29

### Fixed

- [Profile] videos that were in the process of uploading disappeared if the user left the screen

- [Profile] prevent uploading video with custom title, which was already used

- [Profile] fixed keyboard was overlapping entered text

- [Appointments] hid non actual (old) timeslots; sorted timeslots

- [Timeslots] corrected displayed error message when adding timeslot


### Added

- [Profile] added 1024 symbols limit for tags

- [Onboarding] linkedIn new screen as a part of onboarding flow

- [Network] added `renameDocument` and `renameVideo` web requests


### Changed

- [video call] changed notification alert button title from `Enter the call` to `Accept`

- [Network] logging more informative decoding error


## [1.0.41] - 2020-10-22


### Added

- [Appointments] cancel meeting implemented on appointments screen


### Changed

- [Profile] fixed UserData parsing due to server changes

- [Appointments] Names of weekdays at top of the appointments screen are shown in short form

- [Registration] when user profile is deleted - proceed to registration instead of asking user to restart the app


### Fixed

- [Profile] fixed parsing profile's active role

- [Appointments] fixed selection of start time in next days; it wasn't possible to select time interval to the end of a day

- [Appointments] fixed calls update took too long

- [Contacts] Error message when can't find contant profile

- [Contacts] Double click on video button request profile twice bug

- [Videos] video sorting changed

- [Appointments] fixed calls update took too long

- [Push] fixed push `Like` parsing

- [Push] push notifications now working for VS_Testing build


## [1.0.40] - 2020-10-15

### Added

- [documents] actions on long tap

- [network] added parsing of  `mutuals`, `likes`, `liked`  (in profile),

- [swipe] display toast messages of connection request sent / approved / received on Find screen

- [network] added `dislike` user web request

- [appointments] show alert of successfully booking a meeting

- [contacts] Contacts list logic implemented

### Fixed

- [swipe] fixed constraint errors on SwipeCard

- [date formatter] stripped milliseconds from incoming json date string

- [notifications] fcmToken wasn't sent after user initial registration in the App

- [profile] fixed industries editing bug

- [appointments] fixed timeslot creation behavior - after timeslot created horizontal calendar slides to the timeslot's date

- [contacts] UI for small screens on contacts list page fixed


### Changed

- [swipe] removed Like button, Connect button now does llike

- [swipe] changed appearance of SwipeCard depending on like status

- [profile] don't show camera button on profile screen if this is not our contact

- [Documents] duplicate documents uploading constrained

- [swipe] changed messages shown when connection request was sent; refresh connection status on notification; removed toast "Liked user"

- [network] changed profile parsing according to new data structure of `likes`, `liked`, `mutuals`

- [appointments] corrected time slot creation: preselect day in calendar on opening; prevent `dateTo` in Calendar be less than 15 minutes from `dateFrom`; if selected date is today than start time is shifted 15 minutes ahead

- [appointments] changed the error message if an overlapping timestamp is entered

## [1.0.39] - 2020-10-08

### Fixed

- [contacts] fixed displaying mutuals   

- [contacts] arrange meeting by clicking on camera button of a contact   

- [contacts] display message while checking contact for available slots

- [appointments] fixed displaying arranged calls   

- [appointments] refresh calls on appointments list

- [network] fixed parsing of timeslots


## [1.0.38] - 2020-10-07


### Fixed

- [project] fixed swiftlint warnings

- [Stories] Reassigned "Record now" action on adding video

- [video calls] fixed video calls' UI

- [Profile] fixed verifying profile hud being stuck  

- [profile] removed newline characters from headline, position and company; set limit for title and company - 88 characters

- [appointments] Time intervals in appointments

- [profile] fixed video deletion

### Added

- [video calls] added 'cancelCall' web request

### Changed

- [Profile] hide empty sections on others' profiles

- [Video] Empty custom video title constrained

## [1.0.37] - 2020-10-01

### Fixed

- [Stories] Reassigned "Record now" action on adding video

- [network] fixed 403 error, due to expired id token


### Added

- [UI] UI for video call controller

- [notifications] added NotificationManager which replaced PushService; added UNNotificationServiceExtension to be able to modify payload in future

- [calls] implemented Twilio video calls

- New contacts page


## [1.0.36] - 2020-09-24

### Fixed

 - [UI] Appointments card UI for small screen fixed

 - [UI] Swipe card UI for small screen fixed

 - Localized two strings from POEditor  
  Minor string changes:

- [Strings] Localized two strings from POEditor  
  Minor string changes:
Headline > Tagline
Data / Security / Blockchain > Technology


### Changed

- [hud] extracted message and error hud presentation mechanism into separate entity

- [UI] Appointments screen was refactored to match new Figma wireframes

- [network] Refactored appointment scheduling due to back-end and UI/UX changes
• rewrote addTimeSlot web request
• added deleteTimeSlot web request
• added knockUser web request
• rewrote accept / decline call web requests;
• removed old inviteCall web request
• added getTimeSlots web request
• rewrote time slots parsing, added status and new properties to TimeSlot
• added NotificationAlertViewController;
• show notification of invited / declined / accepted calls
• in arrange appointments filter user slots to show only those with status "free"


### Removed

 - removed legacy classes that were out of use



## [1.0.35] - 2020-09-17

### Added

- [chat] added message notification

- [user profile] added chat button with feature flag

- [network] added warning when no internet connection


### Fixed

- [network] fixed serialization fo updated API protocol (other users' uploading videos collections)


### Removed

- [swipe] removed old style notifications

- [zoom] removed Zoom layer

- [user profile] removed legacy profile implementation


## [1.0.34] - 2020-09-10

### Changed

- [video] video status indication colors have changed according to Figma wireframes

### Fixed

- [swiper] small ui changes according to figma

- [user profile] small ui changes according to figma

- [video] video now uploads to the correct MUX destination depending on the build configuration


## [1.0.33] - 2020-09-03

### Internal

- [assets] Refactoring of app assets
Major part of  app assets changed to pdf single scale format

### Added

- [swiper] added message on swiper screen for empty matches

### Fixed

- [navigation bar] changed font type to system


### Internal
- [Coordinator] added coordinator patter in app navigation


## [1.0.32] - 2020-08-27

### Internal

- [appointments] Added API /calls requests implementation

- [tests] changed and added new RestAPI tests

### Added

- [appointments] added new appointments screen
new appointments screen consists of time slots and my calls schedule, horizontal date scroller, time slot builder to create new time slots and appointments screen which is a parent for all of the above

- [multichoice] added new multichoice screen

- [connectivity] Warn user if internet connection is lost

- [appointments] connected network calls api: show user's calls, time slots; add time slots; invite call

- [appointments] added Arrange Appointments screen

- [user profile] parse calls from json

- [swiper] show Arrange Appointments screen when user presses Connect button


### Changed

- [video] Video player starts playing video when opened

- [swiper] added pull to refresh functionality


### Fixed

- [authentication] added IDTokenDidChangeListener to refresh auth token

- [user profile] fixed display of multiline headline and position / company info

- [user profile] replaced "at" with "," in title


## [1.0.31] - 2020-08-20 HOTFIX

### Fixed

- [mutuals] now mutual profile shows videos of selected user correctly


## [1.0.30] - 2020-08-20

### Internal

 - [analytics] Added analytics
 Verify phone, verify code, user type, stages, industries, user profile, swiper


 ### Changed

- [swipe] stages and industries on swipe card now displayed as tags instead of string

- [user profile] Profile Avatar now renders internally and features story-like gradient animation (no stories added yet, only render)

- [mutuals] Refresh mutuals after receiving "like" push notification

### Fixed
- [user profile] all tag cells fit correctly on small screen devices

- [user profile] Changed Deck font to be the same as Stages, Startup, Tags

- [user profile] Leaving profile screen while uploading a document no longer cancels the upload

- [user profile] Removed extra spaces from headline

- [user profile] Text in headline, title and company is word-wrapped now

- [user profile] When editing Stages and Industries, the current states are shown in the Edit screen

- [video] Leaving profile does not result in "losing" videos that are not in 'ready' status yet

- [swipe] removed extra comma on swipe card when stages string is empty

- [authentication] blocks 'resend code' button for 60 seconds to prevent 'code expired' error

## [1.0.29] - 2020-08-17 HOTFIX
 ### Internal
 - [strings] Some UI strings changes
 - [video] Leaving profile does not result in "losing" videos that are not in 'ready' status yet

### Changed
- [onboarding] User is able to correct phone number

 ### Internal
 - [ci] changed CI process
 - [ci] added Danger to preprocess Merge Requests and comment in GitLab any issues before Reviewer comes to play
 - [network] added new API compatibility
 - [network] completely moved to new API

## [1.0.28] - 2020-08-13
### Fixed
- [user profile] When editing Stages and Industries, the current states are shown in the Edit screen
-
### Internal
- [ci] changed CI process
- [ci] added Danger to preprocess Merge Requests and comment in GitLab any issues before Reviewer comes to play
- [network] added new API compatibility
- [network] completely moved to new API

## [1.0.25] - 2020-08-06
### Added
- [user profile] Editing headline: whitespaces trimming and character limit
- [user profile] Uploading video status indication.
After video is uploaded (progress bar runs to 100%), circle changes its color according to video status: primary blue color means video is READY (can be watched and visible for other users), yellow means video is being PROCESSED (can not be watched, users don’t see it), red means something got broken

### Fixed
- [documents] Documents in other users' profiles now can be viewed
- [swipe] Headline on relevant card now scales appropriately
- [user profile] LinkedIn cancelation now cancels loading HUD
- [swipe] Relevant cards now load videos correctly
- [swipe] Relevant pre-fetching is moved to splash screen in instagram manner. When relevant screen is shown, all data is in place, no more waiting for ‘loading’
- [top menu] Navigation bar now does not change its color when cancelling back-swipe gesture

## [1.0.23] - 2020-08-06
### Added
 - Editing headline: whitespaces trimming and character limit
 - Uploading video status indication.
After video is uploaded (progress bar runs to 100%), circle changes its color according to video status: primary blue color means video is READY (can be watched and visible for other users), yellow means video is being PROCESSED (can not be watched, users don’t see it), red means something got broken

### Changed

### Deprecated

### Removed

### Fixed
- Documents in other users' profiles now can be viewed
- Headline on relevant card now scales appropriately
- LinkedIn cancelation now cancels loading HUD
- Relevant cards now load videos correctly
- Relevant pre-fetching is moved to splash screen in instagram manner. When relevant screen is shown, all data is in place, no more waiting for ‘loading’
- Navigation bar now does not change its color when cancelling back-swipe gesture

### Security
