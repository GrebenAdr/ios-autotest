package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "textPhone")
    @iOSXCUITFindBy(accessibility = "textPhone")
    public MobileElement loginField;

    @AndroidFindBy(accessibility = "textCode")
    @iOSXCUITFindBy(accessibility = "textCode")
    public MobileElement passField;

    @AndroidFindBy(accessibility = "btnContinue")
    @iOSXCUITFindBy(accessibility = "btnContinue")
    public MobileElement submitBtn;

    @AndroidFindBy(accessibility = "laAgree")
    @iOSXCUITFindBy(accessibility = "laAgree")
    public MobileElement labelAgree;

    @AndroidFindBy(xpath = "//*[@label='VentureSurf']")
    @iOSXCUITFindBy(xpath = "//*[@label='VentureSurf']")
    public MobileElement laLabel;

    @AndroidFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    @iOSXCUITFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    public MobileElement laFirstText;

//    driver.findElements(By.id("your_id")).get(1)

    public LoginElements(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void sendPhoneNumber(){
        loginField.clear();
        loginField.sendKeys("+15552222222");
    }

    public void sendCode() {
        passField.sendKeys("123123");
    }

    public void acceptUserAgreement() {
        labelAgree.click();
    }

    public void submitLogBtn() {
        submitBtn.click();
    }

}
