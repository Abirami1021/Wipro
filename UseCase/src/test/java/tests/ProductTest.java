package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ExcelUtil;

public class ProductTest extends BaseTest {

    @DataProvider(name = "productData")
    public Object[][] getProductData() {
        return ExcelUtil.getData("ProductData");
    }

    @Test(dataProvider = "productData")
    public void productSearchTest(String productName) {

        driver.get("https://automationexercise.com");

        HomePage home = new HomePage(driver);

        home.searchProduct(productName);

        Assert.assertTrue(home.isProductDisplayed(productName),
                "Product not found: " + productName);
    }
}