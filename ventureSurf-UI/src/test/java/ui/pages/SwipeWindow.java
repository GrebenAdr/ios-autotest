package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class SwipeWindow {

    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "itemMenu")
    @iOSXCUITFindBy(accessibility = "itemMenu")
    public MobileElement itemMenu;

    @AndroidFindBy(accessibility = "tabBarSwipeBtn")
    @iOSXCUITFindBy(accessibility = "tabBarSwipeBtn")
    public MobileElement tabBarSwipeBtn;

    @AndroidFindBy(accessibility = "tabBarProfileBtn")
    @iOSXCUITFindBy(accessibility = "tabBarProfileBtn")
    public MobileElement tabBarProfileBtn;


    public SwipeWindow(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void clickOnItemMenu() {
        itemMenu.click();
    }

    public void clickOnTabBarSwipeBtn() {
        tabBarSwipeBtn.click();
    }

    public void clickOnTabBarProfileBtn() {
        tabBarProfileBtn.click();
    }

}
