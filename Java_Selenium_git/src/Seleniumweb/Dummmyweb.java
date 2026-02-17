package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummmyweb {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

  
        driver.manage().window().maximize();//after open it max the size of the screen

        // Open website
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        //  Login 
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //name
        //driver.findElement(By.name("user-name")).sendKeys("visual_user");//see with username
      //  driver.findElement(By.name("password")).sendKeys("secret_sauce");//with psw
      //  driver.findElement(By.name("login-button")).click();//login

        Thread.sleep(2500);

        //Add Items to Cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        Thread.sleep(2500);

        // Go to Cart 
        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(2500);

        // Checkout 
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2500);

        // Enter details
        driver.findElement(By.id("first-name")).sendKeys("Abi");//.sendkeys for setting the value to that
        driver.findElement(By.id("last-name")).sendKeys("rami");
        driver.findElement(By.id("postal-code")).sendKeys("68989");

        driver.findElement(By.id("continue")).click();//use click when using button--//like form use submit

        Thread.sleep(2500);

        // Finish
        driver.findElement(By.id("finish")).click();

        System.out.println("Order Placed Successfully!");

        Thread.sleep(2500);

        driver.quit();
    }
}
        