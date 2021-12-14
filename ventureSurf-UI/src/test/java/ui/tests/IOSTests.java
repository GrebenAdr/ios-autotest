package ui.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ui.config.ConfProperties;
import ui.pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class IOSTests extends ConfProperties {

    LoginElements loginElements;
    SwipeWindow swipeWindow;
    Contacts contacts;
    Meetings meetings;
    Profile profile;

    public static AppiumDriver appiumDriver;

    @BeforeSuite
    public void setUp() {
        String deviceName = System.getenv("IOS_DEVICE_NAME");
        String platformVersion = System.getenv("IOS_PLATFORM_VERSION");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName == null ? "iPhone 12 Pro" : deviceName);
        capabilities.setCapability("platformVersion", platformVersion == null ? "14.5" : platformVersion);
        capabilities.setCapability("automationName", "XCUITest");
//        capabilities.setCapability("noReset", false);
//        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
//        capabilities.setCapability("app", "/Users/cimacmini/IdeaProjects/VentureSurf/src/test/resources/VentureSurf_Sim.app");
        File filePath = new File(System.getProperty("user.dir"));
        File appDir = new File(filePath, "/src/test/resources/app");
        File app = new File(appDir, "VentureSurf_Sim.app");
        capabilities.setCapability("app", app.getAbsolutePath());
        appiumDriver = getDriver(false, capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginElements = new LoginElements(appiumDriver);
        swipeWindow = new SwipeWindow(appiumDriver);
        contacts = new Contacts(appiumDriver);
        meetings = new Meetings(appiumDriver);
        profile = new Profile(appiumDriver);
    }

    @Test
    public void login() throws InterruptedException {
        // TODO: 29.11.2021 найти способ сброса кешей или переустановки приложения, либо делать разлогин каждый раз перед закуском тестов
//        if (loginElements.laFirstText.getText()){
        appiumDriver.launchApp();
        loginElements.sendPhoneNumber();
        loginElements.acceptUserAgreement();
        loginElements.submitLogBtn();
        loginElements.sendCode();
        Assert.assertNotNull(loginElements.laLabel.getText(), "Ошибка логина");
//        Assert.assertEquals(loginElements.laLabel.getText(), "VentureSurf", "Ошибка логина");
//        }
    }

    //    @Test
    public void testSwipe() {
        swipeWindow.clickOnItemMenu();
    }

    //    @Test
    public void contacts() {
        contacts.clickOnPlusBtn();
    }

    //    @Test
    public void meetings() {
        meetings.clickOnPlusBtn();
    }

    //    @Test
    public void profile() {
        profile.clickOnSettingsBtn();
    }

    // TODO: 10.12.2021 Не всегда логин проходит и тогда этот AfterClass тоже будет выдавать ошибку. Усовершенствовать
    @AfterClass
    public void logout() {
        // TODO: 10.12.2021 Не видит id. Либо не тот указал, либо не там указал в приложении
//        swipeWindow.clickOnTabBarProfileBtn();
        profile.clickOnSettingsBtn();
        // TODO: 10.12.2021 Можно добавить скролл(но не обязательно - работает и без него)
        profile.clickOnLogoutBtn();
        // TODO: 10.12.2021 Поиск работает. Немного переделать assert
        Assert.assertNotNull(loginElements.laFirstText.getText(), "Ошибка логаута");
    }

    @AfterSuite
    public void tearDown() {
        appiumDriver.closeApp();
        appiumDriver.quit();
    }

    //        Assert.assertTrue(appiumDriver.findElementsByClassName("UILayoutContainerView.UINavigationBar.UINavigationBarContentView.UILabel").toString().contains("VentureSurf"), "Ошибка логина");
//        Assert.assertTrue(loginElements.laLabel.toString().contains("VentureSurf"), "Ошибка логина");
//        appiumDriver.findElementByXPath("//XCUIElementTypeLabel[@name='']");
//        Assert.assertTrue(appiumDriver.findElement(By.xpath("//*[contains(text(),'VentureSurf')]")), "Ошибка логина");
//        appiumDriver.findElement(By.xpath("//*[contains(text(),'VentureSurf')]"));
//        appiumDriver.findElementByXPath("//*[contains(text(),'VentureSurf')]");
//        appiumDriver.findElementsByLinkText("VentureSurf");

    //((JavascriptExecutor) driver).executeScript("document.querySelector('.button-ok').scrollIntoView({block: \"end\", behavior: \"smooth\"});")
    //element.clear();
    //Dimension elementSize = element.getSize();
    //element.click();
    //WebElement currentElement = driver.switchTo().activeElement();
    //MobileElement element = (MobileElement) driver.findElementByClassName("SomeClassName");
    //element.submit();
    //MobileElement elementOne = (MobileElement) driver.findElementByClassName("SomeClassName");
    //MobileElement elementTwo = (MobileElement) driver.findElementByClassName("SomeOtherClassName");
    //boolean isEqual = elementOne.equals(elementTwo);

    //List<MobileElement> elementsOne = (List<MobileElement>) driver.findElementsByAccessibilityId("SomeAccessibilityID");
    //List<MobileElement> elementsTwo = (List<MobileElement>) driver.findElementsByClassName("SomeClassName");

    // TODO: 19.11.2021 Сделать отдельные классы для поиска элементов (PageObject)
//        public class IOSPageFactory {
//
//            public IOSPageFactory(IOSDriver<IOSElement> driver) {
//                this.driver = driver;
//                PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//
//            }
//
//
//            @iOSXCUITFindBy  (xpath = "//XCUIElementTypeButton[@name='SIGN IN']")
//            public static WebElement YellowSignIn1;


    // TODO: 19.11.2021 Запросить ссылку на gitlab и выдачу прав для создания проекта для АТ


    // Test that it was successful by checking the document title
//        String pageTitle = appiumDriver.getTitle();
//        Assert.assertEquals(pageTitle, "Google");
}
