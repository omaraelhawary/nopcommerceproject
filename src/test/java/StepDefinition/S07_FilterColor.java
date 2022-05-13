package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07_FilterColor {

    Pages.FilterColor filterColor;

    @When("User Navigates to Shoes Category")
    public void navigateSubCat(){
        filterColor = new Pages.FilterColor(Hook.driver);
        filterColor.openSubCategory();
    }

    @When("Filter by Red Color")
    public void filterByRedColor() {
        filterColor.filterRed();
    }

    @Then("Adidas items showed")
    public void adidasItemsShowed() {
        filterColor.redItem();
    }
}
