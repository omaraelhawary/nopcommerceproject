package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Categories extends Base {
    public Categories(WebDriver driver) {
        super(driver);
        action= new Actions(driver);
    }
    // Main Category
    @FindBy(xpath = "//div[6]/div[2]/ul[1]/li[2]/a")
    WebElement mainCategory;
    // Sub Category
    @FindBy (xpath = "//div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a")
    WebElement subCategory;
    // Page Title
    @FindBy (tagName = "h1")
    WebElement currentCategory;

    // Hover and Click on Sub Category
    public void openSubCategory()
    {
        action.moveToElement(mainCategory).moveToElement(subCategory).click().build().perform();
    }
    // User Navigated to Sub Category
    public void checkCateogry(){
        SoftAssert soft = new SoftAssert();
        String actualResult = currentCategory.getText();
        String expectedResult = "Camera & photo ";
        soft.assertEquals(actualResult,expectedResult);
    }
}
