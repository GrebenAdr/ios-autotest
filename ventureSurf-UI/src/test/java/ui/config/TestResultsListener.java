package ui.config;

import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.*;
import java.nio.charset.StandardCharsets;

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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test PASSED");
    }

    @Attachment(value = "Log file {0}", type = "text/plain")
    public static byte[] saveLog(String testName, Throwable e) throws IOException {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString().getBytes(StandardCharsets.UTF_8);
    }
}
