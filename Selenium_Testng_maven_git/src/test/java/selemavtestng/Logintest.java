package selemavtestng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Logintest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(dataProvider="excelData")
    public void loginTest(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name="excelData")
    public Object[][] getExcelData() throws Exception {
        return ExcelUtils.getEcelData(
            System.getProperty("user.dir") + "/testData/login.xlsx",
            "Sheet1"
        );
    }
}

	 
		/*@Test (dataProvider="loginData")
		public void loginTest(String username, String password)
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login");
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			
			System.out.println();
			
			driver.findElement(By.id("submit")).click();
			
			driver.quit();
		}
			@DataProvider(name="loginData")
			public Object[][] getData()
			{
				return new Object[][]
			{
					{"user1", "pass1"},	
					{"user2", "pass2"},	
					{"user3", "pass3"}	};	}}*/

