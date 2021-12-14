package ui.steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ui.config.ConfProperties;
import ui.pages.*;


public class StepSuit extends ConfProperties {

    public static AppiumDriver appiumDriver;

    LoginElements loginElements;
    SwipeWindow swipeWindow;
    Contacts contacts;
    Meetings meetings;
    Profile profile;
    TabBar tabBar;

    public void login() throws InterruptedException {
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

    public StepSuit(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}