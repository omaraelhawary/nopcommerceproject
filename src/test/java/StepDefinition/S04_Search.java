package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04_Search {
    Pages.Search search;

    @When("Enter Search Item Name {string}")
    public void enterSearchItemName(String uItem) {
        search = new Pages.Search(Hook.driver);
        search.searchForProduct(uItem);
    }

    @And("Click on Search Button")
    public void clickSearchbtn(){
        search.clickSearch();
    }


    @Then("User Able to Find {string} Successfully")
    public void userAbleToFindSuccessfully(String uItem) {
        search.findProduct(uItem);
    }
}
