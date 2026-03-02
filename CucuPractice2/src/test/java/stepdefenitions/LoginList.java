package stepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class LoginList {

    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the SauceDemo website")
    public void i_open_the_sauce_demo_website() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter usernames and passwords using list")
    public void i_enter_usernames_and_passwords_using_list(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        for (List<String> row : data) {

        	driver.get("https://www.saucedemo.com/");
            String username = row.get(0);
            String password = row.get(1);

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("password")).clear();

            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();

            System.out.println("Tried login with: " + username);
        }
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}