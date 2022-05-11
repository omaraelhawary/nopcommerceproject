package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class FilterColor extends Base {
    public FilterColor(WebDriver driver) {
        super(driver);
        action= new Actions(driver);
    }
    // Apparel Category
    @FindBy(xpath = "//li/a[@href='/apparel']")
    WebElement apparelCat;
    // Shoes Category
    @FindBy(xpath = "//li/a[@href='/shoes']")
    WebElement shoesCat;
    // Red Filter
    @FindBy(id = "attribute-option-15")
    WebElement redColor;
    @FindBy(xpath = "//h2/a")
    WebElement redItem;

    // Open Shoes
    public void openSubCategory()
    {
        action.moveToElement(apparelCat).moveToElement(shoesCat).click().build().perform();
    }
    // click on red color
    public void filterRed(){
        redColor.click();
    }
    // success
    public void redItem(){
        SoftAssert soft = new SoftAssert();
        String expectedItem = "adidas Consortium Campus 80s Running Shoes";
        String actualItem = redItem.getText();
        soft.assertEquals(actualItem,expectedItem);
    }

}
