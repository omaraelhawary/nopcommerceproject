package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProductAddtoWishlist extends Base{

    public ProductAddtoWishlist(WebDriver driver) {
        super(driver);
    }

    // Add to Wishlist button
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addToWishlistBtn;

    // Cart Item
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[4]/a")
    WebElement WishlistItem;

    // Click on Add to cart
    public void clickOnAddToCart(){
        addToWishlistBtn.click();
    }

    // Item in Cart
    public void checkItem(){
        SoftAssert soft = new SoftAssert();
        String expectedItem = "Apple MacBook Pro 13-inch";
        String actualItem = WishlistItem.getText();
        soft.assertEquals(actualItem,expectedItem);
    }

}
