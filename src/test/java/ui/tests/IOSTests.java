package ui.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ui.config.ConfProperties;
import ui.pages.LoginElements;

import java.util.concurrent.TimeUnit;

public class IOSTests extends ConfProperties {

    LoginElements loginElements;

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
        capabilities.setCapability("app", "/Users/cimacmini/IdeaProjects/VentureSurf/src/test/resources/VentureSurf_Sim.app");
        appiumDriver = getDriver(false, capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginElements = new LoginElements(appiumDriver);
    }


    @AfterSuite
    public void tearDown() {
        appiumDriver.closeApp();
        appiumDriver.quit();
    }

    @Test()
    public void test1() throws InterruptedException {
        // TODO: 29.11.2021 найти способ сброса кешей или переустановки приложения, либо делать разлогин каждый раз перед закуском тестов
        loginElements.sendPhoneNumber();
        loginElements.acceptUserAgreement();
        loginElements.submitLogBtn();
        loginElements.sendCode();
        Assert.assertEquals(loginElements.laLabel.getText(), "VentureSurf", "Ошибка логина");
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
}
