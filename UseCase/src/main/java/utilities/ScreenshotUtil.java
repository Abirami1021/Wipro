package utilities;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver,String testName){

        File src =
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String path = "screenshots/" + testName + ".png";
        File dest = new File(path);

        try{
            FileUtils.copyFile(src,dest);
        }catch(Exception e){
            e.printStackTrace();
        }

        return path;
    }
}