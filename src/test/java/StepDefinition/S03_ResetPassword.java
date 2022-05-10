package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03_ResetPassword {
    Pages.ResetPassword resetPassword;

    @Given("User Clicks on Forget Password Button")
    public void user_clicks_Forget_Password(){
        resetPassword = new Pages.ResetPassword(Hook.driver);
        resetPassword.forgetBtnClick();
    }

    @When("Enter Email {string}")
    public void enterEmail(String uEmail) {
        resetPassword.enterEmail(uEmail);
    }

    @And("Click on Recover Button")
    public void clickOnRecoverButton() {
        resetPassword.recoverBtnClick();
    }

    @Then("User Able to Reset his Password successfully")
    public void userAbleToResetHisPasswordSuccessfully() {
        resetPassword.resetSuccess();
    }
}
