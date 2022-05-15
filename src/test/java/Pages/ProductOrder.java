package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductOrder extends Base{

    public ProductOrder(WebDriver driver) {
        super(driver);
    }

    // Terms of Service
    @FindBy(id = "termsofservice")
    WebElement termsService;

    // Checkout Button
    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    // Checkout as Guest
    @FindBy(className = "checkout-as-guest-button")
    WebElement guestCheckout;

    // First Name
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement fName;

    // Last Name
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lName;

    // Email
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;

    // Country
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    // Select Country
    public Select getCountry() {
        return new Select(country);
    }

    // City
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    // Address 1
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    // Zip Code
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCode;

    // Phone Number
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    // Submit button
    @FindBy(className = "new-address-next-step-button")
    WebElement shipSubmitBtn;

    // Shipping Method Button
    @FindBy(className = "shipping-method-next-step-button")
    WebElement shipMethodBtn;

    // Confirm Payment Method
    @FindBy(className = "payment-method-next-step-button")
    WebElement payMethodCfm;

    // Confirm Payment Data
    @FindBy(className = "payment-info-next-step-button")
    WebElement paymentCfm;

    // Confirm Order
    @FindBy(className = "confirm-order-next-step-button")
    WebElement confirmbtn;

    // Success Message
    @FindBy(className = "title")
    WebElement successTitle;

    // Check Terms and Click Checkout
    public void checkTermsAndClickCheckout(){
        termsService.click();
        checkoutBtn.click();
    }

    // Guest Checkout
    public void guestCheckoutClick(){
        guestCheckout.click();
    }


    // Enter Shipping Data
    public void enterData(String uFName,
                          String uLName,
                          String uEmail,
                          String uCountry,
                          String uCity,
                          String uAddress,
                          String uZipCode,
                          String uPhoneNumber){
        fName.sendKeys(uFName);
        lName.sendKeys(uLName);
        email.sendKeys(uEmail);
        getCountry().selectByVisibleText(uCountry);
        city.sendKeys(uCity);
        address.sendKeys(uAddress);
        zipCode.sendKeys(uZipCode);
        phoneNumber.sendKeys(uPhoneNumber);
        shipSubmitBtn.click();
    }

    // Ship Method Submit
    public void shipMethod(){
        shipMethodBtn.click();
    }

    // Confirm Payment Method
    public void paymentMehtod(){
        payMethodCfm.click();
    }

    // Confirm Payment Way
    public void confirmPayment(){
        paymentCfm.click();
    }

    // Confirm Order
    public void confirmOrder(){
        confirmbtn.click();
    }

    // Success Message
    public void successMessage(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your order has been successfully processed!";
        String actualResult = successTitle.getText();
        soft.assertEquals(actualResult,expectedResult);
    }
}
