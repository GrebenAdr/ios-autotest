package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

@Data
public class Profile {
    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "profileSettingsBtn")
    @iOSXCUITFindBy(accessibility = "profileSettingsBtn")
    public MobileElement profileSettingsBtn;

    @AndroidFindBy(accessibility = "signOutProfileBtn")
    @iOSXCUITFindBy(accessibility = "signOutProfileBtn")
    public MobileElement signOutBtn;

    public Profile(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
