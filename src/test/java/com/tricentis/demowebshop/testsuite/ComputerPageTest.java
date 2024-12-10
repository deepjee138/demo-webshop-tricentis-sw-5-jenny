package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.MenuPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    MenuPage menuPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        menuPage = new MenuPage();
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //Click on the COMPUTER tab
        menuPage.clickOnComputerMenu();


        // Verify "Computer" text
        String expectedMessage = "Computers";
        String actualMessage = menuPage.verifyTextComputers();
        Assert.assertEquals(expectedMessage, actualMessage, "Invalid text");

    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //Click on the COMPUTER tab
        menuPage.clickOnComputerMenu();

        //Click on the Desktops link
        computerPage.clickOnDeskTopTab();


        //Verify "Desktops" text
        String expectedMessage = computerPage.verifyTextOfDeskTop();
        Assert.assertEquals(expectedMessage, "Desktops", "invalid message");
    }

    @Test (groups = {"regression"}, dataProvider = "searchUserData", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        //Click on the COMPUTER tab
        menuPage.clickOnComputerMenu();

        //  Click on the Desktops link
        computerPage.clickOnDeskTopTab();
        // Click on the product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
        // Select processor "processor"

        //Select processor "processor"
        buildYourOwnComputerPage.selectProcessorFromDropdown(processor);

        //Select RAM "ram"
        buildYourOwnComputerPage.selectRam(ram);

        //Select HDD "hdd"
       buildYourOwnComputerPage.selectHddRadio(hdd);

        //Select OS "os"
      buildYourOwnComputerPage.selectOs(os);

        //Select Software "software"
      buildYourOwnComputerPage.selectCheckBox(software);


        //Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCart();


//        //Verify the message "The product has been added to your shopping cart"
//      Assert.assertEquals(buildYourOwnComputer.getDesktopText(), "The product has been added to your shopping cart");

    }


}
