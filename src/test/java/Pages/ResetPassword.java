package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

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
    // Success Message
    @FindBy(xpath = "//p[@class='content']")
    WebElement banner;

    public void forgetBtnClick(){
        forgetBtn.click();
    }

    public void enterEmail(String uEmail){
        emailF.sendKeys(uEmail);
    }

    public void recoverBtnClick (){
        recoverBtn.click();
    }

    public void resetSuccess(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = banner.getText();
        soft.assertEquals(actualResult, expectedResult);
    }
}
