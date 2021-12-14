package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

@Data
public class SwipeWindow {

    private AppiumDriver appiumDriver;

//    @AndroidFindBy(accessibility = "itemMenu")
//    @iOSXCUITFindBy(accessibility = "itemMenu")
//    public MobileElement itemMenu;

    public SwipeWindow(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
