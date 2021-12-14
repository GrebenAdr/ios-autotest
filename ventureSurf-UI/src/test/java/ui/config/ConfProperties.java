package ui.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.URL;

@Slf4j
public class ConfProperties {

    private static AppiumDriverLocalService service;

    @BeforeSuite
    public void globalSetup () throws IOException {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterSuite
    public void globalTearDown () {
        if (service != null) {
            service.stop();
        }
    }

    public URL getServiceUrl () {
        return service.getUrl();
    }

    public AppiumDriver getDriver(boolean isAndroidDriverNeeded, DesiredCapabilities capabilities) {
        if (isAndroidDriverNeeded) {
            return new AndroidDriver<>(getServiceUrl(), capabilities);
        } else {
            return new IOSDriver<>(getServiceUrl(), capabilities);
        }
    }

    public void skipTestMethodBecauseBug(String text) {
        log.warn(text);
        throw new SkipException(text);
    }
}
