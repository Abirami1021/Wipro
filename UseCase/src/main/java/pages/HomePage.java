package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 🔎 Search box
    @FindBy(id = "search_product")
    WebElement searchBox;

    // 🔍 Search button
    @FindBy(id = "submit_search")
    WebElement searchBtn;

    // 🛒 Product list
    @FindBy(css = ".productinfo p")
    List<WebElement> productNames;

    // ============================

    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBtn.click();
    }

    public boolean isProductDisplayed(String productName) {

        wait.until(ExpectedConditions.visibilityOfAllElements(productNames));

        for (WebElement product : productNames) {
            if (product.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void addFirstProductToCart() {

        WebElement addBtn = driver.findElement(
                By.xpath("(//a[contains(text(),'Add to cart')])[1]")
        );

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addBtn);
    }

    public void clickContinueShopping() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Continue Shopping']")))
                .click();
    }

    public void clickCart() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(),'Cart')]")))
                .click();
    }

    public void clickProceedToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(),'Proceed To Checkout')]")))
                .click();
    }
}