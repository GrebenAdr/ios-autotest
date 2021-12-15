package ui.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
