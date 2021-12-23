package ui.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import ui.config.ConfProperties;
import ui.config.DriverUtils;
import ui.config.TestResultsListener;
import ui.pages.*;
import ui.steps.StepSuit;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static ui.config.DriverUtils.appiumDriver;
import static ui.constants.Constants.CONTRACT_PROFILE;
import static ui.constants.Constants.SWIPE_PROFILE;

@Slf4j
@Listeners(TestResultsListener.class)
@Feature("Smoke UI Login tests")
public class IOSTest extends ConfProperties {

    LoginScreen loginScreen;
    SwipeScreen swipeScreen;
    ContactsScreen contacts;
    MeetingsScreen meetings;
    ProfileScreen profile;
    TabBar tabBar;
    StepSuit stepSuit;

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
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginScreen = new LoginScreen();
        swipeScreen = new SwipeScreen();
        contacts = new ContactsScreen();
        meetings = new MeetingsScreen();
        profile = new ProfileScreen();
        tabBar = new TabBar();
        stepSuit = new StepSuit();
    }


    @BeforeClass(description = "Логин в приложение")
    public void login() {
        loginScreen.init();
        try{
            loginScreen.login("+15552222222", "123123");
        } catch (Exception e){
            return;
        }
    }

    @Test(description = "Добавить, а затем удалить карточку профиля человека")
    public void connectAndDeletePersonProfile() throws InterruptedException {
        // TODO: 21.12.2021 Расставить таймауты в нужных местах
        contacts.init();
        stepSuit.navigateAndUpdateSwipeScreen();
        String profileName = stepSuit.getProfileName(SWIPE_PROFILE);
        Allure.step("Добавить(connect) карточку профиля человека");
        swipeScreen.connectToProfile();
        stepSuit.tap(0.4);
        contacts.clickSentTab();
        contacts.cancelConnectionRequest();
        Allure.step("Удалить карточку профиля человека из Sent вкладки");
        stepSuit.navigateAndUpdateSwipeScreen();
//        WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 30);
//        IOSElement slider = (IOSElement) webDriverWait.until(driver1 -> appiumDriver.findElementByClassName("XCUIElementTypeSlider"));
        MobileElement profileCard = appiumDriver.findElementByAccessibilityId(SWIPE_PROFILE).findElement(By.className("XCUIElementTypeStaticText"));
        Assert.assertEquals(profileCard.getText(), profileName, "Имена должны совпадать");
    }

    // TODO: 10.12.2021 Не всегда логин проходит и тогда этот AfterClass тоже будет выдавать ошибку. Надо усовершенствовать
    @AfterClass
    public void logout() {
        profile.logout();
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
