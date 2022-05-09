package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base {

    public Login(WebDriver driver) {
        super(driver);
    }

    //Email
    @FindBy(id = "Email")
    WebElement emailF;
    //Password
    @FindBy(id = "Password")
    WebElement passwordF;
    //Login Button
    @FindBy(className= "login-button")
    public
    WebElement loginBtn;

    public void validData(String uMail, String uPassword){
        emailF.clear();
        passwordF.clear();
        emailF.sendKeys(uMail);
        passwordF.sendKeys(uPassword);
    }

    public void navigateHome(){
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }

}
