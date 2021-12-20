package ui.steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import ui.config.DriverUtils;
import ui.pages.*;

import static ui.constants.Constants.PLUS;

public class StepSuit extends DriverUtils {

    LoginScreen loginElements = new LoginScreen();
    SwipeScreen swipeWindow = new SwipeScreen();
    ContactsScreen contacts = new ContactsScreen();
    MeetingsScreen meetings = new MeetingsScreen();
    ProfileScreen profile = new ProfileScreen();
    TabBar tabBar = new TabBar();

    public void login() {
        // TODO: 29.11.2021 найти способ сброса кешей или переустановки приложения, либо делать разлогин каждый раз перед закуском тестов
//        if (loginElements.laFirstText.getText()){
        loginElements.init();
        Allure.step("Очистка поля");
        loginElements.getLoginField().clear();
        Allure.step("Ввод телефона");
        loginElements.getLoginField().sendKeys("+15552222222");
        Allure.step("Клик на чекбокс");
        loginElements.getCheckboxAgree().click();
        Allure.step("Клик на кнопку Continue");
        loginElements.getContinueBtn().click();
        Allure.step("Ввод пароля");
        loginElements.getPassField().sendKeys("123123");
        Allure.step("Пароль введен");
        Assert.assertNotNull(loginElements.getLaLabel().getText(), "Ошибка логина");
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

    public void logout() {
        // TODO: 10.12.2021 Не видит id. Либо не тот указал, либо не там указал в приложении
        profile.init();
        tap(0.8);
        Allure.step("Клик на кнопку с настройками");
        profile.getProfileSettingsBtn().click();
        // TODO: 10.12.2021 Можно добавить скролл(но не обязательно - работает и без него)
        Allure.step("Клик на кнопку logout");
        profile.getSignOutBtn().click();
        Allure.step("Кнопка logout нажата");
        // TODO: 10.12.2021 Поиск работает. Немного переделать assert
        Assert.assertNotNull(loginElements.getLaFirstText().getText(), "Ошибка логаута");
    }

    public void validateCard() {
        profile.getBusinessPageCell().findElement(By.id(PLUS)).click();
    }

}
