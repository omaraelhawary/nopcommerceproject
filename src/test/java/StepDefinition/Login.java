package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    Pages.Login login;

    @And("User Navigates to Login Page")
    public void user_navigates_to_register_page(){
        login= new Pages.Login(Hook.driver);
        Hook.driver.navigate().to("https://demo.nopcommerce.com/login");
    }

    @When("Enter Email {string} and Enter Password {string}")
    public void enterEmailAndEnterPassword(String arg0, String arg1) {
        login.validData(arg0, arg1);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        login.loginBtn.click();
    }

    @Then("User Could Login successfully")
    public void userCouldLoginSuccessfully() {
        login.navigateHome();
    }
}