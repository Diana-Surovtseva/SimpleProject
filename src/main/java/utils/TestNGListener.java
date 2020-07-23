package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Method onTestStart run");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Method onTestSuccessful run");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Method onTestFailure run");
    }

    public void onStart(ITestContext context) {
        System.out.println("Method onStart run");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Method onFinish run");
    }

}
