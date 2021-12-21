package ui.pages;

import io.appium.java_client.MobileElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;
import ui.config.DriverUtils;

import java.util.concurrent.TimeUnit;

import static ui.constants.Constants.SWIPE_PROFILE;

@Getter
public class SwipeScreen extends DriverUtils {


    String profileName;

    //    @AndroidFindBy(accessibility = "itemMenu")
//    @iOSXCUITFindBy(accessibility = "itemMenu")
//    public MobileElement itemMenu;

    public void connectToProfile() throws InterruptedException {
        MobileElement profile = appiumDriver.findElementByAccessibilityId(SWIPE_PROFILE).findElement(By.className("XCUIElementTypeStaticText"));
        profileName = profile.getText();
        appiumDriver.findElementByAccessibilityId(SWIPE_PROFILE).findElement(By.className("XCUIElementTypeStaticText")).click();
        appiumDriver.findElementByXPath("//XCUIElementTypeButton[@name = 'Connect']").click();
        Thread.sleep(7000);
        Assert.assertNotEquals(profile.getText(), profileName, "Профиль с именем \"" + profileName + "\" должен был пропасть со swipe экрана");
        // TODO: 21.12.2021 Добавить скриншот
    }
}
