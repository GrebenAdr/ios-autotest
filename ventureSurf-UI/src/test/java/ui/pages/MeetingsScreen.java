package ui.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import ui.config.DriverUtils;

import static ui.constants.Constants.PLUS;

@Getter
public class MeetingsScreen extends DriverUtils {

    @AndroidFindBy(accessibility = PLUS)
    @iOSXCUITFindBy(accessibility = PLUS)
    public MobileElement plusBtn;

}
