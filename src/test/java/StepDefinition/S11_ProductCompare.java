package StepDefinition;

import Pages.ProductAddtoWishlist;
import Pages.ProductCompare;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S11_ProductCompare {

    Pages.ProductCompare productCompare;

    @When("Click on First Product Title")
    public void ClickonFirstProductTitle(){
        productCompare = new ProductCompare(Hook.driver);
        productCompare.navigateToFirstProduct();
    }

    @And("Click on Add to Compare Button in First Product page")
    public void clickOnAddToCompareButtonInProductPage() throws InterruptedException {
        productCompare.addFirstProductComp();
        Thread.sleep(2000);
    }

    @And("Click on Second Product Title")
    public void clickOnSecondProductTitle() throws InterruptedException {
        productCompare.navigateToSecondProduct();
        Thread.sleep(2000);
    }

    @And("Click on Add to Compare Button in Second product page")
    public void clickOnAddToCompareButtonInSecondProductPage() throws InterruptedException {
        productCompare.addSecondProductComp();
        Thread.sleep(2000);
    }

    @And("User Navigates to Compare Page")
    public void userNavigatesToComparePage() {
        Hook.driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
    }

    @Then("Products shown in his Compare List")
    public void productsShownInHisCompareList() {
        productCompare.compareItem();
    }
}
