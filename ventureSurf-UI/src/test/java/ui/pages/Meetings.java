package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

import static ui.constants.Constants.PLUS;

@Data
public class Meetings {
    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = PLUS)
    @iOSXCUITFindBy(accessibility = PLUS)
    public MobileElement plusBtn;

    public Meetings(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
