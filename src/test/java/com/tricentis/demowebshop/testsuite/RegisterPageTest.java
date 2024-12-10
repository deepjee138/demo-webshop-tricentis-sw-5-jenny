package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        registerPage = new RegisterPage();


    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        // Click on the Register Link
        registerPage.clickOnRegisterLink();


        // Verify "Register" text
        String actualText = registerPage.getRegisterText();
        Assert.assertEquals(actualText, "Register", "Invalid text");
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {


        //Click on the Register Link
        registerPage.clickOnRegisterLink();
        // Click on the "Register" button
        registerPage.clickOnRegisterButton();

        // Verify the error message "First name is required."
        String expectedMessage = "First name is required.";
        String actualMessage = registerPage.verifyFirstNameMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Invalid message");


        // Verify the error message "Last name is required."
        String expectedMessage1 = "Last name is required.";
        String actualMessage1 = registerPage.verifyLastNameMessage();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Invalid message");


        // Verify the error message "Email is required."
        String expectedMessage2 = "Email is required.";
        String actualMessage2 = registerPage.verifyEmail();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Invalid message");


        // Verify the error message "Password is required."
        String expectedMessage3 = "Password is required.";
        String actualMessage3 = registerPage.verifyPassword();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Invalid message");


        // Verify the error message "Password is required."
        String expectedMessage4 = "Password is required.";
        String actualMessage4 = registerPage.verifyConformPassword();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Invalid message");


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        // Click on the Register Link
        registerPage.clickOnRegisterLink();
        //Select gender "Female"
        registerPage.selectGenderFemale();

        //Enter the first name
        registerPage.enterFirstName("Jenny");

        //Enter the last name
        registerPage.enterLastName("Patel");

        //Enter email
        registerPage.enterEmail("JeiyPatel099@Gmail.com");

        //Enter password
        registerPage.enterPassword("210999");

        //Enter Confirm Password
        registerPage.enterConformPassword("210999");

        //Click on the "Register" button
        registerPage.clickOnRegisterButton();

        //Verify the message "Your registration completed"
        String expectedMessage5 = "Your registration completed";
        String actualMessage5 = registerPage.verifySuccessMessage();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Invalid message");

    }
}
