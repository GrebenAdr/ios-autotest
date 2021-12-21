package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;
import ui.config.DriverUtils;

import static ui.constants.Constants.CONTRACT_PROFILE;
import static ui.constants.Constants.SWIPE_PROFILE;

@Getter
public class ContactsScreen extends DriverUtils {

    String contractProfile;
    String profileName;

    @AndroidFindBy(accessibility = "plusBtn")
    @iOSXCUITFindBy(accessibility = "plusBtn")
    public MobileElement plusBtn;
    @AndroidFindBy(accessibility = "sentRequestPagingTab")
    @iOSXCUITFindBy(accessibility = "sentRequestPagingTab")
    public MobileElement sentRequestPagingTab;

    public void clickSentTab() {
        sentRequestPagingTab.click();
    }

    public void cancelConnectionRequest() throws InterruptedException {
        MobileElement contractProfile = appiumDriver.findElementByAccessibilityId(CONTRACT_PROFILE).findElement(By.className("XCUIElementTypeStaticText"));
        profileName = contractProfile.getText();
        appiumDriver.findElementByAccessibilityId(CONTRACT_PROFILE).findElement(By.className("XCUIElementTypeStaticText")).click();
        appiumDriver.findElementByXPath("//XCUIElementTypeButton[@name = 'Cancel Connection Request']").click();
        Thread.sleep(7000);
        Assert.assertNotEquals(contractProfile.getText(), profileName, "Профиль с именем \"" + profileName + "\" должен был пропасть из вкладки Sent");
        // TODO: 21.12.2021 Добавить скриншот
    }
}
