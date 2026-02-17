package Seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Script {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Abirami\\OneDrive\\Desktop\\Selenium_Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//sys-built in cls ,setproperty-built in method passing parameters as key and values
		
		WebDriver driver = new ChromeDriver(); // Open Chrome browser(run time polymorphism)-upcasting
		
		driver.get("https://www.google.com"); // Open Google
		
		System.out.println("Title: " + driver.getTitle()); // Print page title
		
		driver.quit(); // Close all the tabs browser
		//driver.close();// close current tab
	}
}
