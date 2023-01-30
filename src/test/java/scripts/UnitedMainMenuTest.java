package scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedBasePage;
import pages.UnitedMainMenuPage;


public class UnitedMainMenuTest extends UnitedBase{

    @BeforeMethod
    public void setUp() {
        unitedMainMenuPage = new UnitedMainMenuPage();
        unitedBasePage = new UnitedBasePage();
    }

    @Test(priority = 1, description = "Validate Main Menu Options")
    public void validateMainMenu(){
        Assert.assertTrue(unitedBasePage.mainMenuButton.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.bookMenu.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.myTripsMenu.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.travelsInfoMenu.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.mileageplusMenu.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.helpMenu.isDisplayed());
    }

}
