package seleniumMav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testamaz {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Amazon
        driver.get("https://www.amazon.in");

        // Click Sign In
        driver.findElement(By.id("nav-link-accountList")).click();

        // Enter Email
        driver.findElement(By.id("ap_email_login")).sendKeys("abiashwinps@gmail.com");
        driver.findElement(By.id("continue")).click();

        // Enter Password
        driver.findElement(By.id("ap_password")).sendKeys("Abi@2004");
        driver.findElement(By.id("signInSubmit")).click();

        Thread.sleep(3000);

        // Search Product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("t shirt");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);

        // Click First Product
        driver.findElement(By.xpath("(//h2/a)[1]")).click();
        Thread.sleep(3000);

        // Add to Cart
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(3000);

        // Proceed to Checkout (optional)
        // driver.findElement(By.id("proceed-to-checkout-action")).click();

        // Hover on Account & Lists
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        Thread.sleep(2000);

        // Click Sign Out
        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
