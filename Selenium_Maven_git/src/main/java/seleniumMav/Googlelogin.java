package seleniumMav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlelogin {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=google+login&oq=google+login&gs_lcrp=EgZjaHJvbWUqEQgAEEUYOxhDGLEDGIAEGIoFMhEIABBFGDsYQxixAxiABBiKBTIHCAEQABiABDIKCAIQABixAxiABDIHCAMQABiABDIGCAQQBRhAMgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEINzM4M2owajeoAgewAgHxBakDaBuHrH4m&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		/*WebElement cb=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
		if(!cb.isSelected())
		{
			cb.click();
			}*/
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/a")).click();
		WebElement ua=driver.findElement(By.className("VV3oRb YZVTmd SmR8"));
		ua.sendKeys("abiashwinps@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		driver.findElement(By.name("Passwd")).sendKeys("Abi@2004");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();
		
		driver.quit();
	}

}
