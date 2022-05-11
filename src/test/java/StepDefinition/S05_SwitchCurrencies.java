package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05_SwitchCurrencies {
    Pages.SwitchCurrencies currencies;

    @When("Select Euro from currency dropdown list")
    public void switchCurrency(){
        currencies = new Pages.SwitchCurrencies(Hook.driver);
        currencies.swtichCurr();
    }

    @Then("Price is Euro")
    public void priceIsEuro() {
        currencies.euroSelected();
    }
}
