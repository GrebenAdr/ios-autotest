package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;
import lombok.Getter;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import ui.config.DriverUtils;

import static ui.constants.Constants.*;

@Getter
public class LoginScreen extends DriverUtils {

    @AndroidFindBy(accessibility = PHONE_NUMBER)
    @iOSXCUITFindBy(accessibility = PHONE_NUMBER)
    private MobileElement loginField;

    @AndroidFindBy(accessibility = SMS_CODE)
    @iOSXCUITFindBy(accessibility = SMS_CODE)
    private MobileElement passField;

    @AndroidFindBy(accessibility = CONTINUE)
    @iOSXCUITFindBy(accessibility = CONTINUE)
    private MobileElement continueBtn;

    @AndroidFindBy(accessibility = CHECKBOX)
    @iOSXCUITFindBy(accessibility = CHECKBOX)
    private MobileElement checkboxAgree;

    @AndroidFindBy(xpath = "//*[@label='VentureSurf']")
    @iOSXCUITFindBy(xpath = "//*[@label='VentureSurf']")
    private MobileElement laLabel;

    @AndroidFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    @iOSXCUITFindBy(xpath = "//*[@label='Mobile for SMS verification:']")
    private MobileElement laFirstText;


    public void login(String numberPhone, String passPhone) {
        // TODO: 29.11.2021 найти способ сброса кешей или переустановки приложения, либо делать разлогин каждый раз перед закуском тестов
//        if (loginScreen.laFirstText.getText()){
        init();
        Allure.step("Очистка поля");
        getLoginField().clear();
        Allure.step("Ввод телефона");
        getLoginField().sendKeys(numberPhone);
        Allure.step("Клик на чекбокс");
        getCheckboxAgree().click();
        Allure.step("Клик на кнопку Continue");
        getContinueBtn().click();
        Allure.step("Ввод пароля");
        getPassField().sendKeys(passPhone);
        Allure.step("Пароль введен");
        Assert.assertNotNull(getLaLabel().getText(), "Ошибка логина");
    }



}
