package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecPractice {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // Type in search box
        driver.findElement(By.name("q")).sendKeys("Official website of selenium");

        // Press Enter (search)
        driver.findElement(By.name("q")).submit();

        // Wait 3 seconds
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver);//Used to perform advanced keyboard/mouse operations.
        //used to scroll up & down the pgg

        // Scroll down using PAGE_DOWN key
        actions.sendKeys(Keys.PAGE_DOWN).perform();//used to scroll down the pgg
        Thread.sleep(2000);

        // Scroll down again
        actions.sendKeys(Keys.PAGE_DOWN).perform();//.perform() to execute the action.
        Thread.sleep(2000);


        // Close browser
        driver.quit();
    }
}
