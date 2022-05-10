package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


public class Login extends Base {

    public Login(WebDriver driver) {
        super(driver);
    }
    // Login Button
    @FindBy(className = "ico-login")
    WebElement loginBtn;
    //Email
    @FindBy(id = "Email")
    WebElement emailF;
    //Password
    @FindBy(id = "Password")
    WebElement passwordF;
    //Login Button
    @FindBy(className= "login-button")
    public
    WebElement loginBtnSubmit;

    // Navigate to Register Page
    public void clickLogin(){
        loginBtn.click();
    }
    // Clear and enter valid login data
    public void validData(String uMail, String uPassword){
        emailF.clear();
        passwordF.clear();
        emailF.sendKeys(uMail);
        passwordF.sendKeys(uPassword);
    }
    // Success by navigating to home page
    public void navigateHome(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }

}
