package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import utilities.ExcelUtil;

public class LoginTest extends BaseTest {

    @DataProvider(name="loginData")
    public Object[][] getLoginData() {
        return ExcelUtil.getData("LoginData");
    }

    @Test(dataProvider="loginData")
    public void loginTest(String email, String password, String expected) {

        driver.get("https://automationexercise.com");

        LoginPage login = new LoginPage(driver);

        login.clickSignupLogin()
             .enterEmail(email)
             .enterPassword(password)
             .clickLogin();

      if(expected.equalsIgnoreCase("failure")) {
            Assert.assertTrue(login.getErrorMessage().contains("incorrect"));
        }
        else if(expected.equalsIgnoreCase("success")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("account"));
        }
    }
}