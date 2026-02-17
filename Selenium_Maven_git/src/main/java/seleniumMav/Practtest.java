package seleniumMav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practtest {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://the-internet.herokuapp.com/checkboxes");
	List<WebElement>cb= driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input"));
	System.out.println("Total size"+cb.size());
	for(WebElement check:cb)
	{
	if(!check.isSelected())
		{
			check.click();
		}
	}
	Thread.sleep(2000);
	
	driver.quit();	

	}

}
