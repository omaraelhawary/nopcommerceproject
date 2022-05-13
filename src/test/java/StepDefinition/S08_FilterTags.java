package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S08_FilterTags {

    Pages.FilterTags filterTags;

    @When("Filter by Cool Tag")
    public void clickonTag(){
        filterTags = new Pages.FilterTags(Hook.driver);
        filterTags.clickTag();
    }

    @Then("User navigate to Cool tag page")
    public void navigateCool(){
        filterTags.navigatetoTag();
    }


}
