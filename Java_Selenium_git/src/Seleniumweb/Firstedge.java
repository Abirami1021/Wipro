package Seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Firstedge {

	
	public static void main(String[] args)
		{
	 
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Abirami\\OneDrive\\Desktop\\Selenium_Integration\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
/*driver.get("https://www.google.com"); // Open selenium web
		
		System.out.println("Title: " + driver.getTitle()); // Print page title
		
		driver.quit();*/
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
	 
