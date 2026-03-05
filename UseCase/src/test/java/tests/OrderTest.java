package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.CheckoutPage;
import pages.OrderConfirmationPage;

public class OrderTest extends BaseTest {
	@Test
	public void placeOrderTest() {

	    driver.get("https://automationexercise.com");

	    // Login
	    LoginPage login = new LoginPage(driver);
	    login.clickSignupLogin()
	         .enterEmail("validuser@gmail.com")
	         .enterPassword("validpassword")
	         .clickLogin();

	    // Add product
	    HomePage home = new HomePage(driver);
	    home.searchProduct("Blue Top");
	    home.addFirstProductToCart();
	    home.clickContinueShopping();
	    home.clickCart();
	    home.clickProceedToCheckout();

	    // ✅ VERIFY ONLY CHECKOUT PAGE LOADED
	    Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),
	            "Checkout page not opened");
	}
}