package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import ui.config.DriverUtils;

import static ui.constants.Constants.*;

@Getter
public class LoginScreen extends DriverUtils {

    @AndroidFindBy(accessibility = PHONE_NUMBER)
    @iOSXCUITFindBy(accessibility = PHONE_NUMBER)
    private MobileElement loginField;

    @AndroidFindBy(accessibility = SMS_CODE)
    @iOSXCUITFindBy(accessibility = SMS_CODE)
    private MobileElement passField;

    @AndroidFindBy(accessibility = CONTINUE)
    @iOSXCUITFindBy(accessibility = CONTINUE)
    private MobileElement continueBtn;

    @AndroidFindBy(accessibility = CHECKBOX)
    @iOSXCUITFindBy(accessibility = CHECKBOX)
    private MobileElement checkboxAgree;

    @AndroidFindBy(xpath = "//*[@label='VentureSurf']")
    @iOSXCUITFindBy(xpath = "//*[@label='VentureSurf']")
    private MobileElement laLabel;

    @AndroidFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    @iOSXCUITFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    private MobileElement laFirstText;

}
