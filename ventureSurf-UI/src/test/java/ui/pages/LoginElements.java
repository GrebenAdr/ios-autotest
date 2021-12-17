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
public class LoginElements {

    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = PHONE_NUMBER)
    @iOSXCUITFindBy(accessibility = PHONE_NUMBER)
    public MobileElement loginField;

    @AndroidFindBy(accessibility = SMS_CODE)
    @iOSXCUITFindBy(accessibility = SMS_CODE)
    public MobileElement passField;

    @AndroidFindBy(accessibility = CONTINUE)
    @iOSXCUITFindBy(accessibility = CONTINUE)
    public MobileElement continueBtn;

    @AndroidFindBy(accessibility = CHECKBOX)
    @iOSXCUITFindBy(accessibility = CHECKBOX)
    public MobileElement checkboxAgree;

    @AndroidFindBy(xpath = "//*[@label='VentureSurf']")
    @iOSXCUITFindBy(xpath = "//*[@label='VentureSurf']")
    public MobileElement laLabel;

    @AndroidFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    @iOSXCUITFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    public MobileElement laFirstText;

    public LoginElements(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
