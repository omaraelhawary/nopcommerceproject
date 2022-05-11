package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SwitchCurrencies extends Base {

    public SwitchCurrencies(WebDriver driver) {
        super(driver);
    }
    // Currency Drop
    @FindBy(id = "customerCurrency")
    WebElement customerCurrency;
    public Select getCurrency() {
        return new Select(customerCurrency);
    }

    public void swtichCurr(){
        getCurrency().selectByVisibleText("Euro");
    }

    public void euroSelected(){
        WebElement currentCurr = getCurrency().getFirstSelectedOption();
        SoftAssert soft = new SoftAssert();
        String actualResult = currentCurr.getText();
        String expectedResult = "Euro";
        soft.assertEquals(actualResult,expectedResult);
    }

}
