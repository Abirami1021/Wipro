package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()=' Products']")
    WebElement productsMenu;

    @FindBy(id="search_product")
    WebElement searchBox;

    @FindBy(id="submit_search")
    WebElement searchBtn;

    @FindBy(xpath="(//a[text()='Add to cart'])[1]")
    WebElement firstAddToCart;

    @FindBy(xpath="//u[text()='View Cart']")
    WebElement viewCart;

    public ProductPage openProducts() {
        productsMenu.click();
        return this;
    }

    public ProductPage searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBtn.click();
        return this;
    }

    public ProductPage addFirstProductToCart() {
        firstAddToCart.click();
        return this;
    }

    public void goToCart() {
        viewCart.click();
    }
}