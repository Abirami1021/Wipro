package Seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firstfire 
{
	    public static void main(String[] args) {

	       /* System.setProperty("webdriver.gecko.driver",
	        "C:\\Users\\Abirami\\OneDrive\\Desktop\\Selenium_Integration\\geckodriver-v0.36.0-win64\\geckodriver.exe");*/

	        WebDriver driver = new FirefoxDriver(); // for Open Firefox//run time polymorphism used here

	       /* driver.get("https://www.google.com"); // Open Google

	        System.out.println("Title: " + driver.getTitle()); // title name google

	        driver.quit(); // Close browser*/
	        try {
				driver.manage().window().maximize();//to maximize the window
			    driver.get("https://www.google.com");
			    
			    String title =driver.getTitle();
			    System.out.println("Page Title" + title);
			
			    if(title.contains("Google"))
			    {
			    	System.out.println("Test Pass");
			    }
			    else
			    {
			    	System.out.println("Test Fail");
			    }
			} catch(Exception e)
			{
			System.out.println("Exception occured : " + e.getMessage());
			}
			finally
			{
				driver.quit();
			}
	    }
	}


