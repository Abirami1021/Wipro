package seletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Testngonly 
{
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	 public void beforeTest() {
        System.out.println("Before Test - Start Test Execution");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Open Browser");
       // WebDriver driver=new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
		System.out.println("Title: "+driver.getTitle());
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Login to Amazon");
        driver.get("https://www.amazon.in");}
	
      @Test
	public void openGoogle()
	{
		// TODO Auto-generated method stub
 
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air fryer under 3000"+Keys.ENTER);
		}
      @AfterMethod
      public void afterMethod() {
          System.out.println("After Method - Logout User");
      }

      // 6️⃣ Runs ONCE after this class
      @AfterClass
      public void afterClass() {
          System.out.println("After Class - Close Browser");
          driver.quit();
      }

      // 7️⃣ Runs ONCE after <test>
      @AfterTest
      public void afterTest() {
          System.out.println("After Test - Generate Test Report");
      }

	}


