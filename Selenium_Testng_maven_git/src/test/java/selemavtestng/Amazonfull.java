package selemavtestng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonfull {


    WebDriver driver;

   
    @BeforeClass
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in"); // Open Browser
    }

 
    @Test(priority = 1)
    public void loginAmazon() throws Exception {
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_email")).sendKeys("abiashwinps@gmail.com");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_password")).sendKeys("Abi@2004");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);   //  Login
    }

  
    @Test(priority = 2)
    public void searchProduct() throws Exception {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("t shirts");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);  // Search Product
    }

   
    @Test(priority = 3)
    public void addToCart() throws Exception {
        driver.findElement(By.xpath("(//h2/a)[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
    } //  Add to Cart

 
    @Test(priority = 4)
    public void checkout() throws Exception {
        driver.findElement(By.id("proceed-to-checkout-action")).click();
        Thread.sleep(3000);   //Checkout
    }

   
    @Test(priority = 5)
    public void logoutAmazon() throws Exception {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();//it is an xpath fro logout
        Thread.sleep(2000); // Logout
    }

    //  Close Browser
    @AfterClass
    public void closeBrowser() {
        driver.quit();  //  Closing all Browser
    }
}
