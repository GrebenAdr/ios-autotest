package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

import static ui.constants.Constants.*;

@Data
public class TabBar {

    private AppiumDriver appiumDriver;

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

    public TabBar(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}
