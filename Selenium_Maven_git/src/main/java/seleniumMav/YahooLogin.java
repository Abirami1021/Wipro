package seleniumMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();;

        try {
            WebDriverManager.chromedriver().setup();
            
            driver.manage().window().maximize();

            driver.get("https://login.yahoo.com/");
            Thread.sleep(2000);

         
            driver.findElement(By.id("login-username")).sendKeys("abiramips");
            driver.findElement(By.id("login-signin")).click();
            Thread.sleep(3000);

         
            driver.findElement(By.id("login-passwd")).sendKeys("Abi@2004");
            driver.findElement(By.id("login-signin")).click();
            Thread.sleep(3000);
            
            System.out.println("Login successfully");
        }
        catch(Exception e) {
            System.out.println("Error found: " + e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
