package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class FilterTags extends Base {
    public FilterTags(WebDriver driver) {
        super(driver);
        action= new Actions(driver);
    }
    // Cool Tag
    @FindBy(xpath = "//li/a[@href='/cool']")
    WebElement coolTag;

    //Click on Cool tag
    public void clickTag(){
        coolTag.click();
    }

    // Success by navigating to Cool tag
    public void navigatetoTag(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/cool",driver.getCurrentUrl());
    }
}
