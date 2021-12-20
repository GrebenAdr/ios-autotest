package ui.constants;

public class Constants {
    //    struct Accessibility {
//    enum Labels: String {
    public static final String USERNAME = "usernameLabel"; //+
    public static final String NO_PAST_MEETINGS = "noPastMeetingsLabel"; // в календаре на вкладке past
    public static final String DATE_LABEL = "dateLabel"; //+
    public static final String TIME = "timeLabel"; //+
    public static final String DURATION = "durationLabel"; //+
    public static final String HEADLINE = "headlineLabel"; // в календаре на вкладке past
    public static final String SETTINGS = "settingsLabel"; // в календаре на вкладке past
//    }

    //    enum CommonButtons: String {
    public static final String CONTINUE = "continueButton"; //+
    public static final String USER_AVATAR = "userAvatarButton"; //+
    public static final String PLUS = "plusButton"; //+
    public static final String ADD_TIME_SLOT = "addTimeSlotButton"; //+
    public static final String MEETINGS = "meetingsButton"; // в календаре после нажатия на "+"
    public static final String TIME_SLOTS = "timeSlotsButton"; // в календаре после нажатия на "+"
    public static final String SCHEDULE = "scheduleButton"; // когда хочу назначить митинг
    public static final String ADD = "addButton"; //похоже, что скрыли кнопку
    public static final String GO_TO_MEETING = "goToMeetingButton"; // когда осталось 15 минут до созвона (в календаре на карточке)
    public static final String ROLE = "roleButton"; // в профиле
    public static final String TITLE = "title"; // возможно, в профиле
    public static final String DELETE_PROFILE = "deleteProfileButton"; //+
    public static final String LOGOUT = "logoutButton"; //+
    public static final String VIEW_MY_PROFILE = "howOthersSeeMeButton"; //+
//    }

    //    enum TextFields: String {
    public static final String PHONE_NUMBER = "phoneNumberTextField"; //+
    public static final String SMS_CODE = "smsCodeTextField"; //+
//    }

    //    enum BarItems: String {
    public static final String NOTIFICATIONS = "notificationsBarItem"; // на swipe экране(колокольчик)
    public static final String CALENDAR = "calendarBarItem"; //+
    public static final String MORE = "moreBarItem"; //+
    public static final String SHARE = "shareBarItem"; //+
    public static final String DONE = "doneBarItem"; //при регистрации
//    }

    //    enum TabBarItems: String {
    public static final String SWIPE = "swipeTabBarItem"; // нижнее меню
    public static final String CONTACTS = "contactsTabBarItem";
    public static final String CALENDAR_TAB = "calendatTabBarItem";
    public static final String PROFILE = "profileTabBarItem";
//    }

    //    enum Cells: String {
    public static final String SWIPE_PROFILE = "profileCardCell"; //+
    public static final String CONTRACT_PROFILE = "profileCell"; //+
    public static final String TIME_SLOT = "timeSlotCell"; //+- (находит, но текста внутри нет)
    public static final String TIME_SLOT_HEADER = "timeSlotHeader"; //+- (находит, но текста внутри нет)
    public static final String DATE_CELL = "dateCell"; //+- (находит, но текста внутри нет)
    public static final String APPOINTMENT = "appointmentCell"; // это митинги
    public static final String DOCUMENT = "documentCell"; //+
    public static final String VIDEO = "videoCell"; //проверить на своем акке
    public static final String ADD_VIDEO = "addVideoCell"; // в профиле на кладке videos (похоже, что скрыли)
    public static final String CONTRACT_VIDEO = "contactVideoCell"; //+
    public static final String PROFILE_SETTINGS = "profileSettingsCell";
    public static final String BUSINESS_PAGE = "businessPageCell"; //+
    public static final String CELL_PERMISSION = "callPermissionCell"; //+
    public static final String MATCHES_NOTIFICATION = "matchesNotificationCell"; //+
    public static final String UPDATES_NOTIFICATION = "updatesNotificationCell"; //+
    public static final String VIDEO_CALLS_NOTIFICATION = "videoCallsNotificationCell"; // в настройках (похоже, что пока что скрыли)
    public static final String SCHEDULED_MEETING_NOTIFICATION = "scheduledMeetingNotificationCell"; //+
    public static final String NEW_VERSION = "newVersionCell"; // в профиле в настройках
    public static final String FOUNDER_PROFILE_VISIBILITY = "founderProfileVisibilityCell"; //+
    public static final String INVESTOR_PROFILE_VISIBILITY = "investorProfileVisibilityCell"; //+


//    }

    //    enum Pagings: String { //+
    public static final String MUTUALS = "mutualsPagingTab"; //+
    public static final String SENT_REQUEST = "sentRequestPagingTab"; //+
    public static final String RECEIVED_REQUEST = "receivedRequestPagingTab"; //+
    public static final String PAST_MEETINGS = "pastMeetingsPagingTab"; //+
    public static final String UPCOMING_MEETINGS = "upcomingMeetingsPagingTab"; //+
    public static final String DECK = "deckPagingTab"; //+
    public static final String VIDEOS = "videosPagingTab"; //+
    public static final String INFO = "aboutPagingTab"; //+
//    }

    //    enum OtherElements: String {
    public static final String CHECKBOX = "checkbox"; //+
    public static final String SEARCHBAR = "searchBar"; //+
    public static final String UNREAD_MESSAGE_BADGE = "unreadMessageBadge";// на вкладке контактов (карточка контакта)
    public static final String NO_APPOINTMENT_EMPTY_STATE = "noAppointmentsEmptyStateView"; //на вкладке календаря
    public static final String SWITCH = "switch"; //+
//    }
}
