package ui.config;

import com.codeborne.selenide.Screenshots;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static ui.config.DriverUtils.appiumDriver;

@Slf4j
public class TestResultsListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Starting test...");
        log.info("From test class: " + result.getTestClass());
        log.info("With name: " + result.getName());
        log.info("\"" + result.getMethod().getDescription() + "\"");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("Test SKIPPED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("Test FAILED");
        //save log on failure

        try {
            saveLog(result.getName(), result.getThrowable());
            if (result.getStatus() == ITestResult.FAILURE) {
                File scrFile = ((TakesScreenshot)appiumDriver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + result.getName() + "-"
//                        + Arrays.toString(result.getParameters()) +  ".jpg"));
                InputStream targetStream = new FileInputStream(scrFile);
                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
            }
//            File screenshot = Screenshots.takeScreenShotAsFile();
//            assert screenshot != null;
//            InputStream targetStream = new FileInputStream(screenshot);
//            Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test PASSED");

        try {
            File scrFile = ((TakesScreenshot)appiumDriver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + result.getName() + "-"
//                    + Arrays.toString(result.getParameters()) +  ".jpg"));
            InputStream targetStream = new FileInputStream(scrFile);
            Allure.addAttachment("Screenshot of a successful test", "image/png", targetStream, "png");
            //            File screenshot = Screenshots.takeScreenShotAsFile();
//            assert screenshot != null;
//            InputStream targetStream = new FileInputStream(screenshot);
//            Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "Log file {0}", type = "text/plain")
    public static byte[] saveLog(String testName, Throwable e) throws IOException {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString().getBytes(StandardCharsets.UTF_8);
    }
}
