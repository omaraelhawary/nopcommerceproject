package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S09_ProductAddtoCart {

    Pages.ProductAddtoCart productAddtoCart;

    @When("Click on Product Title")
    public void clickOnProductTitle() {
        productAddtoCart = new Pages.ProductAddtoCart(Hook.driver);
        productAddtoCart.clickonTitle();
    }

    @And("Click on Add to Cart button in Single product page")
    public void clickOnAddToCartButtonInSingleProductPage() throws InterruptedException {
        productAddtoCart = new Pages.ProductAddtoCart(Hook.driver);
        productAddtoCart.clickOnAddToCart();
        Thread.sleep(2000);
    }

    @Then("Product shown in his Add to cart")
    public void productShownInHisAddToCart() {
        productAddtoCart.checkItem();
    }
}
