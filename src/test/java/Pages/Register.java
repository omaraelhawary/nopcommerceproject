package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

public class Register extends Base {
    public Register(WebDriver driver) {
        super(driver);
    }
    // Register Button
    @FindBy(className = "ico-register")
    WebElement registerBtn;
    //Gender
    @FindBy(id = "gender-male")
    WebElement maleGenderRadio;
    @FindBy(id = "gender-female")
    WebElement femaleGenderRadio;
    //Names
    @FindBy(id = "FirstName")
    WebElement fName;
    @FindBy(id = "LastName")
    WebElement lName;
    //Day
    @FindBy(name = "DateOfBirthDay")
    WebElement birthDay;
    //Select Day
    public Select getBirthDay() {
        return new Select(birthDay);
    }
    //Month
    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;
    //Select Month
    public Select getMonthDay() {
        return new Select(birthMonth);
    }
    //Year
    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;
    //Select Year
    public Select getYearDay() {
        return new Select(birthYear);
    }
    //Emails
    @FindBy(id = "Email")
    WebElement emailF;
    //Company Name
    @FindBy(id = "Company")
    WebElement cName;
    //Newsletter
    @FindBy(id = "Newsletter")
    WebElement newLetter;
    //Password & Password Confirm
    @FindBy(id = "Password")
    WebElement passwordF;
    @FindBy(id = "ConfirmPassword")
    WebElement passwordCfrm;
    //Register button
    @FindBy(id = "register-button")
    public WebElement regBtn;
    // Success message
    @FindBy(className = "result")
    WebElement successMsg;

    // Navigate to Register Page
    public void clickRegister(){
        registerBtn.click();
    }
    //Gender Selection
    public void selectGender(String gender){
        if (Objects.equals(gender, "male")) {
            maleGenderRadio.click();
        } else if (Objects.equals(gender, "female")){
            femaleGenderRadio.click();
        } else {
            System.out.println("Wrong Gender");
        }
    }

    //Names Enter
    public void enterNames(String firstName, String lastName){
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
    }

    //Birthday Date
    public void enterDate(String uDay, String uMonth, String uYear){
        getBirthDay().selectByVisibleText(uDay);
        getMonthDay().selectByVisibleText(uMonth);
        getYearDay().selectByVisibleText(uYear);
    }

    //Enter Email
    public void enterEmail(String umail){
        emailF.sendKeys(umail);
    }

    //Enter Company Name
    public void enterComName(String userComName){
        cName.sendKeys(userComName);
    }

    //Select Newsletter
    public void selectNews(String newsCheck){
        if (Objects.equals(newsCheck, "UnCheck")) {
            newLetter.click();
        } else {
            System.out.println("Check Newsletter");
        }
    }

    //Enter Password
    public void insertPassword(String uPassword, String uCPassword){
        passwordF.sendKeys(uPassword);
        passwordCfrm.sendKeys(uCPassword);
    }

    //Success Message
    public void successMsg(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your registration completed";
        String actualResult = successMsg.getText();
        soft.assertEquals(actualResult, expectedResult);
        String actualBannerColor = successMsg.getCssValue("color");
        String expectedBannerColor = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actualBannerColor, expectedBannerColor);
    }
}
