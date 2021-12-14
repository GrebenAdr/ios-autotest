package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "plusBtn")
    @iOSXCUITFindBy(accessibility = "plusBtn")
    public MobileElement plusBtn;

    public Contacts(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void clickOnPlusBtn(){
        plusBtn.click();
    }
}
