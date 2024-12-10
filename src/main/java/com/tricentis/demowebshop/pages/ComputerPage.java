package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement clickOnDeskTop;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement verifyTextOfDeskTop;

    /**
     * This method will clickOnDeskTop
     */

    public void clickOnDeskTopTab(){
        Reporter.log("Verify Message");
        clickOnElement(clickOnDeskTop);
        CustomListeners.test.log(Status.PASS,"Click on desktop"+clickOnDeskTop);
    }

    /**
     * This method will verify Text deskTop
     */
    public String verifyTextOfDeskTop(){
        Reporter.log("verify message");
        String message=getTextFromElement(verifyTextOfDeskTop);
        CustomListeners.test.log(Status.PASS,"Invalid message");
        return message;
    }
}
