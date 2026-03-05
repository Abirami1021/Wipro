package listeners;

import org.testng.*;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;
import base.BaseTest;
import utilities.ScreenshotUtil;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentReportManager.getReportInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result){
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result){

        test.fail(result.getThrowable());

        WebDriver driver =
                ((BaseTest)result.getInstance()).getDriver();

        String path =
                ScreenshotUtil.captureScreenshot(driver,result.getName());

        try{
            test.addScreenCaptureFromPath(path);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context){
        extent.flush();
    }
}