package ui.steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import ui.config.DriverUtils;

public class StepSuit extends DriverUtils {

    public String getProfileName(String idCard) {
        return appiumDriver.findElementByAccessibilityId(idCard).findElements(By.className("XCUIElementTypeStaticText")).get(0).getText();
    }

    public void tap(double indexWidth) {
        Dimension size = appiumDriver.manage().window().getSize();

//        Только вычислить точку высоты экрана
        int height = (int) (size.getHeight() * 0.92); // высота нижнего таббара(центр)

//        Чтобы вычислить центральную точку ширины экрана
        int width = (int) (size.getWidth() * indexWidth); //0.2, 0.4, 0.6, 0.8 - координаты пунктов меню нижнего таббара

        TouchAction touchAction = new TouchAction<>(appiumDriver);
        touchAction.tap(PointOption.point(width, height)).perform();
    }

    public void swipe() {
        Dimension size = appiumDriver.manage().window().getSize();

//        Только вычислить точку высоты экрана
        int firstHeight = (int) (size.getHeight() * 0.3);
        int secondHeight = (int) (size.getHeight() * 0.7);

//        Чтобы вычислить центральную точку ширины экрана
        int width = (int) (size.getWidth() * 0.5);

        TouchAction touchAction = new TouchAction<>(appiumDriver);
        touchAction.longPress(PointOption.point(width, firstHeight)).moveTo(PointOption.point(width, secondHeight)).perform();
    }

    public void navigateAndUpdateSwipeScreen() throws InterruptedException {
        tap(0.2);
        swipe();
        Thread.sleep(3000);
    }
}
