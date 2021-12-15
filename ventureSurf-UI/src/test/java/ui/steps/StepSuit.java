package ui.steps;

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

        loginElements.getLoginField().clear();
        loginElements.getLoginField().sendKeys("+15552222222");
        loginElements.getLabelAgree().click();
        loginElements.getSubmitBtn().click();
        loginElements.getPassField().sendKeys("123123");
        Assert.assertNotNull(loginElements.laLabel.getText(), "Ошибка логина");

//        Assert.assertEquals(loginElements.laLabel.getText(), "VentureSurf", "Ошибка логина");
//        }
    }

    public void logout() {
        // TODO: 10.12.2021 Не видит id. Либо не тот указал, либо не там указал в приложении
//        tabBar.getTabBarProfileBtn().click();
        profile.getProfileSettingsBtn().click();
        // TODO: 10.12.2021 Можно добавить скролл(но не обязательно - работает и без него)
        profile.getSignOutBtn().click();
        // TODO: 10.12.2021 Поиск работает. Немного переделать assert
        Assert.assertNotNull(loginElements.laFirstText.getText(), "Ошибка логаута");
    }
}
