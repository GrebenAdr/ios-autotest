package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Allure;
import lombok.Getter;
import org.testng.Assert;
import ui.config.DriverUtils;
import ui.steps.StepSuit;

import static ui.constants.Constants.*;

@Getter
public class ProfileScreen extends DriverUtils {

    LoginScreen loginScreen = new LoginScreen();
    StepSuit stepSuit = new StepSuit();

    @AndroidFindBy(accessibility = MORE)
    @iOSXCUITFindBy(accessibility = MORE)
    public MobileElement profileSettingsBtn;

    @AndroidFindBy(accessibility = LOGOUT)
    @iOSXCUITFindBy(accessibility = LOGOUT)
    public MobileElement signOutBtn;

    @AndroidFindBy(accessibility = BUSINESS_PAGE)
    @iOSXCUITFindBy(accessibility = BUSINESS_PAGE)
    public MobileElement businessPageCell;



    public void logout() {
        // TODO: 10.12.2021 Не видит id. Либо не тот указал, либо не там указал в приложении
        init();
        stepSuit.init();
        loginScreen.init();
        stepSuit.tap(0.8);
        Allure.step("Клик на кнопку с настройками");
        getProfileSettingsBtn().click();
        // TODO: 10.12.2021 Можно добавить скролл(но не обязательно - работает и без него)
        Allure.step("Клик на кнопку logout");
        getSignOutBtn().click();
        Allure.step("Кнопка logout нажата");
        // TODO: 10.12.2021 Поиск работает. Немного переделать assert
        Assert.assertNotNull(loginScreen.getLaFirstText().getText(), "Ошибка логаута");
    }

}
