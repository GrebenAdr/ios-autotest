package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import ui.config.DriverUtils;

import static ui.constants.Constants.*;

@Getter
public class TabBar extends DriverUtils {

    @AndroidFindBy(accessibility = SWIPE)
    @iOSXCUITFindBy(accessibility = SWIPE)
    public MobileElement swipeTabBarItem;

    @AndroidFindBy(accessibility = CONTACTS)
    @iOSXCUITFindBy(accessibility = CONTACTS)
    public MobileElement contactsTabBarItem;

    @AndroidFindBy(accessibility = CALENDAR_TAB)
    @iOSXCUITFindBy(accessibility = CALENDAR_TAB)
    public MobileElement calendarTabBarItem;

    @AndroidFindBy(accessibility = PROFILE)
    @iOSXCUITFindBy(accessibility = PROFILE)
    public MobileElement profileTabBarItem;

}
