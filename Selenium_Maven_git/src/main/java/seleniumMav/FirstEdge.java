package seleniumMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstEdge {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();

		  
	        driver.manage().window().maximize();//after open it max the size of the screen
	       
	        driver.get("https://the-internet.herokuapp.com/upload");
	       
	        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Abirami\\Downloads\\ABIRAMI_P_S (RESUME) (1).pdf");
	        driver.findElement(By.id("file-submit")).click();
	       
	        System.out.println("Resume uploaded Successfully!");

	        Thread.sleep(2500);

	        driver.quit();
	        
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();*/
	}

}
