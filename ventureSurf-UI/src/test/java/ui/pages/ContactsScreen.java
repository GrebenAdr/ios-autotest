package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import ui.config.DriverUtils;

@Getter
public class ContactsScreen extends DriverUtils {

    @AndroidFindBy(accessibility = "plusBtn")
    @iOSXCUITFindBy(accessibility = "plusBtn")
    public MobileElement plusBtn;

}
