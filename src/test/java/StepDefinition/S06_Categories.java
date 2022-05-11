package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S06_Categories {
    Pages.Categories categories;
    @When("Hover on menu item and select Category")
    public void navigateSubCat(){
        categories = new Pages.Categories(Hook.driver);
        categories.openSubCategory();
    }

    @Then("Category Page Opened")
    public void categoryPageOpened() {
        categories.checkCateogry();
    }
}
