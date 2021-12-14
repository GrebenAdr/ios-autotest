package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

@Data
public class TabBar {

    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "tabBarSwipeBtn")
    @iOSXCUITFindBy(accessibility = "tabBarSwipeBtn")
    public MobileElement tabBarSwipeBtn;

    @AndroidFindBy(accessibility = "tabBarProfileBtn")
    @iOSXCUITFindBy(accessibility = "tabBarProfileBtn")
    public MobileElement tabBarProfileBtn;

    public TabBar(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}
