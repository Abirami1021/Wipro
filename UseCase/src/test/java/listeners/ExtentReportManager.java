package listeners;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance(){

        if(extent == null){
            ExtentSparkReporter reporter =
                    new ExtentSparkReporter("reports/AutomationExerciseReport.html");

            extent = new ExtentReports();
            extent.attachReporter(reporter);

            extent.setSystemInfo("Application","AutomationExercise");
            extent.setSystemInfo("Tester","Abirami");
        }

        return extent;
    }
}