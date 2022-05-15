package StepDefinition;

import Pages.ProductCompare;
import Pages.ProductOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S12_ProductOrder {

    Pages.ProductOrder productOrder;

    @And("User Navigates to Add To Cart Page")
    public void userNavigatestoAddToCartPage(){
        productOrder = new ProductOrder(Hook.driver);
        Hook.driver.navigate().to("https://demo.nopcommerce.com/cart");
    }

    @And("Check Terms and Click Checkout")
    public void checkTermsAndClickCheckout() {
        productOrder.checkTermsAndClickCheckout();
    }


    @And("Checkout as a Guest")
    public void checkoutAsAGuest() {
        productOrder.guestCheckoutClick();
    }


    @And("Fill CheckOut Data {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillCheckOutData(String uFName,
                                 String uLName,
                                 String uEmail,
                                 String uCountry,
                                 String uCity,
                                 String uAddress,
                                 String uZipCode,
                                 String uPhoneNumber) throws InterruptedException {
        productOrder.enterData(uFName,
                                uLName,
                                uEmail,
                                uCountry,
                                uCity,
                                uAddress,
                                uZipCode,
                                uPhoneNumber);
        Thread.sleep(1500);
    }


    @And("Select Ground Transport")
    public void selectGroundTransport() throws InterruptedException {
        productOrder.shipMethod();
        Thread.sleep(1500);
    }

    @And("Select Check-Money Order")
    public void selectCheckMoneyOrder() throws InterruptedException {
        productOrder.paymentMehtod();
        Thread.sleep(1500);
    }


    @And("Confirm Payment Data")
    public void confirmPaymentData() throws InterruptedException {
        productOrder.confirmPayment();
        Thread.sleep(1500);
    }

    @And("Confirm Order")
    public void confirmOrder(){
        productOrder.confirmOrder();
    }


    @Then("Order Created Successfully")
    public void orderCreatedSuccessfully() {
        productOrder.successMessage();
    }
}
