package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnButton;

    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement verifyFirstNameMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@for='LastName']")
    WebElement verifyLastNameMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@for='Email']")
    WebElement verifyEmail;


    @CacheLookup
    @FindBy(xpath = "//span[@for='Password']")
    WebElement verifyPassword;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement verifyConfirmPassword;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement gender;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameEnter;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement LastNameEnter;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement ConformPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyTextRegister;



    /**
     * This method will registerLink
     */
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "click On link");
        Reporter.log("click On link"+registerLink.toString());
    }

    /**
     * This method will get register text
     */
    public String getRegisterText() {
        Reporter.log("getRegisterText");
        String message = getTextFromElement(verifyMessage);
        CustomListeners.test.log(Status.PASS, "message"+message);
        return message;
    }

    /**
     * This method will click On Button
     */
    public void clickOnRegisterButton() {
        clickOnElement(clickOnButton);
        CustomListeners.test.log(Status.PASS, "Click On Button"+clickOnButton);
        Reporter.log("click On Link"+clickOnButton.toString());
    }

    /**
     * This method will verify FirstName method
     */
    public String verifyFirstNameMessage() {
        Reporter.log("verifyFirstNameMessage");
        CustomListeners.test.log(Status.PASS," verify message"+verifyFirstNameMessage);
        String text = getTextFromElement(verifyFirstNameMessage);
        return text;
    }

    /**
     * This method will verify LastName method
     */

    public String verifyLastNameMessage() {
        Reporter.log(" verifyLastNameMessage");
        CustomListeners.test.log(Status.PASS," verify message"+verifyLastNameMessage);
        String text = getTextFromElement(verifyLastNameMessage);
        return text;

    }

    /**
     * This method will verify Email Field
     */
    public String verifyEmail() {
        Reporter.log("verifyEmail");
        String text = getTextFromElement(verifyEmail);
        CustomListeners.test.log(Status.PASS,"verifyEmail"+verifyEmail);
        return text;
    }

    /**
     * This method will verify password
     */
    public String verifyPassword() {
        Reporter.log("verifyPassword");
        CustomListeners.test.log(Status.PASS,"verify password"+verifyPassword);
        String text = getTextFromElement(verifyPassword);
        return text;
    }

    /**
     * This method will verify Conformpassword
     */
    public String verifyConformPassword() {
        Reporter.log("verifyConformPassword");
        CustomListeners.test.log(Status.PASS,"verify password");
        String text = getTextFromElement(verifyConfirmPassword);
        return text;
    }

    /**
     * This method will select gender
     */
    public void selectGenderFemale() {
        Reporter.log("select gender"+gender.toString());

        clickOnElement(gender);
        CustomListeners.test.log(Status.PASS, "click On Gender"+gender);
    }

    /**
     * This method will firstName
     */
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameEnter, firstName);
        CustomListeners.test.log(Status.PASS, "Enter FirstNAme" + firstName);
        Reporter.log("password"+firstName+"To firstName field"+firstNameEnter.toString());
    }

    /**
     * This method will firstName
     */
    public void enterLastName(String lastName) {
        sendTextToElement(LastNameEnter, lastName);
        CustomListeners.test.log(Status.PASS, "Enter LastName" + lastName);
        Reporter.log("LastName"+lastName+"To last NAme Field"+LastNameEnter.toString());
    }

    /**
     * This method will Email
     */
    public void enterEmail(String email1) {
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS, "Enter email" + email1);
        Reporter.log("email"+email1+"To email Field"+email.toString());
    }

    /**
     * This method will password
     */
    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
        CustomListeners.test.log(Status.PASS, "Enter Password" + password1);
        Reporter.log("Password"+password1+"To password Field"+password.toString());
    }

    /**
     * This method will Conform password
     */
    public void enterConformPassword(String password2) {
        sendTextToElement(ConformPassword, password2);
        CustomListeners.test.log(Status.PASS, "Enter Conform Password" + password2);
        Reporter.log("Password"+password2+"To password Field"+ConformPassword.toString());
    }

    /**
     * This method will verify Text
     */
    public String verifySuccessMessage(){
        Reporter.log("verifySuccessMessage");
        CustomListeners.test.log(Status.PASS," verify success Message");
        String message=getTextFromElement(verifyTextRegister);
        return message;
    }
}