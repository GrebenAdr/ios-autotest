package ui.steps;

import io.qameta.allure.Allure;
import org.testng.Assert;
import ui.pages.*;

import static ui.tests.IOSTest.appiumDriver;

public class StepSuit {


    LoginElements loginElements = new LoginElements(appiumDriver);
    SwipeWindow swipeWindow = new SwipeWindow(appiumDriver);
    Contacts contacts = new Contacts(appiumDriver);
    Meetings meetings = new Meetings(appiumDriver);
    Profile profile = new Profile(appiumDriver);
    TabBar tabBar = new TabBar(appiumDriver);

    public void login() {
        // TODO: 29.11.2021 найти способ сброса кешей или переустановки приложения, либо делать разлогин каждый раз перед закуском тестов
//        if (loginElements.laFirstText.getText()){

        Allure.step("Очистка поля");
        loginElements.getLoginField().clear();
        Allure.step("Ввод телефона");
        loginElements.getLoginField().sendKeys("+15552222222");
        Allure.step("Клик на чекбокс");
        loginElements.getLabelAgree().click();
        Allure.step("Клик на кнопку Continue");
        loginElements.getSubmitBtn().click();
        Allure.step("Ввод пароля");
        loginElements.getPassField().sendKeys("123123");
        Allure.step("Пароль введен");
        Assert.assertNotNull(loginElements.laLabel.getText(), "Ошибка логина");
//        Assert.assertEquals(loginElements.laLabel.getText(), "VentureSurf", "Ошибка логина");
//        }
    }

    public void logout() {
        // TODO: 10.12.2021 Не видит id. Либо не тот указал, либо не там указал в приложении
//        tabBar.getTabBarProfileBtn().click();
        Allure.step("Клик на кнопку с настройками");
        profile.getProfileSettingsBtn().click();
        // TODO: 10.12.2021 Можно добавить скролл(но не обязательно - работает и без него)
        Allure.step("Клик на кнопку logout");
        profile.getSignOutBtn().click();
        Allure.step("Кнопка logout нажата");
        // TODO: 10.12.2021 Поиск работает. Немного переделать assert
        Assert.assertNotNull(loginElements.laFirstText.getText(), "Ошибка логаута");
    }



}
