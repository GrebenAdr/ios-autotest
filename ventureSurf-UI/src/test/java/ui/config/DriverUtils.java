package ui.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DriverUtils {

    public static AppiumDriver appiumDriver;

    public void init() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

}
