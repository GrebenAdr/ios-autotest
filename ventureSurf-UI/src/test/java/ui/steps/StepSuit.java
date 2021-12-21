package ui.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import ui.config.DriverUtils;
import ui.pages.*;

import static ui.constants.Constants.CONTRACT_PROFILE;
import static ui.constants.Constants.PLUS;

public class StepSuit extends DriverUtils {

//    LoginScreen loginScreen = new LoginScreen();
//    SwipeScreen swipeScreen = new SwipeScreen();
//    ContactsScreen contacts = new ContactsScreen();
//    MeetingsScreen meetings = new MeetingsScreen();
//    ProfileScreen profile = new ProfileScreen();
//    TabBar tabBar = new TabBar();

public String getProfileName(String idCard) {
    return appiumDriver.findElementByAccessibilityId(idCard).findElement(By.className("XCUIElementTypeStaticText")).getText();
}

    public void tap(double indexWidth) {
//        Вы уже нашли размер экрана , используя
        Dimension size = appiumDriver.manage().window().getSize();

//        Только вычислить центральную точку высоты экрана
        int height = (int) (size.getHeight() * 0.92); // высота нижнего таббара(центр)

//        Чтобы вычислить центральную точку ширины экрана
        int width = (int) (size.getWidth() * indexWidth); //0.2, 0.4, 0.6, 0.8 - координаты пунктов меню нижнего таббара

        TouchAction touchAction = new TouchAction<>(appiumDriver);
        touchAction.tap(PointOption.point(width, height)).perform();
    }

    public void swipe() {
//        Вы уже нашли размер экрана , используя
        Dimension size = appiumDriver.manage().window().getSize();

//        Только вычислить центральную точку высоты экрана
        int firstHeight = (int) (size.getHeight() * 0.3); // высота нижнего таббара(центр)
        int secondHeight = (int) (size.getHeight() * 0.7); // высота нижнего таббара(центр)

//        Чтобы вычислить центральную точку ширины экрана
        int width = (int) (size.getWidth() * 0.5); //0.2, 0.4, 0.6, 0.8 - координаты пунктов меню нижнего таббара

        TouchAction touchAction = new TouchAction<>(appiumDriver);
        touchAction.press(PointOption.point(width, firstHeight)).moveTo(PointOption.point(width, secondHeight)).perform();
    }

}
