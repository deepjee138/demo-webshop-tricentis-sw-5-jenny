package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@value = 'Log in']")
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOut;

    /**
     * This method will verify text
     */
    public String getWelcomeText() {
        Reporter.log("Getting Text");
        String message = getTextFromElement(welcomeText);
        return message;
    }
    /**
     * This method will enter email
     */
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
        CustomListeners.test.log(Status.PASS,"Enter email"+email);
        Reporter.log("Enter  EmailFiled"+ email + "to email field"+emailField.toString());
    }
    /**
     * This method will enter password
     */
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
        Reporter.log("Enter password"+password+"To password Field"+passwordField.toString());


    }
    /**
     * This method will click on loginButton
     */
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
        Reporter.log("Click on " + loginButton.toString());
    }
    /**
     * This method will verify message
     */
    public String getErrorMessage(){
        Reporter.log("Error Message");
        String message=getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS,"Get errorMessage");
        return message;

    }
    /**
     * This method will logOut
     */
    public void clickOnLogOut(){
        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS,"ClickOn Log Out Link");
        Reporter.log("Click on " + logOut.toString());
    }

}
