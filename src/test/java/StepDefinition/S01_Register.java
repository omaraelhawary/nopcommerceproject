package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01_Register {
    Pages.Register register;

    @Given("User Navigates to Register Page")
    public void user_navigates_to_register_page(){
        register = new Pages.Register(Hook.driver);
        register.clickRegister();
    }

    @When("^Select Gender \"(.*)\"$")
    public void select_gender(String gender) {
        register.selectGender(gender);
    }

    @And("^User Enter \"(.*)\" and \"(.*)\"$")
    public void enterNames(String firstName, String lastName){
        register.enterNames(firstName,lastName);
    }

    @And("^Select Birthday Date \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void selectBirthdayDate(String uDay, String uMonth, String uYear) {
        register.enterDate(uDay,uMonth,uYear);
    }

    @And("^Email Address \"(.*)\"$")
    public void emailAddress(String umail) {
        register.enterEmail(umail);
    }

    @And("^Enter Company name \"(.*)\"$")
    public void enterCompanyName(String userComName) {
        register.enterComName(userComName);
    }

    @And("^Select Newsletter \"(.*)\"$")
    public void selectNewsletter(String newsCheck) {
        register.selectNews(newsCheck);
    }

    @And("^Add Password \"(.*)\" and Password Confirm \"(.*)\"$")
    public void addPassword(String uPassword, String uCPassword) {
        register.insertPassword(uPassword, uCPassword);
    }

    @And("user click on Register button")
    public void userClickOnRegisterButton() {
        register.regBtn.click();
    }

    @Then("User Could Register successfully")
    public void userCouldRegisterSuccessfully() {
        register.successMsg();
    }

}
