package ui.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import ui.config.ConfProperties;
import ui.config.TestResultsListener;
import ui.pages.*;
import ui.steps.StepSuit;

import java.io.File;
import java.util.concurrent.TimeUnit;

@Slf4j
@Listeners(TestResultsListener.class)
@Feature("Smoke UI Login tests")
public class IOSTest extends ConfProperties {

    LoginElements loginElements;
    SwipeWindow swipeWindow;
    Contacts contacts;
    Meetings meetings;
    Profile profile;
    TabBar tabBar;
    StepSuit stepSuit;

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
        tabBar = new TabBar(appiumDriver);
        stepSuit = new StepSuit();
    }


    @Test(description = "Логин в приложение")
    public void login() {
        stepSuit.login();
    }

    // TODO: 10.12.2021 Не всегда логин проходит и тогда этот AfterClass тоже будет выдавать ошибку. Надо усовершенствовать
    @AfterClass
    public void logout() {
        stepSuit.logout();
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


    // Test that it was successful by checking the document title
//        String pageTitle = appiumDriver.getTitle();
//        Assert.assertEquals(pageTitle, "Google");
}
