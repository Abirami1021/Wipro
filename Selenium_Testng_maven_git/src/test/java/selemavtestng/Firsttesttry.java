package selemavtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firsttesttry {

	// TODO Auto-generated method stub
		@Test
        //Run|Debug
		public void openGoogle()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println("Title: "+driver.getTitle());
			driver.quit();
		}

	} 


//annotation-it is a symbol,it is special keyword that controal hen adn how the method runs
//testng=suites(grp of testcasese)