package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(text(),'Signup / Login')]")
    WebElement signupLoginBtn;

    @FindBy(xpath="//input[@data-qa='login-email']")
    WebElement email;

    @FindBy(xpath="//input[@data-qa='login-password']")
    WebElement password;

    @FindBy(xpath="//button[@data-qa='login-button']")
    WebElement loginBtn;

    @FindBy(xpath="//p[text()='Your email or password is incorrect!']")
    WebElement errorMsg;

    public LoginPage clickSignupLogin() {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(signupLoginBtn));

        signupLoginBtn.click();
        return this;
    }
    public LoginPage enterEmail(String mail) {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(email));

        email.clear();
        email.sendKeys(mail);
        return this;
    }
    public LoginPage enterPassword(String pass) {

        password.clear();
        password.sendKeys(pass);
        return this;
    }

    public void clickLogin() {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginBtn));

        loginBtn.click();
    }
    public String getErrorMessage() {
        return errorMsg.getText();
    }
}