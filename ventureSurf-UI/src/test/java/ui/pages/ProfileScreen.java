package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import ui.config.DriverUtils;

import static ui.constants.Constants.*;

@Getter
public class ProfileScreen extends DriverUtils {

    @AndroidFindBy(accessibility = MORE)
    @iOSXCUITFindBy(accessibility = MORE)
    public MobileElement profileSettingsBtn;

    @AndroidFindBy(accessibility = LOGOUT)
    @iOSXCUITFindBy(accessibility = LOGOUT)
    public MobileElement signOutBtn;

    @AndroidFindBy(accessibility = BUSINESS_PAGE)
    @iOSXCUITFindBy(accessibility = BUSINESS_PAGE)
    public MobileElement businessPageCell;

}
