package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderConfirmationPage {

    WebDriver driver;
    WebDriverWait wait;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//p[contains(text(),'Congratulations')]")
    WebElement successMessage;

    public boolean isOrderSuccessful() {
        return successMessage.isDisplayed();
    }
}