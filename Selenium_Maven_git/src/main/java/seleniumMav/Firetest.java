package seleniumMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;   

public class Firetest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 try
		 {
			 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
		 String title=driver.getTitle();
		 System.out.println("Title of the Page: "+title);
		 
		 if(title.contains("Amazon"))
		 {
			 System.out.print("Test Pass");
		 }
		 else
		 {
			 System.out.print("Test Fail");
		 }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.print("Error found: "+e.getMessage());
		 }
		finally
		{
			   driver.quit();
		}
	}

}
