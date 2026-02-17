package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resumeadd 
{
	 public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();

	  
	        driver.manage().window().maximize();//after open it max the size of the screen
	       
	        driver.get("https://the-internet.herokuapp.com/upload");
	       
	        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Abirami\\Downloads\\AbiramiP S_InternshalaResume.pdf");
	        driver.findElement(By.id("file-submit")).click();
	       
	        System.out.println("Resume uploaded Successfully!");

	        Thread.sleep(2500);

	        driver.quit();
	 }
}
