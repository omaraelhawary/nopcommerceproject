package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ProductAddtoCart extends Base{

    public ProductAddtoCart(WebDriver driver) {
        super(driver);
    }

    // item title in Home Page
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")
    WebElement productTitle;

    // Add to cart button
    @FindBy(id = "add-to-cart-button-4")
    WebElement addToCartBtn;

    // Wishlist Item
    @FindBy(xpath = "//*[@id='flyout-cart']/div/div[2]/div/div[2]/div[1]/a")
    WebElement addToCartItem;

    // Open product page
    public void clickonTitle(){
        productTitle.click();
    }

    // Click on Add to cart
    public void clickOnAddToCart(){
        addToCartBtn.click();
    }

    // Item in wishlist
    public void checkItem(){
        SoftAssert soft = new SoftAssert();
        String expectedItem = "Apple MacBook Pro 13-inch";
        String actualItem = addToCartItem.getText();
        soft.assertEquals(actualItem,expectedItem);
    }

}
