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
public class Profile {
    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = MORE)
    @iOSXCUITFindBy(accessibility = MORE)
    public MobileElement profileSettingsBtn;

    @AndroidFindBy(accessibility = LOGOUT)
    @iOSXCUITFindBy(accessibility = LOGOUT)
    public MobileElement signOutBtn;

    public Profile(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
