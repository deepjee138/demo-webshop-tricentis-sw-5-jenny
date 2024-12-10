package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenuPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement computerMenu;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement verifyTextComputer;


    /**
     * This method will click On computer menu
     */

    public void clickOnComputerMenu(){
        Reporter.log("clickOn Computer"+computerMenu.toString());
        clickOnElement(computerMenu);
        CustomListeners.test.log(Status.PASS,"click On tab"+computerMenu);

    }
    /**
     * This method will verify text computer
     */
    public String verifyTextComputers(){
        Reporter.log("verify message");
        String message=getTextFromElement(verifyTextComputer);
        CustomListeners.test.log(Status.PASS,"Verify text");
        return message;
    }
}
