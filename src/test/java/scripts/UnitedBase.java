package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.UnitedBasePage;
import pages.UnitedMainMenuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UnitedBase {

    WebDriver driver;
    UnitedBasePage unitedBasePage;
    UnitedMainMenuTest unitedMainMenuTest;
    UnitedMainMenuPage unitedMainMenuPage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        unitedBasePage = new UnitedBasePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }

}
