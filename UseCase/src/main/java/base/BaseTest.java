package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.ConfigReader;

public class BaseTest {

    protected WebDriver driver;
    ConfigReader config;

    @BeforeMethod
    public void setup() {

        config = new ConfigReader();
        String browser = config.getBrowser();

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com");
    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

    // 🔥 ADD THIS
    public WebDriver getDriver() {
        return driver;
    }
}