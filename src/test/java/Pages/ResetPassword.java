package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPassword extends Base{

    public ResetPassword(WebDriver driver) {
        super(driver);
    }
    // Forget Button
    @FindBy(xpath = "//a[@href='/passwordrecovery']")
    WebElement forgetBtn;
    // Email
    @FindBy(id = "Email")
    WebElement emailF;
    // Recover Button
    @FindBy(className = "password-recovery-button")
    WebElement recoverBtn;
    // Sucess Message
    @FindBy(className = "content")
    WebElement banner;

    public void forgetBtnClick(){
        forgetBtn.click();
    }

    public void enterEmail(String uEmail){
        emailF.sendKeys(uEmail);
    }

    public void reoverBtnClick(){
        recoverBtn.click();
    }

    public void resetSuccess(){
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = banner.getText();
        Assert.assertTrue("Error Message: Text is Wrong", actualResult.contains(expectedResult));
    }
}
