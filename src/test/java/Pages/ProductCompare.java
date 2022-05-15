package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProductCompare extends Base{

    public ProductCompare(WebDriver driver) {
        super(driver);
    }

    // First Product Title
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")
    WebElement firstProduct;

    //Second Product Title
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[3]/div[2]/div[1]/div/div[2]/h2/a")
    WebElement secondProduct;

    // First Product Compare
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[1]/div[2]/div[10]/div[2]/button")
    WebElement firstProductCompareBtn;

    // Second Product Compare
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[1]/div[2]/div[9]/div[2]/button")
    WebElement secondProductCompareBtn;

    // Second Item Compare
    @FindBy(xpath = "//div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")
    WebElement secondItemCompare;

    // First Item Compare
    @FindBy(xpath = "//div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a")
    WebElement firstItemCompare;

    // Navigate to First Product
    public void navigateToFirstProduct(){
        firstProduct.click();
    }

    // Add first Product to Compare
    public void addFirstProductComp(){
        firstProductCompareBtn.click();
    }

    // Navigate to Second Product
    public void navigateToSecondProduct(){
        secondProduct.click();
    }

    // Add first Product to Compare
    public void addSecondProductComp(){
        secondProductCompareBtn.click();
    }

    // Item in Compare
    public void compareItem(){
        SoftAssert soft = new SoftAssert();
        String expectedFirstItem = "Apple MacBook Pro 13-inch";
        String actualFirstItem = firstItemCompare.getText();
        soft.assertEquals(actualFirstItem,expectedFirstItem);
        String expectedSecondItem = "Samsung Series 9 NP900X4C Premium Ultrabook";
        String actualSecondItem = secondItemCompare.getText();
        soft.assertEquals(actualSecondItem,expectedSecondItem);
    }

}
