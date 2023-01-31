package scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedBasePage;
import pages.UnitedMainMenuPage;
import utilities.Driver;
import utilities.Waiter;


public class UnitedMainMenuTest extends UnitedBase{



    @BeforeMethod
    public void setUp() {
        unitedMainMenuPage = new UnitedMainMenuPage();
        unitedBasePage = new UnitedBasePage();
    }

    @Test(priority = 1, description = "Validate Main Menu Options")
    public void validateMainMenu(){

            String[] mainMenuText = {"BOOK", "MY TRIPS", "TRAVEL INFO", "MILEAGEPLUS® PROGRAM", "DEALS", "HELP"};

            for (int i = 0; i < mainMenuText.length; i++) {
                Assert.assertTrue(unitedMainMenuPage.mainMenu.get(i).isDisplayed());
                Assert.assertEquals(unitedMainMenuPage.mainMenu.get(i).getText(), mainMenuText[i]);

            }
        }

    @Test(priority = 2, description = "Validate Book travel menu items")
    public void validateBookTravelMenu(){
        String[] bookMenu = {"Book", "Flight status", "Check-in", "My trips"};
        for (int i = 0; i < bookMenu.length; i++) {
            Assert.assertTrue(unitedMainMenuPage.bookTravelTabs.get(i).isDisplayed());
            Assert.assertEquals(unitedMainMenuPage.bookTravelTabs.get(i).getText(), bookMenu[i]);

        }
    }


    @Test(priority = 3, description = "Validate Round-trip and One-way radio buttons")
    public void validateroundTripButtonAndoneWayButtonButtons(){
        Assert.assertTrue(unitedMainMenuPage.roundTripDisplay.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.roundTripButton.isEnabled());
        Assert.assertTrue(unitedMainMenuPage.roundTripButton.isSelected());
        Assert.assertTrue(unitedMainMenuPage.oneWayDisplay.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.oneWayButton.isEnabled());
        Assert.assertFalse(unitedMainMenuPage.oneWayButton.isSelected());
       unitedMainMenuPage.oneWayButton.click();
        Assert.assertTrue(unitedMainMenuPage.oneWayButton.isSelected());
        Assert.assertFalse(unitedMainMenuPage.roundTripButton.isSelected());

    }


    @Test(priority = 4, description = "Validate Book with miles and Flexible dates checkboxes")
    public void validateBookAndFlexibleCheckboxes(){
        Assert.assertTrue(unitedMainMenuPage.bookWithMilesCheckbox.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.bookWithMilesCheckbox.isEnabled());
        Assert.assertFalse(unitedMainMenuPage.bookWithMilesCheckboxSelect.isSelected());

        Assert.assertTrue(unitedMainMenuPage.flexibleDatesCheckbox.isDisplayed());
        Assert.assertTrue(unitedMainMenuPage.flexibleDatesCheckbox.isEnabled());
        Assert.assertFalse(unitedMainMenuPage.flexibleDatesCheckboxSelect.isSelected());

        unitedMainMenuPage.bookWithMilesCheckbox.click();
        unitedMainMenuPage.flexibleDatesCheckbox.click();

        Assert.assertTrue(unitedMainMenuPage.bookWithMilesCheckboxSelect.isSelected());
        Assert.assertTrue(unitedMainMenuPage.flexibleDatesCheckboxSelect.isSelected());

        unitedMainMenuPage.bookWithMilesCheckbox.click();
        unitedMainMenuPage.flexibleDatesCheckbox.click();

        Assert.assertFalse(unitedMainMenuPage.bookWithMilesCheckboxSelect.isSelected());
        Assert.assertFalse(unitedMainMenuPage.flexibleDatesCheckboxSelect.isSelected());

    }

    @Test(priority = 5, description = "Validate One-way ticket search results from Chicago, IL, US (ORD) to Miami, FL, US (MIA)")
    public void validateTicketSearchResults(){

        unitedMainMenuPage.oneWayButton.click();
        unitedMainMenuPage.fromButton.click();
        unitedMainMenuPage.clearFromButton.click();
        unitedMainMenuPage.fromButton.click();
        unitedMainMenuPage.fromButton.sendKeys("Chicago, IL, US (ORD)");
        unitedMainMenuPage.toButton.sendKeys("Miami, FL, US (MIA)");
        unitedMainMenuPage.departDateButton.click();
        unitedMainMenuPage.previousMonthButton.click();
        unitedMainMenuPage.dateInput.click();
        unitedMainMenuPage.passengerButton.click();
        unitedMainMenuPage.addAnAdult.click();
        Waiter.pause(1);
        unitedMainMenuPage.selectClassButton.click();
        unitedMainMenuPage.selectBusinessOrFirstClass.click();
        unitedMainMenuPage.findFlightsButton.click();
        Assert.assertEquals(unitedMainMenuPage.departureDetails.getText(), "DEPART ON: February 28");

    }

    @AfterMethod
        public void teardown(){
            Driver.quitDriver();
        }

    }


