package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    /**
     * This method will click on login link
     */

    public void clickOnLoginLink(){
        Reporter.log("click On Login");
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS,"clickOn login link"+loginLink);
    }
}
