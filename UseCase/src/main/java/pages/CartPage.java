package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()='Proceed To Checkout']")
    WebElement checkoutBtn;

    public void proceedToCheckout() {
        checkoutBtn.click();
    }
}