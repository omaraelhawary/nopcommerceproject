package Pages;

import StepDefinition.Hook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Search extends Base{
    public Search(WebDriver driver) {
        super(driver);
    }
    // Search Input
    @FindBy(className = "search-box-text")
    WebElement searchInput;
    // item
    @FindBy(className = "search-box-button")
    WebElement searchBtn;
    // Product Name
    @FindBy(xpath = "//h2[@class='product-title']/a")
    WebElement productName;

    public void searchForProduct(String uItem){
        searchInput.sendKeys(uItem);
    }

    public void clickSearch(){
        searchBtn.click();
    }

    public void findProduct(String uItem){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(productName.getText(),uItem);
    }

}
