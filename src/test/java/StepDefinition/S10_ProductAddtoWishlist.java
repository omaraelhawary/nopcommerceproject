package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class S10_ProductAddtoWishlist {

    Pages.ProductAddtoWishlist productAddtoWishlist;

    @And("Click on Wishlist icon in Single product page")
    public void clickOnWishlistButtonInSingleProductPage() throws InterruptedException {
        productAddtoWishlist = new Pages.ProductAddtoWishlist(Hook.driver);
        productAddtoWishlist.clickOnAddToCart();
        Thread.sleep(2000);
    }

    @And("User Navigates to Wishlist")
    public void userNavigatesToWishlist() {
        Hook.driver.navigate().to("https://demo.nopcommerce.com/wishlist");
    }

    @Then("Product shown in his Wishlist")
    public void productShownInHisWishlist() {
        productAddtoWishlist.checkItem();
    }

}
